package service

import model.Employee

class BonusOperation {

    var total: Double = 0.0
        private set

    fun execute(employee: Employee) {
        this.total += employee.salaryBonus
    }

}