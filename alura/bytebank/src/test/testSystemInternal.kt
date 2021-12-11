package test

import model.client.ClientTierC
import model.employee.Director
import model.employee.Manager
import model.system.SystemInternal

fun testSystemInternal() {

    val system = SystemInternal()

    val type2 = Manager("Manager", "123456789", 200.0, "ABC")
    println("Użytkownik: ${type2.name}")
    system.login(type2, "ABC")

    val type3 = Director("Director", "123456789", 300.0, "def", 0.3)
    println("Użytkownik: ${type3.name}")
    system.login(type3, "ABC")

    val tyerC = ClientTierC("TierC", 0, "GhI")
    println("Użytkownik: ${tyerC.name}")
    system.login(tyerC, "GhI")

}