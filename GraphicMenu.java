import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFileChooser;


@SuppressWarnings("serial")
public class GraphicMenu extends JPanel implements ActionListener  {
	
	JMenuBar jmb = new JMenuBar();
		
	    JMenu file = new JMenu("File");
	    JMenu help = new JMenu("Help");
	    JTextField console = new JTextField(15);
	    JMenuItem newImage = new JMenuItem("New"); 
	    JMenuItem load = new JMenuItem("Load");	
	    JMenuItem save = new JMenuItem("Save");
	    JMenuItem exit = new JMenuItem("Exit");
	    JMenuItem about = new JMenuItem("About");  

	    
	public GraphicMenu(JFrame frame)
	{
	// adds the file and help tabs to the enu bar
	    jmb.add(file);
	    jmb.add(help); 
	    jmb.add(console);
	    
	// start again and create a new file
	    newImage.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	          JOptionPane.showMessageDialog(newImage, "New works");
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
		        	  
		          }
	          System.out.println(fc.getSelectedFile().getAbsolutePath());
	        }
	    });
	    
	 // save the current file  
	    save.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	          JOptionPane.showMessageDialog(save, "Save works");
	        }
	    });
	    
	 // exit the program 
	    exit.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	        	int reply = JOptionPane.showConfirmDialog(exit, "Are you sure you want to exit? Unsaved changes will be lost");
	        		if ( reply == JOptionPane.YES_OPTION){
	        			System.exit(0);
	        		}
	        }
	    });
	    
	  // about option  
	    about.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	          JOptionPane.showMessageDialog(about, "About works");
	        }
	    });
	    
	    console.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			    {
						if(console.getText().equals("penup")) {
							GraphicPanel pu = new GraphicPanel(frame);
							pu.penUp();
						}
			    		
			    		else if (console.getText().equals("pendown")) {
			    			GraphicPanel pd = new GraphicPanel(frame);
							pd.penDown();
			    		}
			    		
			    		else if (console.getText().equals("turnleft")) {
					  	  JOptionPane.showMessageDialog(console, "turnleft works");
			    		}
			    		
			    		else if (console.getText().equals("turnright")) {
					  	   JOptionPane.showMessageDialog(console, "turnright works");
			    		}
			    		
			    		else if (console.getText().equals("forward")) {
			    			GraphicPanel fwd = new GraphicPanel(frame);
			    			fwd.forward(270);
				    	}
			    		
			    		else if (console.getText().equals("backward")) {
					  	   JOptionPane.showMessageDialog(console, "backward works");
				    	}
			    		
			    		else if (console.getText().equals("black")) {
					  	   JOptionPane.showMessageDialog(console, "black works");
				    	}
			    		
			    		else if (console.getText().equals("green")) {
					  	   JOptionPane.showMessageDialog(console, "green works");
				    	}
			    		
			    		else if (console.getText().equals("red")) {
					  	    JOptionPane.showMessageDialog(console, "red works");
				    	}
			    		
			    		else if (console.getText().equals("reset")) {
			    			JOptionPane.showMessageDialog(console, "reset works");
				    	}
			    		
			    		else {
					  	    JOptionPane.showMessageDialog(console, "Invalid command, try again");
				    	}
			    }	
		});
	    
	      	    
	    file.add(newImage);
	    file.add(load);
		file.add(save);
		file.add(exit);
		help.add(about);	
		
		frame.setJMenuBar(jmb);
		
		
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
	
	

		
