package com.kaldis.chris.week05;

import com.kaldis.chris.week04.employee.Experience;
import com.kaldis.chris.week04.employee.Rank;
import com.kaldis.chris.week04.employee.Staff;
import com.kaldis.chris.week05.employee.Academic;
import com.kaldis.chris.week05.employee.Employee;
import com.kaldis.chris.week05.employee.HourlyBasedStaff;
import com.kaldis.chris.week05.employee.PermanentStaff;
import com.kaldis.chris.week05.util.Randomize;

public class Week5 {

    private static final int NUMBER_OF_EMPLOYEES = 10_000_000;

    public static void main(String[] args) {
        System.out.println("~Week 05~");
        System.out.println("Creating random employees...");
        createRandomEmployees();
        System.out.println("Employees created!");

        int employeeInMiddleId = NUMBER_OF_EMPLOYEES / 2;
        Employee employee = Employee.searchEmployeeInLinkedList(employeeInMiddleId);
        System.out.println(employee);

        if (employee instanceof HourlyBasedStaff
                && ((HourlyBasedStaff) employee).getWorkingExperience() != Experience.MORE_THAN_TEN_YEARS) {
            ((HourlyBasedStaff) employee).setWorkingExperience(Experience.MORE_THAN_TEN_YEARS);
            ((HourlyBasedStaff) employee).setWorkedHours(HourlyBasedStaff.MAX_MONTHLY_WORKED_HOURS);
        } else if (employee instanceof PermanentStaff && ((PermanentStaff) employee).getRank() != Rank.PROFESSOR) {
            ((PermanentStaff) employee).setRank(Rank.PROFESSOR);
        }

        employee = Employee.searchEmployeeInHashMap(employeeInMiddleId);
        System.out.println(employee);
        int monthlySalary = ((Academic) employee).calculateMonthlySalary();
        System.out.println("Salary after calculation: " + monthlySalary);
    }

    private static void createRandomEmployees() {

        for (int i = 1; i <= Week5.NUMBER_OF_EMPLOYEES; i++) {
            Staff staff = Randomize.getRandomEnumValue(Staff.class);

            if (staff == Staff.PERMANENT) {
                Employee.addEmployee(new PermanentStaff(i));
            } else if (staff == Staff.HOURLY_BASED) {
                Employee.addEmployee(new HourlyBasedStaff(i));
            }
        }

    }

}
