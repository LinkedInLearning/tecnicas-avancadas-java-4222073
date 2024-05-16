import java.util.LinkedList;
import java.util.Queue;

public class App {
  public static void main(String[] args) {
    // Criando uma fila (Queue) usando LinkedList
    Queue<String> fila = new LinkedList<>();

    // Adicionando elementos à fila - add(), offer()
    fila.add("Cliente 1");
    fila.add("Cliente 2");
    fila.add("Cliente 3");

    System.out.println("Clientes na fila: " + fila);

    // Removendo e exibindo o elemento da frente da fila usando o 
    // método poll()
    String elementoRemovido = fila.poll();
    System.out.println("Cliente atendido: " + elementoRemovido);
    System.out.println("Clientes na fila após remoção: " + fila);

    // Exibindo o elemento da frente da fila sem removê-lo usando o 
    // método peek()
    String elementoDaFrente = fila.peek();
    System.out.println("Cliente da frente da fila: " + elementoDaFrente);
    System.out.println("Clientes na fila após peek(): " + fila);
  }
}
