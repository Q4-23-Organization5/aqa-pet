package ex3;
public class Circle extends AbstractClass {

    private double radius;


    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;

    }


    @Override
    public  double calculateArea() {
        return Math.round(Math.PI * radius * radius);
    }

    @Override
    public double calculatePerimeter() {
        return Math.round(2 * Math.PI * radius);
    }

    @Override
    public String paint() {
        return color;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

}
