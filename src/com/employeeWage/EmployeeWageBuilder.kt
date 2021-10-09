package com.employeeWage

class EmployeeWageBuilder : ComputeEmployeeWage {
    var employeeArray = arrayListOf<CompanyEmployeeWage>()

    override fun addCompany(companyName: String, ratePerHour: Int, maximumHour: Int, maximumDays: Int) {
        employeeArray.add(CompanyEmployeeWage(companyName, ratePerHour, maximumHour, maximumDays))
    }

    override fun computeEmpWage() {
        for (i in employeeArray) {
            var time = 0
            var days = 0
            var totalWage = 0

            while (time < i.maximumHour && days < i.maximumDays) {

                days += 1
                val (wage, hours) = DailyWage.computeDailyWage(attendance(), i.ratePerHour)
                time += hours
                i.dailyWage = wage
                totalWage += wage
                println("Day:: $days Working Hour::$hours Daily wage=${i.dailyWage}")
            }
            i.totalWage = totalWage
            println(i)
        }
    }

    fun getTotalWage(company: String): Int {
        for (i in employeeArray) {
            if (company == i.companyName) {
                println("Total wage of $company is ${i.totalWage}")
                return i.totalWage
            }
        }
        println("Company name not found")
        return -1
    }
}