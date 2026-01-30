package com.example.antipattenermagicnumber.repositories

import com.example.antipattenermagicnumber.interfaces.ICalculatePerimeter

class CalculatePerimeterRepository: ICalculatePerimeter {
    override fun calculatePerimeter(radio: Double): Double {
        return 2 * Math.PI * radio
    }
}