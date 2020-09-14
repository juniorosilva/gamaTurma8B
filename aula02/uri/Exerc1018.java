package uri;

import java.util.Scanner;

public class Exerc1018 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        int resto, divisao;

        valor = entrada.nextInt();
        
        System.out.printf("%d\n",valor);

        divisao = valor / 100;
        resto = valor % 100;
        System.out.printf("%d nota(s) de R$ 100,00\n", divisao);
        
        divisao = resto / 50;
        resto = resto % 50;
        System.out.printf("%d nota(s) de R$ 50,00\n", divisao);
        
        divisao = resto / 20;
        resto = resto % 20;
        System.out.printf("%d nota(s) de R$ 20,00\n", divisao);
        
        divisao = resto / 10;
        resto = resto % 10;
        System.out.printf("%d nota(s) de R$ 10,00\n", divisao);
                
        divisao = resto / 5;
        resto = resto % 5;
        System.out.printf("%d nota(s) de R$ 5,00\n", divisao);
        
        divisao = resto / 2;
        resto = resto % 2;
        System.out.printf("%d nota(s) de R$ 2,00\n", divisao);
        
        System.out.printf("%d nota(s) de R$ 1,00\n", resto);
        
        entrada.close();

    }

}
