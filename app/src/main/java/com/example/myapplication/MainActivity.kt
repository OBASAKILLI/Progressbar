package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var strbtn= findViewById<Button>(R.id.button)as Button
        var brbar=findViewById<ProgressBar>(R.id.progressBar)as ProgressBar
        strbtn.setOnClickListener {
            var barstatus=0
            Thread(Runnable{
                while (barstatus<100){
                    barstatus +=1
                    try {
                        Thread.sleep(200)
                        brbar.progress = barstatus
                    }catch (exp: InterruptedException){
                        exp.printStackTrace()
                    }
                }
            }).start()
        }
    }
}
