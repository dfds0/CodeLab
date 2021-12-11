package br.com.alura.bytebank.model.employee

abstract class Employee(
    val name: String,
    val document: String,
    val salary: Double
) {
    abstract val salaryBonus: Double

    fun about() {
        println("Name: ${this.name}")
        println("Document: ${this.document}")
        println("Salary: ${this.salary}. + Bonus: ${this.salaryBonus} \n")
    }
}