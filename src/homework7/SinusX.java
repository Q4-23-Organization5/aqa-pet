import java.sql.SQLOutput;

public class SinusX {
    public static void main(String[] args){

        double table [] = new double [37];

        for (int i = 0, angle = 0; i < table.length; i++, angle += 10) {
            double radians = Math.toRadians(angle);
            table[i] = Math.sin(radians);
           }

        System.out.println("   Angle   |   sin(x)");
        System.out.println("------------------------");
        for (int i = 0, angle = 0; i < table.length; i++, angle += 10) {
            System.out.printf("%8d°  |  %8.4f\n", angle, table[i]);
        }

    }
}
