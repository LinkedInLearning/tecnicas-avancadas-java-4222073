import java.util.List;

public class ExemploLSPLista {
  public static void imprimirListaAnimais(List<Animal> animais) {
    for (Animal animal : animais) {
      System.out.println(animal);
    }
  }

  public static void main(String[] args) {
    Animal gato = new Gato();
    Animal cachorro = new Cachorro();

    // Criando uma lista de animais e adicionando os objetos Gato e Cachorro
    List<Animal> listaAnimais = List.of(gato, cachorro);

    // Funciona para Gato e Cachorro
    System.out.println("Lista de animais:");
    imprimirListaAnimais(listaAnimais);

    // Criando uma lista apenas de gatos
    List<Gato> listaGatos = List.of(new Gato(), new Gato());

    // Não funciona corretamente para lista apenas de Gato
    System.out.println("\nLista de gatos:");
    imprimirListaAnimais(listaGatos);
  }
}
