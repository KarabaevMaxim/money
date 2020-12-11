package com.karabaev.money2.ui.settings.references

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.settings_list_item_view.view.*

class ReferenceListItemViewHolder(private val refItemView: View) : RecyclerView.ViewHolder(refItemView) {
  fun bind(item: ReferenceListItemPresModel) {
    refItemView.title.text = item.title
    refItemView.subtitle.text = item.subtitle
    refItemView.icon.visibility = if (item.tapCommand == null) View.GONE else View.VISIBLE
    refItemView.setOnClickListener {
      item.tapCommand?.invoke()
    }
  }
}