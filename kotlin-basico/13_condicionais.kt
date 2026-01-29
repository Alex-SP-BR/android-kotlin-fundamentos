fun main(){
    
    println("Digite nota")
    val n = readLine()!!.toInt()
    
    if(n<5){
        
        println("Insuficiente")
    }else if(n<=6){
        
        println("Regular")
    }else if(n<=8){
        
        println("Bom")
    }else{
    println("Execelente")
    }
}
