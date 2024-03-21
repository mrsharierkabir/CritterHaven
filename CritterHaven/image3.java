import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.IOException;

public class image3 extends JFrame implements ActionListener {
    private JButton b1, b2, b3, b4, back;
    private JLabel l1, lo1, l2, l3, l4, l5;
    private ImageIcon logo, bu1, bu2, bu3, bu4, lo;

    public image3() {
        logo = new ImageIcon("What We Do.jpg");
        l1 = new JLabel(logo);
        l1.setBounds(0, 0, 1366, 768);

        lo = new ImageIcon("image/lo.png");
        lo1 = new JLabel(lo);
        setIconImage(lo.getImage());

        back = new JButton("ᐊ");
        back.setBounds(20, 10, 50, 35);
        back.addActionListener(this);

        bu1 = new ImageIcon("hostel.png");
        b1 = new JButton(bu1);
        b1.setBounds(120, 310, 195, 200);
        b1.addActionListener(this);

        bu2 = new ImageIcon("shop.jpg");
        b2 = new JButton(bu2);
        b2.setBounds(430, 310, 195, 200);
        b2.addActionListener(this);

        bu3 = new ImageIcon("care.png");
        b3 = new JButton(bu3);
        b3.setBounds(740, 310, 195, 200);
        b3.addActionListener(this);
        bu4 = new ImageIcon("medi.png");
        b4 = new JButton(bu4);
        b4.setBounds(1050, 310, 195, 200);

        l2 = new JLabel("Hostel");
        l2.setBounds(190, 515, 180, 30);

        l3 = new JLabel("Pharmacy");
        l3.setBounds(505, 515, 180, 30);

        l4 = new JLabel("Pet Shop");
        l4.setBounds(820, 515, 180, 30);

        l5 = new JLabel("");
        l5.setBounds(1135, 515, 180, 30);

        add(back);
        add(l4);
        add(l5);
        add(l3);
        add(l2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l1);

        setLayout(null);
        setSize(1366, 768);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            new hostel();
            setVisible(false);
        } else if (e.getSource() == b2) {
            new Pharmacy();
            setVisible(false);
        } else if (e.getSource() == b3) {
            new PetShop();
            setVisible(false);
        } else if (e.getSource() == back) {
            new image2();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new image3();
    }
}
