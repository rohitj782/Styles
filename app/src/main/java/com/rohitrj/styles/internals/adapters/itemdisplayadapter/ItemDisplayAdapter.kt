package com.rohitrj.styles.internals.adapters.itemdisplayadapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rohitrj.styles.R
import com.rohitrj.styles.data.models.ItemInfo

class ItemDisplayAdapter(var list: ArrayList<ItemInfo>) :
    RecyclerView.Adapter<ItemDisplayAdapter.MyViewHolder>() {

    var itemList = this.list

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_display, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.seeDetails(itemList[position], position)
    }


    inner class MyViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        @SuppressLint("SetTextI18n")
        fun seeDetails(item: ItemInfo, position: Int) {
            val name = view.findViewById<TextView>(R.id.textViewName)
            val liked = view.findViewById<ImageButton>(R.id.imageButtonLiked)
            val thumbnail = view.findViewById<ImageView>(R.id.imageViewThumbnail)
            val price = view.findViewById<TextView>(R.id.textViewPrice)
            val hide = view.findViewById<TextView>(R.id.buttonTOHIde)

            if (position > 1) {
                hide.visibility = View.GONE
            } else {
                hide.visibility = View.VISIBLE
            }

            name.text = item.name
            thumbnail.setImageResource(item.thumbnail)
            price.text = "Rs." + item.price.toString()

            if (item.liked) {
                liked.setImageResource(R.drawable.ic_baseline_favorite_24)
            }else{
                liked.setImageResource(R.drawable.ic_outline_favorite_border_24)
            }
            liked.setOnClickListener {
                if (item.liked) {
                    updateItem(item, position, false)
                    liked.setImageResource(R.drawable.ic_outline_favorite_border_24)
                } else {
                    updateItem(item, position, true)
                    liked.setImageResource(R.drawable.ic_baseline_favorite_24)
                }
            }
        }

        private fun updateItem(item: ItemInfo, position: Int, liked: Boolean) {
            val updatedItem = ItemInfo(
                item.gender, item.name,
                item.category, item.price, item.thumbnail,
                liked,
                item.Details, item.sizeList, item.quality
            )
            itemList[position] = updatedItem
            notifyDataSetChanged()
        }

    }
}