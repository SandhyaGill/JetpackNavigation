package com.example.jetpacknavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController


class JetpackActivity : AppCompatActivity() {
    var controller : NavController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jetpack)
        controller = findNavController(R.id.controller)

    }
}