//Taxa de Imposto de Renda
fun main(args: Array<String>) {
    //continue a solução
    fun Double.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val r = readLine()!!.toDouble()
    var i = 0.0
    var difference: Double
    
    if ( r > 4500 ) {
        i = 1000 * 0.08 + 1500 * 0.18
        difference = r - 4500
        i +=  difference * 0.28
    } else if (r > 3000) {
        i = 1000 * 0.08
        difference = r - 3000
        i += difference * 0.18
    } else if ( r > 2000  ) {
        difference = r - 2000
        i = difference * 0.08
    } 
    if (i == 0.0) println("Isento") else println("R$ ${i.format(2)}")
    
    
}
///
// Área do Círculo
import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    
    val raio = readLine()?.toDouble()
    val pi = 3.14159
   
   raio?.let {
     val area = pi*raio.pow(2)
    val resultado = BigDecimal(area).setScale(4, RoundingMode.HALF_EVEN)
    
    println("A= $resultado")
   } 
    
}
///código que deu certo
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow

fun main(args: Array<String>) {
    
    val raio = readLine()!!.toDouble()
    val pi = 3.14159
    val area = pi * raio.pow(2.0)
    val resultado = BigDecimal( area.toString()   ).setScale(4, RoundingMode.HALF_EVEN)
    println("A=$resultado")

    
}


/**************************************/
//  Primo Rápido
fun main(args: Array<String>) {
    //continue a solução
    val n = readLine()!!.toInt()
    
    for (i in n downTo 1) {
        val numero: Long = readLine()!!.toLong()
        if(primo(numero)) {
          println("Prime")
        } else{
          println("Not Prime")
        }
    
    }
    
}

fun primo(numero: Long): Boolean {
  var n: Long = 2
  if(numero <= 1) return false
  while ((n * n) <= numero){
       if(numero % n == 0L) return false
       n++
    }
    return true
}

/***********************************/
//Corrida das tartarugas
import java.io.EOFException

fun main(args: Array<String>) {

    while (true) {

        try {

            val l = readLine()!!.toInt()
            val v = readLine()!!.split(" ").run { this.map { it.toInt() } }.toMutableList()
            v.sort()
            when (v.last()) {
                in 0..9 -> println(1)
                in 10..19 -> println(2)
                else -> println(3)
            }

        } catch (f : EOFException) {
            break
        } catch (n : NullPointerException) {
            break
        } catch (e : Exception) {
            break
        }
    }
}
/**********************************/
// Figurinhas
fun main(args: Array<String>) {
    
    val lista = mutableListOf<Int>()
    
    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        lista.add(mdc(input[0], input[1]))
    }
    lista.forEach{
    println(it) }
}

// máximo divisor comum (chamada recursiva)
fun mdc(n1: Int, n2: Int): Int {
   var num1 = n1
   var num2 = n2
   if(num2 == 0) return num1
   var vale: Int = 0
   while( num2 != 0) {
     vale = num1 % num2
     num1 = num2
     num2 = vale
   }
   return num1
}


//***********************************************************************************************

//DESAFIO INTER BOOTCAMP

val inteiros = mutableListOf<Int>()
//continue declarando as variaveis
val pares: inteiros
val impares: inteiros
val positivos: inteiros
val negativos: inteiros

  for (i in 1..5) { inteiros.add(readLine()!!.toInt()) }
  for (i in inteiros) { if ( i%2 == 0 ) { pares.add(i) } }
  for (i in inteiros) { if (i%2 != 0) { impares.add(i) } }
  for (i in inteiros) { if (  i >= 0  ) { positivos.add(i) } }
  for (i in inteiros) { if ( i < 0   ) { negativos.add(i) } }

  println("${pares.size} valor(es) par(es)")
  println("${impares.size} valor(es) impar(es)")
 println("${positivos.size} valor(es) positivo(s)")
 println("${negativos.size} valor(es) negativo(s)")

