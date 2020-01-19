package com.example.recycleronlineshop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleronlineshop.Model.LatestArrivalDataClass
import com.example.recycleronlineshop.R
import kotlinx.android.synthetic.main.latestarrivals.view.*

class LatestArrivalViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
    var image = itemview.findViewById<ImageView>(R.id.image_latest1)
    var name = itemview.findViewById<TextView>(R.id.text_name)
}

class LatestArrivaladapetr(var latestarrivallist: ArrayList<LatestArrivalDataClass>) :
    RecyclerView.Adapter<LatestArrivalViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestArrivalViewHolder {

        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.latestarrivals, parent, false)
        return LatestArrivalViewHolder(view)

    }

    override fun getItemCount(): Int {
        return latestarrivallist.size
    }

    override fun onBindViewHolder(holder: LatestArrivalViewHolder, position: Int) {
        holder.image.setImageResource(latestarrivallist[position].image)
        holder.name.text=latestarrivallist[position].name
    }

}
