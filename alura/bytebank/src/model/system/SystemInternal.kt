package model.system

import model.employee.Administrator

class SystemInternal {

    fun login(administrator: Administrator, passsword: String) {
        if (administrator.auth(passsword)) {
            println("Dostęp dozwolony!")
        } else {
            println("Odmowa dostępu!")
        }
    }

}