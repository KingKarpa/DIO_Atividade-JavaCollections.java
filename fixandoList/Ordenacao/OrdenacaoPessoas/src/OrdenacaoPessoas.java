import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
    // Atributo
    private List<Pessoa> pessoasList;

    // Construtor
    public OrdenacaoPessoas(){
        this.pessoasList = new ArrayList<>();
    }

    // Método para adicionar objetos Pessoa na pessoasList
    public void adicionarPessoa(String nome, int idade, double altura){
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        pessoasList.add(pessoa);
        System.out.println("Pessoa adicionada");
    }

    // FOCO DO EXERCÍCIO: Método para ordenar objetos Pessoa na pessoasList, usando o atributo idade e o **Comparable**
    public List<Pessoa> ordenarPorIdade(){
        System.out.println("Comparable: Ordenando por idade...");
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    // FOCO DO EXERCÍCIO: Método para ordenar objetos Pessoa na pessoasList, usando o atributo altura e o **Comparator**
    public List<Pessoa> ordenarPorAltura(){
        System.out.println("Comparator: Ordenando por altura...");
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
        ComparatorPorAltura comparatorAltura = new ComparatorPorAltura();
        Collections.sort(pessoasPorAltura, comparatorAltura);
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Nome 1", 19, 1.93);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 24, 1.82);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 21, 1.69);
        ordenacaoPessoas.adicionarPessoa("Nome 4", 64, 1.78);
        ordenacaoPessoas.adicionarPessoa("Nome 5", 40, 1.73);
        System.out.println("-----------------------------------");

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println("-----------------------------------");

        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        System.out.println("-----------------------------------");
    }
}

// FOCO DO EXERCÍCIO: Classe que implementa a interface Comparator
class ComparatorPorAltura implements Comparator<Pessoa>{

    // FOCO DO EXERCÍCIO: Método da interface Comparator para ordenar obejtos Pessoa por altura
    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
    }

}