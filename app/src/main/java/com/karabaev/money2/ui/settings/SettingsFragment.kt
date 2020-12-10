package com.karabaev.money2.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.karabaev.money2.R
import kotlinx.android.synthetic.main.fragment_settings.view.*

class SettingsFragment : Fragment() {
  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    val view = inflater.inflate(R.layout.fragment_settings, container, false)
    view.settings_list.layoutManager = LinearLayoutManager(activity)
    view.settings_list.adapter = SettingsAdapter(getTestSettings(), activity!!)
    return view
  }

  private fun getTestSettings() : List<SettingsItemPresModel> {
    val result = mutableListOf<SettingsItemPresModel>()
    result.add(SettingsItemPresModel("Настройка 1", "Здесь находится настройка 1"))
    result.add(SettingsItemPresModel("Настройка 2", "Здесь находится настройка 2"))
    result.add(SettingsItemPresModel("Настройка 3", "Здесь находится настройка 3"))
    result.add(SettingsItemPresModel("Настройка 4", "Здесь находится настройка 4"))
    result.add(SettingsItemPresModel("Настройка 5", "Здесь находится настройка 5"))
    return result
  }
}

