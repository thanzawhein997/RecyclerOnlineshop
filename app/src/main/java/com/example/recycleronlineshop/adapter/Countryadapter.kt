package com.example.recycleronlineshop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleronlineshop.Model.CountryDataclass
import com.example.recycleronlineshop.R

class CountryViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
    var image = itemview.findViewById<ImageView>(R.id.image_country)
    var name = itemview.findViewById<TextView>(R.id.txt_countryname)
}

class Countryadapter(var countrylist: ArrayList<CountryDataclass>) : RecyclerView.Adapter<CountryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.country, parent, false)
        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countrylist.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.image.setImageResource(countrylist[position].image)
        holder.name.text = countrylist[position].name
    }

}