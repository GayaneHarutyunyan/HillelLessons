package Lesson8.hierarchy;

/**
 * Created by User on 04.03.2016.
 */
public class Employee extends Person {
    public String name;
    //Будт унаследовать имя от класса Person
    //String name;
    protected String position;

    public Employee() {
        super();
    }

    public Employee(String name) {
        super(name);
    }

    public String getName() {

        return super.getName().toUpperCase();
    }


    public void greeting() {
        System.out.println("Hello, I'm employee my name is " + getName());
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
