package com.rondroid.hgnxcv.Adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rondroid.hgnxcv.Models.CVModel
import kotlinx.android.synthetic.main.cvitem_layout.view.*

class AdapterCV (val arrayList: ArrayList<CVModel>):RecyclerView.Adapter<AdapterCV.ViewHolderCv>(){

    inner class ViewHolderCv(itemView:View):RecyclerView.ViewHolder(itemView){

        fun bindItems(cvModel: CVModel){
            itemView.educationTv.text = cvModel.Title
            itemView.y1Tv.text  = cvModel.year1
            itemView.sub1Tv.text = cvModel.subTitle1
            itemView.y2Tv.text = cvModel.year3
            itemView.sub2Tv.text = cvModel.subTitle2
            itemView.y3Tv.text = cvModel.year3
            itemView.sub3Tv.text = cvModel.subTitle3
            itemView.iconEdu.setImageResource(cvModel.image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCv {
        
    }

    override fun onBindViewHolder(holder: ViewHolderCv, position: Int) {

    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}