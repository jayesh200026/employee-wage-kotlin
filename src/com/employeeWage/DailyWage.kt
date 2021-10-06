package com.employeeWage

class DailyWage {
    companion object {
        fun computeDailyWage(employee: Int): Pair<Int, Int> {
            val dailyWage = when (employee) {
                constants.IS_FULL_TIME -> Pair(
                    constants.WAGE_PER_HOUR * constants.FULL_DAY_HOUR,
                    constants.FULL_DAY_HOUR
                )
                constants.IS_PART_TIME -> Pair(
                    constants.WAGE_PER_HOUR * constants.PART_TIME_HOUR,
                    constants.PART_TIME_HOUR
                )
                else -> Pair(0, 0)
            }
            println("Employee daily wage is ${dailyWage.first}")
            return dailyWage
        }
    }
}