fun main(){
    
    println("Está camsado?(sim ou não)")
    val resposta = readLine()?.lowercase()
    
    val estaCansado = resposta == "não"
    
    if(!estaCansado){
        
        println("Descansar")
    }else{
        
        println("Treinar")
    }
}
