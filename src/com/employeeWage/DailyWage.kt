package com.employeeWage

class DailyWage {
    companion object {
        fun computeDailyWage(employee: Int,wagePerHour:Int): Pair<Int, Int> {
            val dailyWage = when (employee) {
                constants.IS_FULL_TIME -> Pair(
                    wagePerHour * constants.FULL_DAY_HOUR,
                    constants.FULL_DAY_HOUR
                )
                constants.IS_PART_TIME -> Pair(
                    wagePerHour * constants.PART_TIME_HOUR,
                    constants.PART_TIME_HOUR
                )
                else -> Pair(0, 0)
            }
            return dailyWage
        }
    }
}