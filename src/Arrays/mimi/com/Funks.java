package Arrays.mimi.com;

import java.util.Arrays;

public class Funks {
    public static void main(String[] args) {
        int [] source = {12, 1, 5, -2, 16, 14, 18, 20, 25};
        // copy
        int [] dist=Arrays.copyOfRange(source, 3, 7);
        System.out.println(dist);
        // to string
        System.out.println(Arrays.toString(source));
        //binary search;

        System.out.println(Arrays.binarySearch(source,25));

        // sort

//        System.out.println(Arrays.sort(source););;

    }
}
