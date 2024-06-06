package Fundamentos.animal;

public class Gato implements Animal {

    @Override
    public void fazerSom() {
       System.out.println("O gato faz miau");
    }

    @Override
    public void comer() {
      System.out.println("O gato come ração");
    }

    @Override
    public void locomocao() {
        System.out.println("O gato anda sobe quatro patas");
    }
    
}
