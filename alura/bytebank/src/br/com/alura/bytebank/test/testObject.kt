package br.com.alura.bytebank.test

import br.com.alura.bytebank.model.employee.Employee
import br.com.alura.bytebank.model.employee.Manager

fun testObject() {
    println("\n### testObject")

    var manager = Manager("Manager", "123456789", 200.0, "ABC")

    redo("Process finished with exit code ")
    redo(0)
    redo(" ")
    redo(true)
    redo(" ")
    redo(Unit)
    redo(" ")
    redo(manager)
    redoAs(manager)
}

fun redo(value: Any): Unit {
    if (value is Manager)
        println("\n -- Manager Name:" + value.name)
    else
        print(value)
}

fun redoAs(value: Any): Unit {
    value as Employee
    println("\n -- Employee Name:" + value.name)
}