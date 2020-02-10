package mytest.question1;

public class Car {
    
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

    public void info() {
        System.out.println("wheels = " + this.wheels+ "\ndoors = " + this.doors
                            + "\nseats = " + this.seats + "\nmaxspeed = " + this.maxSpeed);
    }
    
    public static void main(String args[]) {
      Car toyota = new Car (100);
      Car bmw = new Car (200);
      toyota.run();
      bmw.run();
    }
    
}