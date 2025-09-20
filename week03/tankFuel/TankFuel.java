package week03.tankFuel;

/**
 * Represents a fuel tank with a specific capacity. 
 */
public class TankFuel {
    private final double gasolineTankCapacity;
    private double tankFuel = 0.0;

    /**
     * Constructs a new TankFuel object with a specified capacity.
     *
     * @param gasolineTankCapacity The maximum capacity of the tank. 
     * Cannot be negative.
     * @throws InvalidTankCapacityException if the provided capacity 
     * is negative.
     */
    public TankFuel(double gasolineTankCapacity) 
        throws InvalidTankCapacityException 
    {
        if (gasolineTankCapacity < 0) {
            throw new InvalidTankCapacityException(
                "Tank Capacity cannot be negative: " + gasolineTankCapacity);
        }
        this.gasolineTankCapacity = gasolineTankCapacity;
    }

    /**
     * Gets the amount of fuel in the tank.
     *
     * @return The amount of fuel as a double.
     */
    public double getTankFuel() {
        return tankFuel;
    }

    /**
     * Gets the maximum capacity of the tank.
     *
     * @return The tank's capacity as a double.
     */
    public double getTankCapacity() {
        return gasolineTankCapacity;
    }

    /**
     * Adds a specific amount of fuel to the tank.
     * This method only accepts fuel "tempos" (increments) of 0.1 or 0.2.
     * The new fuel level is rounded to one decimal place.
     *
     * @param fuelTempo The amount of fuel to add. Must be 0.1 or 0.2.
     * @throws InvalidFuelTempoException if the fuelTempo is not 0.1 or 0.2.
     * @throws TankFullException if the tank is already full before attempting 
     * to add fuel.
     */
    public void fuelTank(double fuelTempo)
        throws InvalidFuelTempoException, TankFullException 
    {    
        if ((fuelTempo != 0.1) && (fuelTempo != 0.2))
            throw new InvalidFuelTempoException(
                "Sorry, fuel tempo is not supported"
            );
        
        if (gasolineTankCapacity == tankFuel)
            throw new TankFullException("The tank is now full.");
        
        else {
            System.out.println(tankFuel);
            tankFuel = tankFuel+fuelTempo;
            tankFuel = (double) Math.round(tankFuel * 10) / 10;
        }
    }

}
