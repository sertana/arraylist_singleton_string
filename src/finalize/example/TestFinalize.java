package finalize.example;

public class TestFinalize {
    public static void main(String[] args) {
        String st = new String("House");
        System.out.println(st);
        TestFinalize tf = new TestFinalize();
        tf.finalize();
        //st = null;
        System.gc();
        System.out.println("End of main");
        System.gc();


    }
    public void finalize(){
        System.out.println("Finalize method has been called..");

    }
    }

