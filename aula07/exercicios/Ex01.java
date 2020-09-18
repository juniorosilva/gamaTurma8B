package aula07;

import java.util.Stack;

public class Ex01 {
    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<>();
        String frase = "ESTE EXERCICIO E MUITO FACIL";
        char letra;
        
        for(int i = 0 ; i < frase.length(); i++){
            letra = frase.charAt(i);
            pilha.push(letra);
 
        }

        while(! pilha.isEmpty()){
            System.out.print( pilha.pop());
        }

        

        System.out.println("");
    }
    
}
