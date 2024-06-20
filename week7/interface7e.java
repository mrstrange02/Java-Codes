// Fare interface
import java.util.*;

interface Fare {
    double getAmount();
}

// Bus class implementing Fare interface
class Bus implements Fare {
    private double distance;
    

    // Constructor
    public Bus(double distance) {
        this.distance = distance;
        //this.farePerKilometer = farePerKilometer;
    }

    // Implementation of the getAmount() method for Bus
    @Override
    public double getAmount() {
        // You can implement your own logic for calculating the fare for Bus
        return distance *3.2;
    }
}

// Train class implementing Fare interface
class Train implements Fare {
    private double distance;
    //private double farePerKilometer;

    // Constructor
    public Train(double distance) {
        this.distance = distance;
        //this.farePerKilometer = farePerKilometer;
    }

    // Implementation of the getAmount() method for Train
    @Override
    public double getAmount() {
        // You can implement your own logic for calculating the fare for Train
        return distance * 2.4;
    }
}

// Main class for testing
public class interface7e {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the distance in KM: ");
       double distance=sc.nextDouble();
      //Systm.out.println("enter the kilometer price: ");
     // farePerKilometer=sc.nextDouble();
        // Creating instances of Bus and Train
        Bus bus = new Bus(distance); // distance in kilometers, fare per kilometer
        Train train = new Train(distance); // distance in kilometers, fare per kilometer

        // Using the getAmount() method for both Bus and Train
        //double busFare = bus.getAmount();
        //double trainFare = train.getAmount();

        // Printing the calculated fares
        System.out.println("Bus Fare: $" + bus.getAmount());
        System.out.println("Train Fare: $" +  train.getAmount());
    }
}

