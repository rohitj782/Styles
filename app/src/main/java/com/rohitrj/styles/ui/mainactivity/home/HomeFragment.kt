package com.rohitrj.styles.ui.mainactivity.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.rohitrj.styles.R
import kotlinx.android.synthetic.main.home_fragment.*


class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)

        button_men.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(
                    HomeFragmentDirections.actionHomeFragmentToMensFragment()
                )
        }
        button_women.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(
                    HomeFragmentDirections.actionHomeFragmentToWomenFragment()
                )
        }
        button_kids.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(
                    HomeFragmentDirections.actionHomeFragmentToKidsFragment()
                )
        }
        button_sale.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(
                    HomeFragmentDirections.actionHomeFragmentToSalesFragment()
                )
        }
    }

}
