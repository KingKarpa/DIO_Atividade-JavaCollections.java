# Ordenação -> Map
Esse é um exercício do bootcamp Backend Java da DIO. <br>
O objetivo desse código é fixar o conhecimento das aulas do curso de Collections Java API 2023. <br>
Esse momento do curso trata a **Interface Map** e as classes relacionadas, além de estruturas e métodos pertinentes. <br>
Abaixo comentarei sobre o exercício aqui contido.

### <span style="color: #FA0">AgendaEventos</span>
Esse programa cria um HashMap (eventosMap) na classe AgendaEventos que contém um valor objeto (Evento) e uma chave data (LocalDate). <br>

**A classe Evento** é a classe responsável pela criação dos objetos que ficarão contidos no HashMap. Essa classe possui métodos auxiliares para obtenção de valores de atributo de um objeto específico **(Getters)**, muito usados durante as pesquisas ocorridas nos métodos testados.

- **Atributos da Classe**
    - String nomeEvento
    - String nomeAtracao

<br>**A classe AgendaEventos** possui métodos para gerenciar os seus elementos, focando na ordenação de seus objetos. Uma instância sua é criada no método **main** para realizar testes de manipulação dos elementos através de seus métodos. <br>

- **Métodos da Classe**
    - AgendaEventos( )
    - adicionarEvento( )
    - obterEventos( ) **--> Cria um TreeMap**
    - exibirEventos( )
    - exibirProximoEvento( )

- **Estrutura Exemplificada**
    ```java 
    public class AgendaEventos {
        // Atributo Map (eventosMap)
        private Map<LocalDate, Evento> eventosMap;
        // Métodos
        public AgendaEventos();
        private Map<LocalDate, Evento> obterEventos();
        public void exibirEventos();
        public void exibirProximoEvento();
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