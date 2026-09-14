var fruits = mutableListOf<String>("PERA", "UVA", "MAÇA", "KIWI", "ABACAXI", "MELÃO")

fun main() {
    println("Bem vindo ao ProHortufruit!\n Na sua lista tem: \n$fruits")
    menu()
}
fun menu(){
    var opcao: Int = 0
    while (opcao != 3) {
        println("Você deseja...\n" +
            "1.Atualizar lista\n" +
            "2. Buscar por fruta\n" +
            "3. Sair")
        opcao = readln().toInt()
     println("Opção $opcao selecionada...")
        if (opcao == 1) {
            att()
        }
        else if (opcao == 2){
            busca()
        }
        else if (opcao == 3){
            sair()
        }
        else println("Digite uma opção válida!")
    }
}
fun att () {
    println("Digite o nome da fruta (MAIUSCULA):")
    var fruta = readln().uppercase()
    while (fruta != "PARE") {
        if (fruta in fruits) {
            fruits.remove(fruta)
            println("Fruta removida da lista.")
            if (fruits.size == 0) {
                println("Lista encerrada!")
                break
            }
        } else {
            println("A fruta não está na lista")
        }
        println("Digite o nome da fruta:")
        fruta = readln().uppercase()
    }
}

fun busca(){
    println("Digite a fruta que deseja buscar:")
    var bfruit = readln().uppercase()
    while (bfruit !in fruits) {
        println("Fruta indisponível.")
        break
    }
    println("$bfruit está na lista!")
}
fun sair() {
    println("Obrigado pela preferência, volte sempre!")

}


