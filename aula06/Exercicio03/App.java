package aula06.Exercicio03;

public class App {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João Paulo",6000);
        Gerente g1 = new Gerente("Pedro Archanjo",12000,4);

        System.out.println(f1.imprimir());
        System.out.println(g1.imprimir());

        f1.aumentaSalario(0.1);


    }
}

