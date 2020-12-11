package com.karabaev.money.ui.settings

data class SettingsItemPresModel(val title: String, val subtitle: String, val tapCommand: (() -> Unit)? = null)