package com.employeeWage

fun attendance(): Int {
    val check: Int = (0..2).random()
    return when (check) {
        constants.IS_FULL_TIME -> constants.IS_FULL_TIME
        constants.IS_PART_TIME -> constants.IS_PART_TIME
        constants.ABSENT -> constants.ABSENT
        else -> -1
    }
}