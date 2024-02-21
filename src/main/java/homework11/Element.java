package homework11;

import java.util.Scanner;

enum Element {
        ROCK, PAPER, SCISSORS;


        public static Element getUserElement() {
            System.out.print("Введіть ваш вибір (ROCK, PAPER, SCISSORS): ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine().toUpperCase();

            try {
                return valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Невірний вибір. (" + e.getMessage() + ") Спробуйте ще раз.");
                return getUserElement();
            }
        }
    }

