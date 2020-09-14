package uri;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero, resultado;
        numero = entrada.nextDouble();
        
        if(numero > 20){
            resultado = numero / 2;
            System.out.printf("A metade de %.2f é %.2f\n",numero, resultado);
        } 
        entrada.close();
    }
}
