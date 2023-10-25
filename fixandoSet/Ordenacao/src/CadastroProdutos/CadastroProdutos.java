package CadastroProdutos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	// Atributo
	private Set<Produto> produtosSet;

	// Construtor
	public CadastroProdutos() {
		this.produtosSet = new HashSet<>();
	}
	
	// Método para adicionar objetos (Produto) em produtosSet
	public void adicionarProduto(String nome, int codigo, double preco, int quantidade) {
		Produto produto = new Produto(nome, codigo, preco, quantidade);
		produtosSet.add(produto);
		System.out.println("Produto cadastrado!");
	}
	
	// Método que usa interface Comparable para ordenar os objetos contidos em produtosSet de acordo com seu atributo nome
	public Set<Produto> ordenarProdutosNome(){
		Set<Produto> produtosOrdenados = new TreeSet<>(produtosSet);
		return produtosOrdenados;
	}
	
	// Método que usa interdace Comparator para ordenar os objetos contidos em produtosSet de acordo com seu atributo preco
	public Set<Produto> ordenarProdutosPreco(){
		Set<Produto> produtosOrdenados = new TreeSet<>(new ComparatorPreco());
		produtosOrdenados.addAll(produtosSet);
		return produtosOrdenados;
	}
	
	public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		cadastroProdutos.adicionarProduto("Pacote de Arroz", 412, 12.90, 24);
		cadastroProdutos.adicionarProduto("Barra de Chocolate", 234, 12.90, 23);
		cadastroProdutos.adicionarProduto("Roda de Queijo", 565, 49.90, 10);
		cadastroProdutos.adicionarProduto("Banco de Plástico", 764, 39.90, 10);
		cadastroProdutos.adicionarProduto("Produto 5", 412, 15.90, 20);
		System.out.println("-------------------------------------");
		
		System.out.println(cadastroProdutos.ordenarProdutosNome());
		System.out.println("-------------------------------------");
		
		System.out.println(cadastroProdutos.ordenarProdutosPreco());
	}
}

class ComparatorPreco implements Comparator<Produto>{

	// Método sobrescrito da interface Comparator para realizar a comparação dos preços dos produtos
		// Possui uma verificação adicional, pois ao retornar 0 (valores iguais) o conjunto TreeSet pode entender que os objetos são iguais, então desconsiderando um deles 
	@Override
	public int compare(Produto produto1, Produto produto2) {
        double precoProduto1 = produto1.getPreco();
        double precoProduto2 = produto2.getPreco();

        if (precoProduto1 < precoProduto2) {
            return -1;
        } else if (precoProduto1 > precoProduto2) {
            return 1;
        } else {
            return Double.compare(produto1.getCodigo(), produto2.getCodigo());
        }
	}
}
