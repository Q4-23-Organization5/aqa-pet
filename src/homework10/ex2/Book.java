package ex2;

public class Book  implements Printable {

    final private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Book - " + name);
    }

    public static void printBooks(@org.jetbrains.annotations.NotNull Printable[] printable) {
        System.out.println("Printing Book: ");
        for (Printable num : printable) {
            if (num instanceof Book) {
                num.print();
            }
        }
    }

}
