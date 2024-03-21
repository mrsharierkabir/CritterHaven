import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class hostel extends JFrame implements ActionListener {
    private ImageIcon image1, lo;
    private JLabel logo, l1, l2, l3, l4, lo1;
    private JTextField t1, t2, t3, t4;
    private JRadioButton rb1, rb2, rb3;
    private JButton bs, b1, b2, b3, b4, back;

    public hostel() {
        image1 = new ImageIcon("image/hostel.png");
        logo = new JLabel(image1);
        logo.setBounds(0, 0, 1366, 768);

        lo = new ImageIcon("image/lo.png");
        lo1 = new JLabel(lo);
        setIconImage(lo.getImage());

        back = new JButton("ᐊ");
        back.setBounds(20, 10, 50, 35);
        back.addActionListener(this);

        l1 = new JLabel("Name: ");
        l1.setBounds(100, 320, 270, 25);

        t1 = new JTextField("");
        t1.setBounds(100, 350, 270, 25);
        t1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        t1.setBackground(new Color(0, 0, 0, 0));

        l2 = new JLabel("Number: ");
        l2.setBounds(100, 380, 270, 25);

        t2 = new JTextField("");
        t2.setBounds(100, 410, 270, 25);
        t2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        t2.setBackground(new Color(0, 0, 0, 0));

        l3 = new JLabel("Branches: ");
        l3.setBounds(100, 440, 270, 25);

        rb1 = new JRadioButton("Uttara");
        rb1.setBounds(160, 440, 70, 25);

        rb2 = new JRadioButton("Mirpur");
        rb2.setBounds(230, 440, 75, 25);

        rb3 = new JRadioButton("Mohammodpur");
        rb3.setBounds(300, 440, 130, 25);

        t3 = new JTextField("Address : ");
        t3.setBounds(100, 470, 300, 60);
        t3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        t3.setBackground(new Color(0, 0, 0, 0));

        bs = new JButton("Save");
        bs.setBounds(175, 550, 150, 40);
        bs.addActionListener(this);

        b1 = new JButton("7 Days | 6.99 $ ");
        b1.setBounds(100, 600, 150, 40);
        b1.addActionListener(this);

        b2 = new JButton("15 Days | 12.99 $ ");
        b2.setBounds(250, 600, 150, 40);
        b2.addActionListener(this);

        b3 = new JButton("30 Days | 25.99 $ ");
        b3.setBounds(100, 650, 150, 40);
        b3.addActionListener(this);

        b4 = new JButton("60 Days | 55.99 $ ");
        b4.setBounds(250, 650, 150, 40);
        b4.addActionListener(this);

        l4 = new JLabel("Description : ");
        l4.setFont(new Font("Arial", Font.PLAIN, 16));
        l4.setBounds(850, 50, 300, 50);

        t4 = new JTextField("");
        t4.setBounds(850, 90, 400, 70);
        t4.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        t4.setBackground(new Color(0, 0, 0, 0));

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rb1);
        buttonGroup.add(rb2);
        buttonGroup.add(rb3);

        add(back);
        add(lo1);
        add(bs);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(rb1);
        add(rb2);
        add(rb3);
        add(t1);
        add(l1);
        add(t2);
        add(l2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(logo);

        setLayout(null);
        setSize(1366, 768);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bs) {
            String name = t1.getText();
            String no = t2.getText();
            String add = t3.getText();
            String des = t4.getText();
            String bg = "";

            if (rb1.isSelected()) {
                bg = rb1.getText();
            } else if (rb2.isSelected()) {
                bg = rb2.getText();
            } else if (rb3.isSelected()) {
                bg = rb3.getText();
            }

            if (name.isEmpty() || no.isEmpty() || add.isEmpty() || bg.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter Mandatory information.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Payment Complete. Thank you for choosing us!");

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("hostel.txt", true))) {
                    writer.write("Name: " + name + "\n");
                    writer.write("Number: " + no + "\n");
                    writer.write("Address: " + add + "\n");
                    writer.write("Branch: " + bg + "\n");
                    writer.write("Description: " + des + "\n");
                    writer.write("-----------------------------------------\n");
                    writer.flush();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");

                new payment();
                setVisible(false);
            }
        } else if (e.getSource() == back) {
            setVisible(false);
            new image3();
        }
    }

    public static void main(String[] args) {
        new hostel();
    }
}
