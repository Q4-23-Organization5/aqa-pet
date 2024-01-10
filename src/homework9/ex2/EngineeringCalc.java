package ex2;

public class EngineeringCalc extends BasicCalc {


    public EngineeringCalc(double numberOne, double numberTwo) {
        super(numberOne, numberTwo);
    }

    public EngineeringCalc(double numberOne) {
        super(numberOne);
    }


    public double squared() {
        return super.numberOne * super.numberOne;
    }

    @Override
    public String toString() {
        return "EngineeringCalc{" +
                "numberOne=" + numberOne +
                ", numberTwo=" + numberTwo +
                '}';
    }
}
