package com.example.curlpagetransformer

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager.PageTransformer
import com.example.curlpagetransformer.Data.fetchImages
import com.example.curlpagetransformer.adapter.VPAdapter
import com.example.curlpagetransformer.databinding.ActivityMainBinding
import com.example.curlpagetransformer.viewpagerTransformer.BookFlipPageTransformer
import com.example.curlpagetransformer.viewpagerTransformer.BookFlipPageTransformer2
import com.example.curlpagetransformer.viewpagerTransformer.FanTransformation
import com.example.curlpagetransformer.viewpagerTransformer.GateTransformation
import com.example.curlpagetransformer.viewpagerTransformer.HingeTransformation

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainActVP.adapter = VPAdapter(fetchImages())
//        binding.mainActVP.setPageTransformer(true, BookFlipPageTransformer())


    }
}