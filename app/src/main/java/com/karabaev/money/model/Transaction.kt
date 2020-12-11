package com.karabaev.money.model

import org.joda.time.DateTime

// Транзакция
data class Transaction(
  override var id: Int,
  override var archived: Boolean,
  override var conducted: Boolean,
  override var conductedDate: DateTime,
  override var createdDate: DateTime,
  var positionsIds: List<Int>,
  var amount: Float,
  var photo: Array<Byte>
) : IConductableModel