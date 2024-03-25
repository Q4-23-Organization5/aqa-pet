package org.learn;

import homework13.ex2.SortMethods;
import homework13.ex2.User;
import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;


import java.util.ArrayList;
import java.util.List;


public class Tests {

    static ArrayList<User> list;
    static ArrayList<User> emptyList;

    @BeforeAll
    static void prepareData() {
        list = new ArrayList<>();
        User user1 = new User("Slava","Koshun",50);
        User user9 = new User("Slava","Auhla",12);
        User user8 = new User("Anya","Kerechanka",42);

        list.add(user1);
        list.add(user9);
        list.add(user8);

    }

    @AfterAll
    static void cleanAfterTest() {
        // Виклик команди Maven для очищення проекту
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("mvn", "clean");
            Process process = processBuilder.start();
            process.waitFor(); // Чекаємо завершення виконання команди
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @Test
    public void firstAge(){
        Assertions.assertEquals(34, SortMethods.age(list));
    }

    @Test
    @Description("Not Equals Zero")
    public void secondAge() {
        Assertions.assertNotEquals(0,SortMethods.age(list));
    }


    @ParameterizedTest
    @ValueSource(ints = {50, 12, 42})
    public void thirdAge (int age) {
        Assertions.assertNotEquals(age,SortMethods.age(list));
        System.out.println(age);
    }

    @Test
    @Description("Put user with/without 18 years old")
    public void firstVerification() {
    List<User> teenager = SortMethods.verification(list);
    boolean checking = false;

    for (User user : teenager){
        if(user.getAge() < 18) {
            checking = true;
            }
         System.out.println(user);
        }
    Assertions.assertFalse(checking);
    }

    @Test
    @Description("Put empty list")
    public void secondVerification() {
       Assertions.assertNull(SortMethods.verification(emptyList));
    }


    @Test
    @Description("Compare at the input and output")
    public void firstByName() {
        List<User> nameSorted = SortMethods.byName(list);
        Assertions.assertNotSame(list,nameSorted);


    }

    @Test
    @Description("InstanceOf")
    public void secondByName() {
        List<User> nameSorted = SortMethods.byName(list);
        Assertions.assertInstanceOf(ArrayList.class , nameSorted );
    }

    @Test
    public void sortByAge() {

        List<User> result = SortMethods.byAge(list);

        Assertions.assertNotSame(list, result);

    }

    @Test
    public void checkWithoutSymbol() {
        List<User> result = SortMethods.firstSymbol(emptyList);
        Assertions.assertNotNull(result);

    }
  }

