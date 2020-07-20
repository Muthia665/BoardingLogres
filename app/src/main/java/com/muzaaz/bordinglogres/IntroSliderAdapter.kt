package com.muzaaz.bordinglogres

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// adapter berfungsi untuk menampilkan item yang di muat ke dalam adapter
// adapter untuk menghubungkan data dengan view nya

// membuat introslides untuk mengubah data menjadi entuk list
class IntroSliderAdapter (private val introSlides: List<IntroSlide>)
    // kalo buat adapter ada codingan ini
    : RecyclerView.Adapter<IntroSliderAdapter.IntroSliderViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroSliderViewHolder {
        return IntroSliderViewHolder(
            //onCreateViewHolder =
        LayoutInflater.from(parent.context).inflate(R.layout.slide_item,parent, false)
        )
    }

    override fun getItemCount(): Int {
        // buat ngitung si list nya ada berapa
        return introSlides.size
    }

    override fun onBindViewHolder(holder: IntroSliderViewHolder, position: Int) {
        // buat nge set up widget
        holder.bind(introSlides[position])
    }

    inner class IntroSliderViewHolder (view : View): RecyclerView.ViewHolder(view) {
        private val textTitle = view.findViewById<TextView>(R.id.textTitle)
        private val textDescription = view.findViewById<TextView>(R.id.textDescription)
        private val imageicon = view.findViewById<ImageView>(R.id.imageIcon)

        fun bind (introSlide: IntroSlide) {
            textTitle.text = introSlide.title
            textDescription.text = introSlide.description
            imageicon.setImageResource(introSlide.image)
        }
    }
}