package com.azmovhudstc.playmarketcloneui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.azmovhudstc.playmarketcloneui.R
import com.azmovhudstc.playmarketcloneui.model.Tops
import kotlinx.android.synthetic.main.items_top.view.*


class TopsAdapter(var list: List<Tops>):RecyclerView.Adapter<TopsAdapter.MyViewHolder>() {

    inner class MyViewHolder(var itemView:View):RecyclerView.ViewHolder(itemView){
        fun onBind(movie: Tops,position: Int) {
            itemView.tops_name.text=movie.topsName
            itemView.typ_tops.text=movie.typeTops
            itemView.size_tops.text=movie.sizeTops
            itemView.rating_tops.text=movie.ratingTops
            itemView.type_tops.text=movie.typeTops
            itemView.big_image.setImageResource(movie.bigImage)
            itemView.image_small.setImageResource(movie.smallImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.items_top, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var currentItem=list[position]
        holder.onBind(currentItem,position=position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}