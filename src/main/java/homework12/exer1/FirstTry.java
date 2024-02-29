package homework12.exer1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class FirstTry {
    public static void main(String[] args){


        ArrayList<Integer> first =  new ArrayList<>(100);

        Random random = new Random();

        for (int i = 0; i < 100; i++)
            first.add(i, (random.nextInt(-20, 20)));

        HashSet<Integer> second = new HashSet<>(first);

        int deletedDuplicates = first.size() - second.size();

        System.out.println("---------------");
        System.out.println("First Collection with duplicates");
        System.out.println("Count of First Collection: " + first.size());
        System.out.println(first);
        System.out.println("---------------");

        System.out.println("Second Collection without duplicates");
        System.out.println("Count of First Collection: " + second.size());
        System.out.println(second);
        System.out.println("---------------");

        System.out.println("Number of removed duplicate: " + deletedDuplicates);
    }
}
