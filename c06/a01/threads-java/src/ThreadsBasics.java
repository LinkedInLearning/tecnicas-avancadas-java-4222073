public class ThreadsBasics {
    public static void main(String[] args) {
        System.out.println(Thread.activeCount());
        Thread thread1 = new Thread(
            new PrintTask("Task 1"),
            "T1"
        );
        Thread thread2 = new Thread(
           () -> System.out.println(
            Thread.currentThread().getName())
        );
        thread1.start();
        thread2.start();
        System.out.println(Thread.activeCount());
    }
}
