package exercicios;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i;
        double nota1, nota2, mediaAluno, mediaSala = 0;

        for (i = 0; i < 5; i++) {

            do{
                System.out.printf("Digite a primeira nota do %dº aluno:\n", i + 1);
                nota1 = entrada.nextDouble();
            } while(nota1 < 0 || nota1 > 10);
                    
            do{
                System.out.printf("Digite a segunda nota do %dº aluno:\n", i + 1);
                nota2 = entrada.nextDouble();
            } while(nota2 < 0 || nota2 > 10);

            mediaAluno = (nota1 + nota2) / 2 ;
            System.out.printf("O %dº aluno teve Media %.2f\n\n",i+1,mediaAluno);
            mediaSala = mediaSala + mediaAluno;
                   
        }
        mediaSala = mediaSala / i;
        System.out.printf("A Media da sala é: %.2f",mediaSala);
        entrada.close();
    }
}
