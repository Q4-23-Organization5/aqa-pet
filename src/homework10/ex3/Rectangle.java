package ex3;

public class Rectangle extends AbstractClass {

    private double height;
    private double width;

    public Rectangle(String color, double width, double height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }


    @Override
    public double calculateArea () {
        return  height * width;
    }

    @Override
    public double calculatePerimeter() {
        return  (height + width) * 2;
    }

    @Override
    public String paint() {
        return color;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }
}
