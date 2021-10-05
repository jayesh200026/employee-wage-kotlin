package com.employeeWage
object constants{
    const val TOTAL_WORKING_DAYS=20
}

fun computeMonthlyWage(){
    var attendance:Int
    var totalWage:Int=0
    for(i in 1..constants.TOTAL_WORKING_DAYS){
        attendance = attendance()
        totalWage+=computeDailyWage(attendance)
    }
    println("Monthly wage of employee working for 20 days is $totalWage")
}