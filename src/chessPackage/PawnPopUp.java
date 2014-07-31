package chessPackage;

import java.awt.GridLayout;
import java.util.logging.Level;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PawnPopUp {
	final JFrame PromotionFrame = new JFrame();
	final JPanel PromotionPanel = new JPanel();
	final LightBox Light = new LightBox();
	JButton[][] grid;
	JButton RookButton = new JButton();
    JButton QueenButton = new JButton();
    JButton BishopButton = new JButton();
    JButton KnightButton = new JButton();
	int GlobalWhiteRookProm = 0;
	int GlobalWhiteQueenProm = 0;
	int GlobalWhiteKnightProm = 0;
	int GlobalWhiteBishopProm = 0;
	int GlobalBlackRookProm = 0;
	int GlobalBlackQueenProm = 0;
	int GlobalBlackKnightProm = 0;
	int GlobalBlackBishopProm = 0;
	
    public PawnPopUp(boolean whiteTurn, final JButton J, final int X){
    	
    	Light.createLightBoxEffect(Chess.frame, PromotionPanel); 
    	PromotionFrame.setUndecorated(true);
		Chess.frame.setEnabled(false);
		PromotionFrame.setLayout(new GridLayout(4,1)); //set layout
		grid=new JButton[4][1]; //allocate the size of grid
		
		grid[0][0] = RookButton;
		PromotionFrame.add(grid[0][0]);
		
		grid[1][0] = QueenButton;
		PromotionFrame.add(grid[1][0]);
		
		grid[2][0] = BishopButton;
		PromotionFrame.add(grid[2][0]);
		
		grid[3][0] = KnightButton;
		PromotionFrame.add(grid[3][0]);	
	    
	    if (!whiteTurn){
			//Activate white promotion
	        RookButton.setIcon(WhiteRookA1.getIcon());      
	        QueenButton.setIcon(WhiteQueenD1.getIcon()); 
	        BishopButton.setIcon(WhiteBishopC1.getIcon());
	        KnightButton.setIcon(WhiteKnightB1.getIcon());

			PromotionFrame.pack();
			PromotionFrame.setVisible(true);
			PromotionFrame.setLocationRelativeTo(Chess.frame); 

	        RookButton.addActionListener(new java.awt.event.ActionListener() {
	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	Chess.resetMainFrame(PromotionFrame,Light,PromotionPanel,J);
	            	J.setIcon(WhiteRookA1.getIcon());
	            	GlobalWhiteRookProm++;

	            	if (GlobalWhiteRookProm == 1){
	            		J.setName("White Rook (Prom1)");
		    			WhiteRookProm1.setCurrentPositionX(X);
		    			WhiteRookProm1.setCurrentPositionY(0);
		    			WhiteRookProm1.setCurrentPositionXY(X,0);
		    			WhiteRookProm1.setActive(true);
	    			}
	            	if (GlobalWhiteRookProm == 2){
	            		J.setName("White Rook (Prom2)");
		    			WhiteRookProm2.setCurrentPositionX(X);
		    			WhiteRookProm2.setCurrentPositionY(0);
		    			WhiteRookProm2.setCurrentPositionXY(X,0);
		    			WhiteRookProm2.setActive(true);
	    			}
	            	if (GlobalWhiteRookProm == 3){
	            		J.setName("White Rook (Prom3)");
		    			WhiteRookProm3.setCurrentPositionX(X);
		    			WhiteRookProm3.setCurrentPositionY(0);
		    			WhiteRookProm3.setCurrentPositionXY(X,0);
		    			WhiteRookProm3.setActive(true);
	    			}
	            	if (GlobalWhiteRookProm == 4){
	            		J.setName("White Rook (Prom4)");
		    			WhiteRookProm4.setCurrentPositionX(X);
		    			WhiteRookProm4.setCurrentPositionY(0);
		    			WhiteRookProm4.setCurrentPositionXY(X,0);
	    			}
	            	if (GlobalWhiteRookProm == 5){
	            		J.setName("White Rook (Prom5)");
		    			WhiteRookProm5.setCurrentPositionX(X);
		    			WhiteRookProm5.setCurrentPositionY(0);
		    			WhiteRookProm5.setCurrentPositionXY(X,0);
		    			WhiteRookProm5.setActive(true);
	    			}
	            	if (GlobalWhiteRookProm == 6){
	            		J.setName("White Rook (Prom6)");
		    			WhiteRookProm6.setCurrentPositionX(X);
		    			WhiteRookProm6.setCurrentPositionY(0);
		    			WhiteRookProm6.setCurrentPositionXY(X,0);
		    			WhiteRookProm6.setActive(true);
	    			}
	            	if (GlobalWhiteRookProm == 7){
	            		J.setName("White Rook (Prom7)");
		    			WhiteRookProm7.setCurrentPositionX(X);
		    			WhiteRookProm7.setCurrentPositionY(0);
		    			WhiteRookProm7.setCurrentPositionXY(X,0);
		    			WhiteRookProm7.setActive(true);
	    			}
	            	if (GlobalWhiteRookProm == 8){
	            		J.setName("White Rook (Prom8)");
		    			WhiteRookProm8.setCurrentPositionX(X);
		    			WhiteRookProm8.setCurrentPositionY(0);
		    			WhiteRookProm8.setCurrentPositionXY(X,0);
		    			WhiteRookProm8.setActive(true);
	    			}
	            	if (GlobalWhiteRookProm >= 9){
	            		Chess.LOGGER.log(Level.SEVERE, "Game cannot handle more than 8 white promotional rooks. Exiting game. White promotional rook count at " + GlobalWhiteRookProm);
	            		System.exit(0);
	    			}
	    			
	            }
	        });
	        QueenButton.addActionListener(new java.awt.event.ActionListener() {
	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	Chess.resetMainFrame(PromotionFrame,Light,PromotionPanel,J);
	            	J.setIcon(WhiteQueenProm1.getIcon());
	            	GlobalWhiteQueenProm++;

	            	if (GlobalWhiteQueenProm == 1){
	            		J.setName("White Queen (Prom1)");
		    			WhiteQueenProm1.setCurrentPositionX(X);
		    			WhiteQueenProm1.setCurrentPositionY(0);
		    			WhiteQueenProm1.setCurrentPositionXY(X,0);
		    			WhiteQueenProm1.setActive(true);
	    			}
	            	if (GlobalWhiteQueenProm == 2){
	            		J.setName("White Queen (Prom2)");
		    			WhiteQueenProm2.setCurrentPositionX(X);
		    			WhiteQueenProm2.setCurrentPositionY(0);
		    			WhiteQueenProm2.setCurrentPositionXY(X,0);
		    			WhiteQueenProm2.setActive(true);
	    			}
	            	if (GlobalWhiteQueenProm == 3){
	            		J.setName("White Queen (Prom3)");
		    			WhiteQueenProm3.setCurrentPositionX(X);
		    			WhiteQueenProm3.setCurrentPositionY(0);
		    			WhiteQueenProm3.setCurrentPositionXY(X,0);
		    			WhiteQueenProm3.setActive(true);
	    			}
	            	if (GlobalWhiteQueenProm == 4){
	            		J.setName("White Queen (Prom4)");
		    			WhiteQueenProm4.setCurrentPositionX(X);
		    			WhiteQueenProm4.setCurrentPositionY(0);
		    			WhiteQueenProm4.setCurrentPositionXY(X,0);
		    			WhiteQueenProm4.setActive(true);
	    			}
	            	if (GlobalWhiteQueenProm == 5){
	            		J.setName("White Queen (Prom5)");
		    			WhiteQueenProm5.setCurrentPositionX(X);
		    			WhiteQueenProm5.setCurrentPositionY(0);
		    			WhiteQueenProm5.setCurrentPositionXY(X,0);
		    			WhiteQueenProm5.setActive(true);
		    			return;
	    			}
	            	if (GlobalWhiteQueenProm == 6){
	            		J.setName("White Queen (Prom6)");
		    			WhiteQueenProm6.setCurrentPositionX(X);
		    			WhiteQueenProm6.setCurrentPositionY(0);
		    			WhiteQueenProm6.setCurrentPositionXY(X,0);
		    			WhiteQueenProm6.setActive(true);
	    			}
	            	if (GlobalWhiteQueenProm == 7){
	            		J.setName("White Queen (Prom7)");
		    			WhiteQueenProm7.setCurrentPositionX(X);
		    			WhiteQueenProm7.setCurrentPositionY(0);
		    			WhiteQueenProm7.setCurrentPositionXY(X,0);
		    			WhiteQueenProm7.setActive(true);
	    			}
	            	if (GlobalWhiteQueenProm == 8){
	            		J.setName("White Queen (Prom8)");
		    			WhiteQueenProm8.setCurrentPositionX(X);
		    			WhiteQueenProm8.setCurrentPositionY(0);
		    			WhiteQueenProm8.setCurrentPositionXY(X,0);
		    			WhiteQueenProm8.setActive(true);
	    			}
	            	if (GlobalWhiteQueenProm >= 9){
	            		Chess.LOGGER.log(Level.SEVERE, "Game cannot handle more than 8 white promotional queens. Exiting game. White promotional queen count at " + GlobalWhiteQueenProm);
	            		System.exit(0);
	    			}
	            }
	        });
	        BishopButton.addActionListener(new java.awt.event.ActionListener() {
	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	Chess.resetMainFrame(PromotionFrame,Light,PromotionPanel,J);
	            	J.setIcon(WhiteBishopProm1.getIcon());
	            	GlobalWhiteBishopProm++;

	            	if (GlobalWhiteBishopProm == 1){
	            		J.setName("White Bishop (Prom1)");
		    			WhiteBishopProm1.setCurrentPositionX(X);
		    			WhiteBishopProm1.setCurrentPositionY(0);
		    			WhiteBishopProm1.setCurrentPositionXY(X,0);
		    			WhiteBishopProm1.setActive(true);
	    			}
	            	if (GlobalWhiteBishopProm == 2){
	            		J.setName("White Bishop (Prom2)");
		    			WhiteBishopProm2.setCurrentPositionX(X);
		    			WhiteBishopProm2.setCurrentPositionY(0);
		    			WhiteBishopProm2.setCurrentPositionXY(X,0);
		    			WhiteBishopProm2.setActive(true);
	    			}
	            	if (GlobalWhiteBishopProm == 3){
	            		J.setName("White Bishop (Prom3)");
		    			WhiteBishopProm3.setCurrentPositionX(X);
		    			WhiteBishopProm3.setCurrentPositionY(0);
		    			WhiteBishopProm3.setCurrentPositionXY(X,0);
		    			WhiteBishopProm3.setActive(true);
	    			}
	            	if (GlobalWhiteBishopProm == 4){
	            		J.setName("White Bishop (Prom4)");
		    			WhiteBishopProm4.setCurrentPositionX(X);
		    			WhiteBishopProm4.setCurrentPositionY(0);
		    			WhiteBishopProm4.setCurrentPositionXY(X,0);
	    			}
	            	if (GlobalWhiteBishopProm == 5){
	            		J.setName("White Bishop (Prom5)");
		    			WhiteBishopProm5.setCurrentPositionX(X);
		    			WhiteBishopProm5.setCurrentPositionY(0);
		    			WhiteBishopProm5.setCurrentPositionXY(X,0);
		    			WhiteBishopProm5.setActive(true);
	    			}
	            	if (GlobalWhiteBishopProm == 6){
	            		J.setName("White Bishop (Prom6)");
		    			WhiteBishopProm6.setCurrentPositionX(X);
		    			WhiteBishopProm6.setCurrentPositionY(0);
		    			WhiteBishopProm6.setCurrentPositionXY(X,0);
		    			WhiteBishopProm6.setActive(true);
	    			}
	            	if (GlobalWhiteBishopProm == 7){
	            		J.setName("White Bishop (Prom7)");
		    			WhiteBishopProm7.setCurrentPositionX(X);
		    			WhiteBishopProm7.setCurrentPositionY(0);
		    			WhiteBishopProm7.setCurrentPositionXY(X,0);
		    			WhiteBishopProm7.setActive(true);
	    			}
	            	if (GlobalWhiteBishopProm == 8){
	            		J.setName("White Bishop (Prom8)");
		    			WhiteBishopProm8.setCurrentPositionX(X);
		    			WhiteBishopProm8.setCurrentPositionY(0);
		    			WhiteBishopProm8.setCurrentPositionXY(X,0);
		    			WhiteBishopProm8.setActive(true);
	    			}
	            	if (GlobalWhiteBishopProm >= 9){
	            		Chess.LOGGER.log(Level.SEVERE, "Game cannot handle more than 8 white promotional bishops. Exiting game. White promotional bishop count at " + GlobalWhiteBishopProm);
	            		System.exit(0);
	      
	    			}
	            }
	        });
	        KnightButton.addActionListener(new java.awt.event.ActionListener() {
	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	Chess.resetMainFrame(PromotionFrame,Light,PromotionPanel,J);
	            	J.setIcon(WhiteKnightProm1.getIcon());
	            	GlobalWhiteKnightProm++;

	            	if (GlobalWhiteKnightProm == 1){
	            		J.setName("White Knight (Prom1)");
		    			WhiteKnightProm1.setCurrentPositionX(X);
		    			WhiteKnightProm1.setCurrentPositionY(0);
		    			WhiteKnightProm1.setCurrentPositionXY(X,0);
		    			WhiteKnightProm1.setActive(true);
	    			}
	            	if (GlobalWhiteKnightProm == 2){
	            		J.setName("White Knight (Prom2)");
		    			WhiteKnightProm2.setCurrentPositionX(X);
		    			WhiteKnightProm2.setCurrentPositionY(0);
		    			WhiteKnightProm2.setCurrentPositionXY(X,0);
		    			WhiteKnightProm2.setActive(true);
	    			}
	            	if (GlobalWhiteKnightProm == 3){
	            		J.setName("White Knight (Prom3)");
		    			WhiteKnightProm3.setCurrentPositionX(X);
		    			WhiteKnightProm3.setCurrentPositionY(0);
		    			WhiteKnightProm3.setCurrentPositionXY(X,0);
		    			WhiteKnightProm3.setActive(true);
	    			}
	            	if (GlobalWhiteKnightProm == 4){
	            		J.setName("White Knight (Prom4)");
		    			WhiteKnightProm4.setCurrentPositionX(X);
		    			WhiteKnightProm4.setCurrentPositionY(0);
		    			WhiteKnightProm4.setCurrentPositionXY(X,0);
	    			}
	            	if (GlobalWhiteKnightProm == 5){
	            		J.setName("White Knight (Prom5)");
		    			WhiteKnightProm5.setCurrentPositionX(X);
		    			WhiteKnightProm5.setCurrentPositionY(0);
		    			WhiteKnightProm5.setCurrentPositionXY(X,0);
		    			WhiteKnightProm5.setActive(true);
	    			}
	            	if (GlobalWhiteKnightProm == 6){
	            		J.setName("White Knight (Prom6)");
		    			WhiteKnightProm6.setCurrentPositionX(X);
		    			WhiteKnightProm6.setCurrentPositionY(0);
		    			WhiteKnightProm6.setCurrentPositionXY(X,0);
		    			WhiteKnightProm6.setActive(true);
	    			}
	            	if (GlobalWhiteKnightProm == 7){
	            		J.setName("White Knight (Prom7)");
		    			WhiteKnightProm7.setCurrentPositionX(X);
		    			WhiteKnightProm7.setCurrentPositionY(0);
		    			WhiteKnightProm7.setCurrentPositionXY(X,0);
		    			WhiteKnightProm7.setActive(true);
	    			}
	            	if (GlobalWhiteKnightProm == 8){
	            		J.setName("White Knight (Prom8)");
		    			WhiteKnightProm8.setCurrentPositionX(X);
		    			WhiteKnightProm8.setCurrentPositionY(0);
		    			WhiteKnightProm8.setCurrentPositionXY(X,0);
		    			WhiteKnightProm8.setActive(true);
	    			}
	            	if (GlobalWhiteKnightProm >= 9){
	            		Chess.LOGGER.log(Level.SEVERE, "Game cannot handle more than 8 white promotional knights. Exiting game. White promotional knight count at " + GlobalWhiteKnightProm);
	            		System.exit(0);
	    			}
	            }
	        });
		}
			
		else{
			//Activate black promotion
	        RookButton.setIcon(BlackRookProm1.getIcon());
	        QueenButton.setIcon(BlackQueenProm1.getIcon());
	        BishopButton.setIcon(BlackBishopProm1.getIcon());  
	        KnightButton.setIcon(BlackKnightProm1.getIcon());

			PromotionFrame.pack();
			PromotionFrame.setVisible(true);
			PromotionFrame.setLocationRelativeTo(Chess.frame); 

	        RookButton.addActionListener(new java.awt.event.ActionListener() {
	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	Chess.resetMainFrame(PromotionFrame,Light,PromotionPanel,J);
	            	J.setIcon(BlackRookProm1.getIcon());
	            	GlobalBlackRookProm++;

	            	if (GlobalBlackRookProm == 1){
	            		J.setName("Black Rook (Prom1)");
		    			BlackRookProm1.setCurrentPositionX(X);
		    			BlackRookProm1.setCurrentPositionY(7);
		    			BlackRookProm1.setCurrentPositionXY(X,7);
		    			BlackRookProm1.setActive(true);
	    			}
	            	if (GlobalBlackRookProm == 2){
	            		J.setName("Black Rook (Prom2)");
		    			BlackRookProm2.setCurrentPositionX(X);
		    			BlackRookProm2.setCurrentPositionY(7);
		    			BlackRookProm2.setCurrentPositionXY(X,7);
		    			BlackRookProm2.setActive(true);
	    			}
	            	if (GlobalBlackRookProm == 3){
	            		J.setName("Black Rook (Prom3)");
		    			BlackRookProm3.setCurrentPositionX(X);
		    			BlackRookProm3.setCurrentPositionY(7);
		    			BlackRookProm3.setCurrentPositionXY(X,7);
		    			BlackRookProm3.setActive(true);
	    			}
	            	if (GlobalBlackRookProm == 4){
	            		J.setName("Black Rook (Prom4)");
		    			BlackRookProm4.setCurrentPositionX(X);
		    			BlackRookProm4.setCurrentPositionY(7);
		    			BlackRookProm4.setCurrentPositionXY(X,7);
		    			BlackRookProm5.setActive(true);
	    			}
	            	if (GlobalBlackRookProm == 5){
	            		J.setName("Black Rook (Prom5)");
		    			BlackRookProm5.setCurrentPositionX(X);
		    			BlackRookProm5.setCurrentPositionY(7);
		    			BlackRookProm5.setCurrentPositionXY(X,7);
		    			BlackRookProm5.setActive(true);
	    			}
	            	if (GlobalBlackRookProm == 6){
	            		J.setName("Black Rook (Prom6)");
		    			BlackRookProm6.setCurrentPositionX(X);
		    			BlackRookProm6.setCurrentPositionY(7);
		    			BlackRookProm6.setCurrentPositionXY(X,7);
		    			BlackRookProm6.setActive(true);
	    			}
	            	if (GlobalBlackRookProm == 7){
	            		J.setName("Black Rook (Prom7)");
		    			BlackRookProm7.setCurrentPositionX(X);
		    			BlackRookProm7.setCurrentPositionY(7);
		    			BlackRookProm7.setCurrentPositionXY(X,7);
		    			BlackRookProm7.setActive(true);
	    			}
	            	if (GlobalBlackRookProm == 8){
	            		J.setName("Black Rook (Prom8)");
		    			BlackRookProm8.setCurrentPositionX(X);
		    			BlackRookProm8.setCurrentPositionY(7);
		    			BlackRookProm8.setCurrentPositionXY(X,7);
		    			BlackRookProm8.setActive(true);
	    			}
	            	if (GlobalBlackRookProm >= 9){
	            		Chess.LOGGER.log(Level.SEVERE, "Game cannot handle more than 8 black promotional rooks. Exiting game. Black promotional rook count at " + GlobalBlackRookProm);
	            		System.exit(0);
	    			}
	    			
	            }
	        });
	        QueenButton.addActionListener(new java.awt.event.ActionListener() {
	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	Chess.resetMainFrame(PromotionFrame,Light,PromotionPanel,J);
	            	J.setIcon(BlackQueenProm1.getIcon());
	            	GlobalBlackQueenProm++;

	            	if (GlobalBlackQueenProm == 1){
	            		J.setName("Black Queen (Prom1)");
		    			BlackQueenProm1.setCurrentPositionX(X);
		    			BlackQueenProm1.setCurrentPositionY(7);
		    			BlackQueenProm1.setCurrentPositionXY(X,7);
		    			BlackQueenProm1.setActive(true);
	    			}
	            	if (GlobalBlackQueenProm == 2){
	            		J.setName("Black Queen (Prom2)");
		    			BlackQueenProm2.setCurrentPositionX(X);
		    			BlackQueenProm2.setCurrentPositionY(7);
		    			BlackQueenProm2.setCurrentPositionXY(X,7);
		    			BlackQueenProm2.setActive(true);
	    			}
	            	if (GlobalBlackQueenProm == 3){
	            		J.setName("Black Queen (Prom3)");
		    			BlackQueenProm3.setCurrentPositionX(X);
		    			BlackQueenProm3.setCurrentPositionY(7);
		    			BlackQueenProm3.setCurrentPositionXY(X,7);
		    			BlackQueenProm3.setActive(true);
	    			}
	            	if (GlobalBlackQueenProm == 4){
	            		J.setName("Black Queen (Prom4)");
		    			BlackQueenProm4.setCurrentPositionX(X);
		    			BlackQueenProm4.setCurrentPositionY(7);
		    			BlackQueenProm4.setCurrentPositionXY(X,7);
		    			BlackQueenProm4.setActive(true);
	    			}
	            	if (GlobalBlackQueenProm == 5){
	            		J.setName("Black Queen (Prom5)");
		    			BlackQueenProm5.setCurrentPositionX(X);
		    			BlackQueenProm5.setCurrentPositionY(7);
		    			BlackQueenProm5.setCurrentPositionXY(X,7);
		    			BlackQueenProm5.setActive(true);
		    			return;
	    			}
	            	if (GlobalBlackQueenProm == 6){
	            		J.setName("Black Queen (Prom6)");
		    			BlackQueenProm6.setCurrentPositionX(X);
		    			BlackQueenProm6.setCurrentPositionY(7);
		    			BlackQueenProm6.setCurrentPositionXY(X,7);
		    			BlackQueenProm6.setActive(true);
	    			}
	            	if (GlobalBlackQueenProm == 7){
	            		J.setName("Black Queen (Prom7)");
		    			BlackQueenProm7.setCurrentPositionX(X);
		    			BlackQueenProm7.setCurrentPositionY(7);
		    			BlackQueenProm7.setCurrentPositionXY(X,7);
		    			BlackQueenProm7.setActive(true);
	    			}
	            	if (GlobalBlackQueenProm == 8){
	            		J.setName("Black Queen (Prom8)");
		    			BlackQueenProm8.setCurrentPositionX(X);
		    			BlackQueenProm8.setCurrentPositionY(7);
		    			BlackQueenProm8.setCurrentPositionXY(X,7);
		    			BlackQueenProm8.setActive(true);
	    			}
	            	if (GlobalBlackQueenProm >= 9){
	            		Chess.LOGGER.log(Level.SEVERE, "Game cannot handle more than 8 black promotional queens. Exiting game. Black promotional queen count at " + GlobalBlackQueenProm);
	            		System.exit(0);
	    			}
	            }
	        });
	        BishopButton.addActionListener(new java.awt.event.ActionListener() {
	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	Chess.resetMainFrame(PromotionFrame,Light,PromotionPanel,J);
	            	J.setIcon(BlackBishopProm1.getIcon());
	            	GlobalBlackBishopProm++;

	            	if (GlobalBlackBishopProm == 1){
	            		J.setName("Black Bishop (Prom1)");
		    			BlackBishopProm1.setCurrentPositionX(X);
		    			BlackBishopProm1.setCurrentPositionY(7);
		    			BlackBishopProm1.setCurrentPositionXY(X,7);
		    			BlackBishopProm1.setActive(true);
	    			}
	            	if (GlobalBlackBishopProm == 2){
	            		J.setName("Black Bishop (Prom2)");
		    			BlackBishopProm2.setCurrentPositionX(X);
		    			BlackBishopProm2.setCurrentPositionY(7);
		    			BlackBishopProm2.setCurrentPositionXY(X,7);
		    			BlackBishopProm2.setActive(true);
	    			}
	            	if (GlobalBlackBishopProm == 3){
	            		J.setName("Black Bishop (Prom3)");
		    			BlackBishopProm3.setCurrentPositionX(X);
		    			BlackBishopProm3.setCurrentPositionY(7);
		    			BlackBishopProm3.setCurrentPositionXY(X,7);
		    			BlackBishopProm3.setActive(true);
	    			}
	            	if (GlobalBlackBishopProm == 4){
	            		J.setName("Black Bishop (Prom4)");
		    			BlackBishopProm4.setCurrentPositionX(X);
		    			BlackBishopProm4.setCurrentPositionY(7);
		    			BlackBishopProm4.setCurrentPositionXY(X,7);
	    			}
	            	if (GlobalBlackBishopProm == 5){
	            		J.setName("Black Bishop (Prom5)");
		    			BlackBishopProm5.setCurrentPositionX(X);
		    			BlackBishopProm5.setCurrentPositionY(7);
		    			BlackBishopProm5.setCurrentPositionXY(X,7);
		    			BlackBishopProm5.setActive(true);
	    			}
	            	if (GlobalBlackBishopProm == 6){
	            		J.setName("Black Bishop (Prom6)");
		    			BlackBishopProm6.setCurrentPositionX(X);
		    			BlackBishopProm6.setCurrentPositionY(7);
		    			BlackBishopProm6.setCurrentPositionXY(X,7);
		    			BlackBishopProm6.setActive(true);
	    			}
	            	if (GlobalBlackBishopProm == 7){
	            		J.setName("Black Bishop (Prom7)");
		    			BlackBishopProm7.setCurrentPositionX(X);
		    			BlackBishopProm7.setCurrentPositionY(7);
		    			BlackBishopProm7.setCurrentPositionXY(X,7);
		    			BlackBishopProm7.setActive(true);
	    			}
	            	if (GlobalBlackBishopProm == 8){
	            		J.setName("Black Bishop (Prom8)");
		    			BlackBishopProm8.setCurrentPositionX(X);
		    			BlackBishopProm8.setCurrentPositionY(7);
		    			BlackBishopProm8.setCurrentPositionXY(X,7);
		    			BlackBishopProm8.setActive(true);
	    			}
	            	if (GlobalBlackBishopProm >= 9){
	            		Chess.LOGGER.log(Level.SEVERE, "Game cannot handle more than 8 black promotional bishops. Exiting game. Black promotional bishop count at " + GlobalBlackBishopProm);
	            		System.exit(0);
	    			}
	            }
	        });
	        KnightButton.addActionListener(new java.awt.event.ActionListener() {
	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	Chess.resetMainFrame(PromotionFrame,Light,PromotionPanel,J);
	            	J.setIcon(BlackKnightProm1.getIcon());
	            	GlobalBlackKnightProm++;

	            	if (GlobalBlackKnightProm == 1){
	            		J.setName("Black Knight (Prom1)");
		    			BlackKnightProm1.setCurrentPositionX(X);
		    			BlackKnightProm1.setCurrentPositionY(7);
		    			BlackKnightProm1.setCurrentPositionXY(X,7);
		    			BlackKnightProm1.setActive(true);
	    			}
	            	if (GlobalBlackKnightProm == 2){
	            		J.setName("Black Knight (Prom2)");
		    			BlackKnightProm2.setCurrentPositionX(X);
		    			BlackKnightProm2.setCurrentPositionY(7);
		    			BlackKnightProm2.setCurrentPositionXY(X,7);
		    			BlackKnightProm2.setActive(true);
	    			}
	            	if (GlobalBlackKnightProm == 3){
	            		J.setName("Black Knight (Prom3)");
		    			BlackKnightProm3.setCurrentPositionX(X);
		    			BlackKnightProm3.setCurrentPositionY(7);
		    			BlackKnightProm3.setCurrentPositionXY(X,7);
		    			BlackKnightProm3.setActive(true);
	    			}
	            	if (GlobalBlackKnightProm == 4){
	            		J.setName("Black Knight (Prom4)");
		    			BlackKnightProm4.setCurrentPositionX(X);
		    			BlackKnightProm4.setCurrentPositionY(7);
		    			BlackKnightProm4.setCurrentPositionXY(X,7);
	    			}
	            	if (GlobalBlackKnightProm == 5){
	            		J.setName("Black Knight (Prom5)");
		    			BlackKnightProm5.setCurrentPositionX(X);
		    			BlackKnightProm5.setCurrentPositionY(7);
		    			BlackKnightProm5.setCurrentPositionXY(X,7);
		    			BlackKnightProm5.setActive(true);
	    			}
	            	if (GlobalBlackKnightProm == 6){
	            		J.setName("Black Knight (Prom6)");
		    			BlackKnightProm6.setCurrentPositionX(X);
		    			BlackKnightProm6.setCurrentPositionY(7);
		    			BlackKnightProm6.setCurrentPositionXY(X,7);
		    			BlackKnightProm6.setActive(true);
	    			}
	            	if (GlobalBlackKnightProm == 7){
	            		J.setName("Black Knight (Prom7)");
		    			BlackKnightProm7.setCurrentPositionX(X);
		    			BlackKnightProm7.setCurrentPositionY(7);
		    			BlackKnightProm7.setCurrentPositionXY(X,7);
		    			BlackKnightProm7.setActive(true);
	    			}
	            	if (GlobalBlackKnightProm == 8){
	            		J.setName("Black Knight (Prom8)");
		    			BlackKnightProm8.setCurrentPositionX(X);
		    			BlackKnightProm8.setCurrentPositionY(7);
		    			BlackKnightProm8.setCurrentPositionXY(X,7);
		    			BlackKnightProm8.setActive(true);
	    			}
	            	if (GlobalBlackKnightProm >= 9){
	            		Chess.LOGGER.log(Level.SEVERE, "Game cannot handle more than 8 black promotional knights. Exiting game. Black promotional knight count at " + GlobalBlackKnightProm);
	            		System.exit(0);
	          
	    			}
	            }
	        });
		}
    }   
}
