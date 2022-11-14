import java.util.ArrayList;
import java.util.Collections;

public class Educational {

    public static int adds(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("hello world my man");

        ArrayList<String> names = new ArrayList<String>();
        names.add("oxane");
        names.add("oxane");
        names.add("oxane");
        names.add("oxane");
//        System.out.println(names);

        for (int i = 0 ; i<names.size() ; i++){
            System.out.println(names.get(i));
        }

        ArrayList<Integer> nums =  new ArrayList<Integer>();
        nums.add(13);
        nums.add(18);
        nums.add(92);
        nums.add(62);
        nums.add(12);
        Collections.sort(nums);

       for(int i = 0; i<nums.size();i++){
           System.out.println(nums.get(i));
       }

        System.out.println(adds(2,5));

    }
}
