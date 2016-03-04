package Lesson8;

/**
 * Created by User on 04.03.2016.
 */
public class Person {
    private String name;

    public String getName() {
        return name.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }
    public void greeting(){
        System.out.println("Hello, I'm person my name is " + getName());
    }

}
