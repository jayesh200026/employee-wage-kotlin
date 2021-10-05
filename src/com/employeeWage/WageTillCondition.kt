package com.employeeWage

fun wageTillCondition() {
    var time = 0
    var days = 0
    var totalWage = 0

    while (time < constants.TOTAL_WORKING_HOURS && days < constants.TOTAL_WORKING_DAYS) {
        val (wage, hours) = computeDailyWage(attendance())
        totalWage += wage
        time += hours
        days += 1
    }
    println("Total wage = $totalWage")
    println("Working Days = $days")
    println("Working Hours = $time")
}