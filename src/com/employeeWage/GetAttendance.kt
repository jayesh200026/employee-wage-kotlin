package com.employeeWage

object employeeConstants {
    const val IS_FULL_TIME = 1
    const val IS_PART_TIME = 2
}

fun attendance(): Int {
    val check = (0..2).random()
    if (check == employeeConstants.IS_FULL_TIME) {
        println("Present and is Full time")
        return employeeConstants.IS_FULL_TIME
    } else if(check == employeeConstants.IS_PART_TIME){
        println("Present and is part time")
        return employeeConstants.IS_PART_TIME
    }
    else{
        println("Absent")
        return 0
    }
}