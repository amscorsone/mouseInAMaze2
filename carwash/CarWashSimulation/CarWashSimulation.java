
import java.util.LinkedList;
import java.util.*;
import java.util.Random;
/**
 * controls the simulations- contains teh for loop and if statement to 
 * 1. check and see if a car has showed up 2. to count number of cars
 * 3. note the arrival time of the car(store with car) 4. add car to the
 * queue
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarWashSimulation
{

    KQueue<Car> line; // cars waiting to be let in 
    Bay bay; // create bay object 
    Random rand; // create random obj

    int timeNow = 0;  // how long car wash has been open 
    int carWtotal = 0;  // total wait time for all cars

    int closingTime = 0; // when business should close 
    int carTotal = 0; // total of number of cars that arrived throughout the day
    int longWait = 0;
    int arrival = 0;
    /**
     * Constructor for objects of class CarWashSimulation
     */
    public CarWashSimulation(int washDuration)
    {
        // INTIALIZE OBJECTS 

            // create a LL queue object 
        line = new LLQueue<Car>();
        // create a new bay 
        bay = new Bay(washDuration);
       
    }
    /**
     * Reset the whole simultion to be zero in order to start  new trial
     */
    public void resetWash()
    {
        timeNow = 0;  // how long car wash has been open 
        carWtotal = 0;  // total wait time for all cars
        carTotal = 0;
        //bay.resetWash();
        //line.resetWash();

    }

    /**
     * run sim for a certian amount of time, either 3 or 4 mintues most likely 
     * @param minToRun how long the sim should be going for aka the whole day
     */
    public void runSim( int minToRun)
    {
        //initalize the closingTime var--- wll continue to run until the 
        // chossen time has occred or until there re no more caars wating 
        closingTime = minToRun;

        for (int i = 0; i<minToRun; i++)
        {
            //call step method to run through cars
            step();

        }
        // as long as the waiting line and queue of cars is not empty...
        //its n Or sttement beacuse only one has to be true for the program to not work 
        while(!line.isEmpty() || ! bay.isEmpty())
        {
            step();
        }
    
        System.out.println("Total accumlatived wait time for the cars: " + carWtotal +" mins");
        System.out.println("Total number of cars that showed up: " + carTotal);
        System.out.println("Average wait time of a car is: " + carWtotal/carTotal +" mins");
        System.out.println("Cars that expiernced a long wait time 10+ min: "+ longWait);
        System.out.println();
       
    }

    /**
     * step thorugh a cycle of the sim 
     */
    public void step()
    {
         //initalize new random objects 
        //every minute there is a 1 in 4 chance a car shows up
        int randnum = rand.nextInt(4);
        // create new car object to simulate one cycle 
        Car carNew = new Car(timeNow);
        //need a for loop
        if(randnum == 1 && timeNow < closingTime){
            carTotal++;
            line.enqueue(carNew);
        if(! bay.isEmpty() )
        {
        
          Car car = line.dequeue(); 
            line.enqueue(carNew);
        bay.startWash(); // call wash method 
        int waitTime = timeNow - carSim.arrivalTime(arrival);
            // keep track of if there is a super long wait 
            if( waitTime > 9)
            {
                longWait++;
            }
            carWtotal+=waitTime;
        }

    }
    else if (!bay.isEmpty())
    {
        bay.keepWashing();
    }
    
    // incresas the time for the day since this wash started 
    timeNow++;
    
}
}
