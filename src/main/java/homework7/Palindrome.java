package homework7;

public class Palindrome {
    public static void main(String[] args) {

                String inputString = "зараз";
                char[] charArray = inputString.toCharArray();


                int i = 0;
                int j = charArray.length - 1;
                boolean togle = false;


                while (i < j) {

                    if (charArray[i] != charArray[j]) {
                         togle = false;
                         break;
                    } else {
                        togle = true;
                    }

                    i++;
                    j--;

            }
                if (togle) {
                    System.out.println(inputString + " є паліндромом.");
                } else {
                    System.out.println(inputString + " не є паліндромом.");
                }
    }
}

