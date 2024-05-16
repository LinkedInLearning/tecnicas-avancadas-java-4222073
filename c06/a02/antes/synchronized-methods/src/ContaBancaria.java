import java.math.BigDecimal;

public class ContaBancaria {
  private BigDecimal saldo = BigDecimal.ZERO;

  public ContaBancaria() {
    saldo.setScale(2);
  }

  public void creditar(BigDecimal valor) {
    this.saldo = this.saldo.add(valor);
  }

  public void debitar(BigDecimal valor) {
    this.saldo = this.saldo.subtract(valor);
  }

  public BigDecimal getSaldo() {
    return saldo;
  }

}
