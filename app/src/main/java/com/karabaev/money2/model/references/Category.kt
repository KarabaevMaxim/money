package com.karabaev.money2.model.references

import org.joda.time.DateTime

data class Category(
  override var id: Int,
  override var name: String,
  override var comment: String,
  override var iconPath: String,
  override var createdDate: DateTime,
  override var archived: Boolean
) : IReferenceRecord