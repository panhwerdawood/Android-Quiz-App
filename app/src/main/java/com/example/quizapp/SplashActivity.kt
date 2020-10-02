package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.example.quiz.MainActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)
        val background = object : Thread() {
            override fun run() {

                try {
                    // Thread will sleep for 5 seconds
                    Thread.sleep(1000)

                    // After 5 seconds redirect to another intent
                    val i = Intent(baseContext, MainActivity::class.java)
                    startActivity(i)
                    finish()

                } catch (e: Exception) {

                }

            }
        }

        // start thread
        background.start()

    }

    override fun onDestroy() {

        super.onDestroy()

    }
}