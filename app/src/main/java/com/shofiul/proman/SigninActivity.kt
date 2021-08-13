package com.shofiul.proman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shofiul.proman.databinding.ActivitySigninBinding

class SigninActivity : AppCompatActivity() {
    lateinit var binding:ActivitySigninBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.signinToolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.toolbar_icon_24)

        binding.signinToolbar.setOnClickListener{
            onBackPressed()
        }
    }
}