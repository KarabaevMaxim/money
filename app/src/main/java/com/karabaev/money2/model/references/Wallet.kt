package com.karabaev.money2.model.references

import java.util.*

class Wallet(
  override var id: Int,
  override var archived: Boolean,
  override var createdDate: Date,
  override var name: String,
  override var comment: String,
  override var iconPath: String,
) : IReferenceRecord {
}