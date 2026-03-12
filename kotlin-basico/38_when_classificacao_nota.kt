fun main(){
    
    println("Nota:")
    val nota = readLine()!!.toDouble()
    
    when{
        
        nota >= 7.0 -> println("R: ${nota} aprovado")
        nota >= 5.0 -> println("R: ${nota} recuperação")
        else -> println("R: ${nota} reprovado")
    }
}
