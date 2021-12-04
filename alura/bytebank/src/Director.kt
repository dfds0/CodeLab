class Director(
    name: String,
    document: String,
    salary: Double,
    password: String,
    val plr: Double
) : Manager(name, document, salary, password) {
    override val salaryBonus: Double get() = super.salaryBonus + this.salary + this.plr
}