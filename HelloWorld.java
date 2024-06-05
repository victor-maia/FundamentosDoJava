package Fundamentos;

/*
 * Hello World = Nome da minha classe
 * public = Tipo de acesso da classe
 * class = tipo de classe
 */


public class HelloWorld {
    // Todo conteúdo será inserido aqui dentro
    public static void main(String[] args) {
        // Números (int, double, float, long)
        // Texto   (String)
        // Boolean (boolean)
        int dadoDoTipoInt = 12;
        double dadoDoTipoDouble = 3.14;
        float dadoDoTipoFloat = 3.14f; // Tem que por o f na frente para o Java perceber que o tipo do dado é um float e não ter erro de compilação
        long dadoDoTipoLong = 83812381L; // Tem que por o l na frente para o Java perceber que o tipo do dado é um long e não ter erro de compilação
        String dadoDoTipoString = "Colocar o meu texto da forma como eu desejo";
        boolean dadoDoTipoBoolean = true;

    
        // if - else

        if(dadoDoTipoInt == 11){
            System.out.println("Entrou no if");
        }
            else if(dadoDoTipoInt == 12){
                System.out.println("Entrou no if do 12");
            }
        
        else{
            System.out.println("Entrou no else");

        }

        int valorInicial = 0;
       
        while(valorInicial < 3) {
            System.out.println("O valor inicial é menor que 3");
            System.out.println(valorInicial);
            valorInicial++;
            
        }

        System.out.println("Saiu do while");
        System.out.println(valorInicial);


        // For 

        
        for(int i = 0; i < 4; i++){
            System.out.println("O valor do i é: " + i);
        }

    }   

}   

// Fora do escopo da classe (erro)
