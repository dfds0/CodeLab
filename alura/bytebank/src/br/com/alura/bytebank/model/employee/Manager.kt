package br.com.alura.bytebank.model.employee

open class Manager(
    name: String,
    document: String,
    salary: Double,
    password: String
) : Administrator(name, document, salary, password) {

    override val salaryBonus: Double
        get() = super.salary * 0.2

}