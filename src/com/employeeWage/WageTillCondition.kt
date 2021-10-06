package com.employeeWage

class EmployeeWage(val companyName: String, val ratePerHour: Int, val maximumHour: Int, val maximumDays: Int) {

    fun computeWage() {
        var time = 0
        var days = 0
        var totalWage = 0

        while (time < maximumHour && days < maximumDays) {
            val (wage, hours) = DailyWage.computeDailyWage(attendance(), ratePerHour)
            totalWage += wage
            time += hours
            days += 1
        }
        println("Company:$companyName")
        println("Total wage = $totalWage")
        println("Working Days = $days")
        println("Working Hours = $time")
    }

}