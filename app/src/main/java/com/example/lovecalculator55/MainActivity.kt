package com.example.lovecalculator55

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.lovecalculator55.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val viewModel: LoveViewModel by viewModels()

    @Inject
    lateinit var hero: Hero

    @Inject
    lateinit var makeVoice: MakeVoice

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            getBtn.setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    makeVoice.birdQuake(),
                    Toast.LENGTH_SHORT
                ).show()

            }
        }
    }
}