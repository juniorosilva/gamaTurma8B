package aula06.Exercicio0602;

public class ContaCorrente extends Conta {
    
    //construtor
    public ContaCorrente(int numero, double saldo){
        super(numero,saldo);
    }
    
    //metodos sacar conta corrente se houver saldo suficiente
    @Override
    public void sacar(double saque){
        if(saque <= super.getSaldo()){
            super.sacar(saque);
        } else {
            System.out.printf("Saque de %.2f não realizado! SALDO INSUFICIENTE",saque);
        }

    }

    @Override
    public void depositar(double deposito){
        super.depositar(deposito - 0.10);
    }
    

    
}
