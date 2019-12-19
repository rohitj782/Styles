package com.rohitrj.styles.ui.mainactivity.itemlist

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.rohitrj.styles.R

class ItemListFragmentDirections private constructor() {
    companion object {
        fun actionItemListFragmentToFilterAndSortFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_itemListFragment_to_filterAndSortFragment)

        fun actionItemListFragmentToItemDetailFragmentFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_itemListFragment_to_itemDetailFragmentFragment)
    }
}
