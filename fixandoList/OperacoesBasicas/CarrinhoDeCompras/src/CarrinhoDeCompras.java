import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    // Atributo List
    private List<Item> carrinhoList;

    // Construtor do CarrinhoList
    public CarrinhoDeCompras(){
        this.carrinhoList = new ArrayList<>();
    }

    // Método que adiciona um objeto item ao carrinho, caso haja um com mesmo nome ocorre incremento da sua quantidade
    public void adicionarItem(String nome, Double preco, Integer quantidade){
        System.out.println("Inserindo item na lista...");

        for (Item item : carrinhoList){
            if (item.getNome().equalsIgnoreCase(nome)){
                for (int i = 0; quantidade > i; i++){
                    aumentarQuantidade(nome);
                }
                return;
            }
        }

        Item item = new Item(nome, preco, quantidade);
        carrinhoList.add(item);
    }

    // Método que incrementa a quantidade do item recebido
    public void aumentarQuantidade(String nome){
        System.out.println("Adicionando mais um do item: " + nome);
        for (Item item: carrinhoList){
            if (item.getNome().equalsIgnoreCase(nome)){
                item.incrementarQuantidade();
            }
        }
    }

    // Método que decrementa a quantidade do item recebido
    public void diminuirQuantidade(String nome){
        System.out.println("Diminuindo um do item: " + nome);
        for (Item item: carrinhoList){
            if (item.getNome().equalsIgnoreCase(nome)){
                item.decrementarQuantidade();
            }
        }        
    }

    // Método que remove o item recebido
    public void removerItem(String nome){
        System.out.println("Removendo item: " + nome);
        List<Item> itemsParaRemocao = new ArrayList<>();

        for (Item item : carrinhoList){
            if (item.getNome().equalsIgnoreCase(nome)){
                itemsParaRemocao.add(item);
            }
        }

        carrinhoList.removeAll(itemsParaRemocao);
    }

    // Método que calcula o preço total, somando todos os items do carrinho, respeitando suas quantidades
    public Double calcularPrecoTotal(){
        Double precoTotal = 0.0;

        for (Item item : carrinhoList){
            Double precoItem = item.getPreco() * item.getQuantidade();
            precoTotal += precoItem;
        }

        return precoTotal;
    }

    // Método que exibe cada item no terminal de output
    public void exbirItens(){
        System.out.println(carrinhoList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Pacote de Arroz", 15.90, 2);
        carrinho.adicionarItem("Pacote de Feijão", 12.90, 3);
        carrinho.adicionarItem("Pacote de Açúcar", 12.90, 2);
        System.out.printf("O perço total do carrinho até o momento é: %.2f", carrinho.calcularPrecoTotal());
        System.out.println("\n------------------------------------------------------");

        carrinho.adicionarItem("Pacote de Arroz", 15.90, 2);
        carrinho.exbirItens();
        System.out.printf("O perço total do carrinho até o momento é: %.2f", carrinho.calcularPrecoTotal());
        System.out.println("\n------------------------------------------------------");

        carrinho.aumentarQuantidade("Pacote de Açúcar");
        carrinho.removerItem("Pacote de Feijão");
        carrinho.diminuirQuantidade("Pacote de Arroz");
        carrinho.exbirItens();
        System.out.printf("O perço total do carrinho até o momento é: %.2f", carrinho.calcularPrecoTotal());
        System.out.println("\n------------------------------------------------------");
    }
}
