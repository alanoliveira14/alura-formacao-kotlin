import conta.Conta

fun main(args: Array<String>) {
    println("Bem vindo ao Bytebank!")

    val conta1 = criaConta((Math.random() * 100).toInt())
    val conta2 = criaConta((Math.random() * 100).toInt())

    //invertendo a ordem dos paramentros do construtor
    //dizendo o nome da property na hora de passar o value
    val conta3 = Conta(numeroConta = 789, titular = "Huezinho")

    transferir(conta1, conta2, Math.random()*1000)
}

fun criaConta(i:Int): Conta {


    val conta = Conta("Alan $i", 4520 + i)

    conta.depositar(0.0 + i)

    conta.depositar(conta.saldo + 300)

    println("Nome do titular: ${conta.getTitular()}")
    println("Numero da Conta: ${conta.numeroConta}")
    println("Saldo: ${conta.saldo}")
    println("--------------")

    imprimeSituacaoConta(conta.saldo)

    return conta
}

fun imprimeSituacaoConta(saldo:Double){

    when {
        saldo > 0.0 -> println("Conta positiva")
        saldo == 0.0 -> println("Conta zerada")
        else -> println("Conta negativada")
    }
    println("--------------")

}

fun transferir(contaDebito: Conta, contaCredito: Conta, valor: Double){

    if (contaDebito.sacar(valor)){

        contaCredito.depositar(valor)

    }

}