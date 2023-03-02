package com.example.mymaterialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mymaterialdesign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // inisialize
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.extendedFab.setOnClickListener {
            Toast.makeText(this, "you clicked me" ,Toast.LENGTH_LONG).show()
        }
    }
}