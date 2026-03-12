fun main(){
    
    println("Turno:")
    val turno = readLine()!!
    
    when(turno){
        
        "manhã" -> println("R: ${turno} dia")
        "tarde" -> println("R: ${turno} dia")
        "noite" -> println("R: ${turno} noite")
        else -> println("R: ${turno} inválido")
    }
}
