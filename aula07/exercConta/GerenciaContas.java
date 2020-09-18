package exercicio02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import aula06.Exercicio0602.ContaCorrente;

public class GerenciaContas {

    //private ArrayList<Conta> listaDeContas;
    private HashMap<Integer, Conta> listaDeContas;
    //private HashSet<Conta> listaDeContasHashSet;

    public GerenciaContas() {
        //listaDeContas = new ArrayList<>();
        listaDeContas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta) {
        //listaDeContas.add(ContaCorrente(numeroConta));
        listaDeContas.put(numeroConta, new ContaCorrente(numeroConta);

    }

    public void novaContaPoupanca(int numeroConta) {
        listaDeContas.add(new ContaPoupanca(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        listaDeContas.add(new ContaEspecial(numeroConta, limite));
    }

    public boolean depositar(int numeroConta, double valor) {
        /*
         * for (int i = 0; i < listaDeContas.size(); i++) {
         * if(listaDeContas.get(i).getNumero() == numeroConta){
         * listaDeContas.get(i).depositar(valor); break; } }
         */

        if (valor <= 0) {
            return false;
        }

        for (Conta conta : listaDeContas) {
            if (conta.getNumero() == numeroConta) {
                conta.depositar(valor);
                return true;
            }
        }
        return false;
    }

    public boolean sacar(int numeroConta, double valor) {
        for (Conta conta : listaDeContas) {
            if (conta.getNumero() == numeroConta) {
                return conta.sacar(valor);
            }
        }
        return false;
    }

    public String listarContas() {
        String saida = "";
        for (int i = 0; i < listaDeContas.size(); i++) {
            saida += listaDeContas.get(i).exibir() + "\n";
        }
        return saida;
    }

}
