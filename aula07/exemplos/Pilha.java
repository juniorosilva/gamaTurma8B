package aula07;

import java.util.Stack;

public class Pilha {
    /** 
     * Tipoas básicos       -   Classe que representa o tipo
     * int                      Integer
     * float                    Float
     * char                     Character
     * double                   Double
     * boolean                  Boolean
     * 
    */
    
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);

        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());

        

    }
}
