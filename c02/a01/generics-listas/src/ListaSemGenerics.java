import java.util.ArrayList;
import java.util.List;

class ListaSG {
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
        ListaSG numeros = new ListaSG();
        numeros.adicionar(1);
        numeros.adicionar(2);
        ListaSG textos = new ListaSG();
        textos.adicionar("Olá");
        textos.adicionar("Mundo");

        int numero = (int) numeros.obter(0); // ok, pois o tipo é int
        System.out.println(numero);
        String texto = (String) numeros.obter(0); // ClassCastException
        System.out.println(texto);
    }
}
