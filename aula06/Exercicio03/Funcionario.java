package aula06.Exercicio03;

public class Funcionario {
    private String nome;
    private double salario;

    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Demais métodos

    public String imprimir() {
        return "Nome : " + nome + "\nSalario : " + salario;
    }

    public void aumentaSalario(double perc) {
        salario *= (1 + perc);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario() {

    }

}
