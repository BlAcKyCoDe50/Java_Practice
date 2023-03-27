import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.util.*;
import java.util.Random;  
// import javax.swing.*;

public class GUI_Project {

    private ArrayList<String> packages = new ArrayList<>();
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton addPackageButton;
    private JButton trackPackageButton;
    private JButton listPackagesButton;
    private JButton viewInvoiceButton;

    Random random = new Random();
        int id = random.nextInt(2000);
        static String packageName;
        static String Destination;
        static int  packageWeight;
        static int cost,noofpk;

    public GUI_Project () {
        // Create the JFrame
        frame = new JFrame("Courier Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        

        // Create the JPanel
        panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        // Create the JLabel
        label = new JLabel("Welcome to the Courier Management System");

        // Create the JButtons
        ImageIcon add= new ImageIcon("add.png");   //for image
        addPackageButton = new JButton("",add);
        addPackageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addPackage();
            }
        });

        ImageIcon Track= new ImageIcon("Track.jpg");
        trackPackageButton = new JButton("",Track);
        trackPackageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trackPackage();
            }
        });

        ImageIcon List_All= new ImageIcon("Show.jpg");
        listPackagesButton = new JButton("",List_All);
        listPackagesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listPackages();
            }
        });

        ImageIcon Invoice= new ImageIcon("Invoice.jpg");
        viewInvoiceButton = new JButton("",Invoice);
        viewInvoiceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewInvoice();
            }
        });

        // Add the components to the JPanel
        panel.add(addPackageButton);
        panel.add(trackPackageButton);
        panel.add(listPackagesButton);
        panel.add(viewInvoiceButton);
        // panel.add();                  

        // Add the components to the JFrame
        frame.getContentPane().add(BorderLayout.NORTH, label);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
    }
// **************************************************************************************************************************************************************************************************
    public void addPackage() {
       
        
         noofpk = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter the number of Package:"));
        int size = (noofpk);

         Destination = JOptionPane.showInputDialog(frame, "Enter the Destination:");



        for (int i = 0; i < size; i++) {
             packageName = JOptionPane.showInputDialog(frame, "Enter the name of Package " + (i + 1) + ":");
            packages.add(packageName);
            //  int id =  
            // int pkid=JOptionPane.showMessageDialog(frame+uuid);
            
            int packageWeight = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter the Weight of the Package:"));
             cost=50*packageWeight;
            if (packageWeight<50) {
                
                JOptionPane.showMessageDialog(frame, "Package added successfully!");
                JOptionPane.showMessageDialog(frame, "Your Tracking Id is:-"+id);
                // JOptionPane.showMessageDialog(addPackageButton, id, packageName, i);
            }
            if(packageWeight>50){
                JOptionPane.showMessageDialog(frame, "Sorry!!,Package Weight is Greater then 50 :(");
            }
 
        }

        
    }
// ******************************************************************************************************************************************************************************************
    public void trackPackage() {
        // JOptionPane.showMessageDialog(frame, "This Functionality is Coming Soon....:)");
        JLabel trackingIdLabel = new JLabel("Enter Tracking ID:");
        trackingIdLabel.setBounds(50, 50, 150, 30);
        frame.add(trackingIdLabel);

        // Create a text field for tracking id input
        JTextField trackingIdField = new JTextField();
        trackingIdField.setBounds(200, 50, 150, 30);
        frame.add(trackingIdField);

        // Create a button for tracking package
        JButton trackPackageButton = new JButton("Track Package");
        trackPackageButton.setBounds(100, 100, 200, 30);
        frame.add(trackPackageButton);

        // Add action listener to track package button
        trackPackageButton.addActionListener(e -> {
            // Get the tracking id from the text field
            String trackingId = trackingIdField.getText();

            // Check if the tracking id matches the generated id
            if (trackingId.equals(String.valueOf(id))) {
                // Show an animated screen
                JLabel ins= new JLabel("Total Packages:-"+noofpk);
                JFrame trackingFrame = new JFrame("Package Tracking");
                trackingFrame.setSize(400, 300);
                trackingFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                trackingFrame.setLayout(null);

                JLabel trackingStatusLabel = new JLabel("Your package will be delivered in " + random.nextInt(10) + " hours.");
                trackingStatusLabel.setBounds(50, 50, 300, 30);
                trackingFrame.add(trackingStatusLabel);

                trackingFrame.setVisible(true);
            } else {
                // Show an error message
                JOptionPane.showMessageDialog(frame, "Invalid tracking id.");
            }
        });

        // frame.setVisible(true);
    }


    
// **************************************************************************************************************************************************
    public void listPackages() {
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < packages.size(); i++) {
            message.append("Package ").append(i + 1).append(": ").append(packages.get(i)).append("\n");
        }
        JOptionPane.showMessageDialog(frame, message.toString());
    }
// *********************************************************************************************************************************************
    public void viewInvoice() {
        JFrame frame = new JFrame("View Invoice");
    
        int invoice_id = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter an Tracking ID:"));

        // JTextField idField = new JTextField(10);
        JButton viewButton = new JButton("View Invoice");
    
        JPanel panel = new JPanel();
        // panel.add(invoice_id);
        // panel.add(idField);
        panel.add(viewButton);
    
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    
        viewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // String inputString = JOptionPane.showInputDialog(null, "Enter your name:");
               
                if (id == invoice_id) {
                    JOptionPane.showMessageDialog(frame, "Thanks...\n\n" +
                        "ID:- " + id + "\n" +
                        "Package:- " + packageName + "\n" +
                        "Destination:- " + Destination + "\n" +
                        "Weight:- " + packageWeight + "\n" +
                        "Total Cost:- " + cost + "\n\n" +
                        "Thanks for Choosing Our Service :)");
                } else {
                    JOptionPane.showMessageDialog(frame, "Enter the Valid Package ID...");
                }
            }
        });
    }
    // ******************************************************************************************************************************
    public void checkLocations(){
        String[] loc={"Jalandhar","Phagwara","Ludhiana","Amritsar"};
        JList<String> locJList= new JList<>(loc);

     
        
    }

    

    public static void main(String[] args) {
        new GUI_Project();
        
    }
}


// why working if both has labels AWT and Swing //their Difference
// button then how it is calling which interface it is calling  
// ****************************************************************************************************************


            
