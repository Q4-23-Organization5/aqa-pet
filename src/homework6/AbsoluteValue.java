import javax.swing.event.SwingPropertyChangeSupport;
import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {

        //Welcome in system
        System.out.println("Welcome in Absolute Value. Enter the first number");

        //Add number1
        Scanner firstNumb = new Scanner(System.in);

        //Save scanner to variable
        int getOne = firstNumb.nextInt();
        System.out.println("Enter the second number to compare");

        //Add number2 and save scanner to variable

        Scanner secondNumber = new Scanner(System.in);
        int getTwo = secondNumber.nextInt();

        //Get absolute value
        int numberOne = Math.abs(getOne);
        int numberTwo = Math.abs(getTwo);

        //Added additional number validation
        if(numberOne != 0 & numberTwo != 0 & numberOne != numberTwo) {
            if (numberOne > numberTwo ) {
                System.out.println("Number: " + getOne + " is greater number than " + getTwo);
            } else {
                System.out.println("Number: " + getOne + " is less number than " + getTwo);
            }
        } else {
            System.out.println("Wrong number. Forbids the use of 0 or the same numbers");
            }






    }
}
