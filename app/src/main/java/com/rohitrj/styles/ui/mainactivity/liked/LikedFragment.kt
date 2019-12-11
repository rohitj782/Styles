package com.rohitrj.styles.ui.mainactivity.liked

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.rohitrj.styles.R

class LikedFragment : Fragment() {

    companion object {
        fun newInstance() = LikedFragment()
    }

    private lateinit var viewModel: LikedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.liked_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LikedViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
