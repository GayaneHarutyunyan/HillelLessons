package Lesson30;

import Lesson11collections.CatComparator;
import Lesson29.patterns.singleton.God;
import Lesson29.patterns.singleton.TheGodSingleton;
import javafx.print.Collation;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by User on 06.06.2016.
 */
public class Java8Example {

    public static void main(String[] args) {
        God god = TheGodSingleton.getInstance();
        god.resurrect();
        //defaultSortExample(apples);
        //functionalInterface(apples);
        //methodReferenceExample(apples);


        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(200, "RED", 15));
        apples.add(new Apple(250, "green", 16));
        apples.add(new Apple(300, "blue", 18));
        apples.add(new Apple(350, "yellow", 20));
        apples.add(new Apple(400, "bleak", 5));

        print(apples, apple -> String.valueOf(apple.getPrice()));
        Function<Apple, String> appleStringFunction = apple1 -> apple1.getColor();
        print(apples, appleStringFunction);


    }

    private static void print(List<Apple> apples, Function<Apple, String> appleToString) {
        for (Apple apple : apples) {
            System.out.println(appleToString.apply(apple));
        }
    }

    private static List<Apple> select(List<Apple> apples, Predicate<Apple> tester) {
        List<Apple> result = new ArrayList<>();
        for (Apple appl : apples) {
            if (tester.test(appl)) {
                result.add(appl);
            }
        }
        return result;
    }

    private static void methodReferenceExample(List<Apple> apples) {
        //  Consumer<Apple> appleConsumer = apple -> System.out.println(apple);
        Consumer<Apple> appleConsumer = System.out::println;
        apples.forEach(appleConsumer);
    }

    private static void functionalInterface(List<Apple> apples) {
    /*
            AppleTester greenTester = new AppleTester() {
                @Override
                public boolean test(Apple apple) {

                    return apple.getColor().equals("green");
                }
            };
    */

        AppleTester greenTester = apple -> apple.getColor().equals("green");

        Predicate<Apple> isgreen = apple -> apple.getColor().equals("green");

        // List<Apple> greenApple = select(apples, greenTester);
        List<Apple> greenApple = select(apples, isgreen);


        System.out.println(greenApple);


        //AppleTester hevyTester = apple -> apple.getWeight() > 200;

        Predicate<Apple> isgreenHevy = apple -> apple.getWeight() > 200;

        //   hevyTester.test(new Apple(1, " ", 2));
        // List<Apple> hevyrApple = select(apples, hevyTester);
        List<Apple> hevyrApple = select(apples, isgreenHevy);
        System.out.print(hevyrApple);

        Predicate<Apple> bla = apple -> apple.getWeight() > 200;
        System.out.println("\n");
        System.out.println(select(apples, bla));
    }

    private static void defaultSortEaxmple(List<Apple> apples) {
        Comparator<Apple> byColl = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getColor().compareTo(o2.getColor());

            }

        };
        /*
        Collections.sort(apples, byColl);
        System.out.println(apples);

        apples.sort(byColl);
    */
    }
}
