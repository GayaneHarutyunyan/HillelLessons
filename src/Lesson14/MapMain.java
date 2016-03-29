package Lesson14;

import Lesson8.hierarchy.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 29.03.2016.
 */
public class MapMain {
    public static void main(String[] args) {
//Person тип ключа Integer значение ключа
        Map<Person, Integer> personToDiscount = new HashMap<>();
        personToDiscount.put(new Person("Vasya"), 10);
        personToDiscount.put(new Person("Vsya"), 15);
        personToDiscount.put(new Person("Vaa"), 18);

        Integer vasyaDiscount = personToDiscount.get(new Person("Vasya"));

        System.out.println(vasyaDiscount);

        System.out.println((new Person("Vasya")).equals(new Person("Vasya")));



        doStuff(personToDiscount);

        for (Map.Entry<Person, Integer> personIntegerEntry: personToDiscount.entrySet()){
            System.out.println(personIntegerEntry.getKey()+" discount is "+ personIntegerEntry.getValue());
        }
        for(Person person: personToDiscount.keySet()){
            System.out.println(personToDiscount.get(person));
        }
    }

    private static void doStuff(Map<Person,Integer> someMap) {
        someMap=new HashMap<>();
        someMap.put(new Person("Ashot"),95);
    }
}
