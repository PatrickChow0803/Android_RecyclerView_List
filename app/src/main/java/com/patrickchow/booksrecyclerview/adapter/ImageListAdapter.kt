package com.patrickchow.booksrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.patrickchow.booksrecyclerview.R
import com.patrickchow.booksrecyclerview.model.Book
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.books_item_layout.view.*

class ImageListAdapter (val data: MutableList<Book>):RecyclerView.Adapter<ImageListAdapter.ViewHolder>(){
    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val title: TextView = view.tv_title
        val author: TextView = view.tv_author
        val picture: ImageView = view.image_cover
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewGroup = LayoutInflater.from(parent.context).inflate(R.layout.books_item_layout, parent, false)
        return ViewHolder(viewGroup)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = data[position].title
        holder.author.text = data[position].author
        holder.picture.setImageDrawable(data[position].cover)
    }
}