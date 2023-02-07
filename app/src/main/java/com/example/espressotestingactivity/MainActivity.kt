package com.example.espressotestingactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.espressotestingactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this

        var ettext = binding.etname.text

        binding.btnSubmit.setOnClickListener {
            if (ettext.isNullOrEmpty()) {
                Toast.makeText(this, "Please enter the data", Toast.LENGTH_SHORT).show()
            } else {
                binding.tvHint.text = ettext
            }
        }
    }


}