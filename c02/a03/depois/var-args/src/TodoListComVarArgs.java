import java.util.ArrayList;
import java.util.List;

class TodoListCVA {
  List<String> todoList = new ArrayList<>();

  // Método com varargs para adicionar tarefas
  public void adicionarTarefas(String... tarefas) {
    for (String tarefa : tarefas) {
      todoList.add(tarefa);
    }
  }
}

public class TodoListComVarArgs {
  public static void main(String[] args) {
    TodoListCVA exemplo = new TodoListCVA();

    exemplo.adicionarTarefas(); // Sem tarefas
    exemplo.adicionarTarefas("Estudar Java"); // Uma tarefa
    exemplo.adicionarTarefas("Ler livro", "Fazer exercícios"); // Duas tarefas
  }
}
