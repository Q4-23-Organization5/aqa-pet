package ex1;

import org.jetbrains.annotations.NotNull;

import java.util.stream.Stream;

public class Book  implements Printable {

    final private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Book - " + name);
    }


    public static void printBooks(Printable @NotNull [] printable) {
        System.out.println("Printing Magazine: ");
        Stream.of(printable)
                .filter(Book.class::isInstance)
                .forEach(Printable::print);
    }

}
