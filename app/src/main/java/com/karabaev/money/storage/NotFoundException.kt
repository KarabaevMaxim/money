package com.karabaev.money.storage

class NotFoundException(private val modelId: Int) : Exception() {
  override val message: String
    get() = "Модель с id $modelId не найдена"
}