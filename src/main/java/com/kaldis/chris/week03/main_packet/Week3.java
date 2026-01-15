package com.kaldis.chris.week03.main_packet;

import com.kaldis.chris.week03.tank_fuel.InvalidFuelTempoException;
import com.kaldis.chris.week03.tank_fuel.InvalidTankFuelCapacityException;
import com.kaldis.chris.week03.tank_fuel.TankFuel;
import com.kaldis.chris.week03.tank_fuel.TankFullException;

public class Week3 {

    public static void main(String[] args) {
        TankFuel tankFuel = null;
        double fuelTempo = 0.2;
        boolean fillTank = true;

        System.out.println("~Week 03~");

        try {
            tankFuel = new TankFuel(0);
            System.out.println("Tank with gasoline tank capacity: " + tankFuel.getGasolineTankCapacity() + " created");
        } catch (InvalidTankFuelCapacityException exception) {
            System.out.println(exception.getMessage());
        }

        while (fillTank) {
            try {
                if (tankFuel != null) {
                    tankFuel.fuelTank(fuelTempo);
                } else {
                    fillTank = false;
                }
            } catch (InvalidFuelTempoException e) {
                throw new RuntimeException(e);
            } catch (TankFullException e) {
                fillTank = false;
            }
        }

        if (tankFuel != null)
            System.out.println("Tank is: " + tankFuel.getTankFuel());

    }

}
