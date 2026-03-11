package playground.oop;

import playground.exceptions.InvalidAge;

public class Human {

    private String name;
    private int age;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age) {
        this.name = name;
        if (age < 0) {
            throw new InvalidAge("Age can't be negative");
        } else if (age > 150) {
            throw new InvalidAge("Age can't be greater than 150");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
