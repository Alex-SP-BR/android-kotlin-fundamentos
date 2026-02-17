fun main(){
    
    println("Você está Cansado? (true / false")
    val entrada = readLine()?.lowercase()
    
    if(entrada != "true" && entrada != "false"){
        println("Entrada invalida")
        return
    }
    val estaCansado = entrada.toBoolean()
    
    if(estaCansado){
        
        println("descansar")
    }else{
        
        println("treinar")
    }
}
