package lesson9.polymorfism;

import Lesson8.hierarchy.Employee;
import Lesson8.hierarchy.Person;

/**
 * Created by User on 11.03.2016.
 */
public class polymorphismMain {
    public static void main(String[] args) {
        Object o = new Object();
        print(o);
        print(new Person("Vasya"));
        print(new Employee("Yana"));

        Object[] objects = new Object[3];
        objects[0] = o;
        objects[1] = new Person("vasya");
        objects[2] = new Employee("yana");

        print(objects);

        System.out.println(" Person vasya contains in array " + contains(objects, new Person("vaaasssyya")));
    }

    public static void print(Object o) {
        System.out.println(o);
    }

    public static void print(Object[] objects) {
        for (Object o : objects) {
            System.out.println(o);
        }
    }

    public static boolean contains(Object[] objects, Object o) {
        for (Object object : objects) {
            if (object.equals(o)) {
                return true;
            }
        }
        return false;
    }
}

