package arraylist.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseOfIterator {

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<Integer>(4);
            list.add(10);
            list.add(15);
            list.add(10);
            list.add(15);
            list.add(10);
            list.add(15);
            list.add(10);
            list.add(15);
            list.add(8, 46);
            Iterator it = list.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
    }
}
