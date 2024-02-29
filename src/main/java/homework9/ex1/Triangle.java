package homework9.ex1;

public class Triangle extends Shape {

    private double height;
    private double a;
    private double b;
    private double c;


    public Triangle(String color, double a, double b, double c, double height) {
        super(color);
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
    public void paint() {
        System.out.println("Triangle color: " + color);
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
