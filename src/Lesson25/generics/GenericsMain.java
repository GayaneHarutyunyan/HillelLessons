package Lesson25.generics;

import Lesson8.hierarchy.Employee;
import Lesson8.hierarchy.Manager;
import Lesson8.hierarchy.Person;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 13.05.2016.
 */
public class GenericsMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Manager());

        Employee employee = employees.get(0);
        employee.getPosition();
        Manager manager = new Manager();
        manager.setName("Vasya");
        employee = manager;
        employee.greeting();
        ArrayList<Manager> managers = new ArrayList<>();
        employees.add(new Employee());
        // employee = employees.get(0);
        // employees = managers;

        employees.add(new Employee());
//        fire(employees);


        Pair<Person> personPair = new Pair<>(new Person(), new Person());
        personPair.getFirst();
        copy(employees, new ArrayList<>());
    }

    /*
        public void fire(List<Manager> employees) {
            for (Manager employee : employees) {
                System.out.println(employee.getName() + " is fires");
            }
        }
    */
    //Можно передовать листы которые наследуются от емплоии
    public static void fire(List<? extends Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " is fires");
        }
        // employees.add(new Employee());
    }


    public static void addEmployee(List<? super Employee> employees) {
        employees.add(new Employee());
        // Employee employee = employees.get(0);
    }

    public static void copy(List source, List target) {
        target.addAll(source);
    }
}

