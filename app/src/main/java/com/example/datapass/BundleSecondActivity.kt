package com.example.datapass

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_bundle_second.*

class BundleSecondActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bundle_second)

        supportActionBar?.hide()

        Glide.with(this)
            .load(R.drawable.img)
            .into(bg)

        if (intent.extras != null) {
            val bundle = intent.extras
            nama_bundle_second.setText("""Hi, 
                |${bundle?.getString("nama")}""".trimMargin())
            umur_bundle_second.setText("Semoga kamu sehat selalu di umur yang ke-${bundle?.getString("umur")} Tahun")
        }else {
            nama_bundle_second.setText("Anda tidak mengisi nama")
            umur_bundle_second.setText("Anda tidak mengisi umur")
        }
    }
}