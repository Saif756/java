import java.util.AbstractList;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(678);
        list.add(63);
        list.add(69);
        list.add(66);
        list.add(673);
       // System.out.println(list.contains(9678));
        list.set(1, 99);
        list.remove(3);
        System.out.println(list);
    }
}
