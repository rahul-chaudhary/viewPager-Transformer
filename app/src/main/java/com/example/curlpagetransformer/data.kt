package com.example.curlpagetransformer

object Data {

    fun fetchImages(): Array<Int> {

        return arrayOf(
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
        )
    }

    fun fetchFoodImages(): List<Int> {
        return listOf(
            R.drawable.food1,
            R.drawable.food2,
            R.drawable.food3,
        )
    }
}