package com.karabaev.money2.ui.settings.reference

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.karabaev.money2.R

class ReferenceListAdapter(private val items: List<ReferenceListItemPresModel>, private val activityContext: Context) :
  RecyclerView.Adapter<ReferenceListItemViewHolder>() {

  private val layoutInflater: LayoutInflater by lazy {
    LayoutInflater.from(activityContext)
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReferenceListItemViewHolder {
    val view = layoutInflater.inflate(R.layout.settings_list_item_view, parent, false)
    return ReferenceListItemViewHolder(view)
  }

  override fun onBindViewHolder(holder: ReferenceListItemViewHolder, position: Int) {
    holder.bind(items[position])
  }

  override fun getItemCount(): Int {
    return items.size
  }
}

