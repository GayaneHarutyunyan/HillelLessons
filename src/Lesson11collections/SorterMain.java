package Lesson11collections;

import lesson5.Cat;
import lesson5.Sorter;

import java.util.Arrays;

/**
 * Created by User on 18.03.2016.
 */
public class SorterMain {
    public static void main(String[] args) {

        Sorter sorter = new Sorter();

        Cat[] cats = new Cat[3];

        cats[0] = new Cat("tom", "white", 2013);
        cats[1] = new Cat("murzik", "red", 2014);
        cats[2] = new Cat("barsik", "grey", 2015);

        System.out.println(" before" + Arrays.toString(cats));
        sorter.sort(cats, new CatComparator());
        System.out.println("after"+Arrays.toString(cats));

        //Сортироовка
      //  sorter.sort(cats, ReversedComparator (new CatComparator()));


    }
}
