package com.example.musicplaylistapp

import android.content.Intent
import android.media.Rating
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat






class MainActivity : AppCompatActivity() {
    private lateinit var songNametxt: EditText
    private lateinit var singerNametxt: EditText
    private lateinit var ratingTxt: EditText
    private lateinit var commentsTxt: EditText
    private lateinit var addBtn: Button
    private lateinit var nextBtn: Button
    private lateinit var exitBtn: Button

    // Set the parallel arrays here
    private var songName = mutableListOf<String>()
    private var singerName = mutableListOf<String>()
    private var rating = mutableListOf<Int>()
    private var comments = mutableListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Initialise UI Elements
        songNametxt = findViewById(R.id.songNametxt)
        singerNametxt = findViewById(R.id.singerNametxt)
        ratingTxt = findViewById(R.id.ratingTxt)
        commentsTxt = findViewById(R.id.commentsTxt)
        addBtn = findViewById(R.id.addBtn)
        nextBtn = findViewById(R.id.nextBtn)
        exitBtn = findViewById(R.id.exitBtn)

        // Set the parallel arrays here

        songName = intent.getStringArrayListExtra("songName") ?: arrayListOf()
        singerName = intent.getStringArrayListExtra("singerName") ?: arrayListOf()
        rating = intent.getIntegerArrayListExtra("rating") ?: arrayListOf()
        comments = intent.getStringArrayListExtra("comments") ?: arrayListOf()

        // Set the Add to Playlist button on click listener
        addBtn.setOnClickListener {
            val songName = songNametxt.text.toString()
            val singerName = singerNametxt.text.toString()
            val rating = ratingTxt.text.toString()
            val comments = commentsTxt.text.toString()

            // Add validation here if details are empty
            if (!(songName.isNotBlank() && singerName.isNotBlank() && rating.isNotBlank() && comments.isNotBlank())) {
                // Missing Toast.LENGTH_SHORT or Toast.LENGTH_LONG
                Toast.makeText(
                    this,
                    "Song Name, Singer Name, Rating, and Comments are required!",
                    Toast.LENGTH_LONG
                ).show()


                return@setOnClickListener
            }


            // Set the Next button here on click listener
            nextBtn.setOnClickListener {

                // Code to go to the next screen
               val intent = Intent(this,DetailViewsActivity::class.java)
                startActivity(intent)  // This starts the new screen
            }



        }


    }
}