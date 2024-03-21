import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class Register extends JFrame implements ActionListener {

    // GUI components
    private JLabel logo1, l1, l2 , l3 , l4, lo1;
    private ImageIcon logo , mail, pass , lo;
    private JButton b1, b2, showPasswordButton, back ;
    private JTextField t1,t2;
    private JPasswordField pf1, pf2;


    public Register() {  
    	setTitle("Registration Page");
    	logo = new ImageIcon("image/Register.png");
        logo1 = new JLabel(logo);
        logo1.setBounds(0, 0, 500, 500);
        
        lo = new ImageIcon("image/lo.png");
        lo1 = new JLabel(lo);
        setIconImage(lo.getImage());
        
        back = new JButton(" ᐊ ");
        back.setBounds(20,10,50,35);
        back.addActionListener(this);
        
        l1 = new JLabel("Name :");
        l1.setBounds(100,160,150,30);
        
        t1 = new JTextField("");
        t1.setBounds(100,190,270,25);
        t1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        t1.setBackground(new Color(0, 0, 0, 0));
        
        
        l2 = new JLabel("Email :");
        l2.setBounds(100,210,150,30);
        
        t2 = new JTextField("");
        t2.setBounds(100,240,270,25);
        t2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        t2.setBackground(new Color(0, 0, 0, 0));
        
        l3 = new JLabel("Passwords :");
        l3.setBounds(100,275,150,30);
        
        pf1 = new JPasswordField("");
        pf1.setBounds(100,300,270,25);
        pf1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pf1.setBackground(new Color(0, 0, 0, 0));
        
        l4 = new JLabel("Confirm Password :");
        l4.setBounds(100,330,150,30);
        
        pf2 = new JPasswordField("");
        pf2.setBounds(100,360,270,25);
        pf2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pf2.setBackground(new Color(0, 0, 0, 0));
        
        
        
        b1 = new JButton("CONFIRM");
        Font font = b1.getFont();
        b1.setFont(font.deriveFont(Font.BOLD));
        b1.setOpaque(false);
        b1.setBorderPainted(false);
        b1.setContentAreaFilled(false);
        b1.setBounds(130,400,200,30);
        
        Cursor cursor = b1.getCursor();
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
      
        setSize(1366, 768);
        
        add(back);
        add(b1);
        add(l1);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(t2);
        add(l2);
        add(pf1);
        add(pf2);
     //   add(showPasswordButton);
     add(logo1);


        // Set the action listener for the button
        b1.addActionListener(this);

        // Set the window to be visible
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back){
            
            setVisible(false);
            new image1();
        }
        
        // Handle the button click event
       else if (e.getSource() == b1) {
            String name = t1.getText();
            String email = t2.getText();
            String password = new String(pf1.getPassword());
            String password1 = new String(pf2.getPassword());
            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || password1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter  Information Correctly", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
            
            
            if (String.valueOf(pf1.getPassword()).equals(String.valueOf(pf2.getPassword()))) {
                JOptionPane.showMessageDialog(this, "Registration successful.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(Register.this,"Passwords do not match!");
                }
            	
            	
            	try (BufferedWriter writer = new BufferedWriter(new FileWriter("Data.txt", true))) {
                      writer.write("Name: " + name + "\n");
                      writer.write("Email: " + email + "\n");
                      writer.write("Password: " + password + "\n");
                      writer.write("-------------------------\n");
            writer.flush();
            
            t1.setText("");
            t2.setText("");
            pf1.setText("");
        } catch (IOException ex) {
         
        }

            
            
        }
        
        
        setVisible(true);
        new image1();
        
        
    }
    
    public static void main(String[] args) {
        new Register();
    }
}
