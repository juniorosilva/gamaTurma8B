package aula06.Exercicio03;

public class Gerente extends Funcionario { //Faz referencia a herança da classe
    private int nFuncionarios; //declara atributo especifico para classe Gerente

    //Construtor
    public Gerente(String nome, double salario, int nFuncionarios){
        super(nome,salario);
        this.nFuncionarios = nFuncionarios;
    }

    //Demais métodos

    @Override
    public String imprimir(){
        return super.imprimir() + "\nNumero de funcionarios : " + nFuncionarios;
        
    }

    @Override
    public void aumentarSalario(double perc){
        double bonus = getSalario() * 0.2; //incluir getSalario
    }
    
}
