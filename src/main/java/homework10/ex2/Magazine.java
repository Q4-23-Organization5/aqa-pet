package homework10.ex2;

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
        for (Printable num : printable) {
            if (num instanceof Magazine) {
                num.print();
            }
        }
    }

}
