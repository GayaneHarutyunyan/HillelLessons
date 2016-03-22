package Lesson5;

import Lesson11collections.CatComparator;
import Lesson11collections.ReversedComparator;
import lesson5.Cat;
import lesson5.Sorter;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MBCNEWMAIN on 18.03.2016.
 */
public class SorterTest {
    @Test
    public void yearShouldBeInAscendingOrder() {
        Sorter sorter = new Sorter();

        Cat tom = new Cat("tom", "white", 2013);
        Cat murzik = new Cat("murzik", "black", 2015);
        Cat barsik = new Cat("barsik", "grey", 2014);

        Cat[] cats = {tom, murzik, barsik};

        sorter.sort(cats, new CatComparator());

        Cat[] expected = {tom, barsik, murzik};

        assertArrayEquals("Cats are in wrong order", expected, cats);
    }

    @Test
    public void yearShouldBeInDescendingOrder() {
        Sorter sorter = new Sorter();

        Cat tom = new Cat("tom", "white", 2013);
        Cat murzik = new Cat("murzik", "black", 2015);
        Cat barsik = new Cat("barsik", "grey", 2014);

        Cat[] cats = {tom, murzik, barsik};

        sorter.sort(cats, new ReversedComparator(new CatComparator()));

        Cat[] expected = {murzik, barsik, tom};

        assertArrayEquals("Cats are in wrong order", expected, cats);
    }
}