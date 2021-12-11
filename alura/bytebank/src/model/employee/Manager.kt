package model.employee

import model.employee.Employee

open class Manager(
    name: String,
    document: String,
    salary: Double,
    password: String
) : Administrator(name, document, salary, password) {

    override val salaryBonus: Double
        get() =  super.salary * 0.2
}