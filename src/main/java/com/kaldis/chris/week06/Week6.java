package com.kaldis.chris.week06;

import com.kaldis.chris.week06.spaceship.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week6 {
    public static final int COSMOS_WIDTH = 800;
    public static final int COSMOS_HEIGHT = 600;
    public static final int SPACESHIP_WIDTH = 100;
    public static final int SPACESHIP_HEIGHT = 100;

    public static void main(String[] args) throws Exception {
        System.out.println("~Week 06~");
        List<Spaceship> spaceships = initSpaceships();
        boolean running = true;

        try (Scanner scanner = new Scanner(System.in)) {

            do {
                printSpaceships(spaceships);
                System.out.println("Enter up, down, left, right to move and quit to exit.");
                String input = scanner.nextLine().toLowerCase();

                switch (input) {
                    case "quit", "q" -> running = false;
                    case "up", "u" -> moveSpaceshipsUp(spaceships);
                    case "down", "d" -> moveSpaceshipsDown(spaceships);
                    case "left", "l" -> moveSpaceshipsLeft(spaceships);
                    case "right", "r" -> moveSpaceshipsRight(spaceships);
                    default -> throw new RuntimeException("User input wasn't a valid option");
                }
            } while (running);

        } catch (Exception e) {
            System.err.println("Something went wrong!");
            throw new Exception(e);
        }

    }

    private static List<Spaceship> initSpaceships() {
        List<Spaceship> spaceshipList = new ArrayList<>();
        spaceshipList.add(new SpaceshipZero());
        spaceshipList.add(new SpaceshipAlpha());
        spaceshipList.add(new SpaceshipBeta());
        spaceshipList.add(new SpaceshipGamma());
        spaceshipList.add(new SpaceshipDelta());
        spaceshipList.add(new SpaceshipEnemy());

        return spaceshipList;
    }

    private static void moveSpaceshipsUp(List<Spaceship> spaceshipList) {
        for (Spaceship spaceship : spaceshipList) {
            spaceship.moveUp();
        }
    }

    private static void moveSpaceshipsDown(List<Spaceship> spaceshipList) {
        for (Spaceship spaceship : spaceshipList) {
            spaceship.moveDown();
        }
    }

    private static void moveSpaceshipsLeft(List<Spaceship> spaceshipList) {
        for (Spaceship spaceship : spaceshipList) {
            spaceship.moveLeft();
        }
    }

    private static void moveSpaceshipsRight(List<Spaceship> spaceshipList) {
        for (Spaceship spaceship : spaceshipList) {
            spaceship.moveRight();
        }
    }

    private static void printSpaceships(List<Spaceship> spaceshipList) {
        for (Spaceship spaceship : spaceshipList) {
            System.out.println(spaceship);
        }
    }

}
