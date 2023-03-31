package com.m_newsoryx

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val politics = findViewById(R.id.politics) as Button
        politics.setOnClickListener {
            val x = Intent(Intent.ACTION_VIEW, Uri.parse("https://nation.africa/kenya/news/politics"))
            startActivity(x)
        }//end


        val sports = findViewById(R.id.sports) as Button
        sports.setOnClickListener {
            val x = Intent(Intent.ACTION_VIEW, Uri.parse("https://nation.africa/kenya/sports"))
            startActivity(x)
        }//end


        val business = findViewById(R.id.business) as Button
        business.setOnClickListener {
            val x = Intent(Intent.ACTION_VIEW, Uri.parse("https://nation.africa/kenya/business"))
            startActivity(x)
        }//end


    }
}