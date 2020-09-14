package uri;

import java.util.Scanner;

public class Exerc02 {
    public static void main(final String[] args) {

        final Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Insira a nota 1:");
        nota1 = entrada.nextDouble();
        
        System.out.println("Insira a nota 2:");
        nota2 = entrada.nextDouble();
        
        media = (nota1 * 0.4) + (nota2 * 0.6);
        
        System.out.printf("A media é : %.2f ",media);

        if(media >= 6){
            System.out.println("\nAprovado\n");
        } else {
            System.out.println("\nReprovado\n");
        }
        
        entrada.close();
        
    }
    
}
