package homework8.ex2;
public class Calculator {
    public  double result;

    public void addition (double a, double b) {
        result = a + b;
        System.out.println(result);
    }

    public void  subtraction (double a, double b) {
        result = a - b;
        System.out.println(result);
    }

    public void multiplication (double a, double b) {
        result = a * b;
        System.out.println(result);
    }

    public void division (double a, double b) {
        result = a / b;
        System.out.println(result);
    }

}
