package com.example.miniprojectlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private val name = arrayOf("Avatar","Joker","Pikachu","Pokemon","Smurf","Spiderman","Titanic",
    "ToyStory","Avatar","Joker","Pikachu","Pokemon","Smurf","Spiderman","Titanic")

    private val image = arrayOf(R.drawable.avatar, R.drawable.joker, R.drawable.pikachu,
                                R.drawable.pokemon, R.drawable.smurf, R.drawable.spiderman,
                                R.drawable.titanic, R.drawable.toystory,
                                R.drawable.avatar, R.drawable.joker, R.drawable.pikachu,
                                R.drawable.pokemon, R.drawable.smurf, R.drawable.spiderman,
                                R.drawable.titanic, R.drawable.toystory)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ListView>(R.id.list_view).adapter = ListAdapter(this, image, name)
    }
}