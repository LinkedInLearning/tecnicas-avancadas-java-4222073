import java.io.File;
import java.io.FilenameFilter;

public class App {
    public static void main(String[] args) {
        // String[] conteudos = new File(".").list();
        
        // for (String conteudo : conteudos) {
        //     System.out.println(conteudo);
        // }

        new File("diretorio").mkdir();

        FilenameFilter filtro = (arquivo, nome) -> {
            return nome.endsWith(".md");
        };

        String[] conteudos = new File(".").list(filtro);
        
        for (String conteudo : conteudos) {
            System.out.println(conteudo);
        }
    }
}
