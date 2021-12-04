open class Employee(
    val name: String,
    val document: String,
    val salary: Double
) {
    open val salaryBonus: Double get() = salary * 0.1

    fun about() {
        println("Name: ${this.name}")
        println("Document: ${this.document}")
        println("Salary: ${this.salary}. + Bonus: ${this.salaryBonus} \n")
    }
}