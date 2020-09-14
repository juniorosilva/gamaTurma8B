package exercicios;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a,b,c, NumeroMenor;
               
        System.out.println("Digite tres numeros");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        
        NumeroMenor = checkMaior(a,b,c);
        System.out.println("O menor numero digitado é " + NumeroMenor);
        
        teclado.close();


    }

    static int checkMaior(int x, int y, int z) {
        int menor;
        
        if(x < y && x < z){
            menor = x;
        } else {
            if(y < x && y < z){
                menor = y;
            } else {
                menor = z;
            }
        }
        
        return menor;
    }
}
