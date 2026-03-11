package playground.oop;

import java.util.ArrayList;
import java.util.List;

public class Family {

    public static void main(String[] args) {

        final Human father = new Human("Argiris", 37);
        final Human mother = new Human("Maria", 34);
        final Human sister = new Human("Alice", 3);
        final Human brother = new  Human("Bob", 1);

        List<Human> family = new ArrayList<>();
        family.add(father);
        family.add(mother);
        family.add(sister);
        family.add(brother);

        printList(family);
        father.setName("George");
        printList(family);

        try {
            Human pharaoh = new Human("Tutankhamun", 3350);
        } catch (RuntimeException ignored) {
            System.out.println("Something went wrong, ignoring exceptions like this is actually really bad.");
        }

        Human myChild;
        try {
            myChild = new Human("Olga", -2);
        } catch (Exception e) {
            System.out.println("Something went wrong, ignoring");
            myChild = new  Human("Olga");
        } finally {
            System.out.println("I am actually always executed, wow that's awesome!");
        }

        System.out.println(myChild);

    }

    private static void printList(List<Human> family) {
        for (Human h : family) {
            System.out.println(h);
        }
    }

}
