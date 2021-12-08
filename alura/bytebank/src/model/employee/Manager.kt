package model.employee

import model.employee.Employee

open class Manager(
    name: String,
    document: String,
    salary: Double,
    private val password: String
) : Employee(name, document, salary) {

    override val salaryBonus: Double
        get() =  super.salary * 0.2

    fun auth(password: String): Boolean {
        return password == this.password
    }
}