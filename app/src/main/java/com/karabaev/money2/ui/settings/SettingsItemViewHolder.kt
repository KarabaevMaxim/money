package com.karabaev.money2.ui.settings

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.settings_list_item_view.view.*

class SettingsItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
  fun bind(item: SettingsItemPresModel) {
    view.title.text = item.title
    view.subtitle.text = item.subtitle
    itemView.icon.visibility = if (item.tapHandler == null) View.GONE else View.VISIBLE
  }
}