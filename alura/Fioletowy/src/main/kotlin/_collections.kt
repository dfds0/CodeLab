fun main(args: Array<String>) {
    val namesC: Collection<String> = listOf("Name A", "Name B", "Name C")

    println(namesC)

    val namesM: MutableCollection<String> = mutableListOf("Name D", "Name E", "Name F")

    println(namesM)

    val bankName = BankName()

    bankName.add("name_1")

    println(bankName.names)
}

class BankName {

    companion object {
        private val _names = mutableListOf<String>()
    }

    val names: Collection<String> get() = _names.toList()

    fun add(name: String) {
        _names.add(name)
    }
}