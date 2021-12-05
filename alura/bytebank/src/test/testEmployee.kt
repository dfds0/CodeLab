import model.Analyst
import model.Director
import model.Employee
import model.Manager
import service.BonusOperation

fun testEmployee() {

    val operation = BonusOperation()

    val type1 = Employee("model.Employee", "123456789", 100.0)
    type1.about()
    operation.execute(type1)

    val type2 = Manager("model.Manager", "123456789", 200.0, "ABC")
    type2.about()
    operation.execute(type2)

    val type3 = Director("model.Director", "123456789", 300.0, "def", 0.3)
    type3.about()
    operation.execute(type3)

    val type4 = Analyst("model.Analyst", "123456789", 150.0)
    type4.about()
    operation.execute(type4)

    println("Total: ${operation.total}")
}