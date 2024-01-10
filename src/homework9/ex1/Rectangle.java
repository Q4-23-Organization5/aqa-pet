package ex1;
public class Rectangle extends  Shape {

    private double height;
    private double width;

    public Rectangle(String color, double width, double height) {
        super(color);
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
    public void paint() {
        System.out.println("Rectangle  color: " + color);
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
