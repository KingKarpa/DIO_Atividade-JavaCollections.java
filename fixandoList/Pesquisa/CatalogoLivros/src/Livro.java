public class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // Construtor que deve receber os atributos
    public Livro (String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Método auxiliar para retornar o atributo titulo
    public String getTitulo(){
        return titulo;
    }

    // Método auxiliar para retornar o atributo autor
    public String getAutor(){
        return autor;
    }

    // Método auxiliar para retornar o atributo anoPublicacao
    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    // Método auxiliar para editar a exibição do objeto
    public String toString(){
        return "Livro: [Título='" + titulo + "', Autor='" + autor + "', Ano de Publicação='" + anoPublicacao + "']"; 
    }
}
