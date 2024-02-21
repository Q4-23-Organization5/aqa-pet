package homework8.ex1;

public class Userr {

    String userName;
    private int age;
    String email;
    private String password;
    boolean isActive;
    static double  amountSpentMoney;

    boolean passwordPresent = true;
    boolean agePresent = true;
    double purchasePrice;



    //Constructor
    public Userr() {

    }

    public Userr(String userName) {
        this.userName = userName;

    }

    public  Userr(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public  Userr (String userName, String password, String email, Boolean isActive) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.isActive = isActive;
    }
    /////////////////////////////////


    //makePurchase
    public void makePurchase(double purchasePrice) {
        this.purchasePrice = purchasePrice;
        amountSpentMoney = amountSpentMoney + purchasePrice;
    }



    //printTotalAmountOfSpentMoney
    public void printTotalAmountOfSpentMoney() {
        System.out.println();
        System.out.println("amountSpentMoney - " + amountSpentMoney);
        System.out.println();

    }
    ////////////////////////////////



    ////Set/get Age
          public void printAge() {
                if (agePresent) {
                      System.out.println("Age by getter - " + age);
                } else {
                    System.out.println("Age invalid");
                }
          }


          public void setAge(int age) {
                if ( age >= 18) {
                      this.age = age;
                    agePresent = true;
                } else {
                      System.out.println( userName + " you must be at least 18 years old");
                      agePresent = false;
                }
          }

    /////////////////////

    //////Set/get password
    public void getPassword() {
        if (passwordPresent == true) {
            System.out.println("password by getter - " + password);
        } else {
            System.out.println("password invalid");
        }
    }

    public void setPassword(String password) {
        if(password.length() > 4) {
            this.password = password;
        } else {
            passwordPresent = false;
            System.out.println("password must contain more than 4 characters");
        }
    }





    //Info about USER
    public void PrintUserInfo() {
        System.out.println("------------------");
        System.out.println("userName - " + userName);
        System.out.println("age - " + age);
        System.out.println("email - " + email);
        System.out.println("password - " + password);
        System.out.println("isActive - " + isActive);
        System.out.println("purchasePrice - " + purchasePrice);
        System.out.println("------------------");
    }
    /////////////////////////////////////


}
