package uri;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2;

        num1 = entrada.nextDouble();
        num2 = entrada.nextDouble();

        if (num2 >= num1){
            System.out.printf("%.1f \n%.1f\n",num2,num1);
        } else {
            System.out.printf("%.1f \n%.1f\n",num1,num2);
        }
        
        entrada.close();
    
    }
}
