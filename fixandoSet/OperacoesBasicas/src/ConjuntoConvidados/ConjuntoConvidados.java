package ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	// Atributo	
	private Set<Convidado> convidadosSet;

	// Construtor	
	public ConjuntoConvidados() {
		this.convidadosSet = new HashSet<>();
	}
	
	// Método para adicionar objetos Convidado no Set convidadosSet	
	public void adicionarConvidado(String nome, int codigoConvite) {
		Convidado convidado = new Convidado(nome, codigoConvite);
		convidadosSet.add(convidado);
		System.out.println("Convidado adicionado ao conjunto");
	}
	
	// Método para remover objetos Convidado contidos no Set convidadosSet	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoRemovido = null;
		
		for (Convidado convidado : convidadosSet) {
			if (convidado.getCodigoConvite() == codigoConvite) {
				convidadoRemovido = convidado;
				break;
			}
		}
		
		convidadosSet.remove(convidadoRemovido);
		System.out.println("Convidado removido do conjunto");
	}
	
	// Método que retorna a quantidade de objetos Convidado contidos no Set convidadosSet	
	public int contarConvidados() {
		return convidadosSet.size();
	}
	
	// Método que exibe o Set convidadosSet	no terminal output
	public void exibirConvidados(){
		System.out.println(convidadosSet);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		
		conjuntoConvidados.adicionarConvidado("Convidado 1", 1);
		conjuntoConvidados.adicionarConvidado("Convidado 2", 2);
		conjuntoConvidados.adicionarConvidado("Convidado 3", 3);
		conjuntoConvidados.adicionarConvidado("Convidado 4", 4);
		System.out.println("--------------------------------------");
		
		System.out.println("O conjunto contém: " + conjuntoConvidados.contarConvidados() + " convidados");
		conjuntoConvidados.removerConvidadoPorCodigoConvite(3);
		System.out.println("Agora o conjunto contém: " + conjuntoConvidados.contarConvidados() + " convidados");
		System.out.println("--------------------------------------");
		
		conjuntoConvidados.exibirConvidados();
	}
}
