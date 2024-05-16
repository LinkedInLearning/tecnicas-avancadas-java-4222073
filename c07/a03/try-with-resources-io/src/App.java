import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class App {
    public static void main(String[] args) {
        try(
            BufferedReader leitor = new BufferedReader(
                new StringReader("Olá, Mundo!")
            );
            StringWriter escritor = new StringWriter();
        ) {
            escritor.write(leitor.readLine());
            System.out.println(escritor.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
