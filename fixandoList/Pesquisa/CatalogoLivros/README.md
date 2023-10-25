# Pesquisa -> List
Esse é um exercício do bootcamp Backend Java da DIO. <br>
O objetivo desse código é fixar o conhecimento das aulas do curso de Collections Java API 2023. <br>
Esse momento do curso trata a **Interface List** e as classes relacionadas, além de estruturas e métodos pertinentes.

### CatalogoLivros
Esse programa cria uma ArrayList (livrosList) na classe CatalogoLivros que contém objetos da classe Livro. <br>

**A classe Livro** é responsável por criar objetos que serão contidos pela ArrayList, possuindo métodos auxiliares **(Getters)** para possibilitar a manipulação dos elementos de livrosList.

- **Atributos da Classe**
    - String titulo
    - String autor
    - int anoPublicacao

<br>

**A classe CatalogoLivros** é responsável por criar a ArrayList e possui métodos, focados na pesquisa, para manipular os elementos contidos em livrosList. Uma instância sua é criada no método **main** para realizar testes de manipulação dos elementos através de seus métodos.

- **Métodos da Classe**
    - CatalogoLivros( )
    - adicionarLivro( )
    - pesquisarAutor( )
    - pesquisarIntervaloAnos( )
    - pesquisarTitulo( )

- **Estrutura Exemplificada**
    ```java
    public class CatalogoLivros {
        // Atributo List (livrosList)
        private List<Livro> livrosList;
        // Métodos
        public CatalogoLivros();
        public void adicionarLivro(String titulo, String autor, int anoPublicacao);
        public List<Livro> pesquisarAutor(String autor);
        public List<Livro> pesquisarIntervaloAnos(int anoInicial, int anoFinal);
        public Livro pesquisarTitulo(String titulo);
        // Main que testa os métodos acima
        public static void main(String[] args);
    }
    ```

<br>

## :gear: Executando
Para executar esse código pode ser usada uma das seguintes abordagens: <br>
1. Usar uma IDE configurada para utilizar uma versão de JDK

2. Instalar uma versão JRE e utilizar dentro da pasta bin o comando cmd: 
    ```
    java CatalogoLivros
    ```

<br>

## :hammer_and_wrench: Construção
Esse código foi construido usando como linguagem apenas Java e usando o **VSCode** como IDE.
