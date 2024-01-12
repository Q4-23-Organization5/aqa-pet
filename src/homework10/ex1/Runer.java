package ex1;

public class Runer {
    public static void main(String[] args){

        Model iphoneSeven = new Model(3);

            System.out.println("");
            System.out.println(iphoneSeven);
            System.out.println("Face Time " + iphoneSeven.faceTime());
            iphoneSeven.airDrop();
            System.out.println("wideAngleLens - " + iphoneSeven.wideAngleLens(11));

            second(new Model(12));
    }

    public static void second(InterfaceMobile phone) {
        phone.call();
        phone.sendMessage();
    }
}
