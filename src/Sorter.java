import lesson5.Cat;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *Сортировка с пл=омщю пузирка
 */
public class Sorter {
    /**
     *
     * @param unsorted

    public void sort(int[] unsorted) {
        boolean swap = false;
        do {
            swap = false;
            for (int i = 0; i < unsorted.length - 1; i++) {
                if (unsorted[i] > unsorted[i + 1]) {
                    int temp = unsorted[i];
                    unsorted[i] = unsorted[i + 1];
                    unsorted[i + 1] = temp;Л
                }
            }

        } while (swap);
*/
    public void sort(Comparable [] unsorted) {
        boolean swap = false;
        do {
            swap = false;
            for (int i = 0; i < unsorted.length - 1; i++) {
                if (unsorted[i].compareTo(unsorted[i + 1])>0) {
                    Comparable  temp = unsorted[i];
                    unsorted[i] = unsorted[i + 1];
                    unsorted[i + 1] = temp;
                    swap=true;
                }
            }

        } while (swap);

    }
    public static void main(String[]args){
        int[] a={3,5,6, 64,5, 10};
        String []s={"a","b"};
           new Sorter().sort(s);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(s));


        Cat[] cats = new Cat[0];
        Cat cat1=new Cat("sda","sdas",10);
        Cat cat2=new Cat("sda","sdas",4);
        cat1.compareTo(cat2);
        new Sorter().sort(cats);

    }
}