import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

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
	    
	// start again and create a new file
	    newImage.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	          GraphicPanel clear = new GraphicPanel(frame);
	          clear.clear();
	          		  
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
	   /*( save.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	          try(FileWriter fw = new FileWriter(chooser.getSelectedFile()+".jpg")) {
	        	  fw.write(sb.toString());
	          }
	        }
	    });*/
	    
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
	
	

		
