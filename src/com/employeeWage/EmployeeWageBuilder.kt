package com.employeeWage

class EmployeeWageBuilder {
    var employeeArray = mutableListOf<CompanyEmployeeWage>()

    fun addCompanyEmpWage(companyName: String, ratePerHour: Int, maximumHour: Int, maximumDays: Int) {
        employeeArray.add(CompanyEmployeeWage(companyName, ratePerHour, maximumHour, maximumDays))
    }

    fun computeEmpWage() {
        for (i in employeeArray) {
            var time = 0
            var days = 0
            var totalWage = 0

            while (time < i.maximumHour && days < i.maximumDays) {
                val (wage, hours) = DailyWage.computeDailyWage(attendance(), i.ratePerHour)
                totalWage += wage
                time += hours
                days += 1
            }
            i.totalWage = totalWage
            println(i)
        }
    }
}