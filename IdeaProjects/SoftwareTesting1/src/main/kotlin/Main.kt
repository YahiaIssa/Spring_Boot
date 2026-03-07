package org.example

import java.io.DataInput

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

}
fun evenOrNull(input: Int): Int?{
    return if(input %2 == 0) input else null
}
fun divide(firstNumber: Int, secondNumber: Int): Int{
    return firstNumber / secondNumber
}