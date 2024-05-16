package agendamento;

import empregados.Cabelereiro;

import java.util.*;

public class Agenda {
  private static Map<String, Cabelereiro> cabelereiros = new HashMap<>();

  public Agenda() {
    Cabelereiro joao = new Cabelereiro("Joao");
    Cabelereiro maria = new Cabelereiro("Maria");

    var segundaSexta = new ArrayList() {{
      add("Segunda");
      add("Sexta");
    }};
    var tercaQuartaQuinta = new ArrayList() {{
      add("Terca");
      add("Quarta");
      add("Quinta");
    }};
    joao.setDiasDisponiveis(segundaSexta);
    maria.setDiasDisponiveis(tercaQuartaQuinta);

    cabelereiros.put(joao.getNome(), joao);
    cabelereiros.put(maria.getNome(), maria);
  }

  public void agendar(String nome, String dia) {
    Cabelereiro cabelereiro = cabelereiros.getOrDefault(nome, new Cabelereiro());
    if (cabelereiro.getDiasDisponiveis().contains(dia)) {
      System.out.println("Agendado: %s, %s".formatted(nome, dia));
      cabelereiro.removerDiaDisponivel(dia);
    } else
      System.out.println("%s não está disponível na %s".formatted(nome, dia));
  }
}
