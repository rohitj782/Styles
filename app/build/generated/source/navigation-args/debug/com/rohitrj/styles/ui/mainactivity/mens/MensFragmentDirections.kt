package com.rohitrj.styles.ui.mainactivity.mens

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.rohitrj.styles.R

class MensFragmentDirections private constructor() {
    companion object {
        fun actionMensFragmentToItemListFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_mensFragment_to_itemListFragment)
    }
}
