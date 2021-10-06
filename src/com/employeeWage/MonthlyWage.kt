package com.employeeWage

class MonthlyWage {
    companion object {
        fun computeMonthlyWage() {
            var attendance: Int
            var totalWage: Int = 0
            for (i in 1..constants.TOTAL_WORKING_DAYS) {
                attendance = attendance()
                totalWage += DailyWage.computeDailyWage(attendance,constants.WAGE_PER_HOUR).first
            }
            println("Monthly wage of employee working for 20 days is $totalWage")
        }
    }
}