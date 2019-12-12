package com.rohitrj.styles.ui.mainactivity.women

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.rohitrj.styles.R

class WomenFragment : Fragment() {

    companion object {
        fun newInstance() = WomenFragment()
    }

    private lateinit var viewModel: WomenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.women_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(WomenViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
