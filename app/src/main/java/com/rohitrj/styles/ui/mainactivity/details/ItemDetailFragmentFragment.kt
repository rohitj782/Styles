package com.rohitrj.styles.ui.mainactivity.details

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.rohitrj.styles.R
import com.rohitrj.styles.data.models.ItemInfo
import com.rohitrj.styles.internals.adapters.itemdisplayadapter.ItemDisplayAdapter
import com.rohitrj.styles.internals.utils.MEN
import com.rohitrj.styles.internals.utils.PREMIUM
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_detail_fragment.*
import kotlinx.android.synthetic.main.item_detail_fragment.recycler_item_list
import kotlinx.android.synthetic.main.item_list_fragment.*
import kotlinx.android.synthetic.main.size_list.*

class ItemDetailFragmentFragment : Fragment() {

    companion object {
        fun newInstance() =
            ItemDetailFragmentFragment()
    }

    private lateinit var viewModel: ItemDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.item_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ItemDetailViewModel::class.java)

        requireActivity().toolbar.visibility = View.GONE

        addToCart.setOnClickListener {
            val snack = Snackbar.make(
                requireView().findViewById(
                    R.id.coordinator
                ), "Added to Cart",
                Snackbar.LENGTH_SHORT
            )
            snack.setAction("Undo") {
                snack.dismiss()
            }
            snack.animationMode = Snackbar.ANIMATION_MODE_SLIDE
            snack.show()
        }

        selectSize.setOnClickListener {
            getSize(it)
        }

        setUpRecyclerView()

    }

    private fun setUpRecyclerView() {
        val itemList = ArrayList<ItemInfo>()

        val item2 = ItemInfo(
            MEN, "Easy-iron Shirt Slim Fit", "The Party Edit",
            1299, R.drawable.easy_iron_shirt,
            false, "", arrayListOf("XS", "S", "M", "L", "XL", "XXL"),
            PREMIUM
        )
        itemList.add(item2)


        val item3 = ItemInfo(
            MEN, "Shades", "The Party Edit",
            1799, R.drawable.shades,
            false, "", arrayListOf("S", "M", "L"),
            PREMIUM
        )
        itemList.add(item3)


        val item4 = ItemInfo(
            MEN, "Cotton Shirt", "The Party Edit",
            1399, R.drawable.cotton_shirt,
            false, "", arrayListOf("XS", "S", "M", "L", "XL", "XXL"),
            PREMIUM
        )
        itemList.add(item4)


        val item5 = ItemInfo(
            MEN, "Tuxedo Jacket Slim Fit", "The Party Edit",
            4999, R.drawable.tuxedo_jacket_slim_fit,
            false, "", arrayListOf("M", "L", "XL", "XXL"),
            PREMIUM
        )
        itemList.add(item5)

        recycler_item_list.layoutManager = GridLayoutManager(context, 2,
            GridLayoutManager.VERTICAL,false)
        recycler_item_list.adapter = ItemDisplayAdapter(itemList)

    }

    private val TAG = "ItemDetailFragmentFragm"
    private fun getSize(view: View?) {
        val dialog = activity?.let { Dialog(it) };
        dialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.size_list);

        var size: String? = null

        dialog.xs.setOnClickListener {
            size = "xs"
            Toast.makeText(context, size,Toast.LENGTH_SHORT).show()
        }
        dialog.s.setOnClickListener {
            size = "s"
            Toast.makeText(context, size,Toast.LENGTH_SHORT).show()
        }
        dialog.m.setOnClickListener {
            size = "m"
            Toast.makeText(context, size,Toast.LENGTH_SHORT).show()
        }
        dialog.l.setOnClickListener {
            size = "l"
            Toast.makeText(context, size,Toast.LENGTH_SHORT).show()
        }
        dialog.xl.setOnClickListener {
            size = "xl"
            Toast.makeText(context, size,Toast.LENGTH_SHORT).show()
        }
        dialog.xxl.setOnClickListener {
            size = "xxl"
            Toast.makeText(context, size,Toast.LENGTH_SHORT).show()
        }


        dialog.show();
    }

    override fun onResume() {
        super.onResume()
        requireActivity().toolbar.visibility = View.GONE
    }

    override fun onStop() {
        super.onStop()
        requireActivity().toolbar.visibility = View.VISIBLE
    }

}
