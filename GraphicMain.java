import java.awt.Color;
import javax.swing.JFrame;

public class GraphicMain {
	
	public static void main(String[] args)
	   {
		  JFrame frame = new JFrame("Graphics Assignment");
		  
		  GraphicPanel panel = new GraphicPanel();
		  frame.setContentPane(panel);

		  GraphicMenu menu = new GraphicMenu(frame);	
		  
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setSize(800,600);	       
		  frame.setVisible(true);
			    
		}  
 }
