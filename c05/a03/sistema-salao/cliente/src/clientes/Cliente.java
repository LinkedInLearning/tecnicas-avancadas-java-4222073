package clientes;

import agendamento.Agenda;

public class Cliente {
  public static void main(String[] args) {
    Agenda agenda = new Agenda();
    agenda.agendar("Joao", "Segunda");
    agenda.agendar("Maria", "Sexta");
  }
}
