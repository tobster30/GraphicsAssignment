import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GraphicConsole extends JPanel {
	
	private JTextField console;
	
		public GraphicConsole (JFrame frame) 
		{
			setLayout (new BorderLayout());
			console.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent arg0) 
				    {
							if(console.getText().contains("penup")) {
								panel.penUp();
								//panel.repaint();
							}
				    		
				    		else if (console.getText().contains("pendown")) {
								//penDown();
								//repaint();
				    		}
				    		
				    		else if (console.getText().contains("turnleft")) {
						  	  JOptionPane.showMessageDialog(console, "turnleft works");
				    		}
				    		
				    		else if (console.getText().contains("turnright")) {
						  	   JOptionPane.showMessageDialog(console, "turnright works");
				    		}
				    		
				    		else if (console.getText().startsWith("forward")) {
					
				    			//forward(direction);
				    			//repaint();
					    	}
				    		
				    		else if (console.getText().contains("backward")) {
						  	   JOptionPane.showMessageDialog(console, "backward works");
					    	}
				    		
				    		else if (console.getText().contains("black")) {
						  	   JOptionPane.showMessageDialog(console, "black works");
					    	}
				    		
				    		else if (console.getText().contains("green")) {
						  	   JOptionPane.showMessageDialog(console, "green works");
					    	}
				    		
				    		else if (console.getText().contains("red")) {
						  	    JOptionPane.showMessageDialog(console, "red works");
					    	}
				    		
				    		else if (console.getText().contains("reset")) {
				    			JOptionPane.showMessageDialog(console, "reset works");
					    	}
				    		
				    		else {
						  	    JOptionPane.showMessageDialog(console, "Invalid command, try again");
					    	}
				    }
			});
			
			frame.add(console, BorderLayout.NORTH);
		}
	
	
	

}
