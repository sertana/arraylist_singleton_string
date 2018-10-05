package singleton.example;

public class Car {
    private Car(){}
    private static Car car= new Car();
    public static Car getSingleton() {

        return car;
    }
    public void carInfo(){

        System.out.println("this is a maxda5");
    }
}
