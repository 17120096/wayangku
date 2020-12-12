    package com.wayangku.app.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.wayangku.app.R
import com.wayangku.app.databinding.ActivityMainBinding
import com.wayangku.app.ui.auth.AuthActivity
import com.wayangku.app.ui.auth.WayangkuAuth

    class MainActivity : AppCompatActivity() {
        lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.buttonLogout.setOnClickListener {
            WayangkuAuth.logout(this) {
                startActivity(Intent(this, AuthActivity::class.java))
                finish()
            }
        }
    }
}