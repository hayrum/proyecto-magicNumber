package com.example.antipattenermagicnumber.repositories

import com.example.antipattenermagicnumber.interfaces.ICalculateArea

class CalculateAreaRepository: ICalculateArea {
    override fun calculateArea(radio: Double): Double {
        return Math.PI * radio * radio
    }
}