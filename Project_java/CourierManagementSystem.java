import java.util.*;

public class CourierManagementSystem {
    private static String[] packages;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println("***************");
        System.out.println("**** Welcome to the Courier Management System ****");
        System.out.println("***************\n");
        do {
            System.out.println("1. Create Shipment");
            System.out.println("2. Track Shipment");
            System.out.println("3. View All Shipments");
            System.out.println("4. View Invoice");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    addPackage();
                    break;
                case 2:
                    trackPackage();
                    break;
                case 3:
                    listPackages();
                    break;
                case 4:
                    viewInvoice();
                    break;
                case 5:
                    System.out.println("Exiting......");
                    break;
                default:
                    System.out.println("!!Oops Invalid Option Try Again :(");
            }
        } while (option != 5);
    }

    public static void addPackage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Packages: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // consume the newline character left by nextInt()

        packages = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the name of Package " + (i + 1) + ": ");
            packages[i] = scanner.nextLine();
        }

        System.out.println("Package added successfully!");
    }

    public static void trackPackage() {
       System.out.println("This Functionality is Coming Soon....:)");
    }

    public static void listPackages() {
        for (int i = 0; i < packages.length; i++) {
            System.out.println("Package " + (i + 1) + ": " + packages[i]);
        }
    }

    public static void viewInvoice() {
        System.out.println("This Functionality is Coming Soon....");
    }
}