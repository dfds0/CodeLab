import br.com.alura.bytebank.model.employee.Analyst
import br.com.alura.bytebank.model.employee.Director
import br.com.alura.bytebank.model.employee.Manager
import br.com.alura.bytebank.service.BonusOperation

fun testEmployee() {

    val operation = BonusOperation()

    val type2 = Manager("model.employee.Manager", "123456789", 200.0, "ABC")
    type2.about()
    operation.execute(type2)

    val type3 = Director("model.employee.Director", "123456789", 300.0, "def", 0.3)
    type3.about()
    operation.execute(type3)

    val type4 = Analyst("model.employee.Analyst", "123456789", 150.0)
    type4.about()
    operation.execute(type4)

    println("Total: ${operation.total}\n\n")

}