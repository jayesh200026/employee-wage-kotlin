package com.employeeWage

object wageConstants {
    const val WAGE_PER_HOUR = 20
    const val FULL_DAY_HOUR = 8
    const val PART_TIME_HOUR = 4
}

fun computeDailyWage(employee: Int):Int {
    var dailyWage = 0
    if (employee == employeeConstants.IS_FULL_TIME) {
        dailyWage = wageConstants.WAGE_PER_HOUR * wageConstants.FULL_DAY_HOUR
    }
    else if(employee == employeeConstants.IS_PART_TIME){
        dailyWage = wageConstants.WAGE_PER_HOUR * wageConstants.PART_TIME_HOUR
    }
    println("Employee daily wage is $dailyWage")
    return dailyWage
}