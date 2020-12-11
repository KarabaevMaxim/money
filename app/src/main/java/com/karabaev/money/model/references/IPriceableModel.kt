package com.karabaev.money.model.references

interface IPriceableModel : IReferenceRecord {
  var lastPrice: Float
  var categoryId: Int
}