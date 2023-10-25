# Operações Básicas -> Set
Esse é um exercício do bootcamp Backend Java da DIO. <br>
O objetivo desse código é fixar o conhecimento das aulas do curso de Collections Java API 2023. <br>
Esse momento do curso trata a **Interface Set** e as classes relacionadas, além de estruturas e métodos pertinentes. <br>
O **package** contém dois exercícios diferentes, abaixo comentarei um pouco sobre eles.

### Exercício -> <span style="color: #FA0">ConjuntoConvidados</span>
Esse programa cria um HashSet (convidadosSet) na classe ConjuntoConvidados que contém objetos da classe Convidado. <br>

**A classe Convidado** é responsável por criar os objetos que serão contidos na classe ConjuntoConvidados. Além disso, possui métodos auxiliares **(Getters)** para buscar o valor de atributos dos objetos.

- **Atributos da Classe**
    - String nome
    - int codigoConvite

<br>

**A classe ConjuntoConvidados** possui métodos para gerenciar os seus elementos. Uma instância sua é criada no método **main** para realizar testes de manipulação dos elementos através de seus métodos. <br>

- **Métodos da Classe**
    - ConjuntoConvidados( )
    - adicionarConvidado( )
    - removerConvidadoPorCodigoConvite( )
    - contarConvidados( )
    - exibirConvidados( )

- **Estrutura Exemplificada**
    ```java
    public class ConjuntoConvidados {
        // Atributo Set (convidadosSet)
        private Set<Convidado> convidadosSet;
        // Métodos
        public ConjuntoConvidados();
        public void adicionarConvidado(String nome, int codigoConvite);
        public void removerConvidadoPorCodigoConvite(int codigoConvite);
        public int contarConvidados();
        public void exibirConvidados();
        // Mais que testa os métodos acima
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
    java ConjuntoConvidados
    ```
<br>

## :hammer_and_wrench: Construção
Esse código foi construido usando como linguagem apenas Java e usando o **Eclipse** como IDE.