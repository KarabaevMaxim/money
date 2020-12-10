package com.karabaev.money2.model

import com.karabaev.money2.model.common.ICreatableModel
import java.util.*

interface IConductableModel : ICreatableModel {
    var conducted: Boolean
    var conductedDate: Date
}