package homework13.ex2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import ex2.User;

public class SortMethods {
    /**
     * <p>Cередній вік User</p>
     */
    public static int age(List<User> list) {
        int averageAge = (int)list.stream().mapToInt(User:: getAge).average().getAsDouble();
        System.out.println("Середній вік: " + averageAge);
        System.out.println("--------------");
        return averageAge;
    }


    /**
     * <p>Список User які мають вік > 18.</p>
     */
    public static List<User> verification(List<User> list){
        List<User> ageVerification;

        if (list!=null) {
              ageVerification =
                  list.stream().filter(User -> User.getAge() > 18).collect(Collectors.toList());
              System.out.println("Список юзерів які мають більше 18 років: ");
              ageVerification.forEach(System.out::println);
              System.out.println("--------------");
              return ageVerification;
        }return list;
  }

    /**
     * <p>Sort list by FirstName</p>
     */

    public static List<User> byName(List<User> list){
        List<User> sortedByName = list.stream()
                .sorted(Comparator.comparing(User::getFirstName))
                .collect(Collectors.toList());
        System.out.println("Сортувати список по Імені: ");
        sortedByName.forEach(System.out::println);
        System.out.println("--------------");
        return sortedByName;
    }

    /**
     * <p>Sort list by Age</p>
     */
    public static List<User> byAge(List<User> list){
        List<User> sortedByAge = list.stream()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList());
        System.out.println("Сортувати список по віку: ");
        sortedByAge.forEach(System.out::println);
        System.out.println("--------------");
        return sortedByAge;
    }

    /**
     * <p>Sort list by Name and Age</p>
     * <p>Звертати увагу на імʼя Slava</p>
     */
    public static void doubleSort(List<User> list) {
        List<User> multiSort =
                list.stream()
                        .sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getAge))
                        .collect(Collectors.toList());
        System.out.println("Сортування списку по імені та віку:");
        multiSort.forEach(System.out::println);
        System.out.println("--------------");
    }

  /**
   * <p>Second name start with "A" or "S"</p>
   */
  public static List<User> firstSymbol(List<User> list) {
    try {
      List<User> startSymbol =
          list.stream()
              .filter(
                  user ->
                      user.getSecondName().startsWith("S") || user.getSecondName().startsWith("A"))
              .collect(Collectors.toList());
          System.out.println("Юзери у яких прізвище починається з літери \"S' або \"А\"");
          startSymbol.forEach(System.out::println);
        return startSymbol;
    } catch (NullPointerException notNull) {
      return Collections.emptyList();
    }
    }
}
