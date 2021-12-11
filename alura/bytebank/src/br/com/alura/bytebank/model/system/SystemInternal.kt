package br.com.alura.bytebank.model.system

import br.com.alura.bytebank.model.employee.Authentication

class SystemInternal {

    fun login(authentication: Authentication, passsword: String) {
        if (authentication.auth(passsword)) {
            println("Dostęp dozwolony!\n")
        } else {
            println("Odmowa dostępu!\n")
        }
    }

}