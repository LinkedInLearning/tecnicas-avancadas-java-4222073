import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        // Copiar caminho do diretório desejado!
        // Cria apenas um objeto File
        File arquivo = new File("/Users/giulianabezerra/Downloads/Arquivos/arquivo.txt");
        // Cria o arquivo
        try {
            boolean isArquivoCriado = arquivo.createNewFile();
            // Rodar 2 vezes, uma sem outra com o arquivo.
            System.out.println(isArquivoCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
