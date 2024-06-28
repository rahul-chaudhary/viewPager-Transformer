package com.example.curlpagetransformer.viewpagerTransformer

import android.view.View
import androidx.viewpager.widget.ViewPager
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

class BookFlipPageTransformer2 : ViewPager.PageTransformer {

    private val LEFT = -1f
    private val RIGHT = 1f
    private val CENTER = 0f
    private val MAX_ROTATION = 15f  // Adjust for desired max rotation angle
    private val SCALE_FACTOR = 0.8f  // Adjust for scaling of transitioning page

    override fun transformPage(page: View, position: Float) {
        val absPosition = Math.abs(position).toFloat()

        // Handle visibility
        if (absPosition > 1f) {
            page.visibility = View.GONE
            return
        } else {
            page.visibility = View.VISIBLE
        }

        // Set translation (movement)
        val translationX = page.width * -position
        page.translationX = translationX

        // Handle scaling (optional, adjust for effect)
        if (position > CENTER || position < CENTER) {
            val scale = SCALE_FACTOR + (1 - SCALE_FACTOR) * (1 - absPosition)
            page.scaleX = scale
            page.scaleY = scale
        }

        // Set rotation and curling effect
        val rotationY: Float
        val pivotX: Float
        if (position > CENTER) {
            rotationY = MAX_ROTATION * (1 - absPosition)
            pivotX = page.width * (1 - absPosition)
        } else if (position < CENTER) {
            rotationY = -MAX_ROTATION * (1 - absPosition)
            pivotX = page.width * absPosition
        } else {
            rotationY = 0f
            pivotX = page.width * 0.5f
        }
        page.pivotX = pivotX
        page.rotationY = rotationY
    }
}
