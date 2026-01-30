package com.example.antipattenermagicnumber

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.antipattenermagicnumber.ui.theme.AntiPattenerMagicNumberTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AntiPattenerMagicNumberTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { _ ->
                    initAntiPatterMagicNumber()
                }
            }
        }
    }
}

fun initAntiPatterMagicNumber() {
    println("Area: ${calculateArea(10.0)}")
    println("Perimeter: ${calculatePerimeter(10.0)}")
}

fun calculateArea(radio: Double): Double {
    return 3.14159 * radio * radio
}

fun calculatePerimeter(radio: Double): Double {
    return 2 * 3.14159 * radio
}
