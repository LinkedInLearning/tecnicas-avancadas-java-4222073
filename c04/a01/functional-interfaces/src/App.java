public class App {
  public static void main(String[] args) {
    var saudacao = new Saudacao() {

      @Override
      public void saudar(String nome) {
        System.out.println("Olá, " + nome);
      }
      
    };

    saudacao.saudar("Giu");
  }
}
