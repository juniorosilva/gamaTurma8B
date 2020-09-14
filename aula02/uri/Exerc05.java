package uri;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha,senhaArmazenada;

        System.out.println("Informe a senha:");
        senha = entrada.nextLine();
        senhaArmazenada = "R10p5";
        
        if (senha.equals(senhaArmazenada) == true) {
            System.out.printf("Acesso concedido\n");
        } else {
            System.out.printf("Acesso negado\n");
        }
        
        entrada.close();
    
    }
}