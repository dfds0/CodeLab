class Manager(
    val name: String,
    val document: String,
    val salary: Double,
    val password: String
) {
    fun bonus(): Double {
        return salary * 0.2
    }

    fun auth(password: String): Boolean {
        return password == this.password
    }

    fun about() {
        println("Name: ${this.name}")
        println("Document: ${this.document}")
        println("Salary: ${this.salary}. + Bonus: ${this.bonus()}")
    }
}