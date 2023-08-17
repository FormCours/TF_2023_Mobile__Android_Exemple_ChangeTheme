package be.tftic.web2023.test_theme_daynight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import be.tftic.web2023.test_theme_daynight.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMainDayMode.setOnClickListener { enableDayMode() }
        binding.btnMainNightMode.setOnClickListener { enableNightMode() }
        binding.btnMainDefaultMode.setOnClickListener { enableDefaultMode() }
    }

    private fun enableDayMode() {
        TODO("Not yet implemented")
    }

    private fun enableNightMode() {
        TODO("Not yet implemented")
    }

    private fun enableDefaultMode() {
        TODO("Not yet implemented")
    }
}