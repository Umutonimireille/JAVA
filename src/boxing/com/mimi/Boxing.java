package boxing.com.mimi;

import java.util.ArrayList;

public class Boxing {

    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(12);
        values.add(40);
        values.add(50);
        values.add(70);

        Integer value = (Integer) values.get(0);
        System.out.println(value);

        int last = (Integer) values.get(2);
        System.out.println(last);
    }
}
