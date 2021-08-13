package com.shofiul.proman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shofiul.proman.databinding.ActivitySigninupBinding

class SigninupActivity : AppCompatActivity() {
    lateinit var binding:ActivitySigninupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySigninupBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}