
import javax.swing.*;
import java.awt.*;

public class Project extends JFrame {
   
    	private JLabel l1, l2;
    	private JButton b1,b2;
   	   	private JTextField t1;
		private JPasswordField pf1;
		
	//constructor	
	public Project() {
		
		
		super("Walcome To CRITTER HAVEN");
		
		b1 = new JButton("Log in");
        b1.setBounds(130,520,150,30);
        b2 = new JButton("Sign up");
        b2.setBounds(290,520,150,30);
        l1 = new JLabel("Enter Your Username");
        l1.setBounds(140,450,220,30);
        t1 = new JTextField();
        t1.setBounds(140,480,290,30);
        l2 = new JLabel("Enter Your Password");
        l2.setBounds(140,510,220,30);
        pf1 = new JPasswordField();
        pf1.setBounds(140,540,290,30);

        
   
        // Create a panel to hold the images
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 5));
        
        // Load the images from files and create ImageIcons
        ImageIcon image1 = new ImageIcon("Home.jpg");
        
        ImageIcon image2 = new ImageIcon("Who We Are.jpg");
        ImageIcon image3 = new ImageIcon("What We Do.jpg");
        ImageIcon image4 = new ImageIcon("4.jpg");
        ImageIcon image5 = new ImageIcon("Get in Touch.jpg");
       

        
        // Create labels with the images and add them to the panel
        panel.add(new JLabel(image1));
     
        panel.add(new JLabel(image2));
        panel.add(new JLabel(image3));
        panel.add(new JLabel(image4));
        panel.add(new JLabel(image5));
       
       
       
          // Set the layout manager for the frame
   // setLayout(new BorderLayout());
    
    // Add the buttons and input fields to the top of the frame
 //   JPanel topPanel = new JPanel();
 //  topPanel.setLayout(null);
    add(b1);
    add(b2);
    add(l1);
    add(t1);
    add(l2);
    add(pf1);
   // add( BorderLayout.CENTER);


     //   setLayout();
        setSize(1366, 768);
     setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a scroll pane and add the panel to it
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
        Project example = new Project();
        example.setVisible(true);
    }
}
