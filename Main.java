public class Main {
    public static void main(String[] args) {
        Livraria livraria = new Livraria();

        Livro livro1 = new Livro("Harry", "Hermione", 25.70, 4);
        Livro livro2 = new Livro("One Piece", "Oda", 67.80, 5);
        Livro livro3 = new Livro("Demon Slayer", "Kayokura", 23.90, 3);

        livraria.adicionarLivro(livro1);
        livraria.adicionarLivro(livro2);
        livraria.adicionarLivro(livro3);

        livraria.listarLivros();

        Livro livroBuscado = livraria.buscarLivroPorTitulo("One Piece");
        if(livroBuscado != null) {
            livroBuscado.getInfoLivro();
        }

        

        livro1.calcularValorEstoque();
        livro2.calcularValorEstoque();
        livro3.calcularValorEstoque();
    }
}
