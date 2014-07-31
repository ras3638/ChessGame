package chessPackage;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.swing.*;
 

public class MenuBar implements ActionListener
{
  private JFrame frame;
  private JMenuBar menuBar;
  private JMenu fileMenu;
  private JMenu helpMenu;
  private JMenuItem newMenuItem;
  private JMenuItem exitMenuItem;
  private JMenuItem aboutMenuItem;
 
  //public static void main(String[] args)
  //{
    // needed on mac os x
    //System.setProperty("apple.laf.useScreenMenuBar", "true");
 
    // the proper way to show a jframe (invokeLater)
    //SwingUtilities.invokeLater(new MenuBar());
  //}
 
  public MenuBar()
  {
    menuBar = new JMenuBar();
    
    // build the File menu
    fileMenu = new JMenu("File");
    newMenuItem = new JMenuItem("New Game");
 
    fileMenu.add(newMenuItem);
    exitMenuItem = new JMenuItem("Exit");
   
    fileMenu.add(exitMenuItem);
    
    
    // build the Help menu
    helpMenu = new JMenu("Help");
    aboutMenuItem = new JMenuItem("About Chess");
    helpMenu.add(aboutMenuItem);
    
    // add menus to menubar
    menuBar.add(fileMenu);
    menuBar.add(helpMenu);
 
    // put the menubar on the frame
    Chess.frame.setJMenuBar(menuBar);
 
    SetActionCommand();
  }
 

  private class SampleDialog extends JDialog implements ActionListener
  {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton okButton = new JButton("OK");
    private JLabel label1 = new JLabel("(c) Copyright 2014",JLabel.CENTER);
    private JLabel label2 = new JLabel("Author: Robert Salinas",JLabel.CENTER);
    
    private SampleDialog()
    {
      super(frame, "About Chess", true);
      JPanel panel = new JPanel(new FlowLayout());

      
      panel.add(label1);
      panel.add(label2);
      panel.add(okButton);
      getContentPane().add(panel);
      okButton.addActionListener(this);
      setPreferredSize(new Dimension(300, 200));
      pack();
      
      setLocationRelativeTo(frame);
    }
 
    public void actionPerformed(ActionEvent ev)
    {
      setVisible(false);
    }
  }
	void SetActionCommand(){
	
		newMenuItem.setActionCommand("New");
		exitMenuItem.setActionCommand("Exit");
		aboutMenuItem.setActionCommand("About");
		aboutMenuItem.addActionListener(this);
		newMenuItem.addActionListener(this);
		exitMenuItem.addActionListener(this);


	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if ("New".equals(e.getActionCommand())) {

			try {
				restartApplication();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if ("Exit".equals(e.getActionCommand())) {
			System.exit(0);
		}
		if ("About".equals(e.getActionCommand())) {
		    SampleDialog dialog = new SampleDialog();
		    dialog.setLocationRelativeTo(Chess.frame);
		    dialog.setModal(true);
		    dialog.setVisible(true);
		    
		}
	
}
	public void restartApplication() throws IOException, URISyntaxException{
		  final String javaBin = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
		  final File currentJar = new File(Chess.class.getProtectionDomain().getCodeSource().getLocation().toURI());

		  /* is it a jar file? */
		  if(!currentJar.getName().endsWith(".jar"))
		    return;

		  /* Build command: java -jar application.jar */
		  final ArrayList<String> command = new ArrayList<String>();
		  command.add(javaBin);
		  command.add("-jar");
		  command.add(currentJar.getPath());

		  final ProcessBuilder builder = new ProcessBuilder(command);
		  builder.start();
		  System.exit(0);
		}
}
