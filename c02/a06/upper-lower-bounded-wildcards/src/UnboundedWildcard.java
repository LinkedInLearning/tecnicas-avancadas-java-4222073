import java.util.Arrays;
import java.util.List;

public class UnboundedWildcard {

  private static void printlist(List<?> list) {
    System.out.println(list);
  }

  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(1, 2, 3);
    List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);

    // Aceita lista de qualquer coisa!
    printlist(integers);
    printlist(doubles);
  }
}
