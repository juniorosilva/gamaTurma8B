package exercicios;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero , count=1, CountPares=0, CountImpares=0;
        
        while(count <= 10){
            System.out.printf("Digite o %dº numero:",count);
            numero = in.nextInt();
            count++;
            if((numero % 2) == 0 ){
                CountPares++;
            } else {
                CountImpares++;
            }
        }
        
        System.out.println("O total de pares é: " + CountPares);
        System.out.println("O total de impares é: " + CountImpares);

        in.close();

    }
    
}
