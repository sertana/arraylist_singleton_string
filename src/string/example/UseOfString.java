package string.example;

import java.sql.SQLOutput;

public class UseOfString {

    public static void main(String[] args) {
        String st = "We are java programmer";
        String st1= "We are java programmer";
        System.out.println(st.toUpperCase());
        System.out.println(st.toLowerCase());
        System.out.println(st.charAt(12));
        if (st.contains("are")){
            System.out.println("yeah we found it");
        } else{
            System.out.println("not found");
        }
        if (st.toUpperCase().equals(st1.toUpperCase())){
            System.out.println("they are the same");
        }else {
            System.out.println("they different");
        }

    }
}
