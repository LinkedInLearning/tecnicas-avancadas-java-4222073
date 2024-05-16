import java.util.Scanner;

/*
 * InputStream e OutputStream
 */
public class App {
    public static void main(String[] args) {
        // Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome e sobrenome?");
        String nome = scanner.next();
        String sobrenome = scanner.next();
        
        // Saída
        System.out.printf("Olá, %s %s\n", nome, sobrenome);
        scanner.close();
    }
}
