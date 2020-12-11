package com.karabaev.money2.model

import com.karabaev.money2.model.common.ICreatableModel
import org.joda.time.DateTime
import java.util.*

interface IConductableModel : ICreatableModel {
  var conducted: Boolean
  var conductedDate: DateTime
}