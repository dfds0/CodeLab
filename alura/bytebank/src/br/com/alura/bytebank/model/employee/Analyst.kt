package br.com.alura.bytebank.model.employee

open class Analyst(
    name: String,
    document: String,
    salary: Double
) : Employee(name, document, salary) {

    override val salaryBonus: Double
        get() =  super.salary * 0.1

}