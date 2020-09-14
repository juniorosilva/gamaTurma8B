package livros;

public class Livros {
    String tituloLivro, categoriaLivro;
    int quantidadePaginasLivro;
  
    String exibirDados(){
        return "Título livro: " + tituloLivro 
        + "\nCategoria livro:  " + categoriaLivro 
        + "\nQuantidade de paginas: " + quantidadePaginasLivro
        + "\n";
    }
    
}
