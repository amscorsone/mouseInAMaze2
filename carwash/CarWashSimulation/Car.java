
/**
 * represents the car's and creats a car object
 *
 * @Amalia 
 * @version (Arpril 28)
 */
public class Car
{
    // input thing for car is when it arrives at the car wash 
    private int cArrival;

    /**
     * Constructor for objects of class Car
     */
    public Car(int cArrival)
    {
        // initialise instance variables
        this.cArrival = cArrival;
    }
    
    // Methods
    
    /**
     * Constructs a new car object with a given arrival time.
     * 
     *      @param   int arrival    the current time that the car arrives
     */
    public int arrivalTime(int arrival)
    {
        return this.cArrival;
    
    }
    
    /**
     * Gives the arrival time as a string
     * 
     *      @return the arrival time for the car as a string
     */
    public String toString()
    {
        return "The time that the car arrived:  " + cArrival ;
    }
    
    
}
