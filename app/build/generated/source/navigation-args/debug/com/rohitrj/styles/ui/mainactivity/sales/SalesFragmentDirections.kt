package com.rohitrj.styles.ui.mainactivity.sales

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.rohitrj.styles.R

class SalesFragmentDirections private constructor() {
    companion object {
        fun actionSalesFragmentToItemListFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_salesFragment_to_itemListFragment)
    }
}
