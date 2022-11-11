package Generecis;

public class GenericsExample {

    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(16);
        printer.print();
        Printer<String> words = new Printer<>("hello");
        words.print();



    }

}
