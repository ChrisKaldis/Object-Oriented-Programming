package com.kaldis.chris.week05.employee;

import com.kaldis.chris.week04.employee.Rank;
import com.kaldis.chris.week05.util.Randomize;

public final class PermanentStaff extends Academic {
    private Rank rank;
    private int monthlySalary;

    public PermanentStaff(int id) {
        super(id);
        rank = Randomize.getRandomEnumValue(Rank.class);
    }

    @Override
    public int calculateMonthlySalary() {
        int bonusSalary = 0;

        switch (rank) {
            case LECTURER -> bonusSalary = 1_000;
            case ASSISTANT -> bonusSalary = 1_200;
            case ASSOCIATE -> bonusSalary = 1_400;
            case PROFESSOR -> bonusSalary = 1_500;
        }
        monthlySalary = baseMonthlySalary + bonusSalary;

        return monthlySalary;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "PermanentStaff{" +
                "id=" + super.getId() +
                ", rank=" + rank +
                ", monthlySalary=" + monthlySalary +
                '}';
    }

}
