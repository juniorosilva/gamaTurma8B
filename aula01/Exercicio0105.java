import java.util.Scanner;

public class Exercicio0105 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double km, pes, jarda, milha, polegada;
        
        System.out.println("Qual a medida em Km ?");
        km = entrada.nextDouble();
        
        milha = km * 0.62137;
        jarda = milha / 1760 ;
        pes = jarda / 3;
        polegada = pes / 12;
        
        System.out.println("Km " + km);
        System.out.println("Pe " + pes);
        System.out.println("Jarda " + jarda);
        System.out.println("Milha " + milha);
        System.out.println("Polegadas " + polegada);
        
        entrada.close();
    }
}
