fun main() {

    //EPS
    var lista_planetas = mutableListOf<String>("Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno", "Plutão")

    //PROCESSAMENTO
    println(lista_planetas)
    println("Informe um planeta para checagem: ")
    var inputUsuario = readln()
    var resposta : String

    if (inputUsuario in lista_planetas){
        println("Planeta encontrado!")
        println("Deseja removê-lo? S/N")
        resposta = readln()
        if (resposta.uppercase() == "S") {
            lista_planetas.remove(element = inputUsuario)
        println("O planeta $inputUsuario foi removido da lista. Essa é a lista atual: $lista_planetas")
            println("Obrigado por usar o nosso sistema. Volte sempre!")
        }
    }
    else {
        println("Este planeta não está na lista.")
        println("Deseja inclui-lo na lista?  S/N" )
        resposta = readln()
        if (resposta.uppercase()=="S") {
            lista_planetas.add(inputUsuario)
            println("Planeta adiconado a lista. A lista atual é $lista_planetas")
        }
    else {
        println("Obrigado por usar o nosso sistema. Volte sempre!")
    }
        }
    }


