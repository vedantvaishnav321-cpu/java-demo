class Mobile{
    private String brand;
    private double price;
    private int batteryPercentage;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        if (batteryPercentage >= 0 && batteryPercentage <= 100) {
            this.batteryPercentage = batteryPercentage;
        } else {
            System.out.println("Invalid Battery Percentage! Must be between 0 and 100.");
        }
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }
}

public class mobile1 {
    public static void main(String[] args) {

        Mobile m1 = new Mobile();

        m1.setBrand("Samsung");
        m1.setPrice(25000);
        m1.setBatteryPercentage(85);

        System.out.println("Brand: " + m1.getBrand());
        System.out.println("Price: " + m1.getPrice());
        System.out.println("Battery: " + m1.getBatteryPercentage() + "%");
    }
}