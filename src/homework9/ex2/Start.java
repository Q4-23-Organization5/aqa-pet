package ex2;

public class Start {
    public static void main(String[] args){


        BasicCalc bas = new BasicCalc(3,7);

            System.out.println(bas + " - " + bas.addition());

        EngineeringCalc eng = new EngineeringCalc(3);

            System.out.println(eng + " - " + eng.squared());

        EngineeringCalc second = new EngineeringCalc(6,3);

            System.out.println(second + " - " + second.division());

        ItCalc third = new ItCalc(7);

            System.out.println(third + " - " + third.log());

        ItCalc fourth = new ItCalc(3,5);

            System.out.println(fourth + " - " + fourth.multiplication());


  }
}
