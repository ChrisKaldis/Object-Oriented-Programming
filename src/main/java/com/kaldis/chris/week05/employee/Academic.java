package com.kaldis.chris.week05.employee;

public abstract class Academic extends Employee{
    private final int id;
    protected static final int baseMonthlySalary = 500;

    protected Academic(int id) {
        this.id = id;
    }

    public int calculateMonthlySalary() {
        return baseMonthlySalary;
    }

    @Override
    public int getId() {
        return id;
    }

}
