package Lesson11collections;

import lesson5.Cat;

import java.util.*;

/**
 * Created by MBCNEWMAIN on 18.03.2016.
 */
public class CollectionsMain {

    public static void main(String[] args) {

        HashSet<Cat> set = new HashSet<>();

        Cat cat1 = new Cat("Tom", "gray", 2015);
        set.add(cat1);
        Cat cat2 = new Cat("Tom", "gray", 2015);
        //set.add(cat2);
        System.out.println("equals: " + cat1.equals(cat2));
        System.out.println("hash1: " + cat1.hashCode());
        System.out.println("hash2: " + cat2.hashCode());
        System.out.println("cat1 in set: " + set.contains(cat1));
        System.out.println("cat2 in set: " + set.contains(cat2));
        ArrayList<Cat> list = new ArrayList<>();
        list.add(cat1);
        System.out.println("cat2 in list " + list.contains(cat2));


//Мы изменили состоянине от сюда следует чтохешкод изменилось по этому результат фалш
        // cat1.setName("Barsik");
        System.out.println("hash dor barsik: " + cat1.hashCode());
        System.out.println("barsik in set: " + set.contains(cat1));

        set.add(new Cat("Murzik", "black", 2010));
        set.add(new Cat("burzik", "w", 2011));
        set.add(new Cat("gurzik", "v", 2010));
        System.out.println(" ");
        set.add(new Cat("1", "Gray", 2012));
        set.add(new Cat("2", "Gray", 2013));
        set.add(new Cat("3", "Gray", 2014));

        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    private static void lists() {
        ArrayList<Cat> list = new ArrayList<>();
        list.add(new Cat("tom", "gray", 2015));
        list.add(new Cat("tom", "gray", 2015));
        list.add(new Cat("tom", "gray", 2015));

        System.out.println(list);

        Cat tom = list.get(2);

        LinkedList<Cat> linkedList = new LinkedList<>();
        linkedList.add(new Cat("tom", "gray", 2015));
        linkedList.add(new Cat("tom", "gray", 2015));
        linkedList.add(new Cat("tom", "gray", 2015));

        System.out.println(linkedList.get(1));

        printList(list);
        printList(linkedList);

        Collection<Cat> cats = linkedList;

        TreeSet<Cat> sortedCats = new TreeSet<>(new CatComparator());

        sortedCats.add(new Cat("tom", "gray", 2015));
        sortedCats.add(new Cat("tom", "gray", 2011));
        sortedCats.add(new Cat("tom", "gray", 2013));
        sortedCats.add(new Cat("Murzik", "gray", 2013));

        System.out.println("Set: ");
        printForEach(sortedCats);
    }

    public static void printForEach(Collection<Cat> collection) {
        for (Cat cat : collection) {
            System.out.println(cat);
        }
    }

    public static void printList(List<Cat> cats) {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
}


