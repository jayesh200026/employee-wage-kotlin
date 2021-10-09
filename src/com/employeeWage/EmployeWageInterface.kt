package com.employeeWage

interface ComputeEmployeeWage {
    fun addCompany(companyName: String, ratePerHour: Int, maximumHour: Int, maximumDays: Int)
    fun computeEmpWage()
}
