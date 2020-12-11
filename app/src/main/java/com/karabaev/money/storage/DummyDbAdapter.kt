package com.karabaev.money.storage

import com.karabaev.money.model.common.IStorageModel

class DummyDbAdapter<T> : IDbAdapter<T> where T: IStorageModel {

  private val models: MutableList<T> = mutableListOf()

  override fun save(model: T) {
    models.add(model)
  }

  override fun get(id: Int): T {
    return models.find { m ->
      m.id == id
    } ?: throw NotFoundException(id)
  }

  override fun getAll(): List<T> {
    return List(models.size) {
      models[it]
    }
  }

  override fun delete(id: Int) {
    models.remove(get(id))
  }

  override fun delete(model: T) {
    models.remove(model)
  }

  override fun getNewId(): Int {
    return models.maxOf { model -> model.id }
  }
}