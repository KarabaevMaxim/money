package com.karabaev.money.model.references

import org.joda.time.DateTime

data class Wallet(
  override var id: Int,
  override var archived: Boolean,
  override var createdDate: DateTime,
  override var name: String,
  override var comment: String,
  override var iconPath: String,
) : IReferenceRecord