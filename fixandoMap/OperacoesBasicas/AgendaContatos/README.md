# Operações Básicas -> Map
Esse é um exercício do bootcamp Backend Java da DIO. <br>
O objetivo desse código é fixar o conhecimento das aulas do curso de Collections Java API 2023. <br>
Esse momento do curso trata a **Interface Map** e as classes relacionadas, além de estruturas e métodos pertinentes. <br>
Abaixo comentarei sobre o exercício aqui contido.

### <span style="color: #FA0">AgendaContatos</span>
Esse programa cria um HashMap (contatosMap) na classe AgendaContatos que contém números de telefone (Integer) anexados a uma chave nome (String). <br>

**A classe AgendaContatos** possui métodos para gerenciar os seus elementos. Uma instância sua é criada no método **main** para realizar testes de manipulação dos elementos através de seus métodos. <br>

- **Métodos da Classe**
    - AgendaContatos( )
    - adicionarContatos( )
    - removerContatos( )
    - exibirContatos( )
    - pesquisarNome( )

- **Estrutura Exemplificada**
    ```java
    public class AgendaContatos {
        // Atributo Map (contatosMap)
        private Map<String, Integer> contatosMap;
        // Métodos
        public AgendaContatos();
        public void adicionarContatos(String nome, Integer telefone);
        public void removerContatos(String nome);
        public void exibirContatos();
        public Integer pesquisarNome(String nome);
        // Main testando os métodos acima
        public static void main(String[] args)
    }
    ```

<br>

## :gear: Executando
Para executar algum dos programas podem ser usadas as seguintes abordagens: <br>
1. Usar uma IDE configurada para utilizar uma versão de JDK

2. Instalar uma versão JRE e utilizar dentro da pasta **_out/production/_** o comando cmd: 
    ```
    java AgendaContatos
    ```
<br>

## :hammer_and_wrench: Construção
Esse código foi construido usando como linguagem apenas Java e usando o **IntelliJ** como IDE.
