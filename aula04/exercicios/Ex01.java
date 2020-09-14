package exercicios;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String resultado;
        
        System.out.println("Digite um numero");
        numero = teclado.nextInt();
        
        resultado = checkPar(numero);

        System.out.println(resultado);
        
        teclado.close();


    }

    static String checkPar(int valor) {
        String ePar;
        if(valor%2 == 0){
            ePar = "Numero é par";
        } else {
            ePar = "Numero é ímpar";
        }
        return ePar;
    }
    
}
