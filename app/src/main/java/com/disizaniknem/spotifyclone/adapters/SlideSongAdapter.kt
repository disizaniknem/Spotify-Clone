package com.disizaniknem.spotifyclone.adapters

import androidx.recyclerview.widget.AsyncListDiffer
import com.disizaniknem.spotifyclone.R
import kotlinx.android.synthetic.main.swipe_item.view.*

class SlideSongAdapter : BaseSongAdapter(R.layout.list_item) {

    override val differ = AsyncListDiffer(this, diffCallback)

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song = songs[position]
        holder.itemView.apply {
            val text = "${song.title} - ${song.subtitle}"
            tvPrimary.text = text

            setOnClickListener {
                onItemClickListener?.let { click ->
                    click(song)
                }
            }
        }
    }
}