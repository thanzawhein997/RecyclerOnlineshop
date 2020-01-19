package com.example.recycleronlineshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleronlineshop.Model.CountryDataclass
import com.example.recycleronlineshop.Model.LatestArrivalDataClass
import com.example.recycleronlineshop.Model.Populardataclass
import com.example.recycleronlineshop.adapter.Countryadapter
import com.example.recycleronlineshop.adapter.LatestArrivaladapetr
import com.example.recycleronlineshop.adapter.Popularadapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycleronlineshop)

        latestarrivalrecycler()
        countryrecycler()
        popularproductrecycler()
    }

    fun latestarrivalrecycler()
    {
        var latestrecyclerview :RecyclerView=findViewById(R.id.recycler_latest)

        var latestlist=ArrayList<LatestArrivalDataClass>()
        latestlist.add(LatestArrivalDataClass(R.drawable.huaweimate30pro,"Huawei Mate 30 pro \n Huawei"))
        latestlist.add(LatestArrivalDataClass(R.drawable.hangbag,"HangBag \n Louis Vuitton"))
        latestlist.add(LatestArrivalDataClass(R.drawable.tshirt,"T-Shirt \n Police"))

        latestrecyclerview.layoutManager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, true)

        var latestArrivaladapetr=LatestArrivaladapetr(latestlist)

        latestrecyclerview.adapter=latestArrivaladapetr
    }

    fun countryrecycler()
    {
        var countryrecyclerview:RecyclerView=findViewById(R.id.recycler_country)

        var countrylist=ArrayList<CountryDataclass>()
        countrylist.add(CountryDataclass(R.drawable.china,"China"))
        countrylist.add(CountryDataclass(R.drawable.california,"California"))
        countrylist.add(CountryDataclass(R.drawable.moscow,"Moscow"))
        countrylist.add(CountryDataclass(R.drawable.russia,"Russia"))

        countryrecyclerview.layoutManager=GridLayoutManager(this,2)

        var countryadaper=Countryadapter(countrylist)

        countryrecyclerview.adapter=countryadaper
    }

    fun popularproductrecycler()
    {
        var popularproductrecycler:RecyclerView=findViewById(R.id.recycler_product)

        var popularproductlist=ArrayList<Populardataclass>()
        popularproductlist.add(Populardataclass("Iphone 11 Pro max","Apple",1299.00,R.drawable.iph11promax))
        popularproductlist.add(Populardataclass("Water Bed Cooling","GhostBed",9999.00,R.drawable.waterbed))
        popularproductlist.add(Populardataclass("Dj Emulator product","Pioneer",2930.00,R.drawable.dj))

        popularproductrecycler.layoutManager=LinearLayoutManager(this)

        var popularadapter=Popularadapter(popularproductlist)

        popularproductrecycler.adapter=popularadapter
    }
}
