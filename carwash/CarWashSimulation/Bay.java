
/**
 * keeps track of whether or not the car wash is available and how 
 * much longer the current car wash will take (one q bay)
 *
 * @author (Amalia)
 * @version (April 28th)
 */
public class Bay
{
    //to keep track of how long each car has to wait 
    int delay;
    int washTime; // how long the waash is going to take 
    

    /**
     * Constructor for objects of class Bay
     */
    public Bay( int totalWashTime)
    {
        // initialise instance variables
    
       this.washTime = totalWashTime;
       // call reset method 
       reset();
    }

    /**
     * find out the status of the bay empty or nawh 
     */
    public boolean isEmpty ()
    {
        return this.delay <= 0;
    }
    
    /**
     * restes the sim spefically the ba after one trial run 
     */
    public void reset()
    {
        delay = 0; // no delay it is empty wiht no cars 
    }
    
    
    /**
     * start new wash. acts as a time keeper for how long a car is being washed and 
     * how long it is going to take until its done
     */
    public void startWash ()
    {
       // if there is a car in the cash throw exception bc it cant ressart 
       // the count donw/ timer for the new car 
        if (!isEmpty())
        {
        throw new UnsupportedOperationException("there is alreadly a car!");
        }
        else 
            delay = washTime;
    }
    
     /** 
      * If the car is in the bay keep washing until it is done 
      * 
     */
    public void keepWashing ()
    
    {
        
        if(isEmpty())
        {
            throw new UnsupportedOperationException("no car in bay");
        }
        else delay = delay-1;

    }
}
