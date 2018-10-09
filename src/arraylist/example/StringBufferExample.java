package arraylist.example;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("SanskarBasnet");
        s.insert(5, "lal");
        System.out.println(s);

        s.insert(0, 10);
        System.out.println(s);

        s.insert(2, true);
        System.out.println(s);

        s.insert(7, "A");
        System.out.println(s);
    }
}
