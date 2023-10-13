public class Tarefa {
    // Atributo que compõe a tarefa
    private String descricao;

    // Construtor dos objetos Tarefa
    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    // Método para obter a descrição da tarefa
    public String getDescricao(){
        return descricao;
    }

    // Método para converter a exbibição da descrição em String
    public String toString(){
        return descricao;
    }
}
