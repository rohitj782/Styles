package com.rohitrj.styles.ui.mainactivity.kids

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.rohitrj.styles.R

class KidsFragmentDirections private constructor() {
    companion object {
        fun actionKidsFragmentToItemListFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_kidsFragment_to_itemListFragment)
    }
}
