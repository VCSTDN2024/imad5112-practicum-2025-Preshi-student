package com.example.musicplaylistapp

import android.content.Intent
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.AdapterViewFlipper
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class DetailViewsActivity : AppCompatActivity() {
    private lateinit var displayTxt: TextView
    private lateinit var displayBtn: Button
    private lateinit var calcBtn: Button
    private lateinit var showBtn: Button
    private lateinit var music_list: RecyclerView
    private lateinit var exitButton: Button


    // Put your list of songs here
    companion object {
        fun getDefaultSongs(): List<String> {
            return listOf(
            "Beautiful Things", "Imagine Dragons", "5", "Rock",
            "Way Maker", "Sinach", "5", "Gospel",
            "Ghost", "Justin Bieber", "4", "Pop",
            "Treat you better", "Shawn Mendes", "R&B",




        }


    }








    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_views)

        // Initialise UI Elements here
        displayTxt = findViewById(R.id.displayTxt)
        displayBtn = findViewById(R.id.displayBtn)
        calcBtn = findViewById(R.id.calcBtn)
        showBtn = findViewById(R.id.showBtn)
        music_list = findViewById(R.id.music_list)
        exitButton = findViewById(R.id.exitButton)







        // Set the display button on click listener
        displayBtn.setOnClickListener {
            Toast.makeText(this, "Songs Displayed!", Toast.LENGTH_SHORT).show()


            // Set the calculating button on click listener
            calcBtn.setOnClickListener {


            }

            // Set View Details button on click listener
            showBtn.setOnClickListener {
                 val intent = Intent(this,MainActivity::class.java)
                startActivity(Intent) // Go back to previous screen
            }

            // Set exit button on click listener
            exitButton.setOnClickListener {
                finishAffinity()
            }







        }












    }
}