package com.karabaev.money.model.common

import org.joda.time.DateTime

/**
 * Интерфейс модели, объекты которой может создавать пользователь.
 */
interface ICreatableModel : IStorageModel {
  var createdDate: DateTime
  var archived: Boolean
}