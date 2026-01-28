fun main(){
    
    println("Digite um Número Inteiro:")
    val n = readLine()!!.toInt()
    
    if(n==0){
        
        println("Zero é Par")
    }else if(n>0&&n%2==0){
        
        println("Par e Positivo")
    }else if(n>0){
        
        println("Ímpar e Positivo")
    }else{
        
        println("Negativo")
    }
}
