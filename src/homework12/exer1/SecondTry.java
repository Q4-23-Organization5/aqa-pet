package exer1;

import java.util.ArrayList;
import java.util.Random;

public class SecondTry {

    public static void main(String[] args){


    ArrayList<Integer> first =  new ArrayList<>(100);

    Random random = new Random();

    for (int i = 0; i < 100; i++) {
      first.add(i, (random.nextInt(-20, 20)));

    }

    ArrayList<Integer> second = new ArrayList<>(first.stream().distinct().toList());

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