package com.shofiul.proman

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.shofiul.proman.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {
    lateinit var binding:ActivityFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val font:Typeface = Typeface.createFromAsset(assets,"fonts/Roboto-Bold.ttf")
        binding.tvProman.typeface = font


        // Handler do something about the specific time, like setTimeOut in js
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this,SigninupActivity::class.java))
            finish()
        }, 1500)


    }
}