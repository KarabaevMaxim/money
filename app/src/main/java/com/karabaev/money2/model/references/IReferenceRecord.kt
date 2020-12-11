package com.karabaev.money2.model.references

import com.karabaev.money2.model.common.ICreatableModel

interface IReferenceRecord : ICreatableModel {
  var name: String
  var comment: String
  var iconPath: String
}