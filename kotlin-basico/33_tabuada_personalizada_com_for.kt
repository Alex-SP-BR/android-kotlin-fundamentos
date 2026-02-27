fun main(){
    
    println("Nome:")
    val nome = readLine()!!
    
    println("Numero:")
    val n = readLine()!!.toInt()
    
    println("Valor:")
    val valor = readLine()!!.toDouble()
    
    for(i in 1..n){
        
        println("R: ${nome} ${i} = ${valor * i}")
    }
}
