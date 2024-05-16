import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcard {

  public static void printOnlyIntegerClassorSuperClass(
      List<? super Integer> list) {
    System.out.println(list);
  }

  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(4, 5, 6, 7);
    List<Number> numbers = Arrays.asList(4.9, 5.0, 6, 7);

    // Aceita listas de inteiros ou da superclasse!
    printOnlyIntegerClassorSuperClass(integers);
    printOnlyIntegerClassorSuperClass(numbers);

    // Não aceita double!
    //List<Double> doubles = List.of(1.0, 2.0);
    //printOnlyIntegerClassorSuperClass(doubles);
  }

}
