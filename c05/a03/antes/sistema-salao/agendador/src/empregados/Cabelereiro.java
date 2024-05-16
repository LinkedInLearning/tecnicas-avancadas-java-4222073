package empregados;

import java.util.ArrayList;
import java.util.List;

public class Cabelereiro {
  private String nome;
  private List<String> diasDisponiveis = new ArrayList<>();

  public Cabelereiro() {}

  public Cabelereiro(String nome) {
    this.nome = nome;
  }

  public void setDiasDisponiveis(List<String> diasDisponiveis) {
    this.diasDisponiveis = diasDisponiveis;
  }

  public void removerDiaDisponivel(String dia) {
    diasDisponiveis.remove(dia);
  }

  public List<String> getDiasDisponiveis() {
    return diasDisponiveis;
  }

  public String getNome() {
    return nome;
  }
}
