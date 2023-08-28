package com.example.ui_desing_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ui_desing_app.databinding.ActivityMainBinding
import com.example.ui_desing_app.databinding.ActivityMainSignupBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.textViewKaydol.setOnClickListener {

            val intent=Intent(this,MainActivitySignup::class.java)
            startActivity(intent)

        }
        binding.facebookButton.setOnClickListener {

           /* val intent=Intent(this,ActivityMainSignupBinding::class.java)
            startActivity(intent)*/
            Toast.makeText(this, "Facebook İle Giriş Yapıyorsunuz.", Toast.LENGTH_SHORT).show()

        }
        binding.googleButton.setOnClickListener {

            /* val intent=Intent(this,ActivityMainSignupBinding::class.java)
             startActivity(intent)*/
            Toast.makeText(this, "Google İle Giriş Yapıyorsunuz.", Toast.LENGTH_SHORT).show()

        }
        binding.textViewKaydol.setOnClickListener {

            val intent=Intent(this,MainActivitySignup::class.java)
             startActivity(intent)

        }
        binding.imageViewGiris.setOnClickListener {

            val textvievmail = binding.editTextMail.text.toString()
            val textvievpassword = binding.editTextPassword.text.toString()

            if (textvievmail.isNotEmpty() && textvievpassword.isNotEmpty()) {
                val intent = Intent(this, MainActivityAnasayfa::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "E-Posta ve Şifre Giriniz!", Toast.LENGTH_SHORT).show()
            }
        }




    }

}