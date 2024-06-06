package Fundamentos.conta;

public class ContaBancaria {
    
    private String numero;
    private String titular;
    private double saldo;


    // Getters e Setters

    public ContaBancaria() {
        saldo = 0.0;
    }


    public void setNumero(String numero){
        this.numero = numero;

    }

    public String getNumero(){
        return this.numero;
    }


    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }



    public double getSaldo() {
        return saldo;
    }


    void depositar(double valor) {
        if(valor > 0){
            saldo = saldo + valor;
            System.out.println("Deposito de: " + valor + "Saldo atualizado: " + saldo);
        }

        else{
            System.out.println("O valor de deposito é invalido.");
        }
    }


    void sacar(double valor){
        if(saldo > 0 && valor <= saldo){
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + ". Saldo Atual: " + saldo);
        }
    }
}
