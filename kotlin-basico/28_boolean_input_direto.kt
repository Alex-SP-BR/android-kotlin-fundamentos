fun main(){
    
    println("Você está cansado?(true / False)")
    val entrada = readLine()
    
    val estaCansado = entrada?.toBoolean()
    
    if(estaCansado == true){
        
        println("descançar")
    }else{
        
        println("treinar")
    }
}
