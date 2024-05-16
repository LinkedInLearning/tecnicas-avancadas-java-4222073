public class ArrayUtilsSemGenerics {
    // Método que retorna o primeiro elemento de um array de Object
    public static Object getElemento(Object[] array, int index) {
        if (index >= array.length || index < 0) {
            return null;
        }
        return array[index];
    }

    public static void main(String[] args) {
        // Array de Object
        Integer[] integers = { 1, 2, 3 };
        String[] strings = { "texto 1", "texto 2", "texto 3" };

        // Chamada do método
        Object primeiroObjeto = getElemento(integers, 0);
        System.out.println("Primeiro objeto: " + primeiroObjeto);

        // Tentativa de armazenar o resultado em uma String (ClassCastException)
        // String primeiraString = (String) getElemento(integers, 0);
        // System.out.println(primeiraString);
    }
}
