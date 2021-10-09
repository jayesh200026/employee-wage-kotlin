package com.employeeWage

class CompanyEmployeeWage(val companyName: String, val ratePerHour: Int, val maximumHour: Int, val maximumDays: Int) {
    var dailyWage:Int=0
        set(value) {field=value}
    var totalWage:Int=0
        set(value) {field=value}


    override fun toString(): String {
        return "CompanyEmployeeWage(companyName='$companyName',Totalwage='$totalWage')"
    }


}