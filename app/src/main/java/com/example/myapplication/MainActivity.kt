package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Mengatur padding untuk edge-to-edge
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Menginisialisasi TextView dan menetapkan NIM serta nama
        val tvNim: TextView = findViewById(R.id.nim)
        val tvName: TextView = findViewById(R.id.nama)

        val nim = "225150607111034" // Ganti dengan NIM yang diinginkan
        val name = "Ni Nyoman Dinda Permata Putri Bangse" // Ganti dengan nama yang diinginkan

        tvNim.text = "NIM: $nim"
        tvName.text = "Name: $name"
    }
}
