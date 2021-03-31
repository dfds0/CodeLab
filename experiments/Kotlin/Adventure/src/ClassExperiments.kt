class Experiment1

class Experiment2 (var name: String, var value: String)

class Experiment3 (var name: String) { init { println("Message: $name")} }

class Experiment4 (var name: String) { var value: String = "Default" }

class Experiment5 (var name: String, val value: String) { val description = "$name - $value"}

class Experiment6 (var name: String, val value: String) {
    val description: String
        get() = "The description is: $name - $value - $type"
    var type: String = "None"
        set(value) { field = value }
}


fun main() {
    val exp1 = Experiment1()
    println("Exp 1: $exp1")

    val exp2 = Experiment2("_name", "_value")
    println("Exp 2: ${exp2.name} - ${exp2.value}")

    val exp3 = Experiment3("test init")
    println("Exp 3: ${exp3.name}")

    val exp4 = Experiment4("test property")
    println("Exp 4: ${exp4.value}")

    val exp5 = Experiment5("constant", "variable")
    exp5.name = "name"
    //exp5.value = "value"
    //exp5.description = "description"
    println("Exp 5: ${exp5.description}")

    val exp6 = Experiment6("Class", "6")
    println("Exp 6.1: ${exp6.description}")
    exp6.type = "Experiment"
    println("Exp 6.2: ${exp6.description}")
}
