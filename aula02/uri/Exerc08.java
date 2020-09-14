package uri;

import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A,B,C;

        System.out.println("Informe comprimento do lado A do triangulo:");
        A = entrada.nextDouble();

        System.out.println("Informe comprimento do lado B do triangulo:");
        B = entrada.nextDouble();

        System.out.println("Informe comprimento do lado C do triangulo:");
        C = entrada.nextDouble();

        if (A > ( B + C ) || B > ( A + C ) || C > (A + B) ) {
            System.out.printf("Não é um triangulo");
        } else {
            if (A == B && A == C && B == C ) {
                System.out.printf("Triangulo equilatero");
            } else {
                if (A == B || B == C || A == C) {
                    System.out.printf("Triangulo isosceles");
                } else {
                    System.out.printf("Triangulo escaleno");
                }
            }
        }

        entrada.close();
    }
}
