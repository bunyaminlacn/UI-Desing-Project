package com.example.ui_desing_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ui_desing_app.databinding.ActivityMainSignupBinding

class MainActivitySignup : AppCompatActivity() {
    private lateinit var binding: ActivityMainSignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainSignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewGiris.setOnClickListener {

            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)

        }

        binding.facebookButton.setOnClickListener {

            /* val intent=Intent(this,ActivityMainSignupBinding::class.java)
             startActivity(intent)*/
            Toast.makeText(this, "Facebook İle Kayıt Oluyorsunuz.", Toast.LENGTH_SHORT).show()

        }
        binding.googleButton.setOnClickListener {

            /* val intent=Intent(this,ActivityMainSignupBinding::class.java)
             startActivity(intent)*/
            Toast.makeText(this, "Google İle Kayıt Oluyorsunuz.", Toast.LENGTH_SHORT).show()

        }
        binding.imageViewKayit.setOnClickListener {


            val textvievmail=binding.editTextMail2.text.toString()
            val textvievpassword=binding.editTextPassword.text.toString()
            val textvievAd=binding.editTextAd.text.toString()

            if (textvievmail.isNotEmpty() && textvievpassword.isNotEmpty() ){

                val intent=Intent(this,MainActivityAnasayfa::class.java)
                startActivity(intent)

            }
            else{

                Toast.makeText(this, "Eksik Bilgi Girdiniz!", Toast.LENGTH_SHORT).show()

            }




        }


    }
}