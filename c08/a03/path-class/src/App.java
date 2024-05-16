import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * - Mover, copiar, deletar arquivos = Path
 * - Funcionalidade a mais que não existe em File
 */
public class App {
    public static void main(String[] args) {
        Path arquivoLocalPath = Paths.get("arquivo.txt");
        try {
            Files.deleteIfExists(arquivoLocalPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path arquivoExternoPath = Paths.get("/Users/giulianabezerra/Downloads/Arquivos/arquivo.txt");
        System.out.println(arquivoExternoPath.getParent());
        System.out.println(arquivoExternoPath.getRoot());
        System.out.println(arquivoExternoPath.getFileName());
    }
}
