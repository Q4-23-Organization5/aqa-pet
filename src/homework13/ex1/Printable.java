package ex1;

public interface Printable {


    void print();

    Printable printableLambda = () -> System.out.println("Printing...");

}
