# Operações Básicas -> List
Esse é um exercício do bootcamp Backend Java da DIO. <br>
O objetivo desse código é fixar o conhecimento das aulas do curso de Collections Java API 2023. <br>
Esse momento do curso trata a **Interface List** e as classes relacionadas, além de estruturas e métodos pertinentes.

### <span style="color: #FA0">CarrinhoDeCompras</span>
Esse programa cria uma ArrayList (carrinhoList) na classe CarrinhoDeCompras que contém objetos da classe Item. <br>

**A classe Item** é responsável por criar objetos que serão contidos pela ArrayList, possuindo métodos auxiliares **(Getters)** para possibilitar a manipulação dos elementos de carrinhoList.

- **Atributos da Classe**
    - String nome;
    - Double preco;
    - Integer quantidade;

<br>

**A classe CarrinhoDeCompras** é responsável por criar a ArrayList e possui métodos para manipular os elementos contidos em carrinhoList. Uma instância sua é criada no método **main** para realizar testes de manipulação dos elementos através de seus métodos.<br>

- **Métodos da Classe**
    - CarrinhoDeCompras( )
    - adicionarItem( )
    - aumentarQuantidade( )
    - diminuirQuantidade( )
    - removerItem( )
    - calcularPrecoTotal( )
    - exbirItens( )

- **Estrutura Exemplificada**
    ```java
    public class CarrinhoDeCompras {
        // Atributo List (carrinhoList)
        private List<Item> carrinhoList;
        // Métodos
        public CarrinhoDeCompras();
        public void adicionarItem(String nome, Double preco, Integer quantidade);
        public void aumentarQuantidade(String nome);
        public void diminuirQuantidade(String nome);
        public void removerItem(String nome);
        public Double calcularPrecoTotal();
        public void exbirItens();
        // Main para testar métodos acima
        public static void main(String[] args);
    }
    ```

<br>

## :gear: Executando
Para executar esse código pode ser usada uma das seguintes abordagens: <br>
1. Usar uma IDE configurada para utilizar uma versão de JDK

2. Instalar uma versão JRE e utilizar dentro da pasta bin o comando cmd: 
    ```
    java CarrinhoDeCompras
    ```

<br>

## :hammer_and_wrench: Construção
Esse código foi construido usando como linguagem apenas Java e usando o **VSCode** como IDE.