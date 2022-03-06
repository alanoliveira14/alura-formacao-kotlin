package conta

/**
@author : agoliveira 03/2022
 */

//construtor primario da classe já definindo as properties direto nele
class Conta(
    private var titular: String, //utilizando getter & setter like java
    val numeroConta: Int
//    val numeroConta: Int = 0 (sobrecarga de construtores, definindo valor padrao caso nao seja passado)
) {

//  construtor secundario like java
//    constructor(titular: String, numeroConta: Int) {
//        this.titular = titular
//        this.numeroConta = numeroConta
//    }


    var saldo = 0.0
        private set //deixando só o setter privado para ser manipulado por atribuição direta

    fun depositar(valorDeposito : Double){

        println("Depositando $valorDeposito na conta [${this.numeroConta}] do titular [${this.titular}]")

        this.saldo += valorDeposito

        println("Saldo final ${this.saldo}")

    }

    fun sacar(valorSaque : Double): Boolean {

        println("Saldo inicial ${this.saldo}")
        println("Sacando R$ $valorSaque da conta [${this.numeroConta}] do titular [${this.titular}]")

        if (this.saldo >= valorSaque){

            this.saldo -= valorSaque

            println("Saldo final ${this.saldo}")

            return true
        }

        println("Valor indisponivel para saque")
        return false
    }

    fun setTitular(titular:String){

        this.titular = titular

    }

    fun getTitular() :String{

        return this.titular

    }



}