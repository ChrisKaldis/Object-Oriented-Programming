package playground.oop;

import java.util.ArrayList;
import java.util.List;

public class Family {

    public static void main(String[] args) {

        final Human father = new Human("Argiris");
        final Human mother = new Human("Maria");
        final Human sister = new Human("Alice");
        final Human brother = new  Human("Bob");

        List<Human> family = new ArrayList<>();
        family.add(father);
        family.add(mother);
        family.add(sister);
        family.add(brother);

        printList(family);
        father.setName("George");
        printList(family);

    }

    private static void printList(List<Human> family) {
        for (Human h : family) {
            System.out.println(h);
        }
    }

}
