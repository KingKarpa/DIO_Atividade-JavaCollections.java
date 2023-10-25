# Pesquisa -> Map
Esse é um exercício do bootcamp Backend Java da DIO. <br>
O objetivo desse código é fixar o conhecimento das aulas do curso de Collections Java API 2023. <br>
Esse momento do curso trata a **Interface Map** e as classes relacionadas, além de estruturas e métodos pertinentes. <br>
Abaixo comentarei sobre o exercício aqui contido.

### <span style="color: #FA0">EstoqueProdutos</span>
Esse programa cria um HashMap (produtosMap) na classe EstoqueProdutos que contém um valor objeto (Produto) e uma chave codigo (Integer). <br>

**A classe Produto** é a classe responsável pela criação dos objetos que ficarão contidos no HashMap. Essa classe possui métodos auxiliares para obtenção de valores de atributo de um objeto específico **(Getters)**, muito usados durante as pesquisas ocorridas nos métodos testados.

- **Atributos da Classe**
    - String nome
    - int quantidade
    - double preco

<br>**A classe EstoqueProdutos** possui métodos para gerenciar os seus elementos, focando na pesquisa e obtenção de objetos específicos. Uma instância sua é criada no método **main** para realizar testes de manipulação dos elementos através de seus métodos. <br>

- **Métodos da Classe**
    - adicionarProduto( )
    - exibirProdutos( )
    - calcularInventarioPreco( )
    - obterProdutoMaisCaro( )
    - obterProdutoMaisBarato( )
    - obterProdutoMaiorValor( )

- **Estrutura Exemplificada**
    ```java
    public class EstoqueProdutos {
        // Atributo Map (produtosMap)
        private Map<Integer, Produto> produtosMap;
        // Métodos
        public EstoqueProdutos();
        public void adicionarProduto(Integer codigo, String nome, int quantidade, double preco);
        public void exibirProdutos();
        public double calcularInventarioPreco();
        public List<Produto> obterProdutoMaisCaro();
        public List<Produto> obterProdutoMaisBarato();
        public List<Produto> obterProdutoMaiorValor();
        // Main que testa os métodos acima
        public static void main(String[] args);
    }
    ```
<br>

## :gear: Executando
Para executar algum dos programas podem ser usadas as seguintes abordagens: <br>
1. Usar uma IDE configurada para utilizar uma versão de JDK

2. Instalar uma versão JRE e utilizar dentro da pasta **_out/production/_** o comando cmd: 
    ```
    java EstoqueProdutos
    ```
<br>

## :hammer_and_wrench: Construção
Esse código foi construido usando como linguagem apenas Java e usando o **IntelliJ** como IDE.