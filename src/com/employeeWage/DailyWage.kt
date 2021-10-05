package com.employeeWage

object wageConstants {
    const val WAGE_PER_HOUR = 20
    const val FULL_DAY_HOUR = 8
}

fun computeDailyWage(employee: Int) {
    var dailyWage = 0
    if (employee == employeeConstants.IS_PRESENT) {
        dailyWage = wageConstants.WAGE_PER_HOUR * wageConstants.FULL_DAY_HOUR
    }
    println("Employee daily wage is $dailyWage")
}