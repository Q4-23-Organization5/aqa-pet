package homework13.ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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


        /**
         * <p>Cередній вік User</p>
         */
        int averageAge = (int)list.stream().mapToInt(User:: getAge).average().getAsDouble();
        System.out.println("Середній вік: " + averageAge);
        System.out.println("--------------");

        /**
         * <p>Список User які мають вік > 18.</p>
         */
        List<User> ageVerification = list.stream()
                .filter(User -> User.getAge() > 18)
                .collect(Collectors.toList());

        System.out.println("Список юзерів які мають більше 18 років: ");
        ageVerification.forEach(System.out::println);
        System.out.println("--------------");

        /**
         * <p>Sort list by FirstName</p>
         */
        List<User> sortedByName = list.stream()
                .sorted(Comparator.comparing(User::getFirstName))
                .collect(Collectors.toList());

        System.out.println("Сортувати список по Імені: ");
        sortedByName.forEach(System.out::println);
        System.out.println("--------------");

        /**
         * <p>Sort list by Age</p>
         */

        List<User> sortedByAge = list.stream()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList());

        System.out.println("Сортувати список по віку: ");
        sortedByAge.forEach(System.out::println);
        System.out.println("--------------");

        /**
         * <p>Sort list by Name and Age</p>
         * <p>Звертати увагу на імʼя Slava</p>
         */
        List<User> multiSort = list.stream()
                .sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getAge))
                .collect(Collectors.toList());

        System.out.println("Сортування списку по імені та віку:");
        multiSort.forEach(System.out::println);
        System.out.println("--------------");

        /**
         * <p>Second name start with "A" or "S"</p>
         */

        List<User> startSymbol = list.stream()
                .filter(user -> user.getSecondName().startsWith("S") || user.getSecondName().startsWith("A"))
                .collect(Collectors.toList());

        startSymbol.forEach(System.out::println);
  }
}
