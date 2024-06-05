package Fundamentos;
import java.lang.classfile.constantpool.IntegerEntry;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();

        notas.put("Dani", 10);
        notas.put("Victor", 8);
        notas.put("Elias", 6);

       

        
        for(Map.Entry<String, Integer> entry : notas.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é " + key + " e o valor é " + value);
        }


    }
}
