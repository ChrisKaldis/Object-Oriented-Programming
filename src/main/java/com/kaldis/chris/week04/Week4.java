package com.kaldis.chris.week04;

import com.kaldis.chris.week04.employee.HourlyBasedStaff;
import com.kaldis.chris.week04.employee.PermanentStaff;
import com.kaldis.chris.week04.employee.Staff;
import com.kaldis.chris.week04.exception.InvalidWorkedHours;
import com.kaldis.chris.week04.util.Randomize;

public class Week4 {

    public static void main(String[] args) {
        System.out.println("~Week 04~");
        createRandomEmployees(100);
    }

    public static void createRandomEmployees(int employees) {
        System.out.println("Creating " + employees + " randomized employees.");

        for (int i = 1; i <= employees; i++) {
            Staff staff = Randomize.getRandomStaff();

            if (staff == Staff.HOURLY_BASED) {
                HourlyBasedStaff hourlyBasedStaff = new HourlyBasedStaff(i);
                try {
                    hourlyBasedStaff.setWorkedHours(Randomize.getRandomWorkedHours());
                } catch (InvalidWorkedHours exception) {
                    exception.printStackTrace();
                }
                hourlyBasedStaff.calculateMonthlySalary();

                System.out.println(hourlyBasedStaff);
            } else if (staff == Staff.PERMANENT) {
                PermanentStaff permanentStaff = new PermanentStaff(i);
                permanentStaff.calculateMonthlySalary();

                System.out.println(permanentStaff);
            }
        }

    }

}
