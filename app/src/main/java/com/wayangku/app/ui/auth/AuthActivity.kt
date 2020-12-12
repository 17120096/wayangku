package com.wayangku.app.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.wayangku.app.R
import com.wayangku.app.data.model.AuthUser
import com.wayangku.app.databinding.ActivityAuthBinding
import com.wayangku.app.ui.home.MainActivity
import android.content.Intent as Intent

class AuthActivity : AppCompatActivity() {
    lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auth)
    }

    fun onSuccess(user: AuthUser) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}