package exer2;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SeparateNumbers {
    public static void separateNumbers(List<Integer> numbers, int x) {
        Collections.sort(numbers, (a, b) -> {
            if ((a <= x && b <= x) || (a > x && b > x)) {
                return a - b;
            } else {
                return a <= x ? -1 : 1;
            }
        });
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5, 3, 8, 1, 2, 7, 4, 6));
        int x = 4;

        System.out.println("Список до сортування: " + numbers);

        separateNumbers(numbers, x);

        System.out.println("Список після сортування: " + numbers);
    }
}
