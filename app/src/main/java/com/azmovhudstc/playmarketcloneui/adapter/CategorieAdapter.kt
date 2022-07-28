package com.azmovhudstc.playmarketcloneui.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.azmovhudstc.playmarketcloneui.R
import com.azmovhudstc.playmarketcloneui.model.Categorie
import com.azmovhudstc.playmarketcloneui.model.Type
import kotlinx.android.synthetic.main.item.view.*
import kotlinx.android.synthetic.main.item_type.view.*


class CategorieAdapter(var list: ArrayList<Categorie>, var context:Context):RecyclerView.Adapter<CategorieAdapter.MyViewHolder>() {

    inner class MyViewHolder(var itemView:View):RecyclerView.ViewHolder(itemView){
        fun onBind(movie: Categorie,position: Int) {
            itemView.text_categorie.text=movie.text
            itemView.image_catigories.setImageResource(movie.image)
            if (position==0){
                itemView.text_categorie.setTextColor(Color.BLUE)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_type, parent, false)
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