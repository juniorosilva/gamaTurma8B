package aula07.exemplos;

public class Produto {
    private int codigo;
    private String nome;

    public Produto(int codigo,String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return codigo + ":" + nome;
    }
}
