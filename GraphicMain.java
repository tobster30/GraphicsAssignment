import java.awt.Color;
import javax.swing.JFrame;

public class GraphicMain {
	
	public static void main(String[] args)
	   {
		//create window
		  JFrame frame = new JFrame("Graphics Assignment");
		  
		  GraphicPanel panel = new GraphicPanel(frame);
		  frame.setContentPane(panel);
		  /*panel.drawLine(Color.RED, 200, 200, 400, 400);
		  panel.forward(270);*/

		  GraphicMenu menu = new GraphicMenu(frame);		  

		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setSize(800,600);	       
		  frame.setVisible(true);
			    
		}  
 }