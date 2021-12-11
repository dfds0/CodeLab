package model.employee

abstract class Administrator(
    name: String,
    document: String,
    salary: Double,
    private val password: String
) : Employee(name, document, salary) {

    fun auth(password: String): Boolean {
        return password == this.password
    }
}