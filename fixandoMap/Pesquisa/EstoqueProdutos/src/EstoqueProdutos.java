import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.text.DecimalFormat;

public class EstoqueProdutos {
    // Atributo
    private Map<Integer, Produto> produtosMap;

    // Construtor
    public EstoqueProdutos() {
        this.produtosMap = new HashMap<>();
    }

    // Método para adicionar objetos Produto dentro de produtosMap
    public void adicionarProduto(Integer codigo, String nome, int quantidade, double preco){
        Produto produto = new Produto(nome, quantidade, preco);
        produtosMap.put(codigo, produto);
        System.out.println("Produto adicionado!");
    }

    // Método para exibir os elementos contidos em produtosMap
    public void exibirProdutos(){
        System.out.println(produtosMap);
    }

    // Método para calcular o valor total de produtos no estoque (produtosMap)
    public double calcularInventarioPreco(){
        double precoInventario = 0;

        if (!produtosMap.isEmpty()){
            for (Produto produto : produtosMap.values()){
                precoInventario += (produto.getPreco() * produto.getQuantidade());
            }
        } else {
            System.out.println("O estoque está vazio!");
        }

        return precoInventario;
    }

    // Método para obter o produto de maior preco no estoque (produtosMap)
    public List<Produto> obterProdutoMaisCaro(){
        List<Produto> produtosMaisCaros = new ArrayList<>();
        double maiorPreco = Double.MIN_VALUE;

        if (!produtosMap.isEmpty()){
            for (Produto produto : produtosMap.values()){
                double precoAtual = produto.getPreco();

                if (precoAtual > maiorPreco){
                    produtosMaisCaros.clear();
                    produtosMaisCaros.add(produto);
                    maiorPreco = precoAtual;
                } else if (precoAtual == maiorPreco) {
                    produtosMaisCaros.add(produto);
                }

            }
        } else {
            System.out.println("O estoque está vazio!");
        }

        return  produtosMaisCaros;
    }

    // Método para obter o produto de menor preco no estoque (produtosMap)
    public List<Produto> obterProdutoMaisBarato(){
        List<Produto> produtosMaisBaratos = new ArrayList<>();
        double menorPreco = Double.MAX_VALUE;

        if (!produtosMap.isEmpty()){
            for (Produto produto : produtosMap.values()){
                double precoAtual = produto.getPreco();

                if (precoAtual < menorPreco){
                    produtosMaisBaratos.clear();
                    produtosMaisBaratos.add(produto);
                    menorPreco = precoAtual;
                } else if (precoAtual == menorPreco) {
                    produtosMaisBaratos.add(produto);
                }

            }
        } else {
            System.out.println("O estoque está vazio!");
        }

        return  produtosMaisBaratos;
    }

    // Método para obter o elemento de maior valor total no estoque (produtosMap)
    public List<Produto> obterProdutoMaiorValor(){
        List<Produto> produtosMaiorValor = new ArrayList<>();
        double maiorValor = Double.MIN_VALUE;

        if (!produtosMap.isEmpty()){
            for (Produto produto : produtosMap.values()){
                double valorAtual = produto.getPreco() * produto.getQuantidade();

                if (valorAtual > maiorValor){
                    produtosMaiorValor.clear();
                    produtosMaiorValor.add(produto);
                    maiorValor = valorAtual;
                } else if (valorAtual == maiorValor) {
                    produtosMaiorValor.add(produto);
                }

            }
        } else {
            System.out.println("O estoque está vazio!");
        }

        return  produtosMaiorValor;
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(123, "Produto 1", 12, 19.90);
        estoqueProdutos.adicionarProduto(456, "Produto 2", 10, 89.90);
        estoqueProdutos.adicionarProduto(789, "Produto 3", 45, 9.90);
        estoqueProdutos.adicionarProduto(987, "Produto 4", 21, 29.90);
        estoqueProdutos.adicionarProduto(654, "Produto 5", 25, 32.90);
        estoqueProdutos.adicionarProduto(321, "Produto 6", 60, 24.90);
        estoqueProdutos.adicionarProduto(135, "Produto 7", 38, 12.90);
        estoqueProdutos.adicionarProduto(680, "Produto 8", 32, 49.90);
        System.out.println("--------------------------------------------------------");

        estoqueProdutos.exibirProdutos();
        System.out.println("--------------------------------------------------------");

        estoqueProdutos.adicionarProduto(123, "Produto 9", 30, 9.90);
        System.out.println("O preço total do inventário é: " + df.format(estoqueProdutos.calcularInventarioPreco()));
        estoqueProdutos.exibirProdutos();
        System.out.println("--------------------------------------------------------");

        System.out.println("O(s) produto(s) de maior preço:");
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("O(s) produto(s) de menor preço:");
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("--------------------------------------------------------");

        System.out.println("O(s) produto(s) de maior valor total:");
        System.out.println(estoqueProdutos.obterProdutoMaiorValor());
    }
}