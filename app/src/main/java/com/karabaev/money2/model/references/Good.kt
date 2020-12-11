package com.karabaev.money2.model.references

import org.joda.time.DateTime

data class Good(
  override var id: Int,
  override var archived: Boolean,
  override var createdDate: DateTime,
  override var name: String,
  override var comment: String,
  override var iconPath: String,
  override var lastPrice: Float,
  var defaultUnitId: Int,
  override var categoryId: Int
) : IPriceableModel