import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class GraphicConsole extends JTextField implements ActionListener {
	private GraphicPanel panel;

	public GraphicConsole(GraphicPanel panel) 
	{
		this.panel = panel;
	}
	
	// TODO:	Use the debugger to see what ActionEvent e contains!
	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.getText().contains("penup"))
			panel.setPenUp(true);
		else if(this.getText().contains("pendown"))
			panel.setPenUp(false);
		else if(this.getText().contains("forward"))
			panel.forward();
		else
			JOptionPane.showMessageDialog(this, "Invalid command, try again");

		this.setText("");
		panel.repaint();
	}
}
