import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GraphicPanel extends JPanel 
{
	private int xPos = 400, yPos=300;

	// example of private variable with public accessors
	private boolean penUp = false;
	public boolean getPenUp() { return this.penUp; }
	public void setPenUp(boolean penUp) { this.penUp = penUp; }

	// example of private variable with public and protected setters
	// using the Queen's English.
	private Color colour;
	protected void setColour(Color colour) { this.colour = colour; }
	
	private Color color = Color.black;
	
	private enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

	private Direction direction = Direction.DOWN;
	
	private BufferedImage image;
	private final static Color BACKGROUND_COL = Color.LIGHT_GRAY;
	
	private GraphicPanel panel;
	
	private JTextField console = new JTextField(15);

	public GraphicPanel()
	{
		setPreferredSize(new Dimension(800, 600));

		image = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
		
		setMaximumSize(new Dimension(image.getWidth(), image.getHeight()));
		
		clear();
		
		add(console);
		
		console.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent arg0) 
            {
                if (console.getText().contains("penup"))
                {
                    penUp();
                }
                else if (console.getText().contains("pendown"))
                {
                	penDown();
                }
                else if (console.getText().contains("turnleft"))
                {
                	turnLeft();
                }
                else if (console.getText().contains("turnright"))
                {
                	turnRight();
                }
                else if (console.getText().contains("forward"))
                {
                	forward(50);
                }
                else if (console.getText().contains("backward"))
                {
                	backward(50);
                }
                else if (console.getText().contains("black"))
                {
                	black();
                }
                else if (console.getText().contains("green"))
                {
                	green();
                }
                else if (console.getText().contains("red"))
                {
                	red();
                }
                else if (console.getText().contains("reset"))
                {
                	clear();
                }
                else
                {
                    JOptionPane.showMessageDialog(console, "Invalid command, try again");
                }

                console.setText("");
                repaint();
            }
        });
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
            direction = Direction.RIGHT;
            break;
        case RIGHT:
            direction = Direction.DOWN;
            break;
        case DOWN:
            direction = Direction.LEFT;
            break;
        case LEFT:
            direction = Direction.UP;
            break;
		
		}	
	}

	public void turnLeft()
	{
		switch(direction)
		{
		case UP:
            direction = Direction.LEFT;
            break;
        case LEFT:
            direction = Direction.DOWN;
            break;
        case DOWN:
            direction = Direction.RIGHT;
            break;
        case RIGHT:
            direction = Direction.UP;
            break;
		
		}
	}
	
	public void forward(int amount)
	{
		
		if(penUp)
		{
			return;
		}
		
		switch (direction)
		{
	        case UP:
		            drawLine(xPos, yPos, xPos, yPos - amount );
		            yPos = yPos - amount;
		            break;
	        case DOWN:
		            drawLine(xPos, yPos, xPos, yPos + amount );
		            yPos = yPos + amount;
		            break;
	        case LEFT:
		            drawLine(xPos, yPos, xPos - amount, yPos );
		            xPos = xPos - amount;
		            break;
	        case RIGHT:
		            drawLine(xPos, yPos, xPos + amount, yPos );
		            xPos = xPos + amount;
		            break;
    }
			
	}
	
	public void backward(int amount)
	{
		if (penUp)
        {
            return;
        }

        switch (direction)
        {
            case UP:
	                drawLine(xPos, yPos, xPos, yPos + amount );
	                yPos = yPos + amount;
            case DOWN:
	                drawLine(xPos, yPos, xPos, yPos - amount );
	                yPos = yPos - amount;
	                break;
            case LEFT:
	                drawLine(xPos, yPos, xPos + amount, yPos );
	                xPos = xPos + amount;
            case RIGHT:
	                drawLine(xPos, yPos, xPos - amount, yPos );
	                xPos = xPos - amount;
	                break;
        }
	}
	
	 // change colour to black
    public void black()
    {
        color = Color.black;
    }

    // change colour to green
    public void green()
    {
        color = Color.green;
    }

    // change colour to red
    public void red()
    {
        color = Color.red;
    }

	public void drawLine(int x1, int y1, int x2, int y2) {
		
		Graphics g = image.getGraphics();
		
		g.setColor(color);
		g.drawLine(x1, y1, x2, y2);
	}
	 
	public void clear() {
		Graphics g = image.getGraphics();
		g.setColor(BACKGROUND_COL);
		g.fillRect(0, 0, image.getWidth(),  image.getHeight());
	}
	
	@Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        
        g.drawImage(image, 0, 0, null);
    }
}



