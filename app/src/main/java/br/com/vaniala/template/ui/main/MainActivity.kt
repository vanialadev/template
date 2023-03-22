package br.com.vaniala.template.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.vaniala.template.databinding.ActivityMainBinding
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
