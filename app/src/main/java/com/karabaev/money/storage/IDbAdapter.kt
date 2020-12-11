package com.karabaev.money.storage

import com.karabaev.money.model.common.IStorageModel

interface IDbAdapter<T> where T : IStorageModel {
  fun save(model: T)

  fun get(id: Int): T

  fun getAll(): List<T>

  fun delete(id: Int)

  fun delete(model: T)

  fun getNewId(): Int
}