package MultiThreading;
public class Thread5 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });

        Runnable r = () -> {
            for (int i = 10; i < 20; i++) {
                System.out.println(i);
            }
        };
        Thread t1 = new Thread(r);
        t.start();
        t1.start();
    
    }
}