import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // Atributo
    private Map<String, Integer> contatosMap;

    // Construtor
    public AgendaContatos(){
        this.contatosMap = new HashMap<>();
    }

    // Método para adicionar elementos ao Map contatosMap
    public void adicionarContatos(String nome, Integer telefone){
        contatosMap.put(nome, telefone);
        System.out.println("Contato adicionado!");
    }

    // Método para remover elementos do Map contatosMap
    public void removerContatos(String nome){
        contatosMap.remove(nome);
        System.out.println("Contato removido.");
    }

    // Método para exibir os elementos de contatosMap no terminal output
    public void exibirContatos(){
        System.out.println(contatosMap);
    }

    // Método para buscar o valor (telefone) de um elemento específico dentro do contatosMap, usando a key nome
    public Integer pesquisarNome(String nome){
        Integer contatoPesquisado = null;

        if (!contatosMap.isEmpty()){
            contatoPesquisado = contatosMap.get(nome);
        } else {
            System.out.println("Não existem contatos na agenda!");
        }

        return contatoPesquisado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContatos("Contato 1", 99999);
        agendaContatos.adicionarContatos("Contato 2", 88888);
        agendaContatos.adicionarContatos("Contato 3", 77777);
        agendaContatos.adicionarContatos("Contato 4", 66666);
        agendaContatos.adicionarContatos("Contato 5", 44444);
        System.out.println("----------------------------------------");

        agendaContatos.exibirContatos();
        agendaContatos.removerContatos("Contato 4");
        System.out.println("----------------------------------------");

        agendaContatos.adicionarContatos("Contato 1", 55555);
        System.out.println("O número do contato é: "+ agendaContatos.pesquisarNome("Contato 2"));
        agendaContatos.exibirContatos();
    }
}