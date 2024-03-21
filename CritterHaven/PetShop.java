import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.IOException;


		public class PetShop extends JFrame implements ActionListener {
			private JButton b1,b2, b3, b4 ;
			private JLabel l1, lo1 , l2, l3 , l4 ,l5;
			private ImageIcon logo , bu1,bu2 , bu3 , bu4 , lo;
			
			
			
			public PetShop() {
				logo = new ImageIcon("image/abc.png");
				l1 = new JLabel(logo);
				l1.setBounds(0,0,1366,768);
				
				lo = new ImageIcon("image/lo.png");
        lo1 = new JLabel(lo);
        setIconImage(lo.getImage());
				
				
				bu1 = new ImageIcon("image/ta1.jpeg");
				b1 = new JButton(bu1);
				b1.setBounds(120,310,195,200);
				b1.addActionListener(this);
				
				bu2 = new  ImageIcon("image/ta2.jpeg");
				b2 = new JButton(bu2);
				b2.setBounds(430,310,195,200);
				b1.addActionListener(this);
				
				bu3 = new ImageIcon("image/ta3.jpeg");
				b3 = new JButton(bu3);
				b3.setBounds(740,310,195,200);
				b3.addActionListener(this);
				
				bu4 = new ImageIcon("image/ta4.jpeg");
				b4 = new JButton(bu4);
				b4.setBounds(1050,310,195,200);
				b4.addActionListener(this);
				
				l2 = new JLabel("10 $" );
				l2.setBounds(190,515,180,30);
				
				l3 = new JLabel("15 $" );
				l3.setBounds(505,515,180,30);
				
				l4 = new JLabel("20 $" );
				l4.setBounds(820,515,180,30);
				
				l5 = new JLabel("25 $" );
				l5.setBounds(1135,515,180,30);
				
				
				
				add(b1);
				add(b2);
				add(b3);
				add(b4);
				add(l5);
				add(l4);
				add(l3);
				add(l2);
				add(l1);
				
				
		setLayout(null);
        setSize(1366, 768);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
      
		new payment();
        setVisible(false);
        
    }
    else if(e.getSource() == b2){
    	new payment();
    	setVisible(false);
    }
    else if (e.getSource() == b3){
    	new payment();
    	setVisible(false);
    }
    else if (e.getSource() == b4){
    	new payment ();
    	setVisible(false);
    }
    }

		    public static void main (String []args) {
        new PetShop();
    }
}

				
				
				