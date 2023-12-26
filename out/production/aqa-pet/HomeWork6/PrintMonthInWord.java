import java.util.Scanner;

public class PrintMonthInWord {
    public static void main(String[] args) {

        //Welcome in system
        System.out.println("Welcome in PrintMonthInWord. Enter a month number ");

        //Save scaner data in memory
        Scanner mySkaner = new Scanner(System.in);

        //Save scanner to variable
        int number = mySkaner.nextInt();

        //If-else case
        System.out.println("If-else case ");
        if ( number <= 12 & number > -0 ) {
            if ( number == 1) {
                System.out.println(number + " - January");
            } if ( number == 2) {
                System.out.println(number + " - February");
            } if ( number == 3) {
                System.out.println(number + " - March");
            } if ( number == 4) {
                System.out.println(number + " - April");
            } if ( number == 5) {
                System.out.println(number + " - May");
            } if ( number == 6) {
                System.out.println(number + " - June");
            } if ( number == 7) {
                System.out.println(number + " - July");
            } if ( number == 8) {
                System.out.println(number + " - August");
            } if ( number == 9) {
                System.out.println(number + " - September");
            } if ( number == 10) {
                System.out.println(number + " - October");
            }if ( number == 11) {
                System.out.println(number + " - November");
            }if ( number == 12) {
                System.out.println(number + " - December");
            }
        } else {
            System.out.println("Not a valid month");
        }


        //Switch case
        System.out.println("Switch case ");
        switch (number) {
            case 1:
                System.out.println(number + " - January");
                break;
            case 2:
                System.out.println(number + " - February");
                break;
            case 3:
                System.out.println(number + " - March");
                break;
            case 4:
                System.out.println(number + " - April");
                break;
            case 5:
                System.out.println(number + " - May");
                break;
            case 6:
                System.out.println(number + " - June");
                break;
            case 7:
                System.out.println(number + " - July");
                break;
            case 8:
                System.out.println(number + " - August");
                break;
            case 9:
                System.out.println(number + " - September");
                break;
            case 10:
                System.out.println(number + " - October");
                break;
            case 11:
                System.out.println(number + " - November");
                break;
            case 12:
                System.out.println(number + " - December");
                break;
            default:
                System.out.println(number + "Not a valid month");
        }


    }
}
