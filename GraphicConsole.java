import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GraphicConsole extends JTextField implements ActionListener {
	GraphicPanel panel;

	public GraphicConsole(GraphicPanel panel) 
	{
		setLayout (new BorderLayout());
		this.panel = panel;

		// TODO:	All of this goes in the actionPerformed override!
		// PROTIP:	Use the debugger to see what ActionEvent e contains!

		// 	if(this.getText().contains("penup")) {
		// 		panel.penUp();
		// 	}
			
		// 	else if (this.getText().contains("pendown")) {
		// 		penDown();
		// 	}
			
		// 	else if (this.getText().contains("turnleft")) {
		// 		JOptionPane.showMessageDialog(this, "turnleft works");
		// 	}
			
		// 	else if (this.getText().contains("turnright")) {
		// 		JOptionPane.showMessageDialog(this, "turnright works");
		// 	}
			
		// 	else if (this.getText().startsWith("forward")) {
		// 		//forward(direction);
		// 		//repaint();
		// 	}
			
		// 	else if (this.getText().contains("backward")) {
		// 		JOptionPane.showMessageDialog(this, "backward works");
		// 	}
			
		// 	else if (this.getText().contains("black")) {
		// 		JOptionPane.showMessageDialog(this, "black works");
		// 	}
			
		// 	else if (this.getText().contains("green")) {
		// 		JOptionPane.showMessageDialog(this, "green works");
		// 	}
			
		// 	else if (this.getText().contains("red")) {
		// 		JOptionPane.showMessageDialog(this, "red works");
		// 	}
			
		// 	else if (this.getText().contains("reset")) {
		// 		JOptionPane.showMessageDialog(this, "reset works");
		// 	}
			
		// 	else {
		// 		JOptionPane.showMessageDialog(this, "Invalid command, try again");
		// 	}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
