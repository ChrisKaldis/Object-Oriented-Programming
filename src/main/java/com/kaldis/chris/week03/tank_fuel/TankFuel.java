package com.kaldis.chris.week03.tank_fuel;

public class TankFuel {
    final double gasolineTankCapacity;
    double tankFuel = 0.0;

    public TankFuel(double gasolineTankCapacity) {
        if (gasolineTankCapacity > 0) {
            this.gasolineTankCapacity = gasolineTankCapacity;
        } else throw new InvalidTankFuelCapacityException("Gasoline tank capacity must be a positive number.");
    }

    public double getGasolineTankCapacity() {
        return gasolineTankCapacity;
    }

    public double getTankFuel() {
        return tankFuel;
    }

    public void fuelTank(double fuelTempo) throws InvalidFuelTempoException, TankFullException {

        if (fuelTempo != 0.1 && fuelTempo != 0.2) {
            throw new InvalidFuelTempoException("Fuel tempo must be 0.1 or 0.2.");
        } else if (gasolineTankCapacity == tankFuel) {
            throw new TankFullException("The tank is full.");
        }

        tankFuel += fuelTempo;
        tankFuel = (double) Math.round(tankFuel * 10) / 10;

    }

}
