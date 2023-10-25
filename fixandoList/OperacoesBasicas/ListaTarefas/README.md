# Operações Básicas -> List
Esse é um exercício do bootcamp Backend Java da DIO. <br>
O objetivo desse código é fixar o conhecimento das aulas do curso de Collections Java API 2023. <br>
Esse momento do curso trata a **Interface List** e as classes relacionadas, além de estruturas e métodos pertinentes.

### <span style="color: #FA0">ListaTarefas</span>
Esse programa cria uma ArrayList (tarefasList) na classe ListaTarefas que contém objetos da classe Tarefa. <br>

**A classe Tarefa** é responsável por criar objetos que serão contidos pela ArrayList, possuindo métodos auxiliares **(Getters)** para possibilitar a manipulação dos elementos de tarefasList.

- **Atributos da Classe**
    - String descricao;

<br>

**A classe ListaTarefas** é responsável por criar a ArrayList e possui métodos para manipular os elementos contidos em tarefasList. Uma instância sua é criada no método **main** para realizar testes de manipulação dos elementos através de seus métodos.<br>

- **Métodos da Classe**
    - ListaTarefas( )
    - adicionarTarefa( )
    - removerTarefa( )
    - obterNumeroTotalTarefas( )
    - obterDescricoesTarefas( )

- **Estrutura Exemplificada**
    ```java
    public class ListaTarefas {
        // Atributo List (carrinhoList)
        private List<Item> tarefasList;
        // Métodos
        public ListaTarefas();
        public void adicionarTarefa(String descricao);
        public void removerTarefa(String descricao);
        public int obterNumeroTotalTarefas();
        public void obterDescricoesTarefas();
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
    java ListaTarefas
    ```

<br>

## :hammer_and_wrench: Construção
Esse código foi construido usando como linguagem apenas Java e usando o **VSCode** como IDE.