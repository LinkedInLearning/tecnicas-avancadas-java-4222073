public class Cozinha {
    public static Object colher = new Object();
    public static Object vasilha = new Object();

    public static void main(String[] args) {
        Thread cozinheiro1 = new Thread(
            () -> {
                synchronized(colher) {
                    System.out.println("c1: Segurando a colher...");
                    System.out.println("c1: Esperando a vasilha...");
                    
                    synchronized(vasilha) {
                        System.out.println("c1: Segurando a colher e a vasilha.");
                    }
                }

            }
        );

        Thread cozinheiro2 = new Thread(
            () -> {
                
                synchronized(vasilha) {
                    System.out.println("c2: Segurando a vasilha...");
                    System.out.println("c2: Esperando a colher...");
                    
                    synchronized(colher) {
                        System.out.println("c2: Segurando a colher e a vasilha.");
                    }
                }
            }
        );

        cozinheiro1.start();
        cozinheiro2.start();
    }
}
