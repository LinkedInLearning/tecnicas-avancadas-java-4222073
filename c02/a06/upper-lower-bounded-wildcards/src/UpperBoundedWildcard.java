import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcard {

    private static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number i : list)
            sum += i.doubleValue();

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4, 5, 6, 7);
        List<Double> doubles = Arrays.asList(4.1, 5.1, 6.1);

        // Aceita listas de números!
        System.out.println("Total sum is:" + sum(integers));
        System.out.print("Total sum is:" + sum(doubles));
    }
}
