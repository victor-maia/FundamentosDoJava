package Fundamentos.veiculo;

public class TestedeVeiculo {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        carro.acelerar();
        carro.frear();

        moto.acelerar();
        moto.frear();
    }
}
