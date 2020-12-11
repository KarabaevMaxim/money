package com.karabaev.money2.services

import com.karabaev.money2.model.references.Unit

interface IUnitService {
  fun create(
    name: String,
    abbreviate: String,
    comment: String,
    iconPath: String,
    baseUnit: Unit?,
    baseUnitMultiplier: Float?)

  fun delete(id: Int)

  fun get(id: Int): Unit

  fun get(predicate: (Unit) -> Boolean) : Unit?
}

