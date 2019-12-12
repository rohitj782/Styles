package com.rohitrj.styles.ui.mainactivity.sales

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.rohitrj.styles.R

class SalesFragment : Fragment() {

    companion object {
        fun newInstance() = SalesFragment()
    }

    private lateinit var viewModel: SalesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sales_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SalesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
