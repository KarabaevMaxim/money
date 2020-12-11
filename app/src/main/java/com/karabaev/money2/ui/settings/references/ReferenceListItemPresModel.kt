package com.karabaev.money2.ui.settings.references

data class ReferenceListItemPresModel(
    val title: String,
    val subtitle: String,
    val tapCommand: (() -> Unit)?)