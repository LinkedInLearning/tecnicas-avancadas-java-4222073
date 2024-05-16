import java.util.Scanner;

/*
 * - Interagir com usuários
 * - Ler informações, exibir informações
 *   - Ex: Scanner, Sysout
 * - InputStream, OutputStream
 * - Ler/Escrever console, arquivos, …
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
