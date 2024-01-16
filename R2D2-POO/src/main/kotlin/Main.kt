import javax.naming.InitialContext

class Robot(val nombre : String){

    /*var posX: Int
    init {
        this.posX = 0
    }
    Se puede hacer asi cunaod quieres meter codigo dentro, en este caso al asignarle un 0, no tieen sentido*/

    var posX: Int = 0
    var posY = 0
    var dir = 0  // 0 -> PositiveY; 1 -> NegativeX; 2 -> NegativeY; 3 -> PositiveX

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
            if (this.dir < 3) this.dir +=1 else this.dir = 0
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
        intArrayOf(10, 2, -2),
        intArrayOf(0, 0, 0),
        intArrayOf(),
        intArrayOf(-10, -5, 2),
        intArrayOf(-10, -5, 2, 4, -8)
    )

    for (movimiento in movimientos){
        robot1.mover(movimiento)
        robot1.mostrarDireccion()
    }


}