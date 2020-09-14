package exercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, count, acumulado;

        System.out.println("Digite um numero:");
        N = in.nextInt();

        count = 1;
        acumulado = 1;

        System.out.print("1");
        while (count < N / 2) {
            System.out.print("," + acumulado);
            acumulado = acumulado * 2;
            count = acumulado;
        }

    }

}
