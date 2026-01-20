package com.kaldis.chris.week05.employee;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public abstract class Employee {
    private static final List<Employee> linkedList = new LinkedList<>();
    private static final HashMap<Integer, Employee> hashMap = new HashMap<>();

    abstract public int getId();

    public static void addEmployee(Employee employee) {
        linkedList.add(employee);
        hashMap.put(employee.getId() , employee);
    }

    public static Employee searchEmployeeInLinkedList(int employeeId) {
        long startTime, estimatedTime;
        Employee employeeFound = null;

        System.out.println("> Start searching for an employee in the linked list.");
        startTime = System.currentTimeMillis();
        for (Employee i : linkedList) {
            if (i.getId() == employeeId) {
                employeeFound = i;
                break;
            }
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("> Time elapsed with linked list -> " + estimatedTime + " milliseconds.");

        return employeeFound;
    }

    public static Employee searchEmployeeInHashMap(int employeeId) {
        long startTime, estimatedTime;
        Employee employeeFound;

        System.out.println("> Start searching for an employee in the hash map.");
        startTime = System.currentTimeMillis();
        employeeFound = hashMap.get(employeeId);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("> Time elapsed with hash map -> " + estimatedTime + " milliseconds.");

        return employeeFound;
    }

}
