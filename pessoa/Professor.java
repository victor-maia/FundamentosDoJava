package Fundamentos.pessoa;

public class Professor extends Pessoa {
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    String imprimirDadosDaPessoa(){
        System.out.println(super.imprimirDadosDaPessoa());
        return "Você é professor";
    }
}
