public class MinMax {
    public static void main(String[] args){

        int[] numbers = {5, 10, 15, 3, 20};

        int minValueFromArray = numbers[0];
        int maxValueFromArray = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValueFromArray) {
                minValueFromArray = numbers[i];
            }
            if (numbers[i] > maxValueFromArray) {
                maxValueFromArray = numbers[i];
            }
        }

        System.out.println("Мінімальне значення: " + minValueFromArray);
        System.out.println("Максимальне значення: " + maxValueFromArray);

    }
}
