package com.example.vocalpros

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(listArray: ArrayList<ListItem>,context: Context): RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    var la = listArray
    var ct = context
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvtitle = view.findViewById<TextView>(R.id.tvTitle)
        val tvcontent = view.findViewById<TextView>(R.id.tvContent)
        val tvimage = view.findViewById<ImageView>(R.id.imV)

        fun bind(listItem: ListItem,context: Context){
            tvtitle.text = listItem.titleText
            tvcontent.text = listItem.contentText
            tvimage.setImageResource(listItem.image_id)
            itemView.setOnClickListener(){
                Toast.makeText(context, "Presed: ${tvtitle.text}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val inflater = LayoutInflater.from(ct)
        return ViewHolder(inflater.inflate(R.layout.item_layout,parent,false))
    }

    override fun getItemCount(): Int {
       return la.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       var listItem = la.get(position)
        holder.bind(listItem,ct)
    }

}