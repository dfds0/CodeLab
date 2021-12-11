package br.com.alura.bytebank.model.employee

class Director(
    name: String,
    document: String,
    salary: Double,
    password: String,
    private val plr: Double
) : Administrator(name, document, salary, password) {

    override val salaryBonus: Double
        get() = super.salary * 0.05 + this.plr

}