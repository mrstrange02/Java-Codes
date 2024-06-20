// StudentFee interface
interface StudentFee {
    double getAmount();
    String getFirstName();
    String getLastName();
    String getAddress();
    String getContact();
}

// Hostler class implementing StudentFee interface
class Hostler implements StudentFee {
    private String firstName;
    private String lastName;
    private String address;
    private String contact;
    private double hostelFee;

    // Constructor
    public Hostler(String firstName, String lastName, String address, String contact, double hostelFee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
        this.hostelFee = hostelFee;
    }

    // Implementation of the getAmount() method for Hostler
    @Override
    public double getAmount() {
        // You can implement your own logic for calculating the fee for Hostler
        return hostelFee;
    }

    // Implementations for other methods
    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getContact() {
        return contact;
    }
}

// NonHostler class implementing StudentFee interface
class NonHostler implements StudentFee {
    private String firstName;
    private String lastName;
    private String address;
    private String contact;
    private double tuitionFee;

    // Constructor
    public NonHostler(String firstName, String lastName, String address, String contact, double tuitionFee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
        this.tuitionFee = tuitionFee;
    }

    // Implementation of the getAmount() method for NonHostler
    @Override
    public double getAmount() {
        // You can implement your own logic for calculating the fee for NonHostler
        return tuitionFee;
    }

    // Implementations for other methods
    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getContact() {
        return contact;
    }
}

// Main class for testing
public class interface7f{
    public static void main(String[] args) {
        // Creating instances of Hostler and NonHostler
        Hostler hostler = new Hostler("John", "Doe", "Hostel Block A", "1234567890", 5000.0);
        NonHostler nonHostler = new NonHostler("Jane", "Smith", "Street XYZ", "9876543210", 3000.0);

        // Using the methods from the StudentFee interface for both students
        System.out.println("Hostler ");
        System.out.println(" Name: " + hostler.getFirstName() + " " + hostler.getLastName()) ;
               System.out.println( "Address: " + hostler.getAddress()) ;
               
                System.out.println("Contact: " + hostler.getContact()); 
                
               System.out.println( "Fee: $" + hostler.getAmount());
               System.out.println();

        System.out.println("NonHostler ");
        System.out.println("Name: " + nonHostler.getFirstName() + " " + nonHostler.getLastName()) ;
         System.out.println( "Address: " + nonHostler.getAddress()) ;
               
                System.out.println("Contact: " + nonHostler.getContact()); 
                
               System.out.println( "Fee: $" + nonHostler.getAmount());

         }      
}

