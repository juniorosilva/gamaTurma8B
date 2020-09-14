package uri;

import java.util.Scanner;

public class Exerc1003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma, A, B;

        A = entrada.nextInt();
        B = entrada.nextInt();

        soma = A + B ;

        System.out.println("SOMA = " + soma);

        entrada.close();
    }
    
}
