package br.com.alura.bytebank.model.employee

interface Authentication {

    fun auth(password: String): Boolean

}