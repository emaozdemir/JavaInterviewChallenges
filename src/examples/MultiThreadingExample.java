package examples;

public class MultiThreadingExample {

    // Birden fazla thread kullanarak paralel işleme yapın.
    // Her bir thread, farklı bir mesajı kendi thread adıyla birlikte yazdırmalıdır.
    static class MyRunnable implements Runnable {
        private String name;

        public MyRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name + " is running on thread: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        thread1.start();
        thread2.start();
    }
}
