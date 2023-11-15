class Car{
    var brand =""
    var model = ""
    var year = ""
    var price = ""
}

fun main() {
    val c1 = Car()
    c1.brand = "BMW"
    c1.model = "q3"
    c1.year = "2020"
    c1.price = "20k"

    println(c1.brand + " " + c1.model)
}