package Fundamentos.pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("333.222.111-00");
        professor.setNome("Victor");
        professor.setIdade(19);
        professor.setSalario(15000);
   
        System.out.println(professor.imprimirDadosDaPessoa());


        Aluno aluno = new Aluno();

        aluno.setCpf("333.342.214-00");
        aluno.setNome("João");
        aluno.setIdade(24);
        aluno.setMatricula("SP1252");

        System.out.println(aluno.imprimirDadosDaPessoa());
    }
}
