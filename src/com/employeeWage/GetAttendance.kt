package com.employeeWage

object employeeConstants {
    const val ABSENT = 0
    const val IS_FULL_TIME = 1
    const val IS_PART_TIME = 2
}

fun attendance(): Int {
    val check: Int = (0..2).random()
    return when (check) {
        employeeConstants.IS_FULL_TIME -> employeeConstants.IS_FULL_TIME
        employeeConstants.IS_PART_TIME -> employeeConstants.IS_PART_TIME
        employeeConstants.ABSENT -> employeeConstants.ABSENT
        else -> -1
    }
}