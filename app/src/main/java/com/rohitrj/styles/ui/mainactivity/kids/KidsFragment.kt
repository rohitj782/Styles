package com.rohitrj.styles.ui.mainactivity.kids

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.rohitrj.styles.R

class KidsFragment : Fragment() {

    companion object {
        fun newInstance() = KidsFragment()
    }

    private lateinit var viewModel: KidsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.kids_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(KidsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
