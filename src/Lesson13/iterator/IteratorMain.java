package Lesson13.iterator;

import Lesson12.CustomLinkedList;
import lesson5.Cat;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by User on 25.03.2016.
 */
public class IteratorMain {
    public static void main(String[] args) {

        Integer[] integersArray = new Integer[10];

        ArrayList<Integer> integerAbstractList = new ArrayList<>();

        Iterator arrayIterator = new ArrayIterator(integersArray);

        iterate(arrayIterator);
        CustomLinkedList linkedList = new CustomLinkedList();

        linkedList.add(new Cat("Tom", "Grey", 2010));
        linkedList.add(new Cat("Tom", "Grey", 2010));
        linkedList.add(new Cat("Tom", "Grey", 2010));

        Iterator linkedListIterator = linkedList.iterator();

        iterate(linkedListIterator);

        for (Object o : linkedList) {
            System.out.println(o);
        }
    }

    public static void iiterate(Iterable iterable) {
        Iterator iterator = iterable.iterator();
        iterate(iterator);

    }

    public static void iterate(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator.hasNext();
        iterator.next();
    }

    public static void iterate(ArrayList<Integer> integers) {
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }

    }

    public static void iterate(Integer[] integers) {
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
    }
}

