class Car {
    String brand;
    String model;
    int year;

    void startEngine() {
        System.out.println("Engine started.");
    }
}
 public class five { 
    public static void main(String[] args) {
        Car myCar = new Car ();
        myCar.brand = "Camry";
        myCar.model = "Corolla";
        myCar.year = 2024;
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year:" + myCar.year);
        myCar.startEngine();
    }
 }
