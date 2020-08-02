package com.example.datapass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var dataPass: DataPass
    lateinit var callMenu: CallMenu
    lateinit var whatsappMenu: WhatsappMenu

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        dataPass = DataPass()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_place, dataPass, dataPass.javaClass.simpleName)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()

        bottom_nav.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.data_pass -> {
                    dataPass = DataPass()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_place, dataPass, dataPass.javaClass.simpleName)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.call -> {
                    callMenu = CallMenu()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_place, callMenu, callMenu.javaClass.simpleName)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.whatsapp -> {
                    whatsappMenu = WhatsappMenu()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_place, whatsappMenu, whatsappMenu.javaClass.simpleName)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
            }
            true
        }
    }
}