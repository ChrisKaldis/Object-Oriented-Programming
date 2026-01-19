package com.kaldis.chris.week04.util;

import com.kaldis.chris.week04.employee.Experience;
import com.kaldis.chris.week04.employee.HourlyBasedStaff;
import com.kaldis.chris.week04.employee.Rank;
import com.kaldis.chris.week04.employee.Staff;

import java.util.Random;

public class Randomize {

    private static final Random random = new Random();

    public static Experience getRandomWorkingExperience() {
        Experience[] experienceValues = Experience.values();
        int i = random.nextInt(experienceValues.length);

        return experienceValues[i];
    }

    public static Rank getRandomRank() {
        Rank[] rankValues = Rank.values();
        int i = random.nextInt(rankValues.length);

        return rankValues[i];
    }

    public static Staff getRandomStaff() {
        Staff[] staffValues = Staff.values();
        int i = random.nextInt(staffValues.length);

        return staffValues[i];
    }

    public static int getRandomWorkedHours() {
        return random.nextInt(HourlyBasedStaff.MAX_MONTHLY_WORKED_HOURS);
    }

}
