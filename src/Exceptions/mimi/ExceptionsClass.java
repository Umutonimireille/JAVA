package Exceptions.mimi;

public class ExceptionsClass {

    public static void main(String[] args) {

        try {
//            int x = 5/6;
//            System.out.println(x);

            String s="abc";
            int i=Integer.parseInt(s);
        }catch (NumberFormatException e){
            System.out.println(e);
        }finally {
            System.out.println("errors only");
        }

    }
}
