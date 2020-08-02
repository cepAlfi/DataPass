package com.example.datapass

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bundle_second.*

class BundleSecondActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bundle_second)

        if (intent.extras != null) {
            val bundle = intent.extras
            nama_bundle_second.setText("Nama anda adalah ${bundle?.getString("nama")}")
            umur_bundle_second.setText("Umur anda sekarang adalah ${bundle?.getString("umur")} Tahun")
        }else {
            nama_bundle_second.setText("Anda tidak mengisi nama")
            umur_bundle_second.setText("Anda tidak mengisi umur")
        }
    }
}