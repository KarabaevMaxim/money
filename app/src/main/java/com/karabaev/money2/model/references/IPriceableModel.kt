package com.karabaev.money2.model.references

interface IPriceableModel : IReferenceRecord {
    var lastPrice: Float
    var categoryId: Int
}