package mytest.question3;

class Car implements Runnable {
    
    private int wheels, doors, seats, maxSpeed;
    
    public Car(int maxSpeed) {
        this.wheels = 4;
        this.doors = 5;
        this.seats = 6;
        this.maxSpeed = maxSpeed;
    }
    
    public void run() {
        for (int i=0 ; i<10 ; i++) {
            System.out.println(this.maxSpeed);
        }
    }

}

public class JoinMethod {

    public static void main(String args[]) throws Exception {
        Car toyota = new Car(100);
        Car bmw = new Car(200);
        Thread thr1 = new Thread (toyota);
        Thread thr2 = new Thread (bmw);
        thr1.start();
        thr1.join();
        thr2.start();
    }

}
