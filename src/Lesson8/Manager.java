package Lesson8;

/**
 * Created by User on 04.03.2016.
 */
public class Manager extends Employee {
    //Менеджер будет унаследовать имя и персона от класса Employee
    //String name;
    //String position;

    public void fire(Employee employee) {
        System.out.println(employee.position + " " + employee.getName() + " fired by "+" " +getName());
    }
    public String getName(){

        return super.getName().toUpperCase();
    }
    public void greeting(){
        System.out.println("Hello, I'm manager my name is " + getName());
    }
}
