package com.kaldis.chris.week04.employee;

public class Academic {
    private int id;
    protected static final int baseMonthlySalary = 500;

    public Academic(int id) {
        this.id = id;
    }

    public int calculateMonthlySalary() {
        return baseMonthlySalary;
    }

    public int getId() {
        return id;
    }

}
