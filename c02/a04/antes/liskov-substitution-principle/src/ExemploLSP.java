// Superclasse Animal

import java.util.List;

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

public class ExemploLSP {
    public static void imprimirListaAnimais(List<Animal> animais) {
        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }
    
    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        List<Animal> listaAnimais = List.of(gato, cachorro);

        System.out.println("Lista de animais:");
        imprimirListaAnimais(listaAnimais);

        Gato novoGato = new Gato();
        List<Gato> listaGatos = List.of(novoGato);

        System.out.println("\nLista de gatos:");
        imprimirListaAnimais(listaGatos);

        // System.out.println(gato); // Saída: Sou um gato
        // System.out.println(cachorro); // Saída: Sou um cachorro
    }
}