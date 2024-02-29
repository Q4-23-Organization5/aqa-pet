package homework9.ex1;

public class Main {
    public static void main(String[] args){


  // Shape array [] = {Rectangle,Circle,Triangle};
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle("Black",7.56);
        shapes[1] = new Rectangle("Black", 6,8);
        shapes[2] = new Triangle("Blue",3,4,5,2.5);




        for(Shape shape : shapes ) {
            System.out.println(" ");
            System.out.println(shape);
            System.out.println("area - " + shape.calculateArea());
            System.out.println("perimeter - " + shape.calculatePerimeter());
            shape.paint();
            System.out.println(shape.hashCode());
            System.out.println(" ");
        }







    }
}



