package model.employee

interface Authentication {

    fun auth(password: String): Boolean

}