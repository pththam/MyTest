package mytest.question4;

class Car implements Runnable {

    private int maxSpeed;
    private Thread thread;
    private static Object object = new Object();

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        thread = new Thread(this, "Car Thread");
        thread.start();
    }
    
    public void run() {
        for (int i=0; i<10; i++) {
            synchronized (object) {
                System.out.println(this.maxSpeed);
                object.notify();
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        synchronized (object) {
            object.notify();
        }
    }
}

public class Synchronization {

    public static void main(String args[]) {
        Car toyota = new Car(100);
        Car bmw = new Car(200);
    }
    
}
