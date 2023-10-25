# Ordenação -> Set
Esse é um exercício do bootcamp Backend Java da DIO. <br>
O objetivo desse código é fixar o conhecimento das aulas do curso de Collections Java API 2023. <br>
Esse momento do curso trata a **Interface Set** e as classes relacionadas, além de estruturas e métodos pertinentes. <br>
O **package** contém dois exercícios diferentes, abaixo comentarei um pouco sobre eles.

### Exercício -> <span style="color: #FA0">CadastroProdutos</span>
Esse programa cria um HashSet (produtosSet) na classe CadastroProdutos que contém objetos da classe Produto. Os objetos contidos no HashSet serão ordenados usando as interfaces **Comparable** e **Comparator**. <br>

**A classe Produto** é responsável por criar os objetos que serão contidos pelo HashSet. Além disso, ela possui métodos auxiliares (Getters) para auxiliar a manipulação de elementos do HashSet (produtosSet).<br>
Essa classe implementa a interface **Comparable** e possui métodos adicionais para adicionar critérios de ordenação dos objetos e para realizar a ordenação que será chamada na classe CadastroProdutos.

- **Atributos da Classe**
    - String nome
    - int codigo
    - double preco
    - int quantidade

- **Estrutura Exemplificada**
    ```java
    public class Produto implements Comparable<Produto> {
        // Atributos private e construtor...
        // Métodos Getters...
        // Métodos Override -> Comparable
        @Override
        public int hashCode();
        @Override
	    public boolean equals(Object obj);
        @Override
	    public int compareTo(Produto produto);
        // Método para personalizar exibição dos objetos no output
        @Override
	    public String toString()
    }
    ```

<br>

**A classe CadastroProdutos** possui métodos para gerenciar os seus elementos do HashSet (produtosSet), focando em funções de ordenação. Uma instância sua é criada no método **main** para realizar testes de manipulação dos elementos através de seus métodos. <br>
O arquivo ***.java*** dessa classe possui uma classe secundária que implementa a interface **Comparator**.

- **Métodos da Classe**
    - CadastroProdutos( )
    - adicionarProduto( )
    - ordenarProdutosNome( ) **-> Cria um TreeSet, ordenando com Comparable**
    - ordenarProdutosPreco( ) **-> Cria um TreeSet, ordenando com Comparator**

- **Estrutura Exemplificada**
    ```java
    public class CadastroProdutos {
        // Atributo Set (produtosSet)
        private Set<Produto> produtosSet;
        // Métodos
        public CadastroProdutos();
        public void adicionarProduto(String nome, int codigo, double preco, int quantidade);
        public Set<Produto> ordenarProdutosNome();
        public Set<Produto> ordenarProdutosPreco();
        // Main que testa os métodos acima
        public static void main(String[] args);
    }

    // Classe que implementa Interface Comparator
    class ComparatorPreco implements Comparator<Produto>{
        @Override
	    public int compare(Produto produto1, Produto produto2);
    }
    ```
<hr>

### Exercício -> <span style="color: #FA0">WIP</span>
<br>

## :gear: Executando
Para executar algum dos programas podem ser usadas as seguintes abordagens: <br>
1. Usar uma IDE configurada para utilizar uma versão de JDK

2. Instalar uma versão JRE e utilizar dentro da pasta bin o comando cmd: 
    ```
    java CadastroProdutos
    ```
<br>

## :hammer_and_wrench: Construção
Esse código foi construido usando como linguagem apenas Java e usando o **Eclipse** como IDE.