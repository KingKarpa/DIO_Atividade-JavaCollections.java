# Pesquisa -> Set
Esse é um exercício do bootcamp Backend Java da DIO. <br>
O objetivo desse código é fixar o conhecimento das aulas do curso de Collections Java API 2023. <br>
Esse momento do curso trata a **Interface Set** e as classes relacionadas, além de estruturas e métodos pertinentes. <br>
O **package** contém dois exercícios diferentes, abaixo comentarei um pouco sobre eles.

### Exercício -> <span style="color: #FA0">AgendaContatos</span>
Esse programa cria um HashSet (contatosSet) na classe AgendaContatos que contém objetos da classe Contato. <br>

**A classe Contato** é responsável por criar os objetos que serão contidos no HashSet (contatosSet). Além disso, possui métodos auxiliares **(Getters & Setters)** para possibilitar a manipulação dos elementos nos métodos da classe AgendaContatos.

- **Atributos da Classe**
    - String nome
    - int numeroTelefone

**A classe AgendaContatos** possui métodos para gerenciar os seus elementos, focando em funções de pesquisa. Uma instância sua é criada no método **main** para realizar testes de manipulação dos elementos através de seus métodos.

- **Métodos da Classe**
    - AgendaContatos( )
    - adicionarContato( )
    - exibirContatos( )
    - pesquisarNome( )
    - atualizarNumero( )

- **Estrutura Exemplificada**
    ```java
    public class AgendaContatos {
        // Atributo Set (contatosSet)	
	    private Set<Contato> contatosSet;
        // Métodos
        public AgendaContatos();
        public void adicionarContato(String nome, int numeroTelefone);
        public void exibirContatos();
        public Set<Contato> pesquisarNome(String nome);
        public void atualizarNumero(String nome, int numeroTelefone);
        // Main que testa os métodos acima
        public static void main(String[] args);
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
    java AgendaContatos
    ```
<br>

## :hammer_and_wrench: Construção
Esse código foi construido usando como linguagem apenas Java e usando o **Eclipse** como IDE.