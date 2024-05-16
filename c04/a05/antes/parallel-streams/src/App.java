import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        var livros = criarLivros();
        livros.parallelStream().filter(
            livro -> livro.getAutor().toLowerCase().contains("a")
        )
        .forEach(System.out::println);
    }

    static List<Livro> criarLivros() {
        var livros = new ArrayList<Livro>();
        livros.add(new Livro("Ana", "Livro 1"));
        livros.add(new Livro("Joao", "Livro 2"));
        livros.add(new Livro("Paulo", "Livro 3"));
        livros.add(new Livro("Rogerio", "Livro 4"));
        livros.add(new Livro("Jose", "Livro 5"));
        return livros;
    }
}
