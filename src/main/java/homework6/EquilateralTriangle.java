package homework6;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {

        //Welcome in system
        System.out.println("Welcome in Equilateral Triangle. Enter the first side");

        //Add number1
        Scanner firstNumb = new Scanner(System.in);

        //Save scanner to variable
        int getOne = firstNumb.nextInt();

        //Add number2
        Scanner secondNumb = new Scanner(System.in);

        //Save scanner to variable
        System.out.println("Enter the second side");
        int getSecond = secondNumb.nextInt();


        //Add number3
        Scanner thirdNumb = new Scanner(System.in);

        //Save scanner to variable
        System.out.println("Enter the third side");
        int getThird = thirdNumb.nextInt();

        //Run checking
        if (getThird != 0 && getOne == getSecond && getOne == getThird) {
            System.out.println("Triangle is equilateral");
        }  else {
                System.out.println("Triangle is NOT equilateral");
        }

    }
}
