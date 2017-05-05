import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;


@SuppressWarnings("serial")
public class GraphicMenu extends JMenuBar {
	JMenu file = new JMenu("File");
	JMenu help = new JMenu("Help");
	JMenuItem newImage = new JMenuItem("New"); 
	JMenuItem load = new JMenuItem("Load");	
	JMenuItem save = new JMenuItem("Save");
	JMenuItem exit = new JMenuItem("Exit");
	JMenuItem about = new JMenuItem("About");
	
	private GraphicPanel panel;

	public GraphicMenu(GraphicPanel graphicPanel)
	{
		// start again and create a new file
	    newImage.addActionListener(new ActionListener()
		{
	        public void actionPerformed(ActionEvent ev) 
			{
	          graphicPanel.clear();
	        }
	    });
	    
		// loads a different file    
	    load.addActionListener(new ActionListener()
		{
	        public void actionPerformed(ActionEvent ev) 
	        {
	          JFileChooser fc = new JFileChooser();
	          fc.setCurrentDirectory(new java.io.File("C:/Users/Toby/Desktop"));
	          fc.setDialogTitle("Load");
	          fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	          if (fc.showOpenDialog(load) == JFileChooser.APPROVE_OPTION)
			  {
				  // TODO:
			  }
	          System.out.println(fc.getSelectedFile().getAbsolutePath());
	        }
	    });
	    
		// save the current file  
		save.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev) 
				{
				
				
				
				}
			});
	    
	 	// exit the program 
	    exit.addActionListener(new ActionListener()
		{
	        public void actionPerformed(ActionEvent ev)
			{
	        	int reply = JOptionPane.showConfirmDialog(exit, "Are you sure you want to exit? Unsaved changes will be lost");

				if (reply == JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
	        }
	    });
	    
		// about option  
		about.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ev)
			{
				JOptionPane.showMessageDialog(about, "Create images using the following commands to draw and change line colour: penup, pendown, forward, backward, turnleft, turnright, black, green, red ");
			}
		});

		// adds the actionlisteners to the menuitems
	    file.add(newImage);
	    file.add(load);
		file.add(save);
		file.add(exit);
		help.add(about);

		// adds the file and help tabs
	    this.add(file);
	    this.add(help); 
	}
}
	
	

		
