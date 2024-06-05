package Fundamentos;
import java.util.ArrayList;
import java.util.List;


public class EstruturaDeDados {
    public static void main(String[] args) {
        // List

        List<String> nomes = new ArrayList<>();
        nomes.add("Dani");
        nomes.add("Victor");
        nomes.add("Elias");


       
        for(  String n : nomes){
            System.out.println("O nome é " + n);
        }   

        nomes.forEach(nome -> System.out.println("O nome é: " + nome));
    }
}
