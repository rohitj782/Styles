package com.rohitrj.styles.ui.mainactivity.mens

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation

import com.rohitrj.styles.R
import kotlinx.android.synthetic.main.mens_fragment.*

class MensFragment : Fragment() {

    companion object {
        fun newInstance() = MensFragment()
    }

    private lateinit var viewModel: MensViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.mens_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MensViewModel::class.java)
        // TODO: Use the ViewModel

        //TOdo remove later
        button_item_1.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(MensFragmentDirections.actionMensFragmentToItemListFragment())
        }
    }

}
