package com.kaldis.chris.week05.employee;

import com.kaldis.chris.week04.employee.Experience;
import com.kaldis.chris.week04.exception.InvalidWorkedHours;
import com.kaldis.chris.week05.util.Randomize;

public final class HourlyBasedStaff extends Academic {
    public static final int MAX_MONTHLY_WORKED_HOURS = 40;
    private Experience workingExperience;
    private int workedHours;
    private int monthlySalary;

    public HourlyBasedStaff(int id) {
        super(id);
        workingExperience = Randomize.getRandomEnumValue(Experience.class);
        workedHours = Randomize.getRandomWorkedHours();
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

    public Experience getWorkingExperience() {
        return workingExperience;
    }

    public void setWorkingExperience(Experience workingExperience) {
        this.workingExperience = workingExperience;
    }

    public void setWorkedHours(int workedHours) {
        if (workedHours >= 0 && workedHours <= MAX_MONTHLY_WORKED_HOURS) {
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
