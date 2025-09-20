package week03.tankFuel;

/**
 * Exception for when a tank is already full.
 */
public class TankFullException extends Exception {

    public TankFullException(String str) {
        super(str);
    }
    
}
