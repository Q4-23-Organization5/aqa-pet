package ex1;
public class Circle extends Shape{

    private double radius;


    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;

    }


    @Override
    public double calculateArea () {
        return Math.round(Math.PI * radius * radius);
    }

    @Override
    public double calculatePerimeter() {
        return Math.round(2 * Math.PI * radius);
    }

    @Override
    public void paint() {
        System.out.println("Circle color: " + color);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

}
