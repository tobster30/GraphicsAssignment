import java.awt.Color;
import javax.swing.JFrame;

public class GraphicMain {
	
	public static void main(String[] args)
	   {
		  JFrame frame = new JFrame("Graphics Assignment");
		  
		  GraphicPanel panel = new GraphicPanel();
		  GraphicMenu menu = new GraphicMenu(panel);

		  frame.setContentPane(panel);	
		  
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setSize(800,600);	       
		  frame.setVisible(true);
			    
		}  
 }
