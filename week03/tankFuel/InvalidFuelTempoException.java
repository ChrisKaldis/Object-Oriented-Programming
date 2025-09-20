package week03.tankFuel;

/**
 * Exception for when a tank is filled up with an invalid fuel tempo.
 */
public class InvalidFuelTempoException extends Exception {
    
    public InvalidFuelTempoException(String str) {
        super(str);
    }

}
