package com.employeeWage

class EmployeeWage {
    companion object {
        fun computeWage(companyName:String,ratePerHour:Int,maximumHour:Int,maximumDays:Int) {
            var time = 0
            var days = 0
            var totalWage = 0

            while (time < maximumHour && days < maximumDays) {
                val (wage, hours) = DailyWage.computeDailyWage(attendance(),ratePerHour)
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
}