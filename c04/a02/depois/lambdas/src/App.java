public class App {
  public static void main(String[] args) {
    // Sem Lambda
    Saudacao saudacao = new Saudacao() {
      @Override
      public void saudar(String nome) {
        System.out.println("Olá, " + nome);
      }

    };
    saudacao.saudar("Giu");

    // Com Lambda
    Saudacao saudacaoLambda = (String nome) ->  {
      System.out.println("Olá, " + nome);
    };
  
    saudacaoLambda.saudar("Giu");


    // Com Lambda sem argumentos
    Impressao impressao = () -> {
      System.out.print("Impressão concluída!");
    };

    impressao.imprimir();
  }
}
