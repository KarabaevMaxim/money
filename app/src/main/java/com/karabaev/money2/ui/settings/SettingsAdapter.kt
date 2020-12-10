package com.karabaev.money2.ui.settings

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.karabaev.money2.R

class SettingsAdapter(private val items: List<SettingsItemPresModel>, private val activityContext: Context) :
  RecyclerView.Adapter<SettingsItemViewHolder>() {

  private val layoutInflater: LayoutInflater by lazy {
    LayoutInflater.from(activityContext)
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SettingsItemViewHolder {
    val view = layoutInflater.inflate(R.layout.settings_list_item_view, parent, false)
    return SettingsItemViewHolder(view)
  }

  override fun onBindViewHolder(holder: SettingsItemViewHolder, position: Int) {
    holder.bind(items[position])
  }

  override fun getItemCount(): Int = items.size
}