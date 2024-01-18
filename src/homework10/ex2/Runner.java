package ex2;

public class Runner {
  public static void main(String[] args){

      Printable[] printables = {new Book("Math"),new Magazine("Moto"),new Book("Java Core"), new Magazine("New Car")};

      System.out.println("------------------");

      for (Printable printable : printables) {
          printable.print();
      }

      System.out.println("------------------");

      Book.printBooks(printables);

      System.out.println("------------------");

      Magazine.printMagazines(printables);
}




}
