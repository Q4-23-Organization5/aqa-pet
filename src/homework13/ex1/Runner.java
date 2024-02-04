package ex1;

import static ex1.Magazine.printMagazines;
import static ex1.Book.printBooks;

public class Runner {
  public static void main(String[] args){

      Printable[] printables = {new Book("Math"),new Magazine("Moto"),new Book("Java Core"), new Magazine("New Car")};

      System.out.println("------------------");

      for (Printable printable : printables) {
          printable.print();
      }

      System.out.println("------------------");

      printBooks(printables);

      System.out.println("------------------");

      printMagazines(printables);

  }




}
