package homework6;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {

        //Welcome in system
        System.out.println("Welcome in CheckOddEven. Enter a number to check for even numbers ");

        //Add number
        Scanner mySkaner = new Scanner(System.in);


        //Save scanner to variable
        int number = mySkaner.nextInt();

        //checking
        if (number % 2 == 0 & number != 0 ){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");

        }









    }
}
