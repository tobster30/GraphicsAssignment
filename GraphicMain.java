import java.awt.Color;
import javax.swing.JFrame;

public class GraphicMain {
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Graphics Assignment");	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);	       
		
		GraphicPanel panel = new GraphicPanel();
		frame.setJMenuBar(new GraphicMenu(panel));
		frame.add(new GraphicMenu(panel));

		frame.setContentPane(panel);
		frame.setVisible(true);
	}  
 }
