package com.employeeWage

object employeeConstants {
    const val IS_PRESENT = 1
}

fun attendance(): Int {
    val check = (0..1).random()
    if (check == employeeConstants.IS_PRESENT) {
        println("Present")
        return employeeConstants.IS_PRESENT
    } else {
        println("Absent")
        return 0
    }
}