package com.example.uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.uts.fragments.FCalculator
import com.example.uts.fragments.FConversion
import com.example.uts.fragments.FHome
import com.example.uts.fragments.FMoney
import com.example.uts.fragments.FTentang
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bottomnavmenu = findViewById<BottomNavigationView>(R.id.bottom_nav)
        loadFragment(FHome())
        bottomnavmenu.setOnItemSelectedListener {
            when(it.itemId){
                R.id.bot_menu_home ->{
                    loadFragment(FHome())
                    true
                }
                R.id.bot_menu_calculator ->{
                    loadFragment(FCalculator())
                    true
                }
                R.id.bot_menu_conversion ->{
                    loadFragment(FConversion())
                    true
                }
                R.id.bot_menu_bmi ->{
                    loadFragment(FMoney())
                    true
                }
                R.id.tentang ->{
                    loadFragment(FTentang())
                    true
                }

                else -> {
                    true
                }

            }
        }
    }

    fun loadFragment(fragment : Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container,fragment)
            commit()
        }

    }
}