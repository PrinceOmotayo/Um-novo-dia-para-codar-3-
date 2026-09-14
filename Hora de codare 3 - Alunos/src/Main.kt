//Crie um programa onde o usuário possa cadastrar estudantes sem limites, e, em seguida, Se o usuário digitar "PARE" o programa deve exibir a quantidade de estudantes cadastrados e a lista com cada um deles.
var alunos =  mutableListOf<String>()
fun cadastrarAluno() {
    println("Digite o nome do Aluno(a):")
    var inputUser: String = readln()
    if (inputUser.uppercase() != "PARE") {
        alunos.add(inputUser)
        println("Aluno cadastrado!")
    }
    while (inputUser.uppercase() != "PARE") {
        println("Digite o nome do aluno:")
        inputUser = readln().toString()
        if (inputUser.uppercase() == "PARE") {
            println("A atual lista contém ${alunos.size}  alunos. São eles: \n $alunos")
        }
        else if (inputUser.any { !it.isLetter() }   ) {
            println("Use somente letras!")

        }  // ".any" = algum caracter.  "!it" = é diferente de  ".isLetter" = letras? : verifica se a resposta
        // é verdadeira ou falsa. Sendo verdadeira ele não adiciona a lista, afinal a lista é uma String
        else {
            alunos.add(inputUser)
            println("Aluno adicionado a lista!")
        }
    }
}

fun buscarAn() {
    println("Digite o nome do Aluno:")
    var nomeAluno: String = readln()
    if (nomeAluno in alunos) {
        println("Aluno encontrado! $nomeAluno")
    }
    else  {
        println("Aluno não encontrado. Deseja adicionar a lista?")
    }
    var opcao = readln()
    if (opcao.uppercase() == "S") {
        println("Direcinando ao cadastramento...")
        cadastrarAluno()
    }
}
fun sair () {
    println("Obrigado por usar o nosso sistema, volte sempre!")
}


fun main () {         //Entrada
    println("Bem vindo ao nosso STUDENT LIST. O que deseja fazer?")
    menu()
}
fun menu(){
    var opcao: Int = 0
    while (opcao != 3) {
        println(
            " O que deseja fazer?\n" +
                    "1- Cadastrar Alunos\n" +
                    "2- Buscar por aluno\n" +
                    "3 - Sair")
        opcao = readln().toInt()

        println("Opção $opcao selecionada.")
        if (opcao == 1) {
            cadastrarAluno()
        }
        else if (opcao == 2) {
            buscarAn()
        }
        else if (opcao == 3) {
            sair()
        }
        else {
            println("Erro! Opção inválida!")
        }
    }
}






