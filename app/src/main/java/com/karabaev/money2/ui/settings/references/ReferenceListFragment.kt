package com.karabaev.money2.ui.settings.references

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.karabaev.money2.R
import kotlinx.android.synthetic.main.reference_list_view.view.*

class ReferenceListFragment : Fragment() {
  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    val view = inflater.inflate(R.layout.reference_list_view, container, false)
    val recycler = view.recycler_view
    val layoutManager = LinearLayoutManager(recycler.context)
    recycler.layoutManager = layoutManager
    recycler.addItemDecoration(DividerItemDecoration(recycler.context, layoutManager.orientation))
    recycler.adapter = ReferenceListAdapter(getTestItems(), activity!!)
    return view
  }

  private fun getTestItems(): MutableList<ReferenceListItemPresModel> {
    val result = mutableListOf<ReferenceListItemPresModel>()
    result.add(ReferenceListItemPresModel("Килограмм", "кг", null))
    result.add(ReferenceListItemPresModel("Грамм", "гр", null))
    result.add(ReferenceListItemPresModel("Штука", "шт", null))

    return result
  }
}