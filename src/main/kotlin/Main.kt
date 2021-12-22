fun algoritmoVector(tamanio: Int): Array<Int?> {
    val vector = arrayOfNulls<Int>(tamanio)

    for (i in 0 until tamanio) {
        vector[i] = 2 * i + tamanio
    }

    return vector
}

fun main() {

    println("Primer valor")
    val tamanioV1 = readLine()!!.toInt()
    println("Segundo valor")
    val tamanioV2 = readLine()!!.toInt()

    val v1 = algoritmoVector(tamanioV1)
    val v2 = algoritmoVector(tamanioV2)

    val v2D: Array<Array<Int?>> = arrayOf(v1, v2)

    v2D.forEach { println(it.contentToString()) }

}