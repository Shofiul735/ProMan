package com.shofiul.proman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.shofiul.proman.databinding.ActivitySigninupBinding

class SigninupActivity : AppCompatActivity() {
    lateinit var binding:ActivitySigninupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySigninupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignin.setOnClickListener{
            Toast.makeText(this,"You clicked on Sign in Button",
            Toast.LENGTH_SHORT
                ).show()
        }
        
        binding.btnSignUpIntro.setOnClickListener {
            val intent = Intent(this,SignupActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}