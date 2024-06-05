package Fundamentos.pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "333.222.111-00";
        pessoa1.nome = "Victor";
        pessoa1.idade = 19;

        System.out.println(pessoa1.imprimirDadosDaPessoa(1));

        Pessoa pessoa2 = new Pessoa();
        pessoa2.cpf = "444.555.777-00";
        pessoa2.nome = "Maria";
        pessoa2.idade = 58;

        System.out.println(pessoa2.imprimirDadosDaPessoa(2));
       
    }
}
