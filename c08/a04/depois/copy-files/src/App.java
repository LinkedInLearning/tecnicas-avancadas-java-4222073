import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class App {
    public static void main(String[] args) {
        Path origem = Paths.get("origem/arquivo.txt");
        Path destino = Paths.get("destino/novo.txt");

        // try {
        //     Files.copy(origem, destino);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // Se rodar mais uma vez, o arquivo já existe - Exception!
        try {
            Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
