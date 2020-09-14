package exercicios;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = 1, count = 1, soma = 0;

        while (numero != 0) {
            System.out.printf("Digite o %dº numero:", count);
            numero = in.nextInt();
            soma += numero;
            count++;
        }

        System.out.println("A soma é: " + soma);
        

    }

}
