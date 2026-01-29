fun main() {

    println("Digite um número:")
    val n = readLine()!!.toInt()
    
    if(n==0){
        println("Zero não é Multiplo de 3 nem de 5")
    }else if (n % 3 == 0 && n % 5 == 0) {
        println("Múltiplo de 3 e 5")
    } else if (n % 3 == 0) {
        println("Múltiplo de 3")
    } else if (n % 5 == 0) {
        println("Múltiplo de 5")
    }else{
        println("Não é múltiplo de 3 nem de 5")
    }
}
