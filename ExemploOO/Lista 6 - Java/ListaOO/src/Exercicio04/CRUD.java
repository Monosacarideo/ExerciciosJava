package Exercicio04;
 import java.util.ArrayList;
import java.util.List;
import Exercicio04.ListaTarefas;

public class CRUD{
    int proxId;
    ListaTarefas L = new ListaTarefas();

  
    public void adicionarTarefa(Tarefa T) {
        proxId = T.id ++;
        L.listaDeTarefas.add(T);
  }


    public Tarefa atualizarTarefa(String id, Tarefa tarefa) {
        for (int i = 0; i < ListaTarefas.size(); i++) {
            if (ListaTarefas.get(i).solicitarId().equals(id)) {
                ListaTarefas.set(i, tarefa);
                return tarefa;
            }
        }
        return null;
    }

    public void removerTarefa(int id) {
        
}

}
