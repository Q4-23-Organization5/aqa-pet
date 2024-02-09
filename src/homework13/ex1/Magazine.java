package ex1;

import org.jetbrains.annotations.NotNull;

import java.util.stream.Stream;

public class Magazine  implements Printable {

    final private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void  print() {
        System.out.println("Magazine - " + name);
    }

    public static void printMagazines(Printable @NotNull [] printable) {
        System.out.println("Printing Magazine: ");
        Stream.of(printable)
                .filter(Magazine.class::isInstance)
                .forEach(Printable::print);
    }

}
