package com.rohitrj.styles.ui.mainactivity.women

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.rohitrj.styles.R

class WomenFragmentDirections private constructor() {
    companion object {
        fun actionWomenFragmentToItemListFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_womenFragment_to_itemListFragment)
    }
}
