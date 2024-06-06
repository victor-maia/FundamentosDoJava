package Fundamentos.personagens;

public class Arqueiro extends Personagem {
   
    public String atacar() {
        return super.atacar() + "Arco";
    }
}
