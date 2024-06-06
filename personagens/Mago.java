package Fundamentos.personagens;

public class Mago extends Personagem {
   
    @Override
    public String atacar() {
        return super.atacar() + "Magia";
    }
}
