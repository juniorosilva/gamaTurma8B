package livros;

public class AppLivro {
    public static void main(String[] args) {
        Livros livro1 = new Livros();
        livro1.tituloLivro = "Como fazer amigos e influenciar pessoas";
        livro1.categoriaLivro = "Motivacional";
        livro1.quantidadePaginasLivro = 444;

        System.out.println(livro1.exibirDados());

    }
}
