import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;


 //Represents the graphics display panel within the turtle program. This panel contains an image which is updated to reflect user commands.
 
@SuppressWarnings("serial")
public class GraphicPanel extends JPanel 
{
	
	
	private int xPos = 0, yPos=0;
	private boolean penUp = true;
	private int direction = 180;
	
	
	//The default BG colour of the image.
	
	private final static Color BACKGROUND_COL = Color.DARK_GRAY;
	
	
	 // The underlying image used for drawing. This is required so any previous drawing activity is persistent on the panel.
	 
	private BufferedImage image;

	/*
	 * Draw a line on the image using the given colour.
	 * 
	 * @param color
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	*/
	
	public void penDown()
	{
		penUp = false;
	}
	
	public void penUp()
	{
		penUp = true;
	}
	
	
	public void turnRight()
	{
		
	}
	
	public void turnLeft()
	{
		
	}
	
	public void forward(int amount)
	{
		if (direction == 180)
		{
			if(penUp == false)
				{
					drawLine(Color.red, xPos, yPos, xPos, yPos + amount );
					yPos = yPos + amount;
				}
			
		else if (direction == 270)
				
				{
			if(penUp == false)
				{
					drawLine(Color.red, xPos, yPos, xPos - amount, yPos );
					xPos = xPos - amount;
				}
			}
		}
	}
	
	public void backward(int amount)
	{
		
	}
	
	public void black()
	{
		
	}
	
	public void green()
	{
		
	}
	
	public void red()
	{
		
	}
	
	public void drawLine(Color color, int x1, int y1, int x2, int y2) {
		
		Graphics g = image.getGraphics();
		
		g.setColor(color);
		
		g.drawLine(x1, y1, x2, y2);
	}
	
	 //Clears the image contents.
	 
	public void clear() {
		
		Graphics g = image.getGraphics();
		
		g.setColor(BACKGROUND_COL);
		
		g.fillRect(0, 0, image.getWidth(),  image.getHeight());
	}
	
	@Override
	public void paint(Graphics g) {

		// render the image on the panel.
		g.drawImage(image, 0, 0, null);
	}

	 //Constructor.
	 	
	GraphicPanel(JFrame frame) {
						
		setPreferredSize(new Dimension(800, 600));

		image = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
		
		// Set max size of the panel, so that is matches the max size of the image.
		setMaximumSize(new Dimension(image.getWidth(), image.getHeight()));
		
		clear();
		
		}
		
	}
	
