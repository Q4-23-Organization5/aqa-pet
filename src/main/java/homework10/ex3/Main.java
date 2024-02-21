package homework10.ex3;

public class Main {
    public static void main(String[] args){

        AbstractClass[] shapes = new AbstractClass[3];

        shapes[0] = new Circle("Black",7.56);
        shapes[1] = new Rectangle("Black", 6,8);
        shapes[2] = new Triangle("Blue",3,4,5,2.5);



        for(AbstractClass index : shapes ) {
            System.out.println(" ");
            System.out.println(index);
            System.out.println("area - " + index.calculateArea());
            System.out.println("perimeter - " + index.calculatePerimeter());
            System.out.println(index.paint());
            System.out.println(index.hashCode());
            System.out.println(" ");
        }

        }


}
