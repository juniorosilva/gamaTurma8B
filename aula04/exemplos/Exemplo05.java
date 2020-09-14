package exemplos;

public class Exemplo05 {
    public static void main(String[] args) {
        linha(10);
        System.out.println("Inicio do programa");
        linha2(20,'*');
    }

    static void linha(int tamanho){
        for(int i = 0 ; i < tamanho ; i++){
            System.out.print("-");
        }
        System.out.println();

    }

    static void linha2(int tamanho, char tipo){
        for(int i = 0 ; i < tamanho ; i++){
            System.out.print(tipo);
        }
        System.out.println();
        
    }
}