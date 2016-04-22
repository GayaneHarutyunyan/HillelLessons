package Lesson20;


import Lesson8.hierarchy.Person;

import java.io.Serializable;

/**
 * Created by User on 19.04.2016.
 */
public class Car implements Serializable {
    private static final long serialVersionUID = 2584865176176401432L;
    private final String brand;
    private final int year;
    private final Person owner;
    private transient Tenant tenant;


    public Car(String brand, int year, Person owner) {
        System.out.println(" in car constructor with three parameters");
        this.brand = brand;
        this.year = year;
        this.owner = owner;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", owner=" + owner +
                ", rentor=" + tenant +
                '}';
    }

}
