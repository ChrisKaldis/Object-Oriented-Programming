package week03.tankFuel;

/**
 * Exception for when a tank is initialized with a negative or invalid capacity.
 */
public class InvalidTankCapacityException extends Exception {
    
    public InvalidTankCapacityException(String str) {
        super(str);
    }

}
