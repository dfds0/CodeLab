open class Manager(
    name: String,
    document: String,
    salary: Double,
    val password: String
) : Employee(name, document, salary) {

    override val salaryBonus: Double get() = super.salaryBonus + this.salary

    fun auth(password: String): Boolean {
        return password == this.password
    }
}