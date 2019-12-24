package com.rohitrj.styles.ui.mainactivity.mens

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation

import com.rohitrj.styles.R
import com.rohitrj.styles.databinding.MensFragmentBinding
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
        val binding: MensFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.mens_fragment, container, false
        )

        val viewModel = ViewModelProviders.of(this).get(MensViewModel::class.java)

        binding.menViewModel = viewModel
        binding.lifecycleOwner = this.viewLifecycleOwner

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MensViewModel::class.java)
        // TODO: Use the ViewModel

//        //TOdo remove later
        button_item_1.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(MensFragmentDirections.actionMensFragmentToItemListFragment())
        }
    }

}
