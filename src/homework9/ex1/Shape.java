package ex1;


public class Shape {

    protected String color;


    public Shape(String color) {
        this.color = color;
    }

    public double calculateArea () {
        return 0;
    }

    public double calculatePerimeter() {
        System.out.println("Shape - calculatePerimeter");
        return 0;
    }

    public void paint() {
        System.out.println("Shape - " + color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape shape)) return false;

        return color.equals(shape.color);
    }

    @Override
    public int hashCode() {
        return color.hashCode();
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}




