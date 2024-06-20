/*6. Extend the above TwoWheeler class with methods getType() and getName()
which gives the information about the type and the name of the company.Create
sub-classes Geared and NonGeared with method average() to print the average of
a geared and non-geared two wheeler.*/


import java.util.Scanner;

class TwoWheeler
{
     protected String vehicleNumber;
    protected String insuranceNumber;
    protected String color;

     String type;
    String name;
     public TwoWheeler(String vehicleNumber, String insuranceNumber, String color,String type,String name) {
        this.vehicleNumber = vehicleNumber;
        this.insuranceNumber = insuranceNumber;
        this.color = color;
         this.type = type;
        this.name = name;
    }

  

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    //@Override
    public double getConsumption() {
        // Add logic to get consumption for a generic two-wheeler
        return 0.0;
    }

    public void maintenance() {
        System.out.println("Two-wheeler maintenance is needed every 5000 km.");
    }

    //@Override
    public void displayConsumption() {
        System.out.println("Fuel Consumption: " + getConsumption() + " liters per 100 km");
    }
}

class Geared extends TwoWheeler
 {
    public Geared(String vehicleNumber, String insuranceNumber, String color, String name) 
    {
        super(vehicleNumber, insuranceNumber, color, "Geared", name);
    }

    @Override
    public double getConsumption() {
        // Add logic to get consumption for a geared two-wheeler
        return 4.0; // Example value, modify as needed
    }

    public void average() {
        System.out.println("Average speed of Geared Two-Wheeler is 50 km/h.");
    }
}

class NonGeared extends TwoWheeler
 {
    public NonGeared(String vehicleNumber, String insuranceNumber, String color, String name)
     {
        super(vehicleNumber, insuranceNumber, color, "Non-Geared", name);
    }

    @Override
    public double getConsumption() {
        // Add logic to get consumption for a non-geared two-wheeler
        return 3.0; // Example value, modify as needed
    }

    public void average() {
        System.out.println("Average speed of Non-Geared Two-Wheeler is 40 km/h.");
    }
}

public class GearedTwoWheeler 
{
    public static void main(String[] args)
     {
        Geared gearedTwoWheeler =new  Geared("TS 123","IN 123","black","Pulsar");
        NonGeared nonGearedTwoWheeler = new NonGeared("Ts 2003","IN 321","grey","Activa 6G");

        System.out.println("Details of Geared Two-Wheeler:");
        gearedTwoWheeler.displayConsumption();
        System.out.println("Type: " + gearedTwoWheeler.getType());
        System.out.println("Name: " + gearedTwoWheeler.getName());
        gearedTwoWheeler.maintenance();
        gearedTwoWheeler.average();

        System.out.println("\nDetails of Non-Geared Two-Wheeler:");
        nonGearedTwoWheeler.displayConsumption();
        System.out.println("Type: " + nonGearedTwoWheeler.getType());
        System.out.println("Name: " + nonGearedTwoWheeler.getName());
        nonGearedTwoWheeler.maintenance();
        nonGearedTwoWheeler.average();
    }
    }

    /*public static Geared createGearedTwoWheeler() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Geared Two-Wheeler Vehicle Number: ");
        String vehicleNumber = scanner.nextLine();

        System.out.print("Enter Geared Two-Wheeler Insurance Number: ");
        String insuranceNumber = scanner.nextLine();

        System.out.print("Enter Geared Two-Wheeler Color: ");
        String color = scanner.nextLine();

        System.out.print("Enter Geared Two-Wheeler Name: ");
        String name = scanner.nextLine();

        return new Geared(vehicleNumber, insuranceNumber, color, name);
    }

    public static NonGeared createNonGearedTwoWheeler() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Non-Geared Two-Wheeler Vehicle Number: ");
        String vehicleNumber = scanner.nextLine();

        System.out.print("Enter Non-Geared Two-Wheeler Insurance Number: ");
        String insuranceNumber = scanner.nextLine();

        System.out.print("Enter Non-Geared Two-Wheeler Color: ");
        String color = scanner.nextLine();

        System.out.print("Enter Non-Geared Two-Wheeler Name: ");
        String name = scanner.nextLine();

        return new NonGeared(vehicleNumber, insuranceNumber, color, name);
    }
}*/
