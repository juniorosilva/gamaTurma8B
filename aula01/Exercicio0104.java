import java.util.Scanner;

public class Exercicio0104 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double consumoQuilowatts, quilowatt, salarioMinimo, valorConsumoResidencia;
        
        System.out.println("Qual o valor do salario minimo?");
        salarioMinimo = entrada.nextDouble();
        System.out.println("Quantos quilowatts foram consumidos?");
        consumoQuilowatts = entrada.nextDouble();
        
        quilowatt = salarioMinimo/500;
        valorConsumoResidencia = consumoQuilowatts * quilowatt;
        
        System.out.println("Valor quillowatt em reais " + quilowatt);
        System.out.println("Valor consumo residencia " + valorConsumoResidencia);
        System.out.println("Valor com desconto " + (valorConsumoResidencia * 0.85) );
        
        entrada.close();

    }
}

