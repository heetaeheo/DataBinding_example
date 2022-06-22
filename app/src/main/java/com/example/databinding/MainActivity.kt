package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.apply {

            viewmodel = mainViewModel
            lifecycleOwner = this@MainActivity

        }
    }
}