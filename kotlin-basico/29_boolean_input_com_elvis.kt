fun main(){
    
    println("Você está cansado? (treu / false)")
    val estaCansado = readLine()?.toBoolean()?:false
    
    if (estaCansado){
        
        println("Descansar")
    }else{
        
        println("Treinar")
    }
    
}
