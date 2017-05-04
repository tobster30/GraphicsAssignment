import java.awt.Color;
import javax.swing.JFrame;

public class GraphicMain {
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Graphics Assignment");
		
		GraphicPanel panel = new GraphicPanel();
		frame.setJMenuBar(new GraphicMenu(panel));
		panel.add(new GraphicConsole(panel));

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}  
 }
