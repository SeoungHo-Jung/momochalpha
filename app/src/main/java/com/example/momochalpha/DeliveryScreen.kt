package com.example.momochalpha

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.delivery_option.*

class DeliveryScreen  : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.delivery_option)

        //postmates.setOnClickListener{
            //val intent = Intent(Intent.ACTION_VIEW).apply {
                //data = Uri.parse("https://play.google.com/store/apps/details?id=com.postmates.android")
               // setPackage("com.android.vending")
            //}
           // startActivity(intent)
       // }
    }
}
