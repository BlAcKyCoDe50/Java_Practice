import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class examples implements ActionListener {
    examples(){
    
    //Frame is created
    JFrame jf= new JFrame("Form Example");
    jf.getContentPane().setBackground(Color.GRAY);

    //For name
    JLabel label = new JLabel("Name");
    label.setForeground(Color.white); 
    label.setBounds(20, 30, 90, 40);
    JTextField t_field = new JTextField(32);
    t_field.setBounds(90, 40, 350, 30);

    //For Mobile No
    JLabel label1 = new JLabel("Mobile No"); 
    label1.setForeground(Color.white); 
    label1.setBounds(20, 90, 90, 40);
    JTextField t_number = new JTextField(32);
    t_number.setBounds(90, 100, 350, 30);

    //For Radio Button
    JLabel radio= new JLabel("Gender");
    radio.setForeground(Color.white); 
    radio.setBounds(20, 140, 90, 40);
    JRadioButton b1 = new JRadioButton("Male");
    b1.setBounds(90, 150, 70, 30);
    b1.setBackground(Color.GRAY);
    JRadioButton b2 = new JRadioButton("Female");
    b2.setBounds(180, 150, 70, 30);
    b2.setBackground(Color.GRAY);

    //Group Radio Button together
    ButtonGroup G = new ButtonGroup();
    G.add(b1);
    G.add(b2);

    //For Address
    JLabel address = new JLabel("Address");
    address.setForeground(Color.white); 
    address.setBounds(20, 190, 350, 50);
    JTextArea ad = new JTextArea();
    ad.setBounds(90, 200, 350, 80);

    //Term & Condition checkbox
    JCheckBox c_box = new JCheckBox("I Accept the term & Condition");
    c_box.setBounds(150, 300, 350, 30);
    c_box.setBackground(Color.GRAY);
    c_box.setForeground(Color.white);

    //Submit button
    JButton btn = new JButton("Submit");
    btn.setBounds(200, 350, 90, 30);
    btn.setBackground(Color.orange);
    btn.setForeground(Color.BLACK);

    //Pannel for Result Display
    JPanel jp= new JPanel();
    jp.setBounds(520, 40, 200, 240);
    jp.setBackground(Color.white);

    //Adding all item to Frame
    jf.add(label);
    jf.add(t_field);
    jf.add(label1);
    jf.add(t_number);
    jf.add(radio);
    jf.add(b1);
    jf.add(b2);
    jf.add(address);
    jf.add(ad);
    jf.add(c_box);
    jf.add(btn);
    jf.add(jp);
    jf.setLayout(null);
    jf.setSize(800, 450);
    jf.setVisible(true);

        

    }
    public static void main(String[] args) {
        examples example =new examples();
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
}
