package com.ritikcoder.project13ofandroidcoursewithsaumyasingh_viewbindingandcheckbox

import android.content.DialogInterface
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.ritikcoder.project13ofandroidcoursewithsaumyasingh_viewbindingandcheckbox.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonForSignIn.setOnClickListener(){
            if (binding.checkBoxForTermsAndConditions.isChecked){
                //Open a new Activity.

            }else{
                binding.checkBoxForTermsAndConditions.buttonTintList= ColorStateList.valueOf(Color.RED)
                Toast.makeText(this, "Please accept the Terms and Conditions", Toast.LENGTH_SHORT).show()

            }
        }

        binding.buttonForCancel.setOnClickListener {
            finish()
        }

    }
}