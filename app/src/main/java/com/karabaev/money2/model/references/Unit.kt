package com.karabaev.money2.model.references

import org.joda.time.DateTime

data class Unit(
  override var id: Int,
  override var archived: Boolean,
  override var createdDate: DateTime,
  override var name: String,
  override var comment: String,
  override var iconPath: String,
  var baseUnitId: Int?,
  var baseUnitMultiplier: Float?,
  var abbreviate: String
) : IReferenceRecord