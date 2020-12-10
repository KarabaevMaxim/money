package com.karabaev.money2.ui.settings.reference

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.settings_list_item_view.view.*

class ReferenceListItemViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {
  fun bind(item: ReferenceListItemPresModel) {
    itemView.title.text = item.title
    itemView.subtitle.text = item.subtitle
    itemView.icon.visibility = if (item.tapCommand == null) View.GONE else View.VISIBLE
  }
}