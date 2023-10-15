package AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	// Atributos	
	private Set<Contato> contatosSet;

	// Construtor
	public AgendaContatos() {
		this.contatosSet = new HashSet<>();
	}
	
	// Método para adicionar objetos Contato ao Set contatosSet
	public void adicionarContato(String nome, int numeroTelefone) {
		Contato contato = new Contato(nome, numeroTelefone);
		contatosSet.add(contato);
		System.out.println("Contato adicionado na agenda");
	}
	
	// Métodos para exibir os objetos Contato contidos no Set contatosSet
	public void exibirContatos() {
		System.out.println(contatosSet);
	}
	
	// Método para pesquisar os objetos Contato contidos em contatosSet, usando o atributo nome
	public Set<Contato> pesquisarNome(String nome){
		Set<Contato> conjuntoPesquisado = new HashSet<>();
		
		for (Contato contato : contatosSet) {
			if (contato.getNome().equalsIgnoreCase(nome)) {
				conjuntoPesquisado.add(contato);
			}
		}
		
		return conjuntoPesquisado;
	}
	
	// Método para atualizar o atributo numeroTelefone do primeiro objeto Contato encontrado com o nome recebido 
	public void atualizarNumero(String nome, int numeroTelefone) {
		for (Contato contato : contatosSet) {
			if (contato.getNome().equalsIgnoreCase(nome)) {
				contato.setNumeroTelefone(numeroTelefone);
				System.out.println("Número do contato **" + nome + "** alterado");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Contato 1", 99999999);
		agendaContatos.adicionarContato("Contato 2", 88888888);
		agendaContatos.adicionarContato("Contato 3", 77777777);
		agendaContatos.adicionarContato("Contato 4", 66666666);
		System.out.println("----------------------------------");
		
		System.out.println(agendaContatos.pesquisarNome("Contato 4"));
		agendaContatos.atualizarNumero("Contato 4", 82848688);
		System.out.println("----------------------------------");
		
		agendaContatos.exibirContatos();
	}
}
