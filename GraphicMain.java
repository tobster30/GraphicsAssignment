import java.awt.Color;
import javax.swing.JFrame;

public class GraphicMain {
	
	public static void main(String[] args)
	{
		GraphicPanel panel = new GraphicPanel();
		frame.setJMenuBar(new GraphicMenu(panel));
		frame.add(new GraphicMenu(panel));

		JFrame frame = new JFrame("Graphics Assignment");	
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}  
 }
