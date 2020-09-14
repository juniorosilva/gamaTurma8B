package exercicios;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor, count, result;

        System.out.println("Digite um numero:");
        valor = in.nextInt();
        count = 0;
        
        while(count <= 10){
            result = valor * count;
            System.out.printf("%d x %d = %d \n",valor,count,result);
            count++;
        }
        
        in.close();
    }
}
