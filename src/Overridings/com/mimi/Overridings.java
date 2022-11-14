package Overridings.com.mimi;

public class Overridings {

    int getReturn() {
        return 8;
    }
}

    class Ova  extends  Overridings{
        int getReturn(){
            return 10;
        }
    }

    class  Ride extends  Overridings{
        int getReturn(){
            return  19;
        }
    }

    class  Dings extends  Overridings {
        int getReturn(){
            return  99;
        }
    }

    class  Test {

    public static void main(String[] args) {

        Ova ova = new Ova();
        Ride ride = new Ride();
        Dings dings = new Dings();

        System.out.println("ova is:"+ " "+ova.getReturn());
        System.out.println("ride is:"+" "+ride.getReturn());
        System.out.println("dings is :"+ " "+dings.getReturn());


        }
    }
