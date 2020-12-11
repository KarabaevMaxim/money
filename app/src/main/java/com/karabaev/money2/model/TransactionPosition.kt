package com.karabaev.money2.model

import com.karabaev.money2.model.common.IStorageModel

// строка транзакции
data class TransactionPosition(
  override var id: Int,
  var priceableId: Int,
  var count: Float,
  var price: Float,
  var unitId: Int) : IStorageModel {
  val amount: Float
    get() = count * price
}