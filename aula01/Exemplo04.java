import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;
        
        System.out.println("Digite seu nome:");
        nome = entrada.nextLine(); //leitura da entrada do usuario - string digitada
        
        System.out.println("Digite sua idade:");
        idade = entrada.nextInt();
        
        System.out.println("Olá " + nome);
        System.out.println("Você tem " + idade + " anos");
        entrada.close();
    }
}
