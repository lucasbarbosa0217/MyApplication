package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var categoriaTab: TabLayout.Tab
    private lateinit var conquistaTab: TabLayout.Tab
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)


        // Referenciar o TabLayout e as guias
        tabLayout = findViewById(R.id.tabLayout)
        categoriaTab = tabLayout.getTabAt(0)!! // Índice da guia "categoriaTab"
        conquistaTab = tabLayout.getTabAt(1)!! // Índice da guia "conquistaTab"

        // Configurar a ação ao pressionar a guia "conquistaTab"
        conquistaTab.view.setOnClickListener {
            val intent = Intent(this, Conquista::class.java)
            startActivity(intent)
            finish();
        }

        // Desabilitar a guia "categoriaTab" para que não seja clicável
        categoriaTab.view.isClickable = false
        categoriaTab.view.isFocusable = false
        categoriaTab.select()
    }
    }
