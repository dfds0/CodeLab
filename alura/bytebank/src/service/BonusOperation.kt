package service

import model.employee.Administrator
import model.employee.Employee

class BonusOperation {

    var total: Double = 0.0
        private set

    fun execute(employee: Employee) {
        this.total += employee.salaryBonus
    }

    fun execute(administrator: Administrator) {
        this.total += administrator.salaryBonus
    }

}