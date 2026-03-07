fun main(){
    
    println("Nome:")
    val nome = readLine()!!
    
    println("Nota:")
    val nota = readLine()!!.toDouble()
    
    println("Faltas:")
    val faltas = readLine()!!.toInt()
    
    when{
        
        nota >= 7 && faltas <= 5 -> println("R: ${nome}, Aprovado")
        nota >= 5 && faltas <= 5 -> println("R: ${nome}, Recuperação")
        else -> println("R: ${nome}, Reprovado")
    }
}
