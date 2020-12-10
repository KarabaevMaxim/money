package com.karabaev.money2.model.references

import java.util.*

class Service(
  override var id: Int,
  override var archived: Boolean,
  override var createdDate: Date,
  override var name: String,
  override var comment: String,
  override var iconPath: String,
  override var lastPrice: Float,
  override var categoryId: Int
) : IPriceableModel {
}