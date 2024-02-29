package homework13.ex1;

import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;

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
