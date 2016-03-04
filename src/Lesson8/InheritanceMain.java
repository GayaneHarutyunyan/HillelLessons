package Lesson8;

public class InheritanceMain {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Ivan");

        Employee employee = new Employee();
        employee.setPosition("programmer");
        employee.setName("Denis");

        Manager manager = new Manager();
        manager.setPosition("director");
        manager.setName("Igor");
        manager.fire(employee);

        person.getName();

        Person employeeAsPerson = employee;
        employeeAsPerson = person;

        Person managerAsPerson = manager;

        managerAsPerson.getName();
        employeeAsPerson.getName();
        employeeAsPerson = person;

        // employeeAsPerson.getPosition();


        // Employee employee = (Employee) employeeAsPerson;   //но лучше такиие штуки не делать
        if (employeeAsPerson instanceof Employee) {
            System.out.println("he is employee ");
        } else {
            System.out.println("he is not employee ");
        }

        //System.out.println(employee.position);
     /*   person.greeting();
        manager.greeting();
        employee.greeting();
        Person somebody = person;
        somebody.greeting();
        */
        speek(person);
        speek(employeeAsPerson);
        speek(manager);
        System.out.println(person.getName());
        System.out.println(manager.getName());
        System.out.println(employee.getName());

    }

    public static void speek(Person person) {
        person.greeting();
    }
}
    /*
        //если поле публичнный  сработает
        Employee employee1=new Employee();
        employee1.name="Ivan";


        public static void printName(Person person){
            System.out.println("name is "+person.name);
        }

        */






