import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;


public class payment extends JFrame implements ActionListener {
    private JButton b1 , back ;
    private JLabel l1, l2, l3, l4, l5 , lo1;
    private ImageIcon logo , lo;
    private JTextField t1, t2, t3;
    private JPasswordField pf1;

    public payment() {
    	super ("PAYMENT Gateway");
        logo = new ImageIcon("image/payment.png");
        l1 = new JLabel(logo);
        l1.setBounds(0, 0, 1366, 768);
        
        lo = new ImageIcon("image/lo.png");
        lo1 = new JLabel(lo);
        setIconImage(lo.getImage());
        
        back = new JButton("ᐊ");
        back.setBounds(20, 10, 50, 35);
        back.addActionListener(this);

        l2 = new JLabel("Bank A/C No:");
        l2.setFont(new Font("Arial", Font.PLAIN, 15));
        l2.setBounds(920, 300, 150, 30);

        t1 = new JTextField("");
        t1.setBounds(920, 330, 150, 30);
        t1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        t1.setBackground(new Color(0, 0, 0, 0));

        l3 = new JLabel("Amount:");
        l3.setFont(new Font("Arial", Font.PLAIN, 15));
        l3.setBounds(1130, 300, 80, 30);

        t2 = new JTextField("");
        t2.setBounds(1130, 330, 200, 30);
        t2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        t2.setBackground(new Color(0, 0, 0, 0));

        l4 = new JLabel("PIN:");
        l4.setFont(new Font("Arial", Font.PLAIN, 15));
        l4.setBounds(920, 380, 80, 30);

        pf1 = new JPasswordField("");
        pf1.setBounds(920, 408, 150, 30);
        pf1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pf1.setBackground(new Color(0, 0, 0, 0));

        l5 = new JLabel("OTP:");
        l5.setFont(new Font("Arial", Font.PLAIN, 15));
        l5.setBounds(1130, 380, 80, 30);

        t3 = new JTextField("");
        t3.setBounds(1130, 408, 200, 30);
        t3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        t3.setBackground(new Color(0, 0, 0, 0));

        b1 = new JButton("PAY");
        b1.setBounds(980, 460, 270, 40);
        Font font = b1.getFont();
        b1.setFont(font.deriveFont(Font.BOLD));

        b1.setBackground(Color.BLUE);
        b1.addActionListener(this);

        Cursor cursor = b1.getCursor();
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        
        
        add(back);
        add(pf1);
        add(t1);
        add(t2);
        add(l2);
        add(l3);
        add(l4);
        add(b1);
        add(l5);
        add(t3);
        add(l1);

        setLayout(null);
        setSize(1366, 768);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
        String bankACno = t1.getText();
        String amount = t2.getText();
        String pin = pf1.getText();
        String otp = t3.getText();

        if (bankACno.isEmpty() || amount.isEmpty() || pin.isEmpty() || otp.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all the information correctly.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Perform payment logic here
            JOptionPane.showMessageDialog(this, "Payment Complete. Thank you for choosing us!");
        }
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("payment.txt", true))) {
            writer.write("AC no: " + bankACno + "\n");
            writer.write("Amount: " + amount + "\n");
            writer.write("-------------------------\n");
            writer.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        t1.setText("");
        t2.setText("");
      
    }
    else if (e.getSource() == back){
        
        setVisible(false);
        new hostel();
    }
        
}

    public static void main(String[] args) {
        new payment();
    }
}

