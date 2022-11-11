package Generecis;

public class Printer <T> {

  T  things;

  public  Printer(T things) {
      this.things = things;
  }

  public  void  print(){
      System.out.println(things);
  }

}
