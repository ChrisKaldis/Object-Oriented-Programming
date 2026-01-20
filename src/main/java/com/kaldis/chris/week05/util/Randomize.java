package com.kaldis.chris.week05.util;

import com.kaldis.chris.week05.employee.HourlyBasedStaff;

import java.util.Random;

public class Randomize {

    private static final Random random = new Random();

    public static <T extends Enum<T>> T getRandomEnumValue(Class<T> enumClass) {
        T[] enumValues = enumClass.getEnumConstants();

        return enumValues[random.nextInt(enumValues.length)];
    }

    public static int getRandomWorkedHours() {
        return random.nextInt(HourlyBasedStaff.MAX_MONTHLY_WORKED_HOURS);
    }

}
