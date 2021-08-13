package com.shofiul.proman

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shofiul.proman.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {
    lateinit var binding:ActivityFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val font:Typeface = Typeface.createFromAsset(assets,"fonts/Roboto-Bold.ttf")
        binding.tvProman.typeface = font
    }
}