enum class Classification {
    SAFE, EUCLID, KETER, THAUMIEL, NEUTRALIZED,
    UNDEFINED {
        fun classifyAsNew(): Classification { return SAFE }
    }
}

fun example(classification: Classification): String {
    val classification = Classification.EUCLID
    when (classification) {
        Classification.SAFE -> { return "SCP-999" }
        Classification.EUCLID -> { return "SCP-173" }
        Classification.KETER -> { return "SCP-106" }
        Classification.THAUMIEL -> { return "SCP-179" }
        Classification.NEUTRALIZED -> { return "SCP-1241" }
        else -> { return "No example available" }
    }
}


fun main() {
    println("${Classification.SAFE}")
    println("${Classification.EUCLID.name}")
    println("${Classification.KETER.ordinal}")
    println("${Classification.THAUMIEL.declaringClass}")
    println("${Classification.valueOf("APOLLYON")}")

    println("--")
    Classification.values().forEach(::println)
    println("--")

    println("Example Safe: ${example(Classification.SAFE)}")
    println("Example Euclid: ${example(Classification.EUCLID)}")
    println("Example Keter: ${example(Classification.KETER)}")
    println("Example Thaumiel: ${example(Classification.THAUMIEL)}")
    println("Example Neutralized: ${example(Classification.NEUTRALIZED)}")
    println("Example UNDEFINED: ${example(Classification.UNDEFINED)}")
}