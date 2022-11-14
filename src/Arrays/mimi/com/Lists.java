package Arrays.mimi.com;

import java.util.HashSet;

public class Lists {

    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        set.add(1234);
        set.add("Helllo");
        set.add(1234);

        System.out.println(set.size());

        for(int k = 0 ; k<set.size();k++){
            System.out.println(set.getClass());
        }
    }
}
