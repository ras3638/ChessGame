package chessPackage;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WinningScreen {
	final LightBox Light = new LightBox();
	final JPanel PromotionPanel = new JPanel();
	private JFrame frame;
	final JFrame PromotionFrame = new JFrame();
	 
	public WinningScreen(int i) {
		

		Chess.ResetSelection();
		if(i==0){
			//black wins
			WinningDialog dialog = new WinningDialog(0);
		    dialog.setLocationRelativeTo(Chess.frame);
		    dialog.setModal(true);
		    dialog.setVisible(true);
		}
		if(i==1){
			//white wins
			WinningDialog dialog = new WinningDialog(1);
		    dialog.setLocationRelativeTo(Chess.frame);
		    dialog.setModal(true);
		    dialog.setVisible(true);
		}
	}
	private class WinningDialog extends JDialog implements ActionListener
	  {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JButton okButton = new JButton("New Game");
	    private JLabel label1 = new JLabel("        Checkmate! Black Wins!        ",JLabel.CENTER);
	    private JLabel label2 = new JLabel("        Checkmate! White Wins!        ",JLabel.CENTER);
	    
	    private WinningDialog(int i){
	      super(frame, "", true);
	      JPanel panel = new JPanel(new FlowLayout());

	      
	      if(i==0){
	    	  panel.add(label1); 
	      }
	      if(i==1){
	    	  panel.add(label2);
	      }
	      
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
	      Light.closeLightBox(Chess.frame, PromotionPanel);
	      MenuBar.restartApplication();
	      new MenuBar();
	    }

	  }
}
