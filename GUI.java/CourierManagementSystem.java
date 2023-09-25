import java.util.*;
import java.util.Random;  


public class CourierManagementSystem {
    static Scanner scanner= new Scanner(System.in);
    static Random random = new Random();   
    static int id = random.nextInt(2000);
    static String name,Destinaion;
    static String[] Locations;
    static Double packageWeight,cost;
    int ons;
   
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
            System.out.println("6. Return to Main Menu");
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
                case 6:
                    System.out.println("Return to main Menu");
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
            name=scanner.next();

            packages[i] = scanner.nextLine();
            System.out.println("Enter the Weight of the Package"+i+":- ");
            packageWeight=scanner.nextDouble();
            if(packageWeight>50){
                System.out.println("Sorry!!...We can't deliver the Packages Above 50KG");
                break;

                
            }
            else{
            cost=50*packageWeight;
         }
         System.out.println("Enter the Destination of the Package:- ");
         Destinaion=scanner.next();


        
        
         System.out.println("Package added successfully!");
       
        
        System.out.println("Your Tracking ID is:- "+id);
        }

        }
    public static void trackPackage() {
        //    System.out.println("This Functionality is Coming Soon....:)");
        System.out.println("Enter the Tracking id of the Package:- ");
        int track_id=scanner.nextInt();
        int time=random.nextInt(10);
        if (track_id==id) {
            System.out.println("Your Package will be Delivered Within "+time+" Hour at your Desired Destination");
            System.out.println("Thanks for choosing Our Service :)");
        }
        else{
            System.out.println("Your Package was not Found....");
            
        }
    }

    

    public static void listPackages() {
        for (int i = 0; i < packages.length; i++) {
            System.out.println("Package " + (i + 1) + ": " + packages[i]);
        }
    }

    public static void viewInvoice() {
        // System.out.println("This Functionality is Coming Soon....");
        System.out.println("Enter the ID of the Package :- ");
        int invoice_id=scanner.nextInt();
        if (invoice_id==id) {
            System.out.println("Thanks...");   
            System.out.println("************************************");        
            System.out.println("                                        ");
            System.out.println("ID:- "+id);
            System.out.println("Package:- "+name);
            System.out.println("Destination:- "+Destinaion);
            System.out.println("Weight:- "+packageWeight);
            System.out.println("Total Cost:- "+cost);
            System.out.println("***********************************************************");
            System.out.println("Thanks for Choosing Our Service :)");
            
    }
        else{
            System.out.println("Enter the Valid Package ID...");
        }
        
    //  
      
    }
    
}