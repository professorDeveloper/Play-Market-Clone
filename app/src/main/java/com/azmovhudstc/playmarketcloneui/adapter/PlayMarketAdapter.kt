package com.azmovhudstc.playmarketcloneui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.azmovhudstc.playmarketcloneui.R
import com.azmovhudstc.playmarketcloneui.model.GeneralData
import kotlinx.android.synthetic.main.general_item.view.*

class PlayMarketAdapter(var arrayList: List<GeneralData>,var context:Context) :
    RecyclerView.Adapter<PlayMarketAdapter.Wh>() {
    inner class Wh(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun generalData(generalData: GeneralData) {
            itemView.title_general.text=generalData.title
            var topsAdapter=TopsAdapter(list = generalData.appList )
            itemView.rv_inside.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false,)
            itemView.rv_inside.adapter=topsAdapter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Wh {
        return Wh(LayoutInflater.from(parent.context).inflate(R.layout.items_top, parent, false))
    }

    override fun onBindViewHolder(holder: Wh, position: Int) {
        holder.generalData(arrayList[position]!!)
    }

    override fun getItemCount(): Int = arrayList.size

}