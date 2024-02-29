package homework6;

public class MiddleLetter {
    public static void main(String[] args) {

        //Add variables
        String hillel = "Hillel";
        String java = "Java";
        String hometask = "Hometask";
        String index = "Index";

        //Get middle of string
        int lengthH = hillel.length();
        int middleH = lengthH / 2;

        int lengthJ = java.length();
        int middleJ = lengthJ / 2;

        int lengthT = hometask.length();
        int middleT = lengthT / 2;

        int lengthI = index.length();
        int middleI = lengthI / 2;


        //Run case Hillel
        if (lengthH % 2 == 0) {
            System.out.println(hillel.substring(middleH - 1, middleH + 1));
        } else {
            System.out.println(hillel.substring(middleH, middleH + 1));
        }

        //Run case Java
        if (lengthJ % 2 == 0) {
            System.out.println(java.substring(middleJ - 1, middleJ + 1));
        } else {
            System.out.println(java.substring(middleJ, middleJ + 1));
        }

        //Run case Hometask
        if (lengthT % 2 == 0) {
            System.out.println(hometask.substring(middleT - 1, middleT + 1));
        } else {
            System.out.println(hometask.substring(middleT, middleT + 1));
        }

        //Run case Index
        if (lengthI % 2 == 0) {
            System.out.println(index.substring(middleI - 1, middleI + 1));
        } else {
            System.out.println(index.substring(middleI, middleI + 1));
        }


    }
}
