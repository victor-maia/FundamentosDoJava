package Fundamentos.pessoa;

public class Pessoa {
    //nome, idade, cpf
    String nome;
    int idade;
    String cpf;

    String imprimirDadosDaPessoa(int indice){
        return "O nome da pessoa é " + nome + " A idade é " + " E o documento é " + cpf + " E o índice é: ";
    }
}
