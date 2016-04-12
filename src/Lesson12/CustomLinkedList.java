package Lesson12;

import Lesson13.iterator.CustomLinkedListIterator;
import Lesson17.exception.MyOwnOutOfIndexException;
import Lesson17.exception.MyOwnOutOfIndexException;

import java.util.Calendar;
import java.util.Iterator;

/**
 * Created by User on 22.03.2016.
 */
public class CustomLinkedList implements Iterable {

    private ListElement next;

    public int size() {
        if (next == null) {
            return 0;
        } else {
            return next.size();
        }

    }

    public void add(Object o) {
        if (next == null) {
            next = new ListElement(o);
        } else {
            next.add(o);
        }
    }

    public Object get(int index) throws MyOwnOutOfIndexException {
        if (next == null) {
            throw new MyOwnOutOfIndexException("size: " + size() + " index: " + index);
        } else {
            try {
                return next.get(index);
            } catch (IndexOutOfBoundsException e) {
                throw new MyOwnOutOfIndexException("size: " + size() + " index: " + index);
            }
        }
    }

    @Override
    public Iterator iterator() {
        return new CustomLinkedListIterator(next);
    }
}