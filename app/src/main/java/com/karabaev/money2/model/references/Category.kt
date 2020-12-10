package com.karabaev.money2.model.references

import java.util.*

class Category(
  override var id: Int,
  override var name: String,
  override var comment: String,
  override var iconPath: String,
  override var createdDate: Date,
  override var archived: Boolean
) : IReferenceRecord {
}