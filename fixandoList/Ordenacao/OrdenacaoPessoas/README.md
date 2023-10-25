# Ordenação -> List
Esse é um exercício do bootcamp Backend Java da DIO. <br>
O objetivo desse código é fixar o conhecimento das aulas do curso de Collections Java API 2023. <br>
Esse momento do curso trata a **Interface List** e as classes relacionadas, além de estruturas e métodos pertinentes.

### O que o programa faz?
O foco desse programa é a implementação das interfaces **Comparable** e **Comparator**. <br>
Esse programa cria uma ArrayList (pessoasList) na classe OrdenacaoPessoas que contém objetos da classe Pessoa. <br>

**A classe Pessoa** é responsável por criar objetos que serão contidos pela ArrayList, possuindo métodos auxiliares **(Getters)** para possibilitar a manipulação, com foco na ordenação, dos elementos de pessoasList. <br>
Essa classe implementa a **Interface Comparable** e utiliza seu método ***compareTo( )*** para definir critérios de comparação que serão usados para ordenar os elementos contidos na ArrayList.

- **Atributos da Classe**
    - String nome
    - int idade
    - double altura

- **Estrutura Exemplificada**
    ```java
    public class Pessoa implements Comparable<Pessoa> {
        // Definição dos Atributos...
        // Constructor...
        // Métodos Getters...
        // Método da Interface Comparable
        @Override
        public int compareTo(Pessoa pessoa);
        // Método para personalizar a sáida do objeto no terminal
        public String toString();
    }
    ```

<br>

**A classe OrdenacaoPessoas** é responsável por criar a ArrayList e possui métodos para ordenar os seus elementos. Uma instância sua é criada no método **main** para realizar testes de manipulação dos elementos através de seus métodos. <br>
No arquivo ***.java*** dessa classe, existe uma classe secundária que implementa a **Interface Comparator** para realizar uma ordenação com base em outro critério. Além disso, essa mesma classe possui um método que consome o critério de comparação definido na classe Pessoa para ordenar os elementos em pessoasList.

- **Métodos da Classe**
    - OrdenacaoPessoas( )
    - adicionarPessoa( )
    - ordenarPorIdade( ) **-> Utiliza o método de Comparable**
    - ordenarPorAltura( ) **-> Utiliza o método de Comparator**

- **Estrutura Exemplificada**
    ```java
    public class OrdenacaoPessoas {
        // Atributo List (pessoasList)
        private List<Pessoa> pessoasList;
        // Métodos
        public OrdenacaoPessoas();
        public void adicionarPessoa(String nome, int idade, double altura);
        public List<Pessoa> ordenarPorIdade();
        public List<Pessoa> ordenarPorAltura();
        // Main que testa os métodos acima
        public static void main(String[] args);
    }

    // Classe sencundária que implimenta Interface Comparator
    class ComparatorPorAltura implements Comparator<Pessoa>{
        @Override
        public int compare(Pessoa pessoa1, Pessoa pessoa2); 
    }
    ```

<br>

## :gear: Executando
Para executar esse código pode ser usada uma das seguintes abordagens: <br>
1. Usar uma IDE configurada para utilizar uma versão de JDK

2. Instalar uma versão JRE e utilizar dentro da pasta bin o comando cmd: 
    ```
    java OrdenacaoPessoas
    ```

<br>

## :hammer_and_wrench: Construção
Esse código foi construido usando como linguagem apenas Java e usando o **VSCode** como IDE.