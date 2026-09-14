//Crie um programa que funcione como uma agenda de contatos.
//O usuário pode cadastrar contatos informando nome e telefone (armazene como objetos em um array).
//O programa deve permitir que o usuário busque um contato pelo nome.
//Se o contato existir, exiba o telefone; se não existir, exiba "Contato não encontrado".
//O usuário também pode remover um contato pelo nome.
//Quando o usuário digitar "LISTAR", exiba todos os contatos cadastrados (nome e telefone).
//Quando o usuário digitar "SAIR", encerre o programa exibindo a
// mensagem "Agenda encerrada. Total de contatos: X".

data class Contato  (
    var nome: String ,
    var numero : String)
var listCtt = mutableListOf<Contato>()

    fun main() {
        println("Agenda de Contatos")
        menu()
    }

    fun menu() {
        var opcao: Int = 0
        while (opcao != 4) {
            println("O que deseja fazer?")
            println(
                "1. Adicionar.\n" +
                        "2. Listar.\n" +
                        "3. Busca.\n" +
                        "4. Sair. \n"
            )
            opcao = readln().toInt()
            println("Opção $opcao selecionada:")
            if (opcao == 1) {
                addCtt()
            }
            else if (opcao == 2){
                listar()
            }
            else if (opcao ==3 ){
                busca()
            }
            else if (opcao == 4){
                sair()
            }
            else println("Erro. Escolha uma opção válida!")
        }
    }

    fun addCtt() {
// contato1(objeto) é o que vai armazenar o as informaçoes dentro da Data Class
        var yes = true
        while (yes == true) {
            println("Digite o nome do contato:")
            var ome = readln().replaceFirstChar { it .uppercase()}
            println("Digite o número:")
            var ero = readln()
            var contato = Contato(ome, ero)
            listCtt.add(contato)
            println("Contato Adicionado! Quer continuar?")
            var resp = readln().uppercase()
            if (resp == "N") {
                yes = false }
            else yes = true
            }

        }
fun listar (){
        println("Você tem : ${listCtt.size} contatos")
    for (Contato in listCtt) {
        println(Contato.nome)
        println(Contato.numero)
    }
}

fun busca () {
    println("Informe o nome do contato:")
    var pnome: String = readln().replaceFirstChar { it.uppercase() }
    var find = false
    var nomeachado: Contato? = null
    for (contato in listCtt) {
        if (pnome == contato.nome) {
            find = true
            nomeachado = contato
        }
    }

    if (nomeachado != null) {
            println("${nomeachado.nome} encontrado.")
            println(nomeachado.numero)
        } else println("Não encontrado.")
    }

    fun sair (){
}

