package org.example

class IllegalWeightInput: IllegalArgumentException  ("Weight should be a positive number>0")

class IllegalHeightInput: IllegalArgumentException  ("Height should be a positive number>0")
fun calculateBodyMassIndex(weight: Double,height: Double): Double {

    if (height<=0.0){
        throw IllegalHeightInput()
    }
    if (weight<=0.0){
        throw IllegalWeightInput()
    }
    return weight/(height*height)
}