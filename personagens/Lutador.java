package Fundamentos.personagens;

public class Lutador extends Personagem {
   @Override
    public String atacar() {
        return super.atacar() + "Mãos";
    }

}
