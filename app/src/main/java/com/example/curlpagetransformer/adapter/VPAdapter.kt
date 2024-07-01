package com.example.curlpagetransformer.adapter

import android.animation.ObjectAnimator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.example.curlpagetransformer.R
import com.example.curlpagetransformer.customView.PageCurlView2


class VPAdapter(private val imgList: List<Int>) : PagerAdapter() {

    override fun getCount(): Int {
        return imgList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        // Inflate the layout for each page
        val inflater = LayoutInflater.from(container.context)
        val view = inflater.inflate(R.layout.item_view_pager, container, false)

        // Find the ImageView in the inflated layout
        val imageView : PageCurlView2 = view.findViewById(R.id.pageCurlView2)

        // Set the image resource for the ImageView
//        imageView.setImageResource(imgList[position])
        imageView.setCurlView(imgList.toList())
        // Add the view to the container
        container.addView(view)


        // Return the view as the key object
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        // Remove the view from the container
        container.removeView(`object` as View)
    }
}