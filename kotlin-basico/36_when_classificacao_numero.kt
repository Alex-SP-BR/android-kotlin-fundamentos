fun main(){
    
    println("numero:")
    val n = readLine()!!.toInt()
    
    when{
        
        n > 0 && n % 2 == 0 -> println("R: ${n} par Positivo")
        n > 0 -> println("R: ${n} ímpar positivo")
        n < 0 -> println("R: ${n} negativo")
        else -> println("R: ${n} zero")
    }
}
