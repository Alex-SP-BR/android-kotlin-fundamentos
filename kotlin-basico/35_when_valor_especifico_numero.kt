fun main(){
    
    println("Número:")
    val n = readLine()!!.toInt()
    
    when(n){
        
        1 -> println("R: ${n} um")
        2 -> println("R: ${n} dois")
        3 -> println("R: ${n} três")
        else -> println("R: ${n} outro")
    }
}
