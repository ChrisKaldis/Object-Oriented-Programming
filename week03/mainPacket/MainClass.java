package week03.mainPacket;

import week03.tankFuel.TankFuel;
import week03.tankFuel.TankFullException;
import week03.tankFuel.InvalidFuelTempoException;
import week03.tankFuel.InvalidTankCapacityException;

/**
 * Main application class to demonstrate the functionality of the 
 * {@link TankFuel} class.
 */
public class MainClass {

    /**
     * The main entry point for the demonstration application.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        TankFuel myTank = null;

        try {
            myTank = new TankFuel(50);
        } catch (InvalidTankCapacityException ex) {
            System.out.println(ex.getMessage());
            return ;
        }

        boolean fillTank = true;
        double fuelTempo = 0.1;

        while (fillTank) {
            try {
                myTank.fuelTank(fuelTempo);
            } catch (InvalidFuelTempoException ex) {
                fillTank = false;
                System.out.println(ex.getMessage());
            } catch (TankFullException ex) {
                fillTank = false;
                System.out.println(ex.getMessage());
            }
        }

        System.out.println(myTank.getTankFuel());
        myTank = null;
    }

}
