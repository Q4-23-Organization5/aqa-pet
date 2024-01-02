public class Palindrome {
    public static void main(String[] args) {

                String inputString = "зараз";
                // Конвертація рядка в масив символів
                char[] charArray = inputString.toCharArray();

                // Індекси для перевірки паліндрому
                int i = 0;
                int j = charArray.length - 1;
                boolean togle = false;

                // Перевірка паліндрому
                while (i < j) {
                    // Якщо символи на відповідних позиціях не рівні, то це не паліндром
                    i++;
                    j--;
                    if (charArray[i] != charArray[j]) {
                         togle = false;
                    } else {
                        togle = true;
                    }

            }
                if (togle) {
                    System.out.println(inputString + " є паліндромом.");
                } else {
                    System.out.println(inputString + " не є паліндромом.");
                }
        }
        }

