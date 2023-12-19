public class Main {
    public static void main(String[] args) {

        //Exercise 1
        System.out.println("Exercise 1");
        System.out.println("My First Java Program");
        System.out.println(" ");


        //Exercise2
        System.out.println("Exercise 2");

        float celsius;
        float fahrenheit;
        double kelvin;

        celsius = 5;

        fahrenheit = celsius + 32;
        kelvin = celsius + 273.16;

        System.out.println(celsius + " Celsius: " + fahrenheit + " Fahrenheit; " + kelvin + " Kelvin");
        System.out.println(" ");

        //Exercise3
        System.out.println("Exercise 3");

        float firstSide;
        float secondSide;

        firstSide = 3;
        secondSide = 5;

        float S = (firstSide * secondSide) / 2;

        System.out.println("Розрахунок площі " + S);
    }}