package com.employeeWage

object constants {
    const val ABSENT = 0
    const val IS_FULL_TIME = 1
    const val IS_PART_TIME = 2
    const val WAGE_PER_HOUR = 20
    const val FULL_DAY_HOUR = 8
    const val PART_TIME_HOUR = 4
    const val TOTAL_WORKING_DAYS = 20
    const val TOTAL_WORKING_HOURS = 100
}

fun main() {
    println("Welcome to employee wage computation")
    wageTillCondition()
}