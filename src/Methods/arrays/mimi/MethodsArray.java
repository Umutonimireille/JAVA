package Methods.arrays.mimi;

import java.util.Arrays;

public class MethodsArray {

    public  int[] returnArray(){
        int a [] = new int[5];

        for ( int i = 0; i<a.length;i++){
            a[i] = i*2;
        }
        return  a;
    }

    public  void  returnFirst( int [] a){
        System.out.println("the first element in the array is:" + a[0]);
    }


    public static void main(String[] args) {
      int [] myArray = {1,2,3,4,5,6};
        MethodsArray methods = new MethodsArray();
     int []  myArray2 =      methods.returnArray();
        System.out.println(Arrays.toString(myArray2));
        methods.returnFirst(myArray);


    }

}
