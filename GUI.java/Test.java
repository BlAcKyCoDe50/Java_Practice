import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Test extends JFrame {
    private ArrayList<String> packages;
    private Random random;
    private JLabel statusLabel;

    public Test() {
        packages = new ArrayList<String>();
        random = new Random();

        setTitle("Shipment Tracking System");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel label1 = new JLabel("Enter the number of packages:");
        panel.add(label1);

        JTextField textField1 = new JTextField();
        panel.add(textField1);

        JButton button1 = new JButton("Create Packages");
        panel.add(button1);

        JLabel label2 = new JLabel("Track Package:");
        panel.add(label2);

        JTextField textField2 = new JTextField();
        panel.add(textField2);

        JButton button2 = new JButton("Track");
        panel.add(button2);

        statusLabel = new JLabel(" ");
        panel.add(statusLabel);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int size = Integer.parseInt(textField1.getText());
                for (int i = 0; i < size; i++) {
                    String packageName = JOptionPane.showInputDialog(panel, "Enter the name of Package " + (i + 1) + ":");
                    packages.add(packageName);
                }
                JOptionPane.showMessageDialog(panel, "Packages created successfully!");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String trackingId = textField2.getText();
                if (trackingId.equals("")) {
                    statusLabel.setText("Please enter a tracking ID");
                } else {
                    int id = random.nextInt(2000);
                    if (trackingId.equals(Integer.toString(id))) {
                        statusLabel.setText("Tracking information: Your package will be delivered in " + random.nextInt(10) + " hours.");
                    } else {
                        statusLabel.setText("Invalid tracking ID");
                    }
                }
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test();
    }
}
