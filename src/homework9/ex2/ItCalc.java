package ex2;

public class ItCalc extends BasicCalc {

    public ItCalc(double numberOne, double numberTwo) {
        super(numberOne, numberTwo);
    }

    public ItCalc(double numberOne) {
        super(numberOne);
    }


    public  double log() {
        return Math.log(numberOne);
    }

    @Override
    public String toString() {
        return "ItCalc{" +
                "numberOne=" + numberOne +
                ", numberTwo=" + numberTwo +
                '}';
    }
}
