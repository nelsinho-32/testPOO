public class Livraria {
    private Livro[] livros;
    private int quantidade;

    public Livraria() {
        livros = new Livro[5];
        quantidade = 0;
    }

    public void adicionarLivro(Livro livro) {
        if(quantidade < livros.length) {
            livros[quantidade] = livro;
            quantidade++;
        }
    }

    public void listarLivros() {
        for(int i = 0; i < livros.length; i++) {
            System.out.println(livros[i]);
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for(int i = 0; i < livros.length; i++) {
            if (livros[i] != null && livros[i].getTitulo().equals(titulo)) {
              return livros[i];
            }
        }
      return null;
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0.0;
        for (int i = 0; i < livros.length; i++) {
            valorTotal += this.livros[i].calcularValorEstoque();
        }
        return valorTotal;
    }
}

