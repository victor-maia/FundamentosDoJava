package Fundamentos.personagens;

public class Atirador extends Personagem {
   
    @Override
    public String atacar() {
        return super.atacar() + "Arma";
    }
}
