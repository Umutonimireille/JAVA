package Overloading.com.mimi;

public class Overloads {

    static  void sum(int a , int b){
//        return  a+b;
        System.out.println(a+b);
    }


    static  void sum(int a,int b,int c){
        System.out.println( a+b+c);
    }

    public static void main(String[] args) {
//        System.out.println(Overloads.sum(6,7));
//        System.out.println(sum(2,3,4));

        Overloads c = new Overloads();
        c.sum(2,4);
        c.sum(9,7,8);
    }
}

