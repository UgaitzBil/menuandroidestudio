package com.example.menu

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu ,
            menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.gorde-> {
                Toast.makeText(this, "Gorde botoia sakatu da", Toast.LENGTH_SHORT)
                true
            }

            R.id.irten-> {
                Toast.makeText(this, "Irten botoia sakatu da", Toast.LENGTH_SHORT)
                true
            }


            R.id.zabaldu-> {
                Toast.makeText(this, "zabaldu botoia sakatu da", Toast.LENGTH_SHORT)
                true
            }
            else -> return super.onOptionsItemSelected(item)
        }

    }



    }
