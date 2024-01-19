import javax.naming.InitialContext

enum class Direccion {
    PositiveY, NegativeX, NegativeY, PositiveX
}

class Robot(private val nombre : String){

    private var posX = 0
    private var posY = 0
    private var dir = Direccion.PositiveY


    /**
     * Mueve el robot de posicion
     * @param movimientos Intarray lista de movimientos
     */
    fun mover(movimientos: IntArray){
        for (movs in movimientos){
            when (this.dir) {
                Direccion.PositiveY -> this.posY += movs
                Direccion.NegativeX -> this.posX -= movs
                Direccion.NegativeY -> this.posY -= movs
                Direccion.PositiveX -> this.posX += movs
            }

            // Cambia de una direccion a otra constantemente
            this.dir = when (this.dir){
                Direccion.PositiveY -> Direccion.NegativeX
                Direccion.NegativeX -> Direccion.NegativeY
                Direccion.NegativeY -> Direccion.PositiveX
                Direccion.PositiveX -> Direccion.PositiveY
            }

        }

    }

    /**
     * Obtiene la direccion a la que mira el robot.
     */
    private fun obtenerDireccion() =
         when (this.dir){
             Direccion.PositiveY -> "PositiveY"
             Direccion.NegativeX -> "NegativeX"
             Direccion.NegativeY -> "NegativeY"
             Direccion.PositiveX -> "PositiveX"

        }

    /**
     * Muestra por pantalla la informacion de corrdenadas y direccion del robot
     */
    fun mostrarDireccion(){
        println("${this.nombre} esta en (${this.posX}, ${this.posY}) ${obtenerDireccion()}")
    }

}


fun main(){
    val robot1 = Robot("R2D2")

    // Creamos un array de IntsArrays con las indicaciones para el robot
    val movimientos = arrayOf(
        intArrayOf(10, 5, -2),
        intArrayOf(0, 0, 0),
        intArrayOf(),
        intArrayOf(-10, -5, 2),
        intArrayOf(-10, -5, 2, 4, -8),
        intArrayOf(3,4, 2)
    )

    // Recorremos el array para aplicarle al robot sus funciones
    for (movimiento in movimientos){
        robot1.mover(movimiento)
        robot1.mostrarDireccion()
    }
    
}