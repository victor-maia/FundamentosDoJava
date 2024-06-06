package Fundamentos.animal;

public class Cachorro implements Animal {

    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz auau!");
    }

    @Override
    public void comer() {
      System.out.println("O cachorro come ração");
    }

    @Override
    public void locomocao() {
        System.out.println("O cachorro anda sobre quatro patas");
    }
}
