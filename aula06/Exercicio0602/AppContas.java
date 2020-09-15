package aula06.Exercicio0602;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AppContas {
    public static void main(String[] args) {
        int option;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Selecione uma opção\n1 - Conta Corrente\n2 - Conta Poupança\n3 - Conta Especial\n");
        option = teclado.nextInt();

        switch (option) {
            case 1 -> ContaCorrente();
            case 2 -> System.out.println("Conta poupança");
            case 3 -> System.out.println("Conta Especial");
            default -> System.out.println("Opção invalida");
        }
        teclado.close();
    }

    public static void ContaCorrente() {
        Scanner teclado = new Scanner(System.in);
        int numConta, operacao;

        System.out.println("Conta corrente");
        System.out.println("Digite o numero da conta");
        numConta = teclado.nextInt();

        System.out.println("Selecione operação a ser realizada\n1 - Consultar Saldo\n2 - Deposito\n3 - Saque ");
        operacao = teclado.nextInt();

        switch (operacao) {
            case 1 -> { //Saque
              
                ContaCorrente c1 = new ContaCorrente(numConta,300);
                System.out.println(c1.dadosConta());
                System.out.println(c1.getSaldo());
                
            }

            case 2 -> { //Deposito
                double deposito;
                ContaCorrente c1 = new ContaCorrente(numConta,300);
                System.out.println("\nDigite o valor do deposito");
                deposito = teclado.nextDouble();

                System.out.println("Saldo anterior: ");
                System.out.println(c1.getSaldo());

                c1.depositar(deposito);
                System.out.println("\nDeposito efetuado\n");
                System.out.println("Saldo atual: " + c1.getSaldo());

            }

            case 3 -> {
                double saque;

                ContaCorrente c1 = new ContaCorrente(numConta,300);
                System.out.println("\nDigite o valor do saque");
                saque = teclado.nextDouble();

                System.out.println(c1.dadosConta());
                System.out.println("\nSaldo anterior: " + c1.getSaldo());
                
                c1.sacar(saque);
                
                System.out.println("\nSaldo atual: " + c1.getSaldo());    


            }
        }
        teclado.close();

    }
}
