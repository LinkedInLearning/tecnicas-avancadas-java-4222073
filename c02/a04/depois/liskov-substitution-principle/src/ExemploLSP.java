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

public class ExemploLSP {
    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        System.out.println(gato); // Saída: Sou um gato
        System.out.println(cachorro); // Saída: Sou um cachorro
    }
}