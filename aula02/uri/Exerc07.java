package uri;

import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;
        System.out.println("Informe o salario:");
        salario = entrada.nextDouble();

        if (salario > 2000) {
            System.out.printf("Desconto do INSS será 30%%");
        } else {
            if (salario > 1200) {
                System.out.printf("Desconto do INSS será 25%%");
            } else {
                if (salario > 600) {
                    System.out.printf("Desconto do INSS será 20%%");
                } else {
                    System.out.printf("Desconto do INSS será ISENTO");
                }
            }
        }

        entrada.close();

    }
}
