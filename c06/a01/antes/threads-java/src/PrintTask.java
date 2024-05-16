public class PrintTask implements Runnable {
  private String name;

  public PrintTask(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    System.out.println("%s: Olá, %s".formatted(
      Thread.currentThread().getName(), name));
  }

}
