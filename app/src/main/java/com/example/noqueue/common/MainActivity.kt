package com.example.noqueue.common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.noqueue.R
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        FirebaseAuth.getInstance().signOut()
    }
}