import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pharmacy extends JFrame implements ActionListener {
JPanel panel2;

JButton b1,b2,b3,b4,b5;

JTextField t1, t2;
JLabel label1, label2,label3,label4,label5;
ImageIcon bg1,bg2,bg3,bg4,bg5;


public Pharmacy() {
    this.setTitle("Medicine shop");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(750, 600);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    
    panel2 = new JPanel();
    panel2.setLayout(null);
    panel2.setBackground(Color.DARK_GRAY);
    panel2.setBounds(0, 0, 750, 600);
    panel2.setVisible(true);
    this.add(panel2);

    bg1 = new ImageIcon("Elements/1.jpg");
    label1 = new JLabel(bg1);
    label1.setVisible(true);
    label1.setBounds(0, 0, 450, 600);
    label1.setLayout(null);
    panel2.add(label1);


    label2 = new JLabel("Hii, Pet Lovers");
    label2.setVisible(true);
    label2.setBounds(500, 30, 200, 100);
    label2.setFont(new Font( "Calbri",Font.BOLD, 25));
    label2.setForeground(Color.WHITE);
    label2.setLayout(null);
    panel2.add(label2);
    
    bg1 = new ImageIcon("Elements/download.jpg");
    b1 = new JButton(bg1);
    b1.setBounds(490,150,200,100);
    b1.setFont(new Font("Arial", Font.BOLD, 26));
    b1.setBackground(Color.BLUE);
    b1.setForeground(Color.WHITE);
    b1.setVisible(true);
    panel2.add(b1);


    bg2 = new ImageIcon("Elements/download1.jpg");
    b2 = new JButton(bg2);
    b2.setBounds(490,270,200,100);
    b2.setFont(new Font("Arial", Font.BOLD, 26));
    b2.setBackground(Color.BLUE);
    b2.setForeground(Color.WHITE);
    b2.setVisible(true);
    panel2.add(b2);


    bg3 = new ImageIcon("Elements/download3.jpg");
    b3 = new JButton(bg3);
    b3.setBounds(490,400,200,100);
    b3.setFont(new Font("Arial", Font.BOLD, 26));
    b3.setBackground(Color.BLUE);
    b3.setForeground(Color.WHITE);
    b3.setVisible(true);
    panel2.add(b3);


   

    

    bg5 = new ImageIcon("Elements/images.jpg");
    b5 = new JButton(bg5);
    b5.setBounds(520,520,150,40);
    b5.setFont(new Font("Arial", Font.BOLD, 10));
    b5.setBackground(Color.BLUE);
    b5.setForeground(Color.WHITE);
    b5.setVisible(true);
    panel2.add(b5);
   
    b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);







   
   




    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
         pFrame n = new pFrame();
         this.setVisible(false);
         n.setVisible(true);
        }
        else if(ae.getSource()==b2)
        {
          pFrame1 k = new pFrame1();
            this.setVisible(false);
            k.setVisible(true);
        }
        else if(ae.getSource()==b3){
         pFrame3 n = new pFrame3();
          n.setVisible(true);
          this.setVisible(false);

        }
          
         }
        




}

