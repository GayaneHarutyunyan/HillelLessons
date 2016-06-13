package Lesson32;

import Lesson30.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by User on 13.06.2016.
 */
public class MainStream {


    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(200, "Red", 15));
        apples.add(new Apple(250, "Green", 16));
        apples.add(new Apple(100, "Green", 11));
        apples.add(new Apple(250, "Yellow", 15));
        apples.add(new Apple(100, "Green", 17));

/*
        Stream<Apple> s = apples.stream().filter(apple -> apple.getColor().equals("Green"));
        s = s.filter(apple -> apple.getWeight() > 250);
        apples.add(new Apple(230, "Green", 16));

        s.forEach(System.out::println);
        */

        Predicate<Apple> isGreen = apple -> apple.getColor().equals("Green");
        Predicate<Apple> isHeavy = apple -> apple.getColor().equals("Green");

        /*
        apples.stream()
                .filter(apple -> apple.getColor().equals("Green"))
                .filter(apple1 -> apple1.getWeight() > 200)
                .forEach(System.out::println);

        apples.stream().filter(MainStream::isGreen)
                .filter(MainStream::isHeavy)
                .forEach(System.out::println);


        apples.stream()
                .filter(Apple::isGreen)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Function<Apple, String> toString = apple -> apple.getColor();
*/


    }

    private static void anyMach(List<Apple> apples) {
        boolean areThereExpensiveApples = apples.stream()
                .anyMatch(apple -> apple.getPrice() > 10);
        System.out.println(areThereExpensiveApples);
    }

    private static void mapExample(List<Apple> apples) {
        List<String> olors =
                apples.stream()
                        .map(Apple::getColor)
                        .collect(Collectors.toList());
        System.out.println(olors);

        // удаляет элемент
        Predicate<String> isYellow = letter -> !letter.equals("Y");
        Predicate<String> notYellow = isYellow.negate();
        List<String> color =
                apples.stream()
                        .map(Apple::getColor)
                        .map(MainStream::extractFirstChar)
                        .filter(notYellow)   // удаляет элемент
                        .collect(Collectors.toList());
        System.out.println(color);
    }

    /**
     * распечатоет первые буквыы
     *
     * @param st
     * @return
     */
    public static String extractFirstChar(String st) {
        return st.substring(0, 1);
    }

    private static List<Apple> limitExample(List<Apple> apples) {
        return apples.stream()
                .filter(Apple::isGreen)
                .filter(MainStream::isHeavy)
                .limit(3)
                .collect(Collectors.toList());
    }

    public static boolean isGreen(Apple apple) {
        return apple.getColor().equals("Green");
    }

    public static boolean isHeavy(Apple apple) {
        return apple.getWeight() > 200;
    }

}
