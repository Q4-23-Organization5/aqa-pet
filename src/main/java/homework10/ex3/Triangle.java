package homework10.ex3;

public class Triangle extends AbstractClass {

    private double height;
    private double a;
    private double b;
    private double c;


    public Triangle(String color, double a, double b, double c, double height) {
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    @Override
    public double calculateArea () {
        return 0.5 * (c * height);
    }

    @Override
    public double calculatePerimeter() {
        return  a + b + c;
    }

    @Override
    public String paint() {
       return color;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", color='" + color + '\'' +
                '}';
    }
}
