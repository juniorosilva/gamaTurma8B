import java.util.Scanner;

public class Exercicio0103 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;
        System.out.println("Qual o salario atual?");
        salario = entrada.nextDouble();
        System.out.println("O valor reajustado do salario é " + (salario * 1.25));
        entrada.close();

    }
}
