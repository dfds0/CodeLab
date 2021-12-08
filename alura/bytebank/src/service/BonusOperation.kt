package service

import model.employee.Employee

class BonusOperation {

    var total: Double = 0.0
        private set

    fun execute(employee: Employee) {
        this.total += employee.salaryBonus
    }

}