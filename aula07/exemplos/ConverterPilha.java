package aula07;

import java.util.Stack;

public class ConverterPilha {
    public static void main(String[] args) {
        //converter numero decimal para binario
        //dividir por 2 pegando os restos

        Stack<Integer> pilha = new Stack<>();
        int decimal = 1000;

        System.out.print("O valor " + decimal + " convertido em binário é ");

        while(decimal != 0){
            int resto = decimal % 2;
            pilha.push(resto);
            decimal = decimal / 2;
        }

        while(! pilha.isEmpty()){
            System.out.print( pilha.pop());
        }

        

        System.out.println("");
    }
}
