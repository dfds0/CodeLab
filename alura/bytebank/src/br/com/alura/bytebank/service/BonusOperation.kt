package br.com.alura.bytebank.service

import br.com.alura.bytebank.model.employee.Administrator
import br.com.alura.bytebank.model.employee.Employee

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