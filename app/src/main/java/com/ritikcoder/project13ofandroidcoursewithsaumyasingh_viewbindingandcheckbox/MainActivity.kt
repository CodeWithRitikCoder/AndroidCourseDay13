package com.ritikcoder.project13ofandroidcoursewithsaumyasingh_viewbindingandcheckbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.ritikcoder.project13ofandroidcoursewithsaumyasingh_viewbindingandcheckbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed({
            val intentToOpenActivity2= Intent(this, MainActivity2::class.java)
            startActivity(intentToOpenActivity2)
            finish()
        }, 1000)

    }
}