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

  public void setDiasDisponiveis(String... diasDisponiveis) {
    for (String dia : diasDisponiveis)
      this.diasDisponiveis.add(dia);
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
