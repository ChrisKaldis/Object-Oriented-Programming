package com.kaldis.chris.week06.spaceship;

import com.kaldis.chris.week06.Week6;

public abstract class Spaceship implements Navigation {

    private final String spaceshipName;
    protected int xCoordinate;
    protected int yCoordinate;

    protected int movingStep;

    public Spaceship(int xCoordinate, int yCoordinate, int movingStep, String spaceshipName) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.movingStep = movingStep;
        this.spaceshipName = spaceshipName;
    }

    @Override
    public int moveUp() {
        if (yCoordinate - movingStep > 0)
            yCoordinate -= movingStep;

        return yCoordinate;
    }

    @Override
    public int moveDown() {
        if (yCoordinate + movingStep + Week6.SPACESHIP_HEIGHT < Week6.COSMOS_HEIGHT)
            yCoordinate += movingStep;

        return yCoordinate;
    }

    @Override
    public int moveLeft() {
        if (xCoordinate - movingStep > 0)
            xCoordinate -= movingStep;

        return xCoordinate;
    }

    @Override
    public int moveRight() {
        if (xCoordinate + movingStep + Week6.SPACESHIP_WIDTH < Week6.COSMOS_WIDTH)
            xCoordinate += movingStep;

        return xCoordinate;
    }

    @Override
    public String toString() {
        return "Spaceship{" +
                "spaceshipName='" + spaceshipName + '\'' +
                ", xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                ", movingStep=" + movingStep +
                '}';
    }

}
