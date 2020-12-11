package com.karabaev.money.model

import com.karabaev.money.model.common.ICreatableModel
import org.joda.time.DateTime

interface IConductableModel : ICreatableModel {
  var conducted: Boolean
  var conductedDate: DateTime
}