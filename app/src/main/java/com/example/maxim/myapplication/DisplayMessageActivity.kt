package com.example.maxim.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_display_message.*

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        val textView = findViewById<TextView>(R.id.newTextView).apply {
            text = message
        }

        send_email.setOnClickListener() {
            val intent = Intent(Intent.ACTION_SEND)

            intent.type = "text/html"

            intent.putExtra(Intent.EXTRA_EMAIL, (arrayOf<String>("")))

            intent.putExtra(Intent.EXTRA_CC, (arrayOf<String>("")))

            intent.putExtra(Intent.EXTRA_BCC, arrayOf<String>(""))

            intent.putExtra(Intent.EXTRA_SUBJECT, "")

            intent.putExtra(Intent.EXTRA_TEXT, "")

            startActivity(intent)
        }
    }
}
