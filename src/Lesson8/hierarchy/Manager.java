package Lesson8.hierarchy;

/**
 * Created by User on 04.03.2016.
 */
public class Manager extends Employee {
    //Менеджер будет унаследовать имя и персона от класса Employee
    //String name;
    //String position;

    public void fire(Employee employee) {
        System.out.println(employee.position + " " + employee.getName() + " fired by " + position + " " + getName());
    }

    public void greeting(){
        System.out.println("Hello, I'm a manager. My name is " + getName());
    }
}