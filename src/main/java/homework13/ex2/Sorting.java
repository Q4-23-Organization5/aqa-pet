package homework13.ex2;

import java.util.ArrayList;

public class Sorting {


    public static void main(String[] args){
        ArrayList<User> list = new ArrayList<>();

        User user1 = new User("Slava","Koshun",50);
        User user2 = new User("Andrii","Koros",10);
        User user3 = new User("Mishel","Kors",57);
        User user4 = new User("Arsen","Petrenko",11);
        User user5 = new User("Inna","Kvitka",35);
        User user6 = new User("Katerina","Sidenko",53);
        User user7 = new User("Vika","Peresta",42);
        User user8 = new User("Anya","Kerechanka",42);
        User user9 = new User("Slava","Auhla",12);
        User user10 = new User("Daniella","Nova",100);

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);
        list.add(user7);
        list.add(user8);
        list.add(user9);
        list.add(user10);


        SortMethods.age(list);
        SortMethods.verification(list);
        SortMethods.byName(list);
        SortMethods.byAge(list);
        SortMethods.doubleSort(list);
        SortMethods.firstSymbol(list);

  }



}
