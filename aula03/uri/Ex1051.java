package uri;

import java.util.Scanner;

public class Ex1051 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario, ImpostoDeRenda;

        System.out.println("Informe o salario:");
        salario = in.nextDouble();

        if (salario >= 0 && salario <= 2000) {
            System.out.println("Isento");
        } else {
            if (salario > 2000 && salario <= 3000) {
                ImpostoDeRenda = ((salario - 2000) * 0.08);
                System.out.printf("R$ %.2f", ImpostoDeRenda);
            } else {
                if (salario > 3000 && salario <= 4500) {
                    ImpostoDeRenda = salario * 0.18;
                    System.out.printf("R$ %.2f", ImpostoDeRenda);
                } else {
                    if (salario > 4500) {
                        ImpostoDeRenda = salario * 0.28;
                        System.out.printf("R$ %.2f", ImpostoDeRenda);
                    } else {
                        System.out.printf("Valor salario invalido");
                    }
                }
            }
        }
    }
}
