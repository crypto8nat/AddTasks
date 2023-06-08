package additional1;

public class Car {

    String model;
    int maxSpeed;
    int yearOfManufacture;
    public  Car(String model, int maxSpeed, int yearOfManufacture){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari 360 Spider", 280, 1996);
        Car ferrariTwin = new Car("Ferrari 360 Spider", 280, 1996);
        System.out.println(ferrari.equals(ferrariTwin));

    }


}
