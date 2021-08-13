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
        setSupportActionBar(binding)
    }
}