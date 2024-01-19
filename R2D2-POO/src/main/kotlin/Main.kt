import javax.naming.InitialContext


// TODO: Posible mejora usar enum class
class Robot(val nombre : String){

    var posX = 0
    var posY = 0
    var dir = 0  // 0 -> PositiveY; 1 -> NegativeX; 2 -> NegativeY; 3 -> PositiveX

    var posXFinal = 0
    var posYFinal = 0
    /**
     * Mueve el robot de posicion
     * @param movimientos Intarray lista de movimientos
     */
    fun mover(movimientos: IntArray){


        for (movs in movimientos){
            when (this.dir) {
                0 -> this.posY += movs
                1 -> this.posX -= movs
                2 -> this.posY -= movs
                3 -> this.posX += movs
            }

            if (dir == 3) {
                dir = 0
            }
            else{
                dir++
            }
        }



    }

    fun obtenerDireccion() =
         when (this.dir){
            0 -> "PositiveY"
            1 -> "NegativeX"
            2 -> "NegativeY"
            3 -> "PositiveX"
            else -> ""
        }


    fun mostrarDireccion(){
        println("${this.nombre} esta en (${this.posX}, ${this.posY}) ${obtenerDireccion()}")
    }

}



fun main(){
    val robot1 = Robot("R2D2")

    val movimientos = arrayOf(
        intArrayOf(10, 5, -2),
        intArrayOf(0, 0, 0),
        intArrayOf(),
        intArrayOf(-10, -5, 2),
        intArrayOf(-10, -5, 2, 4, -8),
        intArrayOf(3,4, 2)
    )

    for (movimiento in movimientos){
        robot1.mover(movimiento)
        robot1.mostrarDireccion()
    }


}