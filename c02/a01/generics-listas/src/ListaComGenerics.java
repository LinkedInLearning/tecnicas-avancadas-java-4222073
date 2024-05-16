import java.util.ArrayList;
import java.util.List;

class ListaCG<T> {
  private List<T> lista = new ArrayList<>();

  public void adicionar(T elemento) {
    lista.add(elemento);
  }

  public T obter(int indice) {
    return lista.get(indice);
  }
}

public class ListaComGenerics {
  public static void main(String[] args) {
    // Exemplo sem o uso de generics
    ListaCG<Integer> numeros = new ListaCG<>();
    numeros.adicionar(1);
    numeros.adicionar(2);
    ListaCG<String> textos = new ListaCG<>();
    textos.adicionar("Olá");
    textos.adicionar("Mundo");

    int numero = (int) numeros.obter(0); // ok, pois o tipo é int
    System.out.println(numero);
    // String texto = (String) numeros.obter(0); // erro de compilação
    // System.out.println(texto);
  }
}
