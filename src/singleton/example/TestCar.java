package singleton.example;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = Car.getSingleton();
        car1.carInfo();
        Car car2 = Car.getSingleton();
        car2.carInfo();
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
    }
}
