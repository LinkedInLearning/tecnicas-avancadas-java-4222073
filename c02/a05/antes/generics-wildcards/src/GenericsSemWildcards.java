import java.util.List;

// Superclasse Animal
class Animal {
    public String toString() {
        return "Sou um animal";
    }
}

// Subclasse Gato
class Gato extends Animal {
    public String toString() {
        return "Sou um gato";
    }
}

// Subclasse Cachorro
class Cachorro extends Animal {
    public String toString() {
        return "Sou um cachorro";
    }
}

public class GenericsSemWildcards {
    public static void imprimirListaAnimais(List<Animal> animais) {
        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        // Lista de Animal
        List<Animal> listaAnimais = List.of(gato, cachorro);
        System.out.println("Lista de animais:");
        imprimirListaAnimais(listaAnimais);

        // Lista de Gato
        List<Gato> listaGatos = List.of(new Gato(), new Gato());
        System.out.println("\nLista de gatos:");
        // Não aceita Gato, apenas Animal!
        imprimirListaAnimais(listaGatos);
    }
}
