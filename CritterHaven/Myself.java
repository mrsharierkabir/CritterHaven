import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myself extends JFrame implements ActionListener {
    private JButton fb, ig, gh, in, back;
    private JLabel l1, lo1;
    private ImageIcon i1, lo, i2, i3, i4, i5;

    public Myself() {
        super("M R SHARIER KABIR");
        i1 = new ImageIcon("image/my.png");
        l1 = new JLabel(i1);
        l1.setBounds(0, 0, 1366, 768);

        lo = new ImageIcon("image/lo.png");
        lo1 = new JLabel(lo);
        setIconImage(lo.getImage());

        back = new JButton("ᐊ");
        back.setBounds(20, 10, 50, 35);
        back.addActionListener(this);

        i2 = new ImageIcon("image/2.png");
        fb = new JButton(i2);
        fb.setBounds(850, 600, 40, 40);
        fb.addActionListener(this);

        i3 = new ImageIcon("image/3.png");
        ig = new JButton(i3);
        ig.setBounds(920, 600, 40, 40);
        ig.addActionListener(this);

        i4 = new ImageIcon("image/4.png");
        in = new JButton(i4);
        in.setBounds(990, 600, 40, 40);
        in.addActionListener(this);

        i5 = new ImageIcon("image/5.png");
        gh = new JButton(i5);
        gh.setBounds(1060, 600, 40, 40);
        gh.addActionListener(this);

        add(fb);
        add(ig);
        add(in);
        add(gh);
        add(lo1);
        add(back);
        add(l1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1366, 768);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fb) {
            openWebPage("https://www.facebook.com/m.r.sharier.kabir0?mibextid=LQQJ4d");
        }
        // Add code for other button actions here
        else if (e.getSource() == ig) {
            openWebPage("https://www.instagram.com/m.r.sharier.kabir");
        }
        else if (e.getSource() == in) {
            openWebPage("https://www.linkedin.com/in/m-r-sharier-kabir/");
        }
        else if (e.getSource() == gh) {
            openWebPage("https://github.com/mrsharierkabir");
        }
        else if (e.getSource() == back){
            setVisible(false);
            new image2();
        }

    }

    public static void main(String[] args) {
        new Myself();
    }

    private void openWebPage(String url) {
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
