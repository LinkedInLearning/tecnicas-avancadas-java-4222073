import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        // Pacote raiz do projeto!
        File arquivo = new File("arquivo.txt");

        try {
            BufferedReader leitor = new BufferedReader(
                new FileReader(arquivo)
            );
            String linha;
            while ((linha = leitor.readLine()) != null)
                System.out.println(linha);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
