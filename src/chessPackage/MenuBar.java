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
 

  public class SampleDialog extends JDialog implements ActionListener
  {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton okButton = new JButton("OK");
    private JLabel label1 = new JLabel("(c) Copyright 2014",JLabel.CENTER);
    private JLabel label2 = new JLabel("Author: Robert Salinas",JLabel.CENTER);
    
    private SampleDialog(){
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
			restartApplication();
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
	public static void restartApplication() {

		//reset static variables
		Chess.Highlighted = false;
		Chess.WhiteTurn = true;
		Chess.ActivateWhiteRightCastle = false;
		Chess.ActivateWhiteLeftCastle = false;
		Chess.ActivateBlackLeftCastle = false;
		Chess.ActivateBlackRightCastle = false;
		Chess.ComingFrom = null;
		PawnPopUp.GlobalBlackBishopProm = 0;
		PawnPopUp.GlobalBlackRookProm = 0;
		PawnPopUp.GlobalBlackKnightProm = 0;
		PawnPopUp.GlobalBlackQueenProm = 0;
		PawnPopUp.GlobalWhiteBishopProm = 0;
		PawnPopUp.GlobalWhiteRookProm = 0;
		PawnPopUp.GlobalWhiteKnightProm = 0;
		PawnPopUp.GlobalWhiteQueenProm = 0;
		
		//reset piece location
		BlackPawnA7.reset();
		BlackPawnB7.reset();
		BlackPawnC7.reset();
		BlackPawnD7.reset();
		BlackPawnE7.reset();
		BlackPawnF7.reset();
		BlackPawnG7.reset();
		BlackPawnH7.reset();
		
		WhitePawnA2.reset();
		WhitePawnB2.reset();
		WhitePawnC2.reset();
		WhitePawnD2.reset();
		WhitePawnE2.reset();
		WhitePawnF2.reset();
		WhitePawnG2.reset();
		WhitePawnH2.reset();
		
		BlackRookA8.reset();
		BlackRookH8.reset();
		BlackRookProm1.reset();
		BlackRookProm2.reset();
		BlackRookProm3.reset();
		BlackRookProm4.reset();
		BlackRookProm5.reset();
		BlackRookProm6.reset();
		BlackRookProm7.reset();
		BlackRookProm8.reset();
		
		WhiteRookA1.reset();
		WhiteRookH1.reset();
		WhiteRookProm1.reset();
		WhiteRookProm2.reset();
		WhiteRookProm3.reset();
		WhiteRookProm4.reset();
		WhiteRookProm5.reset();
		WhiteRookProm6.reset();
		WhiteRookProm7.reset();
		WhiteRookProm8.reset();
		
		BlackKnightB8.reset();
		BlackKnightG8.reset();
		BlackKnightProm1.reset();
		BlackKnightProm2.reset();
		BlackKnightProm3.reset();
		BlackKnightProm4.reset();
		BlackKnightProm5.reset();
		BlackKnightProm6.reset();
		BlackKnightProm7.reset();
		BlackKnightProm8.reset();
		
		WhiteKnightB1.reset();
		WhiteKnightG1.reset();
		WhiteKnightProm1.reset();
		WhiteKnightProm2.reset();
		WhiteKnightProm3.reset();
		WhiteKnightProm4.reset();
		WhiteKnightProm5.reset();
		WhiteKnightProm6.reset();
		WhiteKnightProm7.reset();
		WhiteKnightProm8.reset();
		
		BlackBishopC8.reset();
		BlackBishopF8.reset();
		BlackBishopProm1.reset();
		BlackBishopProm2.reset();
		BlackBishopProm3.reset();
		BlackBishopProm4.reset();
		BlackBishopProm5.reset();
		BlackBishopProm6.reset();
		BlackBishopProm7.reset();
		BlackBishopProm8.reset();
		
		WhiteBishopC1.reset();
		WhiteBishopF1.reset();
		WhiteBishopProm1.reset();
		WhiteBishopProm2.reset();
		WhiteBishopProm3.reset();
		WhiteBishopProm4.reset();
		WhiteBishopProm5.reset();
		WhiteBishopProm6.reset();
		WhiteBishopProm7.reset();
		WhiteBishopProm8.reset();
		
		BlackQueenD8.reset();
		BlackQueenProm1.reset();
		BlackQueenProm2.reset();
		BlackQueenProm3.reset();
		BlackQueenProm4.reset();
		BlackQueenProm5.reset();
		BlackQueenProm6.reset();
		BlackQueenProm7.reset();
		BlackQueenProm8.reset();
		
		WhiteQueenD1.reset();
		WhiteQueenProm1.reset();
		WhiteQueenProm2.reset();
		WhiteQueenProm3.reset();
		WhiteQueenProm4.reset();
		WhiteQueenProm5.reset();
		WhiteQueenProm6.reset();
		WhiteQueenProm7.reset();
		WhiteQueenProm8.reset();
		
		BlackKingE8.reset();
		WhiteKingE1.reset();
		
		//dehighlight all buttons
		Chess.dehighlightButton(Chess.bA1);
		Chess.dehighlightButton(Chess.bA2);
		Chess.dehighlightButton(Chess.bA3);
		Chess.dehighlightButton(Chess.bA4);
		Chess.dehighlightButton(Chess.bA5);
		Chess.dehighlightButton(Chess.bA6);
		Chess.dehighlightButton(Chess.bA7);
		Chess.dehighlightButton(Chess.bA8);
		Chess.dehighlightButton(Chess.bB1);
		Chess.dehighlightButton(Chess.bB2);
		Chess.dehighlightButton(Chess.bB3);
		Chess.dehighlightButton(Chess.bB4);
		Chess.dehighlightButton(Chess.bB5);
		Chess.dehighlightButton(Chess.bB6);
		Chess.dehighlightButton(Chess.bB7);
		Chess.dehighlightButton(Chess.bB8);
		Chess.dehighlightButton(Chess.bC1);
		Chess.dehighlightButton(Chess.bC2);
		Chess.dehighlightButton(Chess.bC3);
		Chess.dehighlightButton(Chess.bC4);
		Chess.dehighlightButton(Chess.bC5);
		Chess.dehighlightButton(Chess.bC6);
		Chess.dehighlightButton(Chess.bC7);
		Chess.dehighlightButton(Chess.bC8);
		Chess.dehighlightButton(Chess.bD1);
		Chess.dehighlightButton(Chess.bD2);
		Chess.dehighlightButton(Chess.bD3);
		Chess.dehighlightButton(Chess.bD4);
		Chess.dehighlightButton(Chess.bD5);
		Chess.dehighlightButton(Chess.bD6);
		Chess.dehighlightButton(Chess.bD7);
		Chess.dehighlightButton(Chess.bD8);
		Chess.dehighlightButton(Chess.bE1);
		Chess.dehighlightButton(Chess.bE2);
		Chess.dehighlightButton(Chess.bE3);
		Chess.dehighlightButton(Chess.bE4);
		Chess.dehighlightButton(Chess.bE5);
		Chess.dehighlightButton(Chess.bE6);
		Chess.dehighlightButton(Chess.bE7);
		Chess.dehighlightButton(Chess.bE8);
		Chess.dehighlightButton(Chess.bF1);
		Chess.dehighlightButton(Chess.bF2);
		Chess.dehighlightButton(Chess.bF3);
		Chess.dehighlightButton(Chess.bF4);
		Chess.dehighlightButton(Chess.bF5);
		Chess.dehighlightButton(Chess.bF6);
		Chess.dehighlightButton(Chess.bF7);
		Chess.dehighlightButton(Chess.bF8);
		Chess.dehighlightButton(Chess.bG1);
		Chess.dehighlightButton(Chess.bG2);
		Chess.dehighlightButton(Chess.bG3);
		Chess.dehighlightButton(Chess.bG4);
		Chess.dehighlightButton(Chess.bG5);
		Chess.dehighlightButton(Chess.bG6);
		Chess.dehighlightButton(Chess.bG7);
		Chess.dehighlightButton(Chess.bG8);
		Chess.dehighlightButton(Chess.bH1);
		Chess.dehighlightButton(Chess.bH2);
		Chess.dehighlightButton(Chess.bH3);
		Chess.dehighlightButton(Chess.bH4);
		Chess.dehighlightButton(Chess.bH5);
		Chess.dehighlightButton(Chess.bH6);
		Chess.dehighlightButton(Chess.bH7);
		Chess.dehighlightButton(Chess.bH8);
		
		//reset all icons
		
		// A file
		Chess.bA8.setIcon(BlackRookA8.getIcon());
		Chess.bA8.setName(BlackRookA8.getTitle());
		Chess.bA7.setIcon(BlackPawnA7.getIcon());
		Chess.bA7.setName(BlackPawnA7.getTitle());
		Chess.bA6.setIcon(null);
		Chess.bA6.setName(null);
		Chess.bA5.setIcon(null);
		Chess.bA5.setName(null);
		Chess.bA4.setIcon(null);
		Chess.bA4.setName(null);
		Chess.bA3.setIcon(null);
		Chess.bA3.setName(null);
		Chess.bA2.setIcon(WhitePawnA2.getIcon());
		Chess.bA2.setName(WhitePawnA2.getTitle());
		Chess.bA1.setIcon(WhiteRookA1.getIcon());
		Chess.bA1.setName(WhiteRookA1.getTitle());
		
		// B file
		Chess.bB8.setIcon(BlackKnightB8.getIcon());
		Chess.bB8.setName(BlackKnightB8.getTitle());
		Chess.bB7.setIcon(BlackPawnB7.getIcon());
		Chess.bB7.setName(BlackPawnB7.getTitle());
		Chess.bB6.setIcon(null);
		Chess.bB6.setName(null);
		Chess.bB5.setIcon(null);
		Chess.bB5.setName(null);
		Chess.bB4.setIcon(null);
		Chess.bB4.setName(null);
		Chess.bB3.setIcon(null);
		Chess.bB3.setName(null);
		Chess.bB2.setIcon(WhitePawnB2.getIcon());
		Chess.bB2.setName(WhitePawnB2.getTitle());
		Chess.bB1.setIcon(WhiteKnightB1.getIcon());
		Chess.bB1.setName(WhiteKnightB1.getTitle());
		
		// C file
		Chess.bC8.setIcon(BlackBishopC8.getIcon());
		Chess.bC8.setName(BlackBishopC8.getTitle());
		Chess.bC7.setIcon(BlackPawnC7.getIcon());
		Chess.bC7.setName(BlackPawnC7.getTitle());
		Chess.bC6.setIcon(null);
		Chess.bC6.setName(null);
		Chess.bC5.setIcon(null);
		Chess.bC5.setName(null);
		Chess.bC4.setIcon(null);
		Chess.bC4.setName(null);
		Chess.bC3.setIcon(null);
		Chess.bC3.setName(null);
		Chess.bC2.setIcon(WhitePawnC2.getIcon());
		Chess.bC2.setName(WhitePawnC2.getTitle());
		Chess.bC1.setIcon(WhiteBishopC1.getIcon());
		Chess.bC1.setName(WhiteBishopC1.getTitle());
		
		// D file
		Chess.bD8.setIcon(BlackQueenD8.getIcon());
		Chess.bD8.setName(BlackQueenD8.getTitle());
		Chess.bD7.setIcon(BlackPawnD7.getIcon());
		Chess.bD7.setName(BlackPawnD7.getTitle());
		Chess.bD6.setIcon(null);
		Chess.bD6.setName(null);
		Chess.bD5.setIcon(null);
		Chess.bD5.setName(null);
		Chess.bD4.setIcon(null);
		Chess.bD4.setName(null);
		Chess.bD3.setIcon(null);
		Chess.bD3.setName(null);
		Chess.bD2.setIcon(WhitePawnD2.getIcon());
		Chess.bD2.setName(WhitePawnD2.getTitle());
		Chess.bD1.setIcon(WhiteQueenD1.getIcon());
		Chess.bD1.setName(WhiteQueenD1.getTitle());
		
		// E file
		Chess.bE8.setIcon(BlackKingE8.getIcon());
		Chess.bE8.setName(BlackKingE8.getTitle());
		Chess.bE7.setIcon(BlackPawnE7.getIcon());
		Chess.bE7.setName(BlackPawnE7.getTitle());
		Chess.bE6.setIcon(null);
		Chess.bE6.setName(null);
		Chess.bE5.setIcon(null);
		Chess.bE5.setName(null);
		Chess.bE4.setIcon(null);
		Chess.bE4.setName(null);
		Chess.bE3.setIcon(null);
		Chess.bE3.setName(null);
		Chess.bE2.setIcon(WhitePawnE2.getIcon());
		Chess.bE2.setName(WhitePawnE2.getTitle());
		Chess.bE1.setIcon(WhiteKingE1.getIcon());
		Chess.bE1.setName(WhiteKingE1.getTitle());
		
		// F file
		Chess.bF8.setIcon(BlackBishopF8.getIcon());
		Chess.bF8.setName(BlackBishopF8.getTitle());
		Chess.bF7.setIcon(BlackPawnF7.getIcon());
		Chess.bF7.setName(BlackPawnF7.getTitle());
		Chess.bF6.setIcon(null);
		Chess.bF6.setName(null);
		Chess.bF5.setIcon(null);
		Chess.bF5.setName(null);
		Chess.bF4.setIcon(null);
		Chess.bF4.setName(null);
		Chess.bF3.setIcon(null);
		Chess.bF3.setName(null);
		Chess.bF2.setIcon(WhitePawnF2.getIcon());
		Chess.bF2.setName(WhitePawnF2.getTitle());
		Chess.bF1.setIcon(WhiteBishopF1.getIcon());
		Chess.bF1.setName(WhiteBishopF1.getTitle());
		
		// G file
		Chess.bG8.setIcon(BlackKnightG8.getIcon());
		Chess.bG8.setName(BlackKnightG8.getTitle());
		Chess.bG7.setIcon(BlackPawnG7.getIcon());
		Chess.bG7.setName(BlackPawnG7.getTitle());
		Chess.bG6.setIcon(null);
		Chess.bG6.setName(null);
		Chess.bG5.setIcon(null);
		Chess.bG5.setName(null);
		Chess.bG4.setIcon(null);
		Chess.bG4.setName(null);
		Chess.bG3.setIcon(null);
		Chess.bG3.setName(null);
		Chess.bG2.setIcon(WhitePawnG2.getIcon());
		Chess.bG2.setName(WhitePawnG2.getTitle());
		Chess.bG1.setIcon(WhiteKnightG1.getIcon());
		Chess.bG1.setName(WhiteKnightG1.getTitle());
		
		// H file
		Chess.bH8.setIcon(BlackRookH8.getIcon());
		Chess.bH8.setName(BlackRookH8.getTitle());
		Chess.bH7.setIcon(BlackPawnH7.getIcon());
		Chess.bH7.setName(BlackPawnH7.getTitle());
		Chess.bH6.setIcon(null);
		Chess.bH6.setName(null);
		Chess.bH5.setIcon(null);
		Chess.bH5.setName(null);
		Chess.bH4.setIcon(null);
		Chess.bH4.setName(null);
		Chess.bH3.setIcon(null);
		Chess.bH3.setName(null);
		Chess.bH2.setIcon(WhitePawnH2.getIcon());
		Chess.bH2.setName(WhitePawnH2.getTitle());
		Chess.bH1.setIcon(WhiteRookH1.getIcon());
		Chess.bH1.setName(WhiteRookH1.getTitle());
	}
	@SuppressWarnings("unused")
	private void restartApplication_exitConsole() throws IOException, URISyntaxException{
		
		//this restarts application by exiting and rebooting jar file. not in use
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
