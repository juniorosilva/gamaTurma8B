package uri;

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioBruto, valorPrestacao, maxPrestacao;

        System.out.println("Informe o valor do Salario Bruto:");
        salarioBruto = entrada.nextDouble();
        
        System.out.println("Informe o valor da prestacao:");
        valorPrestacao = entrada.nextDouble();
        maxPrestacao = salarioBruto * 0.3 ;
             

        if (valorPrestacao > maxPrestacao){
            System.out.printf("O emprestimo não pode ser concedido, pois ultrapassa o valor maximo\n");
            System.out.printf("Salario bruto: %.2f\n",salarioBruto);
            System.out.printf("Valor prestação: %.2f\nValor maximo prestação :%.2f\n",valorPrestacao,maxPrestacao);
        } else {
            System.out.printf("O emprestimo pode ser concedido, pois não ultrapassa o valor maximo\n");
            System.out.printf("Salario bruto: %.2f\n",salarioBruto);
            System.out.printf("Valor prestação: %.2f\nValor maximo prestação :%.2f\n",valorPrestacao,maxPrestacao);
        }
        
        entrada.close();
    }   

}
