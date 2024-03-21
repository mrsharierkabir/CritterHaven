import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


	public class image2 extends JFrame implements ActionListener {
		private JLabel logo1 , lo1;
		private JButton b3, b4 , back;
		private ImageIcon  logo , lo ;
		
		
		
		
		public image2(){
			logo = new ImageIcon("image/Who We Are.png");
			logo1 = new JLabel(logo);
			logo1.setBounds(0, 0, 1366,768);
			
			lo = new ImageIcon("image/lo.png");
        	lo1 = new JLabel(lo);
  			setIconImage(lo.getImage());
        
        	back = new JButton("ᐊ");
        	back.setBounds(20,10,50,35);
        	back.addActionListener(this);

			
			b3 = new JButton(" My Self ");
       		b3.setBounds(500,500,150,40);
        	b3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        	b3.setForeground(Color.WHITE);
        	b3.setBackground(new Color(0, 0, 0, 0));
        	b3.addActionListener(this);
        
			
			b4 = new JButton("What We Do");
        	b4.setBounds(700, 500, 150,40);
        	b4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        	b4.setForeground(Color.WHITE);
        	b4.addActionListener(this);

        
			
			add(b3);
			add(back);
        	add(b4);
			add(logo1);
			
			setLayout(null);
			setSize(1366,768);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//	new image1();
		}
		
		
		 public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b4) {
      		



        setVisible(false);
        new image3();
    }else if(e.getSource() == b3) {
    	setVisible(false);
    	new Myself();
    }
    else if (e.getSource() == back){
    setVisible(false);
    new image1();
    }
    }

			
		
	public static void main (String []args){
		new image2();
	}
	}