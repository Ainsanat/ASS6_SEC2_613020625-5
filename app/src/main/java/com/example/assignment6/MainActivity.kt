package com.example.assignment6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState==null){
            supportFragmentManager.beginTransaction()
                .add(R.id.frameLayout, TwoFragment())
                .commit()
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.item_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        /*
        val manager: FragmentManager = supportFragmentManager
        val transaction: FragmentTransaction = manager.beginTransaction()
        */
        when(item.itemId){
            R.id.menu1 -> {supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, OneFragment())
                .addToBackStack(null)
                .commit()
                return true
            }
            R.id.menu2 -> {supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, ThreeFragment())
                .addToBackStack(null)
                .commit()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}
