package Lesson11collections;

import lesson5.Cat;

import java.util.*;

/**
 * Created by MBCNEWMAIN on 18.03.2016.
 */
public class CollectionsMain {

    public static void main(String[] args) {
        ArrayList<Cat> list = new ArrayList<>();
        list.add(new Cat("tom", "gray", 2015));
        list.add(new Cat("tom", "gray", 2015));
        list.add(new Cat("tom", "gray", 2015));
        System.out.println("set");
        System.out.println(list);
        Cat tom = list.get(2);

        LinkedList<Cat> linkedList = new LinkedList<>();


        linkedList.add(new Cat("tom", "gray", 2015));
        linkedList.add(new Cat("tom", "gray", 2012));
        linkedList.add(new Cat("tom", "gray", 2011));
        System.out.println("set");
        System.out.println(linkedList.get(1));
        printList(list);
        printList(linkedList);

        Collection<Cat> cats = linkedList;

        //Сортировка

        TreeSet<Cat> sortedcat=new TreeSet<>(new CatComparator());
        sortedcat.add(new Cat("tom", "gray", 2015));
        sortedcat.add(new Cat("tom", "gray", 2011));
        sortedcat.add(new Cat("tom", "gray", 2013));
        //проверят и видет что на этом ссылке уже сохранен 2013 год котик  уже есть по этому он не отображается
        sortedcat.add(new Cat("murzik", "gray", 2013));

        System.out.println("set");
        printFoEach(sortedcat);

    }

    public static void printFoEach(Collection<Cat> collection) {
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


