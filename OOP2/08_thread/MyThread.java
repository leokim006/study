public class MyThread extends Thread {
    public static int shared_count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 5; ++i) {
            shared_count++;
            System.out.println(getName() + ": " + i + " shared_count: " + shared_count);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
