package com.rohitrj.styles.ui.mainactivity.filterandsort

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.rohitrj.styles.R
import kotlinx.android.synthetic.main.activity_main.*

class FilterAndSortFragment : Fragment() {

    companion object {
        fun newInstance() = FilterAndSortFragment()
    }

    private lateinit var viewModel: FilterAndSortViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.filter_and_sort_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FilterAndSortViewModel::class.java)
        // TODO: Use the ViewModel
        requireActivity().toolbar.visibility = View.GONE
    }

    override fun onDestroy() {
        super.onDestroy()
        requireActivity().toolbar.visibility = View.VISIBLE
    }

}
