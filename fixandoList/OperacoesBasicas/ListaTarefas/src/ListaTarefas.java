import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    // Atributo List
    private List<Tarefa> tarefasList;

    // Construtor da lista
    public ListaTarefas(){
        this.tarefasList = new ArrayList<>();
    }

    // Método para adicionar objetos Tarefa à tarefasList
    public void adicionarTarefa(String descricao){
        System.out.println("Adicionando nova tarefa...");
        Tarefa tarefa = new Tarefa(descricao);
        tarefasList.add(tarefa);
    }

    // Método para remover os objetos com a descrição recebida de tarefasList
    public void removerTarefa(String descricao){
        System.out.println("Removendo tarefa: " + descricao);
        List<Tarefa> tarefasParaRemocao = new ArrayList<>();

        // Repetição para encontrar objetos com a mesma descrição
        for (Tarefa tarefa : tarefasList){
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemocao.add(tarefa);
            }
        }

        tarefasList.removeAll(tarefasParaRemocao);
    }

    // Método para obter o número total de objetos dentro de tarefasList
    public int obterNumeroTotalTarefas(){
        return tarefasList.size();
    }

    // Método para objeter todas as descrições dentro de tarefasList
    public void obterDescricoesTarefas(){
        System.out.println(tarefasList);
    }

    public static void main(String[] args){
        ListaTarefas ListaTarefas = new ListaTarefas();
        System.out.println("Número atual de tarefas: " + ListaTarefas.obterNumeroTotalTarefas());
        System.out.println("---------------------------------------");

        ListaTarefas.adicionarTarefa("Limpar o computador");
        ListaTarefas.adicionarTarefa("Tirar poeira");
        ListaTarefas.adicionarTarefa("Varrer a casa");
        System.out.println("Número atual de tarefas: " + ListaTarefas.obterNumeroTotalTarefas());
        System.out.println("---------------------------------------");

        ListaTarefas.adicionarTarefa("Passar pano");
        ListaTarefas.adicionarTarefa("Passar pano");
        System.out.println("Número atual de tarefas: " + ListaTarefas.obterNumeroTotalTarefas());
        System.out.println("---------------------------------------");

        ListaTarefas.removerTarefa("Passar pano");
        System.out.println("---------------------------------------");
        ListaTarefas.obterDescricoesTarefas();
    }
}
