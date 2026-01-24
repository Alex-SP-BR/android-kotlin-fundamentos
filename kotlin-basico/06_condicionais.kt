fun main(){
    
    println("Difite um numero:")
    val n = readLine()!!.toInt()
    
    if(n>0){
        
        println("Positivo")
    }else if(n<0){
        
        println("Negativo")
    }else{
        
        println("Zero")
    }
}
