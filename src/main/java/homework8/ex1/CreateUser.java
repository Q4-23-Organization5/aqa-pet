package homework8.ex1;

public class CreateUser {
    public static void main(String[] args){

        Userr Vladislava = new Userr("Vladislava","12345","vla@disla,va",true);
        Vladislava.PrintUserInfo();

        Userr Slava = new Userr("Slava","Abc12345" );
        Slava.makePurchase(3.5);
        Slava.PrintUserInfo();



        Userr Misha = new Userr("Misha","Abc12");
        Misha.makePurchase(14.5);
        Misha.PrintUserInfo();



        Userr Illya = new Userr("Illya");
        Illya.setAge(17);
        Illya.printAge();

        Illya.setPassword("Abc12345");
        Illya.getPassword();

        System.out.println("-------------------------");

        Userr Andrii = new Userr();
        Andrii.setAge(18);
        Andrii.printAge();

        Andrii.setPassword("Abc");
        Andrii.getPassword();


        ///TotalAmountOfSpentMoney ( All users )
        Misha.printTotalAmountOfSpentMoney();



    }
}
