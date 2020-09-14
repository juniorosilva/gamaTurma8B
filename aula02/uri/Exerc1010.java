package uri;
import java.util.Scanner;

public class Exerc1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadePeca1 , quantidadePeca2;
        double valorPeca1 , valorPeca2, total;
        
        entrada.nextInt();
        quantidadePeca1 = entrada.nextInt();
        valorPeca1 = entrada.nextDouble();
        entrada.nextInt();
        quantidadePeca2 = entrada.nextInt();
        valorPeca2 = entrada.nextDouble();
        total = (quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);

        entrada.close();

    }
    
}
