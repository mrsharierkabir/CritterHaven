import javax.swing.*;
import java.awt.*;

public class test extends JFrame {
    public test() {
        super("Example");

        // Create a panel to hold the images
        JPanel imagePanel = new JPanel();
        imagePanel.setLayout(new GridLayout(5, 5));

        // Load the images from files and create ImageIcons
        ImageIcon image1 = new ImageIcon("image1.jpg");
        ImageIcon image2 = new ImageIcon("image2.jpg");
        ImageIcon image3 = new ImageIcon("image3.jpg");
        ImageIcon image4 = new ImageIcon("image4.jpg");
        ImageIcon image5 = new ImageIcon("image5.jpg");

        // Create labels with the images and add them to the panel
        imagePanel.add(new JLabel(image1));
        imagePanel.add(new JLabel(image2));
        imagePanel.add(new JLabel(image3));
        imagePanel.add(new JLabel(image4));
        imagePanel.add(new JLabel(image5));

        // Create a panel to hold the text field
        JPanel textFieldPanel = new JPanel();
        textFieldPanel.setLayout(new FlowLayout());
        JTextField textField = new JTextField(20);
        textFieldPanel.add(new JLabel("Enter text: "));
        textFieldPanel.add(textField);

        // Create a scroll pane and add the image panel and text field panel to it
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.getViewport().add(imagePanel, BorderLayout.CENTER);
        scrollPane.getViewport().add(textFieldPanel, BorderLayout.SOUTH);

        // Add the scroll pane to the frame
        getContentPane().add(scrollPane);

        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new test();
    }
}
