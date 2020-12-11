package com.karabaev.money2.ui.settings

data class SettingsItemPresModel(val title: String, val subtitle: String, val tapCommand: (() -> Unit)? = null)