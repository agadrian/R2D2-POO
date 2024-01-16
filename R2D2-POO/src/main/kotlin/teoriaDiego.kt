/*
class Perro(var nombre: String, peso: Int) {
    var raza: String = ""
        get() = field.uppercase()
        set(value) {
            require(value.isNotEmpty()) { "Raza no puede estar vacía" }

            // lo mismo que lo de arriba: if (value.isEmpty()) throw IllegalArgumentException("Raza no puede estar vacía")

            field = value.lowercase()
        }

    var peso: Int = 0

    init {
        this.peso = peso
    }

    private var color: String = ""

    fun getColor(): String {
        return this.color.uppercase()
    }

    fun setColor(color: String) {
        if (color.isNotEmpty()) {
            this.color = color
        }
    }

    constructor(nombre: String, raza: String, peso: Int) : this(nombre, peso) {
        this.raza = raza
    }

    constructor(nombre: String, raza: String) : this(nombre, 0) {
        this.raza = raza
    }

    fun ladrar() {
        println("guau")
    }


    override fun toString(): String {
        return "${this.nombre} de color ${this.color} raza ${this.raza} y peso ${this.peso}}"
    }

}

fun main() {

    //val perro1 = Perro("Dobby", "Boston Terrier", 10200)

    val perro1 = Perro("Dobby", "Boston Terrier")

    val perro2 = Perro("Bichito", "Rata")
    val perro3 = Perro("Thortilla", "Pastor alemán", 35)


    perro1.setColor("Rojo")

    println(perro1.getColor())

    println("perro1.toString()--------")
    println(perro1.toString())
    println("perro1.toString()--------")



    perro1.ladrar()

    perro1.nombre = "Dobby"
    perro1.raza = "Boston Terrier"
    perro1.peso = 10200


    /*
    fun isAnEmail(email: (String) -> Boolean) {
        print("Introduzca su email: ")
        if (email(readln())) {
            println("Email de empresa correcto.")
        }
        else {
            println("Email incorrecto.")
        }
    }

    isAnEmail { it.contains("@") && it.contains("business.com") }
    */
}
*/


