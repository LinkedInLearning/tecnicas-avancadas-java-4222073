import java.util.ArrayList;
import java.util.List;

class TodoListSVA {
    List<String> todoList = new ArrayList<>();

    // Método para adicionar uma tarefa
    public void adicionarTarefas(String tarefa) {
        todoList.add(tarefa);
    }

    // Método para adicionar duas tarefas
    public void adicionarTarefas(String tarefa1, String tarefa2) {
        todoList.add(tarefa1);
        todoList.add(tarefa2);
    }

    // Método para adicionar tarefas de uma lista
    public void adicionarTarefas(String[] tarefas) {
        for (String tarefa : tarefas) {
            todoList.add(tarefa);
        }
    }
}

public class TodoListSemVarArgs {
    public static void main(String[] args) {
        TodoListSVA exemplo = new TodoListSVA();

        exemplo.adicionarTarefas("Estudar Java");
        exemplo.adicionarTarefas("Estudar Java", "Tomar Café");
        exemplo.adicionarTarefas(new String[] { "Ler livro", "Fazer exercícios" });
    }
}
