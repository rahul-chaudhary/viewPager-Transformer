package com.example.curlpagetransformer

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.curlpagetransformer.Data.fetchImages
import com.example.curlpagetransformer.adapter.VPAdapter
import com.example.curlpagetransformer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainActVP.adapter = VPAdapter(fetchImages())
//        binding.mainActVP.setPageTransformer(true, ViewPager.PageTransformer())


    }
}