class Employee(
    val name: String,
    val document: String,
    val salary: Double
) {
    fun bonus(): Double {
        return salary * 0.1
    }

    fun about() {
        println("Name: ${this.name}")
        println("Document: ${this.document}")
        println("Salary: ${this.salary}. + Bonus: ${this.bonus()}")
    }
}