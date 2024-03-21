import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.IOException;
import java.io.FileReader;
import java.io.*;
import java.util.Scanner;
import java.nio.file.*;
import java.io.BufferedReader;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



	public class image1 extends JFrame  implements ActionListener {
    private JLabel logo1,logo2,logo3, l1, l2 , l3 , lo1 , l4; 
    private ImageIcon logo , mail, pass , lo;
    private JButton b1, b2, showPasswordButton , b3 ;
    private JTextField t1;
    private JPasswordField pf1;
    
    
    // Constructor 
    public image1(){
        super("Welcome to CritterHaven");
        logo = new ImageIcon("image/Homee.png");
        logo1 = new JLabel(logo);
        logo1.setBounds(0, 0, 1366, 768);
        
        lo = new ImageIcon("image/lo.png");
        lo1 = new JLabel(lo);
        setIconImage(lo.getImage());
        
        l4  = new JLabel ("<html><u>Welcome</u></html>");
        l4.setFont(new Font ("AkayaKanadaka", Font.PLAIN, 35));
        l4.setBounds(1080,200,220,40);
        
        
        getRootPane().setDefaultButton(b1);
        b1 = new JButton("Log in");
        b1.setFont(new Font ("Arial", Font.PLAIN, 16));
        b1.setBackground(Color.BLACK);
        b1.setBounds(1020, 400 , 290, 40);
        b1.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    b1.doClick();
                    }
              }
           });
        b1.addActionListener(this);
        getRootPane().setDefaultButton(b1);
        
        
        
       // mail = new ImageIcon("image/2.png");
        logo2 = new JLabel("");
        logo2.setFont(new Font ("Arial", Font.PLAIN, 50));
        logo2.setBounds(150,490,35,30);
        
        //pass = new ImageIcon("");
        logo3 = new JLabel("");
        logo3.setFont(new Font ("Arial", Font.PLAIN, 25));
        logo3.setBounds(150,555,35,30);
        
        
        b2 = new JButton("Sign up");
        Font font = b2.getFont();
        b2.setFont(font.deriveFont(Font.BOLD));
        b2.setOpaque(false);
        b2.setBorderPainted(false);
        b2.setContentAreaFilled(false);
        b2.setBounds(1160, 640, 120, 30);
        b2.addActionListener(this);
        
        l1 = new JLabel("Gmail ");
        l1.setFont(new Font ("Arial", Font.PLAIN, 16));
        l1.setBounds(1020, 250 , 100 , 30);
        
        
        t1 = new JTextField("");
        t1.setFont(new Font ("Arial", Font.PLAIN, 16));
        t1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        t1.setBackground(new Color(0, 0, 0, 0));
        t1.setBounds(1020, 280, 290 , 30);
        
        
        l2 = new JLabel("Password");
        l2.setFont(new Font ("Arial", Font.PLAIN, 16));
        l2.setBounds(1020, 310, 290, 30);
        
        
        pf1 = new JPasswordField();
        pf1.setBounds(1020, 340, 260, 30);
        pf1.setFont(new Font ("Arial", Font.BOLD, 16));
        pf1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        pf1.setBackground(new Color(0, 0, 0, 0));
        showPasswordButton = new JButton("☃");
        showPasswordButton.setBounds(1280, 340,30,30);
        showPasswordButton.setFont(new Font ("Arial", Font.BOLD, 16));
        showPasswordButton.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        showPasswordButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (pf1.getEchoChar() =='\u2022'){
                    pf1.setEchoChar((char)0);
                }else{
                    pf1.setEchoChar('\u2022');
                }
            }
        });
        
                
        
        l3 = new JLabel("New Critter Haven ?");
        l3.setBounds(1060,640,290,30);
        
        
        b3  = new JButton("Forget Password");
        b3.setFont(new Font ("Arial", Font.PLAIN, 10));
        
        b3.setBounds(1210 , 370 , 125 , 20);
        b3.setOpaque(false);
        b3.setBorderPainted(false);
        b3.setContentAreaFilled(false);
        
        add(b3);
        add(l4);
        add(lo1);
        add(b1);
        add(b2);
        add(l1);
        add(t1);
        add(l2);
        add(pf1);
        
        add(showPasswordButton);
        add(l3);
        add(logo2);
        add(logo3);
        add(logo1);
        
        setLayout(null);
        setSize(1366, 768);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
        
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b2) {
     

        setVisible(false);
        new Register();
    }
    
     else if (e.getSource() == b1) {
         String username = t1.getText();
         String password = pf1.getText();
         String fileData = " ";
         boolean validCredentials = false;
          try {
              
           
            File file = new File("Data.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                fileData += scanner.nextLine() + "\n";
            }

            scanner.close();
            if (username.isEmpty() || password.isEmpty()){
                JOptionPane.showMessageDialog(this, "Please enter a username");
        return;
        }
                
            if (fileData.contains("Email: " + username) && fileData.contains("Password: " + password)) {
                
                validCredentials = true;
			
				new image2();
				this.setVisible(false);
				}
				 
				else  {
               
				
				
				 JOptionPane.showMessageDialog(this, "invalid User name or password!");	
				 }
			}
				 catch (IOException ex) {
                ex.printStackTrace();
            }
        

    }}
    


    
    public static void main (String []args) {
        new image1();
    }
}
