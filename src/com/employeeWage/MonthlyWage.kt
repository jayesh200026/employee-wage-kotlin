package com.employeeWage

fun computeMonthlyWage() {
    var attendance: Int
    var totalWage: Int = 0
    for (i in 1..constants.TOTAL_WORKING_DAYS) {
        attendance = attendance()
        totalWage += computeDailyWage(attendance).first
    }
    println("Monthly wage of employee working for 20 days is $totalWage")
}