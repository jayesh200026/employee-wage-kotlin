package com.employeeWage

object constants {
    const val ABSENT = 0
    const val IS_FULL_TIME = 1
    const val IS_PART_TIME = 2
    const val FULL_DAY_HOUR = 8
    const val PART_TIME_HOUR = 4

}

fun main() {
    println("Welcome to employee wage computation")
    val companyBuilder = EmployeeWageBuilder()
    companyBuilder.addCompany("Google", 30, 90, 20)
    companyBuilder.addCompany("Amazon", 40, 80, 18)
    companyBuilder.computeEmpWage()
    companyBuilder.getTotalWage("Google")
  
}