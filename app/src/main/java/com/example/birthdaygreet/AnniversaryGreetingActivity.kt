package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import kotlinx.android.synthetic.main.activity_anniversary_greeting.*

class AnniversaryGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_SPOUSE="name_spouse"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anniversary_greeting)
        val name1=intent.getStringExtra(NAME_SPOUSE)
        marriageAnniversary.text="Happy Marriage Anniversary\n $name1"

    }
}
