package arraylist.example;

import java.util.ArrayList;
import java.util.List;

public class UseOfArrayList {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<Integer>(4);
        list.add(10);
        list.add(15);
        list.add(10);
        list.add(15);
        list.add(10);
        list.add(15);
        list.add(10);
        list.add(15);
        list.add(8, 46);
        //System.out.println(list.size());
        //System.out.println(list);
        //System.out.println(list.get(4));
        for (Integer element:list){
            System.out.println(element);
        }


    }

}
