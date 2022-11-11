package Exceptions.mimi;

public class ExceptionThrow {

    public static int addNumber(int a, int b) throws  Exception{
        int sum = a +b;
        if (sum ==0 ){
            throw  new Exception("error occured");

        }
        return  sum;
    }

    public static void main(String[] args) {

        try {
            int x = 0;
            int y = 0;
        System.out.println( addNumber(x,y));
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
