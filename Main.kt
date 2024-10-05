// POO no Kotlin

fun main(){

    //val meuCarro = Carro("Toyota", "Corolla", 2020)

    //meuCarro.ligar()
    //meuCarro.status()

    // meuCarro.desligar()
    // meuCarro.status()

    //val meuCachorro = Cachorro("Luki", "Salsicha", 10, 18.20)

    //meuCachorro.latir()
    //meuCachorro.comer()
    //meuCachorro.envelhecer()

    //println("Nome do titular: ")
    //val nomeTitular = readln() ?: "Titular Desconhecido"

    //println("Digite o saldo inicial: ")
    //val saldoInicial = readln().toDoubleOrNull() ?: 0.0

    //val conta = contaBancaria(nomeTitular, saldoInicial)

    //conta.mostrarSaldo()

    //conta.depositar(100.0)
    //conta.sacar(50.0)

    val meuLivro = Livro("Como enfrentar o ódio", "Felipe Neto", 350)

    meuLivro.ler(50)
    meuLivro.statusLeitura()

    meuLivro.ler(100)
    meuLivro.statusLeitura()

    meuLivro.ler(200)
    meuLivro.statusLeitura()

    meuLivro.ler(10)
}


// Exercício 1
class Carro(val marca: String, val modelo: String, val ano: Int){

    var ligado: Boolean = false

    fun ligar(){
        ligado = true
        println("Carro ligado.")
    }

    fun desligar(){
        ligado = false
        println("Carro desligado.")
    }

    fun status(){
        val statusligado = if (ligado) "Ligado" else "desligado"
        println("Marca: $marca, Modelo: $modelo, Ano: $ano, Status: $statusligado.")
    }

}


// Exercício 2

class Cachorro(val name: String, val raca: String, val age: Int, val peso: Double){

    fun latir(){
        println("Au Au")
    }

    fun comer(){
        println("O cachorou comeu e agora pesa ${peso - 0.5} KG.")
    }

    fun envelhecer(){

        println("O cachorro fez aniversário e agora tem ${age + 1} anos.")
    }

}


// Exercicio 3

class contaBancaria(val titular: String, var saldo: Double){

    fun depositar(valor: Double){
        saldo += valor
        println("Seu saldo aumento para $saldo reais.")
    }

    fun sacar(valor: Double){
        if (valor <= saldo){
            saldo -= valor
            println("Saque realizado. Saldo atual $saldo.")
        }else{
            println("Saldo Insuficiente")
        }
    }

    fun mostrarSaldo(){
        println("Saldo atual: $saldo.")
    }

}

class Livro(val titulo: String, val autor: String, val paginas: Int){
    var paginasLidas: Int = 0

    fun ler(paginas: Int){
        if (paginasLidas + paginas > this.paginas){
            paginasLidas = this.paginas
            println("Você já terminou o livro.")
        }else{
            paginasLidas += paginas
            println("Você leu mais $paginas páginas.")
        }
    }

    fun statusLeitura(){
        val paginasRestantes = paginas - paginasLidas
        println("Você já leu $paginasLidas páginas e faltam $paginasRestantes páginas para acabar.")
    }

}