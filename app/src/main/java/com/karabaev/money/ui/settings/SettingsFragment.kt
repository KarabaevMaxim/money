package com.karabaev.money.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.karabaev.money.R
import com.karabaev.money.ui.settings.references.ReferenceListFragment
import kotlinx.android.synthetic.main.fragment_settings.view.*




class SettingsFragment : Fragment() {
  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    val view = inflater.inflate(R.layout.fragment_settings, container, false)
    val recycler = view.settings_list
    val layoutManager = LinearLayoutManager(recycler.context)
    recycler.layoutManager = layoutManager
    recycler.addItemDecoration(DividerItemDecoration(recycler.context, layoutManager.orientation))
    view.settings_list.adapter = SettingsAdapter(getTestSettings(), activity!!)
    return view
  }

  private fun getTestSettings() : List<SettingsItemPresModel> {
    val result = mutableListOf<SettingsItemPresModel>()
    result.add(SettingsItemPresModel("Единицы измерения", "Открыть справочник единиц измерения") {
      Toast.makeText(activity, "Открываем единицы измерения", Toast.LENGTH_SHORT).show()

      val id = (view?.parent as ViewGroup).id
      val nextFrag = ReferenceListFragment()
      activity!!.supportFragmentManager.beginTransaction()
        .replace(id, nextFrag, "ReferenceListFragment")
        .addToBackStack(null)
        .commit()
    })

    result.add(SettingsItemPresModel("Настройка 2", "Здесь находится настройка 2") {
      Toast.makeText(activity, "Нажата настройка 2", Toast.LENGTH_SHORT).show()
    })
    result.add(SettingsItemPresModel("Настройка 3", "Здесь находится настройка 3") {
      Toast.makeText(activity, "Нажата настройка 3", Toast.LENGTH_SHORT).show()
    })
    result.add(SettingsItemPresModel("Настройка 4", "Здесь находится настройка 4") {
      Toast.makeText(activity, "Нажата настройка 4", Toast.LENGTH_SHORT).show()
    })
    result.add(SettingsItemPresModel("Настройка 5", "Здесь находится настройка 5"))
    result.add(SettingsItemPresModel("Настройка 6", "Здесь находится настройка 6"))
    result.add(SettingsItemPresModel("Настройка 7", "Здесь находится настройка 7"))
    result.add(SettingsItemPresModel("Настройка 8", "Здесь находится настройка 8") {
      Toast.makeText(activity, "Нажата настройка 5", Toast.LENGTH_SHORT).show()
    })
    result.add(SettingsItemPresModel("Настройка 9", "Здесь находится настройка 9"))
    result.add(SettingsItemPresModel("Настройка 10", "Здесь находится настройка 10"))
    return result
  }
}

