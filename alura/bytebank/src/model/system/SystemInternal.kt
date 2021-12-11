package model.system

import model.employee.Authentication

class SystemInternal {

    fun login(authentication: Authentication, passsword: String) {
        if (authentication.auth(passsword)) {
            println("Dostęp dozwolony!\n")
        } else {
            println("Odmowa dostępu!\n")
        }
    }

}