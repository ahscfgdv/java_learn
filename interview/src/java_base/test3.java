package java_base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next == 5) {
//                list.remove(next);
                iterator.remove();
            }
        }
        list.forEach(System.out::println);
    }

}
