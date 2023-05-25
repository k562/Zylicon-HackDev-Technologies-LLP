package com.example.oxygreens

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.Window
import android.view.WindowManager
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.oxygreens.Fragments.AccountFragment
import com.example.oxygreens.Fragments.HelpFragment
import com.example.oxygreens.Fragments.HomeFragment
import com.example.oxygreens.Fragments.OffersFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import javax.net.ssl.SSLEngineResult.Status

class MainActivity : AppCompatActivity() {

  // initialising the bottom navigation view
    lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // this is the title for activity
        title = "OxyGreens"

        setContentView(R.layout.activity_main)

        // Code for to set the colour of status bar
        window.setStatusBarColor(Color.parseColor("#c6f68d"))


        // Declaring the bottom navigation view
        bottomNavigationView = findViewById(R.id.bottomNavigationView)

        // Call back Function of replace with fragment by taking home fragment as argument
        replacewithfragment(HomeFragment())



        // Code for to set on clickListner for bottom navigation view

       bottomNavigationView.setOnItemSelectedListener {

        when(it.itemId){
            R.id.home -> replacewithfragment(HomeFragment())
            R.id.offer -> replacewithfragment(OffersFragment())
            R.id.help -> replacewithfragment(HelpFragment())
            R.id.account -> replacewithfragment(AccountFragment())

            else -> {

            }
        }
           true
       }




    }

    // Transaction of fragment to navigate it to the bottom navigation view
    private fun replacewithfragment(fragment: Fragment) {

            val fragmentmanager = supportFragmentManager
            val transaction = fragmentmanager.beginTransaction()
            transaction.replace(R.id.frameLayout,fragment)
            transaction.commit()
    }




    // Code for to set the menu in the activity

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_drawer,menu)
        return super.onCreateOptionsMenu(menu)
    }



   // Code for to set the on click listner for menu items

    override fun onOptionsItemSelected(item: MenuItem): Boolean {


         when(item.itemId){
             R.id.Shop -> {
                 
                 val intent = Intent(this@MainActivity ,shopActivity::class.java)
                 startActivity(intent)
             }
         }

        return super.onOptionsItemSelected(item)
    }
}