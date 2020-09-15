package aula06.Exercicio0602;

public class ContaEspecial extends Conta {
    private double limite;

    //construtor
    public ContaEspecial(int numero, double saldo, double limite){
        super(numero,saldo);
        this.limite = limite;
    }

    //metodo sacar: saque <= saldo + limite
    @Override
    public void sacar(double saque){
        if(saque <= (getSaldo() + limite)){
            super.sacar(saque);
        }
    }


    
}
