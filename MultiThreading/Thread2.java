package MultiThreading;

public class Thread2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread created via Runnable" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread2 t2 = new Thread2();
        Thread t = new Thread(t2);

        System.out.println();
        t.start();
        t.setName("child");
        System.out.println("Main thread " + Thread.currentThread().getName());
        // t.setName("Parent");

        System.out.println(Thread.activeCount());
    }

}
