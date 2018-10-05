package singleton.example;

import java.sql.SQLOutput;

public class TestHouse {
    public static void main(String[] args) {
        House house1 = House.getSingleton().get(0);
        house1.displayHouseDim();
        house1.size();
        House house2 = House.getSingleton().get(1);
        house2.displayHouseDim();
        house2.size();
        House house3 = House.getSingleton().get(0);
        house3.displayHouseDim();
        house3.size();
        House house4 = House.getSingleton().get(2);
        House house5 = House.getSingleton().get(2);
        House house6 = House.getSingleton().get(8);
        house6.displayHouseDim();
        house6.size();
        System.out.println(house1.hashCode());
        System.out.println(house2.hashCode());
        System.out.println(house3.hashCode());
        System.out.println(house4.hashCode());
        System.out.println(house5.hashCode());
        System.out.println(house6.hashCode());

    }
}
