import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    // Atributo
    private Map<LocalDate, Evento> eventosMap;

    // Construtor
    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    // Método para adicionar elementos (chave + obj Evento) ao eventosMap
    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao){
        Evento evento = new Evento(nomeEvento, nomeAtracao);
        eventosMap.put(data, evento);
        System.out.println("Novo evento adicionado");
    }

    // Método para obter todo Map de eventos em ordem crescente
    private Map<LocalDate, Evento> obterEventos(){
        // A classe LocalDate implementa uma interface (ChronoLocalDate) que já implementa a interface **Comparable**
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        return  eventosTreeMap;
    }

    // Método para exibir todo Map de eventos em ordem crescente no terminal output
    public void exibirEventos(){
        if (!eventosMap.isEmpty()){
            Map<LocalDate, Evento> eventosCronologicos = obterEventos();
            System.out.println(eventosCronologicos);
        } else {
            System.out.println("Não existe nenhum evento agendado.");
        }
    }

    // Método para exibir o próximo evento, comparando datas (chave)
    public void exibirProximoEvento(){
        // eventosMap.keySet() => retorna um Set independente apenas com as chaves (LocalDate)
        // eventosMap.values => retorna uma coleção independente apenas com os valores (Evento)
        // eventosmap.entrySet => retorna um Set onde chave e valor estão relacionados

        LocalDate dataAtual = LocalDate.now();
        if (!eventosMap.isEmpty()){
            for (var entry : obterEventos().entrySet()){
                LocalDate entryKey = entry.getKey();
                if (entryKey.isEqual(dataAtual) || entryKey.isAfter(dataAtual)){
                    System.out.println("O próximo evento é " + entry.getValue() + " na data " + entry.getKey());
                    break;
                }
            }
        } else {
            System.out.println("Nenhum evento encontrado.");
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JANUARY, 11), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 12, 25), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 1, 1), "Evento 2", "Atração 2");
//       agendaEventos.adicionarEvento(LocalDate.now(), "Evento Especial", "Atração");
        System.out.println("-------------------------------------------");

        agendaEventos.exibirEventos();
        System.out.println("-------------------------------------------");

        agendaEventos.exibirProximoEvento();
    }
}