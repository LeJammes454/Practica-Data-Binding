package com.example.practicalinerlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener{
            addNickName(it)
        }
    }

    private fun addNickName(view : View){
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)

        val  addNickName = findViewById<Button>(R.id.done_button)

        nicknameTextView.text=editText.text
        editText.visibility= View.GONE
        view.visibility=View.GONE
        nicknameTextView.visibility = View.VISIBLE


        addNickName.setOnClickListener{
            Log.d("MainActivity","sad")
        }
    }

}