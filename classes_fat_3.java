// You are using Java
import java.util.Scanner;

class Patient {

    
    class Doctor {
        private String name;
        private String address;
        private String passportNumber;

        // Constructor to set the name, address, and passport number
        public Doctor(String name, String address, String passportNumber) {
            this.name = name;
            this.address = address;
            this.passportNumber = passportNumber;
        }

        // Getter methods to access the private fields
        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getPassportNumber() {
            return passportNumber;
        }
    }

    private String name;
    private String address;
    private int wardNumber;

    // Constructor to set the patient details
    public Patient(String name, String address, int wardNumber) {
        this.name = name;
        this.address = address;
        this.wardNumber = wardNumber;
    }

    // Method to display patient details
    public void displayPatientDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Ward number: " + wardNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input for patient's details
       
        String patientName = scanner.nextLine();

        
        String patientAddress = scanner.nextLine();

      
        int wardNumber = scanner.nextInt();

        // Close the scanner
        scanner.close();

        
        Patient patient = new Patient(patientName, patientAddress, wardNumber);

        // Display patient details
        patient.displayPatientDetails();
    }

