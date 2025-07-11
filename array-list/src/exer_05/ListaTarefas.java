package exer_05;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> ListaTarefas; // Lista de tarefas

    // Construtor
    public ListaTarefas() {
        ListaTarefas = new ArrayList<>();
    }

    // Métodos
    public void adicionarTarefa(Tarefa t){
        if (!ListaTarefas.contains(t)){
            ListaTarefas.add(t);
        }
    }
}
