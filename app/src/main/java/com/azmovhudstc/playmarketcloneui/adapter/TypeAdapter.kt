package com.azmovhudstc.playmarketcloneui.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.azmovhudstc.playmarketcloneui.R
import com.azmovhudstc.playmarketcloneui.model.Type
import kotlinx.android.synthetic.main.item.view.*


class TypeAdapter(var list: ArrayList<Type>, var context:Context):RecyclerView.Adapter<TypeAdapter.MyViewHolder>() {

    inner class MyViewHolder(var itemView:View):RecyclerView.ViewHolder(itemView){
        fun onBind(movie: Type,position: Int){
            itemView.type_name.text=movie.typeName
            itemView.type_color.setBackgroundColor(Color.BLACK)
            if (0==position){
                itemView.type_color.setBackgroundColor(Color.BLUE)
                itemView.type_name.setTextColor(Color.BLUE)

            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
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