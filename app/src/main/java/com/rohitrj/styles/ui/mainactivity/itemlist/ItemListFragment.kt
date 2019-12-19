package com.rohitrj.styles.ui.mainactivity.itemlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import android.view.animation.DecelerateInterpolator
import androidx.core.view.marginTop
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import com.rohitrj.styles.R
import com.rohitrj.styles.data.models.ItemInfo
import com.rohitrj.styles.internals.adapters.itemdisplayadapter.ItemDisplayAdapter
import com.rohitrj.styles.internals.utils.MEN
import com.rohitrj.styles.internals.utils.MyRecyclerScroll
import com.rohitrj.styles.internals.utils.PREMIUM
import kotlinx.android.synthetic.main.item_list_fragment.*


class ItemListFragment : Fragment() {

    companion object {
        fun newInstance() = ItemListFragment()
    }

    private lateinit var viewModel: ItemListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.item_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ItemListViewModel::class.java)

        val itemList = ArrayList<ItemInfo>()

        val item1 = ItemInfo(
            MEN, "Polo-neck Slim Fit", "The Party Edit",
            1499, R.drawable.polo_neck_top_muscle_fit,
            false, "", arrayListOf("XS", "S", "M", "L", "XL", "XXL"),
            PREMIUM
        )
        itemList.add(item1)

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

        val item6 = ItemInfo(
            MEN, "Easy-iron Shirt Slim Fit", "The Party Edit",
            1299, R.drawable.easy_iron_shirt_slim_fit,
            false, "", arrayListOf("XS", "S", "M", "L", "XL", "XXL"),
            PREMIUM
        )
        itemList.add(item6)

        val item7 = ItemInfo(
            MEN, "Suit Trousers Skinny Fit", "The Party Edit",
            799, R.drawable.suit_trousers_skinny_fit,
            false, "", arrayListOf("XS", "S", "M", "L", "XL", "XXL"),
            PREMIUM
        )
        itemList.add(item7)

        val item10 = ItemInfo(
            MEN, "Easy-iron Shirt Slim Fit", "The Party Edit",
            1299, R.drawable.easy_iron_shirt_slim_fit2,
            false, "", arrayListOf("XS", "S", "M", "L", "XL", "XXL"),
            PREMIUM
        )
        itemList.add(item10)

        itemList.add(item2)
        itemList.add(item1)
        itemList.add(item4)
        itemList.add(item3)
        itemList.add(item6)
        itemList.add(item7)
        itemList.add(item10)
        itemList.add(item5)



        recycler_item_list.layoutManager = GridLayoutManager(context, 2)
        recycler_item_list.adapter = ItemDisplayAdapter(itemList)

        recycler_item_list.addOnScrollListener(object : MyRecyclerScroll() {
            override fun show() {
                filterButton
                    .animate()
                    .translationY(0f).setInterpolator(AccelerateInterpolator(2f))
                    .start()
            }

            override fun hide() {
                filterButton
                    .animate()
                    .translationYBy(-(filterButton.getHeight() + filterButton.marginTop + 0f))
                    .setInterpolator(DecelerateInterpolator(2f))
                    .start()
            }
        })

        filterButton.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(ItemListFragmentDirections.actionItemListFragmentToFilterAndSortFragment())
        }
    }

}
