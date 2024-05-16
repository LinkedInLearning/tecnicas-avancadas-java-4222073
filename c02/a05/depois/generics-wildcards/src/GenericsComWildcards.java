import java.util.List;

public class GenericsComWildcards {
  public static void imprimirListaAnimais(List<? extends Animal> animais) {
    for (Animal animal : animais) {
      System.out.println(animal);
    }
  }

  public static void main(String[] args) {
    Animal gato = new Gato();
    Animal cachorro = new Cachorro();

    // Lista de Animais
    List<Animal> listaAnimais = List.of(gato, cachorro);
    System.out.println("Lista de animais:");
    imprimirListaAnimais(listaAnimais);

    // Aceita Animal e subclasses de Animal
    List<Gato> listaGatos = List.of(new Gato(), new Gato());
    System.out.println("\nLista de gatos:");
    imprimirListaAnimais(listaGatos);

    List<Cachorro> listaCachorros = List.of(new Cachorro(), new Cachorro());
    System.out.println("\nLista de cachorros:");
    imprimirListaAnimais(listaCachorros);
  }
}
