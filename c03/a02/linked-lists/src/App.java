import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        var myList = new LinkedList<String>();
        myList.add("A");
        myList.add("B");
        myList.add(1, "C");

        System.out.println(myList);

        myList.remove("C");
        System.out.println(myList);
    }
}
