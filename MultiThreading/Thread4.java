package MultiThreading;

public class Thread4 {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("Created a Thread via Lambda Expression " + Thread.currentThread().getName());
        };
        Thread t = new Thread(r);
        t.setPriority(1);
        t.setName("Lambada via Runnable ");
        t.start();

        Thread t1 = new Thread(() -> {
            System.out.println("Created a Thread via Lambda Expression " + Thread.currentThread().getName());
        });
        
        t1.setName("Lambda via Thread");
        t1.start();

        Thread t2 = new Thread(() -> {
            System.out.println("Created a Thread via Lambda Expression " + Thread.currentThread().getName());
            // Thread.MAX_PRIORITY();
        });
        // Thread.MAX_PRIORITY();
        t2.setName("Lambda via Thread-2");
        t2.setPriority(10);
        t2.start();

        Runnable r1 = () -> {
            System.out.println("Created a Thread via Lambda Expression " + Thread.currentThread().getName());
        };
        Thread t3 = new Thread(r1);
        t3.setName("Lambada via Runnable -2");
        t3.start();

        System.out.println("Active Count " + Thread.activeCount());
    }

}
