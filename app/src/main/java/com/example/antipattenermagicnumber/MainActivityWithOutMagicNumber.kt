package com.example.antipattenermagicnumber

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.antipattenermagicnumber.repositories.CalculateAreaRepository
import com.example.antipattenermagicnumber.repositories.CalculatePerimeterRepository
import com.example.antipattenermagicnumber.ui.theme.AntiPattenerMagicNumberTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
class MainActivityWithOutMagicNumber : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AntiPattenerMagicNumberTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { _ ->
                    initSolutionAntiPatterMagicNumber()
                }
            }
        }
    }
}

fun initSolutionAntiPatterMagicNumber() {
    val calculateArea = CalculateAreaRepository()
    val calculatePerimeter = CalculatePerimeterRepository()

    println("Area: ${calculateArea.calculateArea(5.0)}")
    println("Perimeter: ${calculatePerimeter.calculatePerimeter(5.0)}")
}