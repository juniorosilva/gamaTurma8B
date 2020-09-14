import java.util.Scanner;

public class Exercicio0102 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2;
        System.out.println("Qual a primeira nota?");        
        nota1 = entrada.nextDouble();
        
        System.out.println("Qual a segunda nota?");
        nota2 = entrada.nextDouble();
        
        System.out.println("A sua media é " + ((nota1 + nota2) / 2));
        
        entrada.close();
    }
}
