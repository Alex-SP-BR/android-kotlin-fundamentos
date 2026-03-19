fun calcularMedia(n1: Double, n2: Double): Double{
    
    return (n1+n2)/2
}

fun main(){
    
    val resultado = calcularMedia(10.0, 10.0)
    
    if(resultado >= 7){
        
        println("Aprovado com nota $resultado")
    }else{
        
        println("Reprovado com nota $resultado")
    }
}
