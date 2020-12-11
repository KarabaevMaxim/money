package com.karabaev.money.ui.settings.references

data class ReferenceListItemPresModel(
    val title: String,
    val subtitle: String,
    val tapCommand: (() -> Unit)?)