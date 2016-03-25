package Lesson13.iterator;

import java.util.Iterator;

/**
 * Created by User on 25.03.2016.
 */
public class ArrayIterator implements Iterator {
    private Integer[] array;
    private int currentIndex = 0;

    public ArrayIterator(Integer[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length;
    }

    @Override
    //Давайте нам следующий элемент
    public Object next() {
        /**  Integer curent = array[currentIndex];
         currentIndex++;
         return curent;
         */
        //Так не рекоменддуеттся пиисать
        return array[currentIndex++];
    }
}
