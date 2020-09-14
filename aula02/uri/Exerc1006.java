package uri;
import java.util.Scanner;

public class Exerc1006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A, B, C , media;

        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();

        media = (A * 0.2) + (B * 0.3) + (C * 0.5);

        System.out.printf("MEDIA = %.1f\n" , media);

        entrada.close();
    }    
}
