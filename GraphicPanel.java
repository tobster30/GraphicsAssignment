import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GraphicPanel extends JPanel 
{
	private int xPos = 10, yPos=10;

	// example of private variable with public accessors
	private boolean penUp = true;
	public boolean getPenUp() { return this.penUp; }
	public void setPenUp(boolean penUp) { this.penUp = penUp; }

	// example of private variable with public and protected setters
	// using the Queen's English.
	private Color colour;
	protected void setColour(Color colour) { this.colour = colour; }
	public void black() { setColour(Colour.black); }
	public void green() { setColour(Color.green); }
	public void red() { setColour(Color.red); }

	private final static int DOWN = 0;
	private final static int UP = 1;
	private final static int LEFT = 2;
	private final static int RIGHT = 3;
	private int direction = DOWN;
	private final static Color BACKGROUND_COL = Color.DARK_GRAY;
	private BufferedImage image;
	
	GraphicPanel()
	{
		setPreferredSize(new Dimension(800, 600));

		image = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
		
		setMaximumSize(new Dimension(image.getWidth(), image.getHeight()));
		
		clear();
	}

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
		switch(direction)
		{
			case UP:
					direction = RIGHT;
					break;
			case DOWN:
					direction = LEFT;
					break;
			case LEFT:
					direction = UP;
					break;
			case RIGHT:
					direction = DOWN;
					break;
			default:
					break;
		
		}	
	}

	public void turnLeft()
	{
		switch(direction)
		{
			case UP:
					direction = LEFT;
					break;
			case DOWN:
					direction = RIGHT;
					break;
			case LEFT:
					direction = DOWN;
					break;
			case RIGHT:
					direction = UP;
					break;
			default:
					break;
		
		}
	}
	
	public void forward(int amount = 10)
	{
		
		if(penUp)
			return;
		
		if (direction == DOWN)
		{
			drawLine(colour, xPos, yPos, xPos, yPos + amount );
			yPos = yPos + amount;
		}
		
		else if (direction == UP)
		{
			drawLine(colour, xPos, yPos, xPos, yPos - amount );
			yPos = yPos - amount;
		}
			
		else if (direction == LEFT)		
		{
			drawLine(colour, xPos, yPos, xPos - amount, yPos );
			xPos = xPos - amount;
		}
		
		else if (direction == RIGHT)		
		{
			drawLine(colour, xPos, yPos, xPos + amount, yPos );
			xPos = xPos + amount;
		}
			
	}
	
	public void backward(int amount)
	{
		if(penUp)
			return;
		
		if (direction == DOWN)
		{
			drawLine(colour, xPos, yPos, xPos, yPos - amount );
			yPos = yPos - amount;
		}
		
		else if (direction == UP)
		{
			drawLine(colour, xPos, yPos, xPos, yPos + amount );
			yPos = yPos + amount;
		}
			
		else if (direction == LEFT)		
		{
			drawLine(colour, xPos, yPos, xPos + amount, yPos );
			xPos = xPos + amount;
		}
		
		else if (direction == RIGHT)		
		{
			drawLine(colour, xPos, yPos, xPos - amount, yPos );
			xPos = xPos - amount;
		}
	}

	public void drawLine(Color color, int x1, int y1, int x2, int y2) {
		Graphics g = image.getGraphics();
		g.setColor(color);
		g.drawLine(x1, y1, x2, y2);
	}
	 
	public void clear() {
		Graphics g = image.getGraphics();
		g.setColor(BACKGROUND_COL);
		g.clearRect(0, 0, image.getWidth(),  image.getHeight());
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, null);
	}
}
