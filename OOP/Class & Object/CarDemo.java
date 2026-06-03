public class CarDemo {

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.setData("BMW", "Black", 250);

        c1.display();

        c1.start();
        c1.stop();
    }
}

class Car {

    String brand;
    String color;
    int speed;

    void setData(String newBrand, String newColor, int newSpeed) {
        brand = newBrand;
        color = newColor;
        speed = newSpeed;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }

    void start() {
        System.out.println("Car Started");
    }

    void stop() {
        System.out.println("Car Stopped");
    }
}