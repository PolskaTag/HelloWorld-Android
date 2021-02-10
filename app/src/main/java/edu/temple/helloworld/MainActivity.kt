package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Changes the textView on tap
    fun onPress(view: View) {
        val editText: TextView = findViewById(R.id.textView)
        editText.text = getString(R.string.button_clicked)
    }
}