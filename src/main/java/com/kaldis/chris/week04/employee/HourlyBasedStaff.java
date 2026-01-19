package com.kaldis.chris.week04.employee;

import com.kaldis.chris.week04.exception.InvalidWorkedHours;
import com.kaldis.chris.week04.util.Randomize;

public class HourlyBasedStaff extends Academic {
    public static final int MAX_MONTHLY_WORKED_HOURS = 40;
    private Experience workingExperience;
    private int workedHours = 0;
    private int monthlySalary;

    public HourlyBasedStaff(int id) {
        super(id);
        workingExperience = Randomize.getRandomWorkingExperience();
    }

    @Override
    public int calculateMonthlySalary() {
        int bonusSalary = 0;

        switch (workingExperience) {
            case UP_TO_FIVE_YEARS -> bonusSalary = workedHours * 10;
            case FIVE_TO_TEN_YEARS -> bonusSalary = workedHours * 20;
            case MORE_THAN_TEN_YEARS -> bonusSalary = workedHours * 30;
        }
        monthlySalary = baseMonthlySalary + bonusSalary;

        return monthlySalary;
    }

    public void setWorkedHours(int workedHours) {
        if (workedHours <= MAX_MONTHLY_WORKED_HOURS) {
            this.workedHours = workedHours;
        } else throw new InvalidWorkedHours("Max worked hours per month are: " + MAX_MONTHLY_WORKED_HOURS);
    }

    @Override
    public String toString() {
        return "HourlyBasedStaff{" +
                "id=" + super.getId() +
                ", workingExperience=" + workingExperience +
                ", workedHours=" + workedHours +
                ", monthlySalary=" + monthlySalary +
                '}';
    }

}
