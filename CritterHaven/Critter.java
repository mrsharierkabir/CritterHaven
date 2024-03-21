import javax.swing.*;
import java.awt.*;

public class Critter extends JFrame {
		
		
		
		public Critter() {
			super ("Walcome To CRITTER HAVEN");
			JPanel penal = new JPanel();
			panel.setLayout(new GridLayout(2,1));
			
			JPanel panel1 = new JPanel();
			{
				new frame1();
			}
			JPanel panel2 = new JPanel();
			{
				new frame2();
			}
						
			
			JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        setSize(1366, 768);
        setVisible(true);
        
        
        public static void main(String[] args) {
        new Project();
    }
}
