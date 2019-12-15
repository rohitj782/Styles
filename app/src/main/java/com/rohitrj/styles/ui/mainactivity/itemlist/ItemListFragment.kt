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

        val item = ItemInfo(
            MEN, "Polo_neck Slim Fit", "The Party Edit",
            1200, R.drawable.men1, false, "", arrayListOf("XS", "S", "M", "L", "XL", "XXL"),
            PREMIUM
        )
        itemList.add(item)
        itemList.add(item)
        itemList.add(item)
        itemList.add(item)
        itemList.add(item)
        itemList.add(item)
        itemList.add(item)
        itemList.add(item)
        itemList.add(item)
        itemList.add(item)
        itemList.add(item)
        itemList.add(item)
        itemList.add(item)
        itemList.add(item)
        itemList.add(item)

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
