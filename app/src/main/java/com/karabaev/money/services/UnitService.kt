package com.karabaev.money.services

import com.karabaev.money.model.references.Unit
import com.karabaev.money.storage.IDbAdapter
import org.joda.time.DateTime

class UnitService(private val dbAdapter: IDbAdapter<Unit>) : IUnitService {
  override fun create(
    name: String,
    abbreviate: String,
    comment: String,
    iconPath: String,
    baseUnit: Unit?,
    baseUnitMultiplier: Float?
  ) {
    val newUnit = Unit(
      dbAdapter.getNewId(),
      false,
      DateTime.now(),
      name,
      comment,
      iconPath,
      baseUnit?.id,
      baseUnitMultiplier,
      abbreviate
    )
    dbAdapter.save(newUnit)
  }

  override fun delete(id: Int) {
    dbAdapter.delete(id)
  }

  override fun get(id: Int): Unit {
    return dbAdapter.get(id)
  }

  override fun get(predicate: (Unit) -> Boolean) : Unit? {
    return dbAdapter.getAll().find(predicate)
  }
}