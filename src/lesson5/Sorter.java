package lesson5;

import Lesson11collections.ReversedComparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 *Сортировка с пл=омщю пузирка
 */
public class Sorter {
    public void sort(Object[] unsorted, ReversedComparator comparator) {
        boolean swap = false;
        do {
            swap = false;
            for (int i = 0; i < unsorted.length - 1; i++) {

                if (comparator.compare(unsorted[i], unsorted[i + 1])> 0) {
                    //if (unsorted[i].compareTo(unsorted[i + 1]) > 0) {
                    Object temp = unsorted[i];
                    unsorted[i] = unsorted[i + 1];
                    unsorted[i + 1] = temp;
                    swap = true;
                }
            }
        } while (swap);
    }

    public static void main(String[] args) {
        int[] a = {9, 5, 8, 4, 3, 7};
        String[] s = {"a", "b", "e", "c"};
        Cat[] cats = new Cat[0];

        Cat cat1 = new Cat("asd","dfdf", 10);

        Cat cat2 = new Cat("dfd","df", 4);

        cat1.compareTo(cat2);

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };




    }

}