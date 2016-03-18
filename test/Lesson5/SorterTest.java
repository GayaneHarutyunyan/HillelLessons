package Lesson5;

import Lesson11collections.CatComparator;
import Lesson11collections.ReversedComparator;
import lesson5.Cat;
import lesson5.Sorter;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 18.03.2016.
 */
public class SorterTest {
    @Test
    //Фрразза  то что мы от  тестта ожиижжаем
    public void yearShouldBeInAscendingOrder() {

        Sorter sorter = new Sorter();


        Cat tom = new Cat("tom", "white", 2013);
        Cat murzik = new Cat("murzik", "red", 2015);
        Cat barsik = new Cat("barsik", "grey", 2014);
        Cat[] cats = new Cat[3];

      /*  Assert.assertEquals(2013, cats[0].getBirthYear());
        Assert.assertEquals(2014, cats[1].getBirthYear());
        Assert.assertEquals(2015, cats[2].getBirthYear());
*/
        cats[0] = tom;
        cats[1] = murzik;
        cats[2] = barsik;

        sorter.sort(cats, new CatComparator());


        Cat[] expected = {tom, murzik, barsik};
        /*
        ТОЖЕ САМОЕ
            expected[0] = tom;
            expected[1] = murzik;
            expected[2] = barsik;
        */
        Assert.assertArrayEquals(expected, cats);


    }

    @Test
    //Фрразза  то что мы от  тестта ожиижжаем
    public void yearShouldBeInDescendingOrder() {

        Sorter sorter = new Sorter();


        Cat tom = new Cat("tom", "white", 2013);
        Cat murzik = new Cat("murzik", "red", 2015);
        Cat barsik = new Cat("barsik", "grey", 2014);


        Cat[] cats = {tom, murzik, barsik};



        sorter.sort(cats, new ReversedComparator(new CatComparator()));


        Cat[] expected = {tom, murzik, barsik};

        Assert.assertArrayEquals(expected, cats);


    }
}
