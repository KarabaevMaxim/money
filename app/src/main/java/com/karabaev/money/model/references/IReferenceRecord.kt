package com.karabaev.money.model.references

import com.karabaev.money.model.common.ICreatableModel

interface IReferenceRecord : ICreatableModel {
  var name: String
  var comment: String
  var iconPath: String
}