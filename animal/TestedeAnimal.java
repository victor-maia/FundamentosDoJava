package Fundamentos.animal;

public class TestedeAnimal {
    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();
        Animal vaca = new Vaca();

        cachorro.comer();
        gato.comer();
        vaca.comer();

        cachorro.fazerSom();
        gato.fazerSom();
        vaca.fazerSom();

        cachorro.locomocao();
        gato.locomocao();
        vaca.locomocao();


    }
}
