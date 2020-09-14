package exercicios;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int valor = 1, maior = 0, menor = 0, i;

        for (i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº numero:",i + 1);
            valor = entrada.nextInt();
            
            if (i == 0) {
                maior = valor;
                menor = valor;
            }

            if (valor > maior){
                maior = valor;
            }

            if(valor < menor){
                menor = valor;
            }

           
        }

        System.out.println("MAIOR: " + maior);
        System.out.println("MENOR: " + menor);

        entrada.close();
    }
}
