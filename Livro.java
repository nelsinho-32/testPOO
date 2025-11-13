public class Livro {
    private String titulo;
    private String autor;
    private double preco;
    private int quantidade;

    public Livro(String titulo, String autor, double preco, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }
    public double getpreco() {
        return preco;
    }

    public String getInfoLivro() {
        return "Nome do livro: " +  titulo + ", Autor: " + autor + ", Preço do Livro: " + preco + ", Quantidade: " + quantidade;
    }

    public double calcularValorEstoque() {
        return this.preco * this.quantidade;
    }
}