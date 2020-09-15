package aula06.Exercicio0602;

public class ContaPoupanca extends Conta {
    private double taxaOperacao;

    //construtor
    public ContaPoupanca(int numero, double saldo, double taxaOperacao) {
        super(numero,saldo);
        this.taxaOperacao = taxaOperacao;
    }

    //metodo sacar, saque <= limite + taxa
    @Override
    public void sacar(double saque){
        if(saque <= getSaldo()){
            super.sacar(saque + taxaOperacao);
        }
    }
    
}
