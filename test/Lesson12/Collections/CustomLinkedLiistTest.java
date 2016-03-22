package Lesson12.Collections;

import Lesson12.CustomLinkedList;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 22.03.2016.
 */
public class CustomLinkedLiistTest {

    @Test
    public void newInstanceShouldBeCreatedEmpty() {
        CustomLinkedList list = new CustomLinkedList();
        Assert.assertEquals(0, list.size());
    }


    //Будем вставлять элемент и проверять как будет изменятся размер
    @Test
    public void sizeShouldChangeOnAdd() {
        CustomLinkedList list = new CustomLinkedList();

        //проверить что он создается пустым вызываем в нем метод size
        Assert.assertEquals(0, list.size());
        //В этот лист добавим элемент new Object()параметор который передаем
        list.add(new Object());
        list.add(new Object());

        Assert.assertEquals(2, list.size());
    }


    @Test
    public void getShouldReturnAppropriateElement() {
        CustomLinkedList list = new CustomLinkedList();
        Object element = new Object();
        list.add(element);
        list.add(element);

        Assert.assertEquals(element, list.get(0));
        Assert.assertEquals(element, list.get(1));
    }
}
