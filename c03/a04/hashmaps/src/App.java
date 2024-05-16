import java.util.HashMap;
import java.util.Map;

public class App {
  public static void main(String[] args) {
    // Criando um HashMap para armazenar as matrículas 
    // e nomes de alunos
    Map<Integer, String> mapaAlunos = new HashMap<>();

    // Adicionando pares chave-valor ao HashMap
    mapaAlunos.put(104, "João");
    mapaAlunos.put(102, "Maria");
    mapaAlunos.put(103, "Pedro");
    mapaAlunos.put(101, "Ana");

    System.out.println("Alunos: " + mapaAlunos);

    // Iterando sobre o HashMap e exibindo os pares 
    // chave-valor
    for (Map.Entry<Integer, String> entrada : 
      mapaAlunos.entrySet()) {
      int matricula = entrada.getKey();
      String nome = entrada.getValue();
      System.out.println(
        "Matricula: " + matricula + ", Nome: " + nome);
    }

    // Verificando se um aluno está presente no HashMap
    int matricula = 10342;
    if (mapaAlunos.containsKey(matricula)) {
      String nomeAluno = mapaAlunos.get(matricula);
      System.out.println(
        "Matrícula " + matricula + " encontrada: " 
        + nomeAluno);
    } else {
      System.out.println(
        "Matrícula " + matricula + " não encontrada.");
    }

    // Removendo um aluno do HashMap
    mapaAlunos.remove(103);
    System.out.println(
      "Mapa após a remoção de Pedro: " + mapaAlunos);

    mapaAlunos.clear();
    System.out.println("Clear all: " + mapaAlunos);
  }
}
