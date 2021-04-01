open class ScpSafe() : ScpContainment {
    open val example: String = "SCP-999"

    var name: String = "default name"
    constructor(name: String): this() {
        this.name = name
    }

    open fun print() {
        println("Example of SAFE scp: $example")
    }

    override fun printContainment() {
        print("Simple or not required containment")
    }

}

class ScpEuclid(name: String, val level: Int): ScpSafe(name) {

    override val example: String = "SCP-173"
    init {
        println("New instance")
    }

    override fun print() {
        super.print()
        println("Example of EUCLID scp: $example")
    }

    override fun printContainment() {
        print("Protected containment")
    }

}

interface ScpContainment {
    fun printContainment()
}


fun main() {
    var scp999 = ScpSafe("SCP-999")
    println(scp999.name)
    scp999.print()
    scp999.printContainment()

    println("---")

    var scp173 = ScpEuclid("SCP-173", 1)
    println(scp173.name)
    scp173.print()
    scp173.printContainment()
}