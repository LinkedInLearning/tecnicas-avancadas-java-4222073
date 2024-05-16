import java.math.BigDecimal;

public class Usuarios {
  static final ContaBancaria conta = 
    new ContaBancaria();
  public static void main(String[] args) {
    conta.creditar(new BigDecimal(100));

    Thread usuario1 = new Thread(
      () -> CaixaEletronico.sacar(conta, new BigDecimal(100))
    );
    Thread usuario2 = new Thread(
      () -> CaixaEletronico.sacar(conta, new BigDecimal(100))
    );

    usuario1.start();
    usuario2.start();
  }
}
