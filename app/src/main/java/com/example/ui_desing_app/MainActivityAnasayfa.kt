package com.example.ui_desing_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ui_desing_app.databinding.ActivityMainAnasayfaBinding

class MainActivityAnasayfa : AppCompatActivity() {
    private lateinit var binding: ActivityMainAnasayfaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainAnasayfaBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}