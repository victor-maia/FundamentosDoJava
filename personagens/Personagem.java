package Fundamentos.personagens;
import java.util.ArrayList;
import java.util.List;

public class Personagem {

    public List<String> caracteristicas() {

        List<String> tipos = new ArrayList<>();
        tipos.add("Arqueiro");
        tipos.add("Mago");
        tipos.add("Lutador");
        tipos.add("Atirador");

        return tipos;
    }


    public void imprimirPersonagem(String tipo, String nome){ 
         System.out.println("O nome do personagem:" + nome); 
         System.out.println("O tipo do personagem é:" + tipo);

    }

    public String atacar(){
        return "O personagem ataca com "; 
    }

    


}
