package uri;

import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario, NovoSalario, reajuste;

        System.out.println("Informe o salario:");
        salario = in.nextDouble();

        if (salario > 0 && salario <= 400) {
            NovoSalario = salario * 1.15;
            reajuste = salario * 0.15;
            System.out.printf("Novo salario: %.2f\n", NovoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 15 %\n");
        } else {
            if (salario > 400 && salario <= 800) {
                NovoSalario = salario * 1.12;
                reajuste = salario * 0.12;
                System.out.printf("Novo salario: %.2f\n", NovoSalario);
                System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                System.out.println("Em percentual: 12 %\n");
            } else {
                if (salario > 800 && salario <= 1200) {
                    NovoSalario = salario * 1.10;
                    reajuste = salario * 0.10;
                    System.out.printf("Novo salario: %.2f\n", NovoSalario);
                    System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                    System.out.println("Em percentual: 10 %\n");
                } else {
                    if (salario > 1200 && salario <= 2000) {
                        NovoSalario = salario * 1.07;
                        reajuste = salario * 0.07;
                        System.out.printf("Novo salario: %.2f\n", NovoSalario);
                        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                        System.out.println("Em percentual: 7 %\n");
                    } else {
                        NovoSalario = salario * 1.04;
                        reajuste = salario * 0.04;
                        System.out.printf("Novo salario: %.2f\n", NovoSalario);
                        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                        System.out.println("Em percentual: 4 %\n");
                    }
                }
            }
        }
    }
}
