import java.math.BigDecimal;

public class CaixaEletronico {
  public synchronized static void sacar(ContaBancaria conta, BigDecimal valor) {
    if (conta.getSaldo().compareTo(valor) < 0)
      System.out.println("Saldo insuficiente!");
    else {
      conta.debitar(valor);
      System.out.printf("Saque realizado: %.2f\n", valor.doubleValue());
    }
    System.out.printf("Saldo Atual: %.2f\n", conta.getSaldo().doubleValue());
  }
}
