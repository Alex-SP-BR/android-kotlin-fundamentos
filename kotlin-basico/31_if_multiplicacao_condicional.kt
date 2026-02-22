fun main(){
    
    println("digite um numero:")
    val n = readLine()!!.toInt()
    
    if(n>=6){
        
        println("Vou multiplicar $n por 7. Resultado: ${n*7}")
    }else{
        
        println("Número digitado: $n")
    }
}
