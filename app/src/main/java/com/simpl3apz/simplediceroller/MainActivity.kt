package com.simpl3apz.simplediceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    // initialise the dice text view
    lateinit var diceTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // find and link the dice view
        diceTextView = findViewById(R.id.diceTxtView)

        // initialise the integer variable for the dice face
        var diceNum : Int = 0

        // set on click action for dice view
        diceTextView.setOnClickListener {
            // get random number between 1 and 6 inclusive
            diceNum = Random().nextInt(6) + 1
            // set the dice view to display the number
            diceTextView.setText(diceNum.toString())
        }

    }
}