package com.example.recycleronlineshop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleronlineshop.Model.Populardataclass
import com.example.recycleronlineshop.R

class PopularViewHolder(itemview: View):RecyclerView.ViewHolder(itemview)
{
    var name=itemview.findViewById<TextView>(R.id.txt_name)
    var brand=itemview.findViewById<TextView>(R.id.txt_brand)
    var price=itemview.findViewById<TextView>(R.id.txt_price)
    var image=itemview.findViewById<ImageView>(R.id.image_product)
}

class Popularadapter(var popularproductlist: ArrayList<Populardataclass>) : RecyclerView.Adapter<PopularViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.popularproduct,parent,false)
        return PopularViewHolder(view)
    }

    override fun getItemCount(): Int {
        return popularproductlist.size
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        holder.name.text=popularproductlist[position].name
        holder.brand.text=popularproductlist[position].brand
        holder.price.text=popularproductlist[position].price.toString()
        holder.image.setImageResource(popularproductlist[position].image)

    }

}