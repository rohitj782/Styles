package com.rohitrj.styles.ui.mainactivity.home

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.rohitrj.styles.R

class HomeFragmentDirections private constructor() {
    companion object {
        fun actionHomeFragmentToCartFragment2(): NavDirections =
                ActionOnlyNavDirections(R.id.action_homeFragment_to_cartFragment2)

        fun actionHomeFragmentToProfileFragment2(): NavDirections =
                ActionOnlyNavDirections(R.id.action_homeFragment_to_profileFragment2)

        fun actionHomeFragmentToLikedFragment2(): NavDirections =
                ActionOnlyNavDirections(R.id.action_homeFragment_to_likedFragment2)

        fun actionHomeFragmentToSearchFragment2(): NavDirections =
                ActionOnlyNavDirections(R.id.action_homeFragment_to_searchFragment2)

        fun actionHomeFragmentToMensFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_homeFragment_to_mensFragment)

        fun actionHomeFragmentToKidsFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_homeFragment_to_kidsFragment)

        fun actionHomeFragmentToSalesFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_homeFragment_to_salesFragment)

        fun actionHomeFragmentToWomenFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_homeFragment_to_womenFragment)
    }
}
