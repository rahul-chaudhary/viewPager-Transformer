package com.example.curlpagetransformer.viewpagerTransformer

import android.view.View
import androidx.viewpager.widget.ViewPager
import kotlin.math.abs


class HingeTransformation : ViewPager.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        page.translationX = -position * page.width
        page.pivotX = 0f
        page.pivotY = 0f


        if (position < -1) {    // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.alpha = 0f
        } else if (position <= 0) {    // [-1,0]
            page.rotation = (90 * abs(position.toDouble())).toFloat()
            page.alpha = (1 - abs(position.toDouble())).toFloat()
        } else if (position <= 1) {    // (0,1]
            page.rotation = 0f
            page.alpha = 1f
        } else {    // (1,+Infinity]
            // This page is way off-screen to the right.
            page.alpha = 0f
        }
    }
}