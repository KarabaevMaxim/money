package com.karabaev.money2.model

import java.util.*

// Транзакция
class Transaction(
    override var id: Int,
    override var archived: Boolean,
    override var conducted: Boolean,
    override var conductedDate: Date,
    override var createdDate: Date,
    var positionsIds: List<Int>,
    var amount: Float,
    var photo: Array<Byte>
) : IConductableModel {
}