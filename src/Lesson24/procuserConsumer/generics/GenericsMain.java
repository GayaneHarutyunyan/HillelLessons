package Lesson24.procuserConsumer.generics;

import Lesson8.hierarchy.Employee;


import java.util.ArrayList;
import java.util.List;

public class GenericsMain {

    public static void main(String[] args) {

        List<Employee> employee = new ArrayList<>();

        employee.add(new Employee("Ivan"));

        Employee employee1 = employee.get(0);

        employee1.getPosition();

    }
}

