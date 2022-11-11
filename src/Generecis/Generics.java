package Generecis;

public class Generics <T>{

    T obj;
    Generics (T obj){
        this.obj = obj;
    }
    public  T getObject(){
        return  this.obj;
    }
    public static void main(String[] args) {

        Generics<Integer> iobj = new Generics<>(15);
        System.out.println(iobj.getObject());

        Generics<String> sObj = new Generics<String>("home girl");
        System.out.println(sObj.getObject());

        

    }

}
