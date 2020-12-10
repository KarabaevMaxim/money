package com.karabaev.money2.model.common

import java.util.*

/**
 * Интерфейс модели, объекты которой может создавать пользователь.
 */
interface ICreatableModel : IStorageModel {
  var createdDate: Date
  var archived: Boolean
}