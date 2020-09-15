package aula06.Exercicio0602;

public class Conta {
    //atributos
    private int numero;
    private double saldo;

    //construtor
    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;

    }

    //metodo dados da conta
    public String dadosConta(){
        return "Conta : " + numero + "\nSaldo : " + saldo;
    }

    //metodo depositar
    public void depositar(double deposito){
        saldo += deposito;
    }

    //metodo sacar
    public void sacar(double saque){
        saldo -= saque;
    }

    public double getSaldo(){
        return saldo;
    }

    
    
}
