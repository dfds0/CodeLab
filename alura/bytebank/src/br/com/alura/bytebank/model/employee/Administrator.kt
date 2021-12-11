package br.com.alura.bytebank.model.employee

abstract class Administrator(
    name: String,
    document: String,
    salary: Double,
    private val password: String
) : Employee(name, document, salary), Authentication {

    override fun auth(password: String): Boolean {
        return password == this.password
    }

}