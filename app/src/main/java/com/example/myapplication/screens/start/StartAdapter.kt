package com.example.myapplication.screens.start

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.model.GifModel.GifImageData


class StartAdapter(private val context: Context) :
    RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    private var gifList: List<GifImageData> = emptyList()

    class StartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.gifHolder)
    }

    override fun onViewAttachedToWindow(holder: StartViewHolder) {
        super.onViewAttachedToWindow(holder)
        holder.itemView.setOnClickListener {
         StartFragment.clickGif(gifList[holder.adapterPosition].originalImage.imageUrl.url, it)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        return StartViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_gif, parent, false)
        )
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        val gif = gifList[position]

        Glide.with(context).load(gif.originalImage.imageUrl.url)
            .into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return gifList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<GifImageData>) {
        gifList = list
        notifyDataSetChanged()
    }

}