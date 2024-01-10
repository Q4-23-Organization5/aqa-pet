package ex2;

public class BasicCalc {

     protected double numberOne;
     protected double numberTwo;

    public BasicCalc(double numberOne, double numberTwo) {
            this.numberOne = numberOne;
            this.numberTwo = numberTwo;
    }

    public BasicCalc(double numberOne) {
        this.numberOne = numberOne;
    }

    public double addition () {
        return numberOne + numberTwo;
    }

    public double subtraction () {
        return numberOne - numberTwo;
    }

    public double multiplication () {
        return numberOne * numberTwo;

    }

    public double division () {
        return numberOne / numberTwo;
    }

    @Override
    public String toString() {
        return "BasicCalc{" +
                "numberOne=" + numberOne +
                ", numberTwo=" + numberTwo +
                '}';
    }
}
