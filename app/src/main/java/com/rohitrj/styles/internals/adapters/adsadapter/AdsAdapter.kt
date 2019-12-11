package com.rohitrj.styles.internals.adapters.adsadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.rohitrj.styles.R
import com.rohitrj.styles.data.models.Ads

class AdsAdapter(list: ArrayList<Ads>) : RecyclerView.Adapter<AdsAdapter.MyViewHolder>() {

    var arrayList: ArrayList<Ads> = list

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.ads_layout, parent, false
        )
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.seeDetails(arrayList[position])
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun seeDetails(ads: Ads) {
            val imageData = ads.imageData
            val imageView = itemView.findViewById<ImageView>(R.id.imageViewAds)
            imageView.setImageResource(imageData)
        }

    }
}