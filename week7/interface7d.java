// Vehicle interface
interface Vehicle {
    String getColor();
    String getNumber();
    double getConsumption();
}

// TwoWheeler class implementing Vehicle interface
class TwoWheeler implements Vehicle {
    private String color;
    private String number;
    private double fuelConsumption;

    // Constructor
    public TwoWheeler(String color, String number, double fuelConsumption) 
    {
        this.color = color;
        this.number = number;
        this.fuelConsumption = fuelConsumption;
    }

    // Implementation of the getColor() method for TwoWheeler
    @Override
    public String getColor() {
        return color;
    }

    // Implementation of the getNumber() method for TwoWheeler
    @Override
    public String getNumber() {
        return number;
    }

    // Implementation of the getConsumption() method for TwoWheeler
    @Override
    public double getConsumption() {
        // You can implement your own logic for calculating fuel consumption for TwoWheeler
        return fuelConsumption;
    }
}

// FourWheeler class implementing Vehicle interface
class FourWheeler implements Vehicle {
    private String color;
    private String number;
    private double fuelConsumption;

    // Constructor
    public FourWheeler(String color, String number, double fuelConsumption) {
        this.color = color;
        this.number = number;
        this.fuelConsumption = fuelConsumption;
    }

    // Implementation of the getColor() method for FourWheeler
    @Override
    public String getColor() {
        return color;
    }

    // Implementation of the getNumber() method for FourWheeler
    @Override
    public String getNumber() {
        return number;
    }

    // Implementation of the getConsumption() method for FourWheeler
    @Override
    public double getConsumption() {
        // You can implement your own logic for calculating fuel consumption for FourWheeler
        return fuelConsumption;
    }
}

// Main class for testing
public class interface7d {
    public static void main(String[] args) {
        // Creating instances of TwoWheeler and FourWheeler
        TwoWheeler twoWheeler = new TwoWheeler("Red", "TW123", 50.0);
        FourWheeler fourWheeler = new FourWheeler("Blue", "FW456", 30.0);

        // Using the methods from the Vehicle interface for both vehicles
        System.out.println("TwoWheeler -");
        System.out.println(" Color: " + twoWheeler.getColor());
        System.out.println(" Number: " + twoWheeler.getNumber());
        System.out.println( " Fuel Consumption: " + twoWheeler.getConsumption() + " km/l");

        System.out.println("FourWheeler - ");
        System.out.println("Color: " + fourWheeler.getColor() );
                System.out.println("Number: " + fourWheeler.getNumber() );
              System.out.println(  " Fuel Consumption: " + fourWheeler.getConsumption() + " km/l");
    }
}

