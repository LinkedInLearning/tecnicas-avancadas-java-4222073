import java.util.ArrayList;
import java.util.List;

class Lista {
    private List<Object> lista = new ArrayList<>();

    public void adicionar(Object elemento) {
        lista.add(elemento);
    }

    public Object obter(int indice) {
        return lista.get(indice);
    }
}

public class ListaSemGenerics {
    public static void main(String[] args) {
        // Exemplo sem o uso de generics
        Lista numeros = new Lista();
        numeros.adicionar(1);
        numeros.adicionar(2);
        Lista textos = new Lista();
        textos.adicionar("Olá");
        textos.adicionar("Mundo");

        int numero = (int) numeros.obter(0); // ok, pois o tipo é int
        System.out.println(numero);
        String texto = (String) numeros.obter(0); // ClassCastException
        System.out.println(texto);
    }
}
