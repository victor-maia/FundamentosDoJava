package Fundamentos.personagens;
import java.util.ArrayList;
import java.util.List;


public class TestedePersonagem {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        List<String> tipos = personagem.caracteristicas();
        
  
        String tipoEscolhido = tipos.get(3); 
        

        Personagem personagemEspecifico = null;
        
        switch (tipoEscolhido) {
            case "Arqueiro":
                personagemEspecifico = new Arqueiro();
                break;
            case "Mago":
                personagemEspecifico = new Mago();
                break;
            case "Lutador":
                personagemEspecifico = new Lutador();
                break;
            case "Atirador":
                personagemEspecifico = new Atirador();
                break;
            default:
                System.out.println("Tipo de personagem desconhecido!");
                return;
        }

        personagemEspecifico.imprimirPersonagem(tipoEscolhido, "Legolas");
        System.out.println(personagemEspecifico.atacar());
    }
}
