import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // Atributo
    private List<Livro> livrosList;

    // Construtor
    public CatalogoLivros(){
        this.livrosList = new ArrayList<>();
    }

    // Método para adicionar objetos livro na livrosList
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        livrosList.add(livro);
        // livrosList.add(new Livro(titulo, autor, anoPublicacao));
        System.out.println("Livro adicionado!");
    }

    // Método para pesquisar objetos Livro de um autor específico em livrosList
    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosDoAutor = new ArrayList<>();

        if (!livrosList.isEmpty()){
            System.out.println("Pesquisando autor...");
            for(Livro livro : livrosList){
                if (livro.getAutor().equalsIgnoreCase(autor)){
                    livrosDoAutor.add(livro);
                }
            }
        } else {
            System.out.println("O catálogo ainda não possui livros!");
        }

        return livrosDoAutor;
    }

    // Método para pesquisar objetos Livro de um intervalo de anos em livrosList
    public List<Livro> pesquisarIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosNoIntervalo = new ArrayList<>();

        if (anoInicial < anoFinal){
            if (!livrosList.isEmpty()){
                System.out.println("Pesquisando intervalo de anos...");
                for(Livro livro : livrosList){
                    if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                        livrosNoIntervalo.add(livro);
                    }
                }            
            } else {
                System.out.println("O catálogo ainda não possui livros!");
            }
        } else {
            System.out.println("O ano final deve ser maior que o ano inicial do intervalo!");
        }

        return livrosNoIntervalo;
    }

    // Método para pesquisar objetos Livro de um titulo específico em livrosList
    public Livro pesquisarTitulo(String titulo){
        Livro livroEncontrado = null;

        if (!livrosList.isEmpty()){
            System.out.println("Pesquisando título...");
            for(Livro livro : livrosList){
                if (livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroEncontrado = livro;
                }
            }            
        } else {
            System.out.println("O catálogo ainda não possui livros!");
        }

        return livroEncontrado;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogo.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogo.adicionarLivro("Livro 2", "Autor 1", 2022);
        catalogo.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogo.adicionarLivro("Livro 4", "Autor 4", 1996);
        System.out.println("----------------------------------");

        System.out.println(catalogo.pesquisarAutor("Autor 1"));
        System.out.println(catalogo.pesquisarAutor("Autor 4"));
        System.out.println("----------------------------------");

        System.out.println(catalogo.pesquisarIntervaloAnos(2020, 2022));
        System.out.println(catalogo.pesquisarIntervaloAnos(2020, 2019));
        System.out.println("----------------------------------");

        System.out.println(catalogo.pesquisarTitulo("Livro 1"));
        System.out.println(catalogo.pesquisarTitulo("Livro 2"));
        System.out.println(catalogo.pesquisarTitulo("Livro 3"));
    }
}
