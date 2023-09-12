package com.rondroid.redod

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*
import kotlin.contracts.contract

class PersonAdapter(val personArray:ArrayList<PersonData>, val context:Context):RecyclerView.Adapter<PersonAdapter.PersonViewHolder>(){

    inner class PersonViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun bindItems(personData: PersonData){
            itemView.nameTv.text = personData.name
            itemView.nickNameTv.text = personData.nickName
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bindItems(personArray[position])
    }

    override fun getItemCount(): Int {
        return personArray.size
    }
}