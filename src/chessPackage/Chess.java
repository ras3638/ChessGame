package chessPackage;

import javax.swing.JFrame; 
import javax.swing.JButton; 
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Chess extends JFrame  implements ActionListener {
	
	//Variables
	private static final long serialVersionUID = 1L;
	static boolean Highlighted = false;
	static boolean WhiteTurn = true;
	static boolean ActivateWhiteRightCastle = false;
	static boolean ActivateWhiteLeftCastle = false;
	static boolean ActivateBlackLeftCastle = false;
	static boolean ActivateBlackRightCastle = false;
	static JButton ComingFrom = null;	
	static String CurrentTitle;
	static String CurrentColor;
	static ArrayList<int[]> PossibleXY;
	static boolean ActivateBlackCheck = false;
	static boolean ActivateWhiteCheck = false;
	static Logger LOGGER = Logger.getLogger(Chess.class.getName());
	
	//Grid Coordinates
	static final int[] A8ComXY = {0,0};
	static final int A8ComX = 0;
	static final int A8ComY = 0;

	static final int[] A7ComXY = {0,1};
	static final int A7ComX = 0;
	static final int A7ComY = 1;

	static final int[] A6ComXY = {0,2};
	static final int A6ComX = 0;
	static final int A6ComY = 2;

	static final int[] A5ComXY = {0,3};
	static final int A5ComX = 0;
	static final int A5ComY = 3;

	static final int[] A4ComXY = {0,4};
	static final int A4ComX = 0;
	static final int A4ComY = 4;

	static final int[] A3ComXY = {0,5};
	static final int A3ComX = 0;
	static final int A3ComY = 5;

	static final int[] A2ComXY = {0,6};
	static final int A2ComX = 0;
	static final int A2ComY = 6;

	static final int[] A1ComXY = {0,7};
	static final int A1ComX = 0;
	static final int A1ComY = 7;

	static final int[] B8ComXY = {1,0};
	static final int B8ComX = 1;
	static final int B8ComY = 0;

	static final int[] B7ComXY = {1,1};
	static final int B7ComX = 1;
	static final int B7ComY = 1;

	static final int[] B6ComXY = {1,2};
	static final int B6ComX = 1;
	static final int B6ComY = 2;

	static final int[] B5ComXY = {1,3};
	static final int B5ComX = 1;
	static final int B5ComY = 3;

	static final int[] B4ComXY = {1,4};
	static final int B4ComX = 1;
	static final int B4ComY = 4;

	static final int[] B3ComXY = {1,5};
	static final int B3ComX = 1;
	static final int B3ComY = 5;

	static final int[] B2ComXY = {1,6};
	static final int B2ComX = 1;
	static final int B2ComY = 6;

	static final int[] B1ComXY = {1,7};
	static final int B1ComX = 1;
	static final int B1ComY = 7;

	static final int[] C8ComXY = {2,0};
	static final int C8ComX = 2;
	static final int C8ComY = 0;

	static final int[] C7ComXY = {2,1};
	static final int C7ComX = 2;
	static final int C7ComY = 1;

	static final int[] C6ComXY = {2,2};
	static final int C6ComX = 2;
	static final int C6ComY = 2;

	static final int[] C5ComXY = {2,3};
	static final int C5ComX = 2;
	static final int C5ComY = 3;

	static final int[] C4ComXY = {2,4};
	static final int C4ComX = 2;
	static final int C4ComY = 4;

	static final int[] C3ComXY = {2,5};
	static final int C3ComX = 2;
	static final int C3ComY = 5;

	static final int[] C2ComXY = {2,6};
	static final int C2ComX = 2;
	static final int C2ComY = 6;

	static final int[] C1ComXY = {2,7};
	static final int C1ComX = 2;
	static final int C1ComY = 7;

	static final int[] D8ComXY = {3,0};
	static final int D8ComX = 3;
	static final int D8ComY = 0;

	static final int[] D7ComXY = {3,1};
	static final int D7ComX = 3;
	static final int D7ComY = 1;

	static final int[] D6ComXY = {3,2};
	static final int D6ComX = 3;
	static final int D6ComY = 2;

	static final int[] D5ComXY = {3,3};
	static final int D5ComX = 3;
	static final int D5ComY = 3;

	static final int[] D4ComXY = {3,4};
	static final  int D4ComX = 3;
	static final int D4ComY = 4;

	static final int[] D3ComXY = {3,5};
	static final int D3ComX = 3;
	static final int D3ComY = 5;

	static final int[] D2ComXY = {3,6};
	static final int D2ComX = 3;
	static final int D2ComY = 6;

	static final int[] D1ComXY = {3,7};
	static final int D1ComX = 3;
	static final int D1ComY = 7;

	static final int[] E8ComXY = {4,0};
	static final int E8ComX = 4;
	static final int E8ComY = 0;

	static final int[] E7ComXY = {4,1};
	static final int E7ComX = 4;
	static final int E7ComY = 1;

	static final int[] E6ComXY = {4,2};
	static final int E6ComX = 4;
	static final int E6ComY = 2;

	static final int[] E5ComXY = {4,3};
	static final int E5ComX = 4;
	static final int E5ComY = 3;

	static final int[] E4ComXY = {4,4};
	static final int E4ComX = 4;
	static final int E4ComY = 4;

	static final int[] E3ComXY = {4,5};
	static final int E3ComX = 4;
	static final int E3ComY = 5;

	static final int[] E2ComXY = {4,6};
	static final int E2ComX = 4;
	static final int E2ComY = 6;

	static final int[] E1ComXY = {4,7};
	static final int E1ComX = 4;
	static final int E1ComY = 7;

	static final int[] F8ComXY = {5,0};
	static final int F8ComX = 5;
	static final int F8ComY = 0;

	static final int[] F7ComXY = {5,1};
	static final int F7ComX = 5;
	static final int F7ComY = 1;

	static final int[] F6ComXY = {5,2};
	static final int F6ComX = 5;
	static final int F6ComY = 2;

	static final int[] F5ComXY = {5,3};
	static final int F5ComX = 5;
	static final int F5ComY = 3;

	static final int[] F4ComXY = {5,4};
	static final int F4ComX = 5;
	static final int F4ComY = 4;

	static final int[] F3ComXY = {5,5};
	static final int F3ComX = 5;
	static final int F3ComY = 5;

	static final int[] F2ComXY = {5,6};
	static final int F2ComX = 5;
	static final int F2ComY = 6;

	static final int[] F1ComXY = {5,7};
	static final int F1ComX = 5;
	static final int F1ComY = 7;

	static final int[] G8ComXY = {6,0};
	static final int G8ComX = 6;
	static final int G8ComY = 0;

	static final int[] G7ComXY = {6,1};
	static final int G7ComX = 6;
	static final int G7ComY = 1;

	static final int[] G6ComXY = {6,2};
	static final int G6ComX = 6;
	static final int G6ComY = 2;

	static final int[] G5ComXY = {6,3};
	static final int G5ComX = 6;
	static final int G5ComY = 3;

	static final int[] G4ComXY = {6,4};
	static final int G4ComX = 6;
	static final int G4ComY = 4;

	static final int[] G3ComXY = {6,5};
	static final int G3ComX = 6;
	static final int G3ComY = 5;

	static final int[] G2ComXY = {6,6};
	static final int G2ComX = 6;
	static final int G2ComY = 6;

	static final int[] G1ComXY = {6,7};
	static final int G1ComX = 6;
	static final int G1ComY = 7;

	static final int[] H8ComXY = {7,0};
	static final int H8ComX = 7;
	static final int H8ComY = 0;

	static final int[] H7ComXY = {7,1};
	static final int H7ComX = 7;
	static final int H7ComY = 1;

	static final int[] H6ComXY = {7,2};
	static final int H6ComX = 7;
	static final int H6ComY = 2;

	static final int[] H5ComXY = {7,3};
	static final int H5ComX = 7;
	static final int H5ComY = 3;

	static final int[] H4ComXY = {7,4};
	static final int H4ComX = 7;
	static final int H4ComY = 4;

	static final int[] H3ComXY = {7,5};
	static final int H3ComX = 7;
	static final int H3ComY = 5;

	static final int[] H2ComXY = {7,6};
	static final int H2ComX = 7;
	static final int H2ComY = 6;

	static final int[] H1ComXY = {7,7};
	static final int H1ComX = 7;
	static final int H1ComY = 7;

	//A File
	static ChessButton.LightChessButton bA8 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bA7 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bA6 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bA5 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bA4 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bA3 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bA2 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bA1 = new ChessButton().new DarkChessButton();

	//B File
	static ChessButton.DarkChessButton bB8 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bB7 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bB6 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bB5 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bB4 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bB3 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bB2 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bB1 = new ChessButton().new LightChessButton();

	//C File
	static ChessButton.LightChessButton bC8 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bC7 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bC6 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bC5 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bC4 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bC3 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bC2 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bC1 = new ChessButton().new DarkChessButton();

	//D File
	static ChessButton.DarkChessButton bD8 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bD7 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bD6 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bD5 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bD4 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bD3 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bD2 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bD1 = new ChessButton().new LightChessButton();

	//E File
	static ChessButton.LightChessButton bE8 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bE7 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bE6 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bE5 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bE4 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bE3 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bE2 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bE1 = new ChessButton().new DarkChessButton();

	//F File
	static ChessButton.DarkChessButton bF8 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bF7 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bF6 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bF5 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bF4 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bF3 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bF2 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bF1 = new ChessButton().new LightChessButton();

	//G File
	static ChessButton.LightChessButton bG8 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bG7 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bG6 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bG5 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bG4 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bG3 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bG2 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bG1 = new ChessButton().new DarkChessButton();

	//H File
	static ChessButton.DarkChessButton bH8 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bH7 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bH6 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bH5 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bH4 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bH3 = new ChessButton().new LightChessButton();
	static ChessButton.DarkChessButton bH2 = new ChessButton().new DarkChessButton();
	static ChessButton.LightChessButton bH1 = new ChessButton().new LightChessButton();
	

	static JFrame frame = new JFrame(); //creates frame
	static JButton[][] grid; //names the grid of buttons
	public Chess(int width, int length){ 
		frame.setLayout(new GridLayout(width,length)); //set layout
		grid=new JButton[width][length]; //allocate the size of grid
		for(int y=0; y<length; y++){
			for(int x=0; x<width; x++){
				//A file
				if (x == 0 && y == 0){
					grid[x][y] = bA8;
					bA8.setIcon(BlackRookA8.getIcon());
					bA8.setName(BlackRookA8.getTitle());
				}
				if (x == 0 && y == 1){
					grid[x][y] = bA7;
					bA7.setIcon(BlackPawnA7.getIcon());
					bA7.setName(BlackPawnA7.getTitle());
				}
				if (x == 0 && y == 2){
					grid[x][y] = bA6;
				}
				if (x == 0 && y == 3){
					grid[x][y] = bA5;
				}
				if (x == 0 && y == 4){
					grid[x][y] = bA4;
				}
				if (x == 0 && y == 5){
					grid[x][y] = bA3;
				}
				if (x == 0 && y == 6){
					grid[x][y] = bA2;
					bA2.setIcon(WhitePawnA2.getIcon());
					bA2.setName(WhitePawnA2.getTitle());
				}
				if (x == 0 && y == 7){
					grid[x][y] = bA1;
					bA1.setIcon(WhiteRookA1.getIcon());
					bA1.setName(WhiteRookA1.getTitle());
				}
				//B File

				if (x == 1 && y == 0){
					grid[x][y] = bB8;
					bB8.setIcon(BlackKnightB8.getIcon());
					bB8.setName(BlackKnightB8.getTitle());
				}
				if (x == 1 && y == 1){
					grid[x][y] = bB7;
					bB7.setIcon(BlackPawnB7.getIcon());
					bB7.setName(BlackPawnB7.getTitle());
				}
				if (x == 1 && y == 2){
					grid[x][y] = bB6;
				}
				if (x == 1 && y == 3){
					grid[x][y] = bB5;
				}
				if (x == 1 && y == 4){
					grid[x][y] = bB4;
				}
				if (x == 1 && y == 5){
					grid[x][y] = bB3;
				}
				if (x == 1 && y == 6){
					grid[x][y] = bB2;
					bB2.setIcon(WhitePawnB2.getIcon());
					bB2.setName(WhitePawnB2.getTitle());
				}
				if (x == 1 && y == 7){
					grid[x][y] = bB1;
					bB1.setIcon(WhiteKnightB1.getIcon());
					bB1.setName(WhiteKnightB1.getTitle());
				}

				//C File
				if (x == 2 && y == 0){
					grid[x][y] = bC8;
					bC8.setIcon(BlackBishopC8.getIcon());
					bC8.setName(BlackBishopC8.getTitle());
				}
				if (x == 2 && y == 1){
					grid[x][y] = bC7;
					bC7.setIcon(BlackPawnC7.getIcon());
					bC7.setName(BlackPawnC7.getTitle());
				}
				if (x == 2 && y == 2){
					grid[x][y] = bC6;
				}
				if (x == 2 && y == 3){
					grid[x][y] = bC5;
				}
				if (x == 2 && y == 4){
					grid[x][y] = bC4;
				}
				if (x == 2 && y == 5){
					grid[x][y] = bC3;
				}
				if (x == 2 && y == 6){
					grid[x][y] = bC2;
					bC2.setIcon(WhitePawnC2.getIcon());
					bC2.setName(WhitePawnC2.getTitle());
				}
				if (x == 2 && y == 7){
					grid[x][y] = bC1;
					bC1.setIcon(WhiteBishopC1.getIcon());
					bC1.setName(WhiteBishopC1.getTitle());
				}

				//D File
				if (x == 3 && y == 0){
					grid[x][y] = bD8;
					bD8.setIcon(BlackQueenD8.getIcon());
					bD8.setName(BlackQueenD8.getTitle());
				}
				if (x == 3 && y == 1){
					grid[x][y] = bD7;
					bD7.setIcon(BlackPawnD7.getIcon());
					bD7.setName(BlackPawnD7.getTitle());
				}
				if (x == 3 && y == 2){
					grid[x][y] = bD6;
				}
				if (x == 3 && y == 3){
					grid[x][y] = bD5;
				}
				if (x == 3 && y == 4){
					grid[x][y] = bD4;
				}
				if (x == 3 && y == 5){
					grid[x][y] = bD3;
				}
				if (x == 3 && y == 6){
					grid[x][y] = bD2;
					bD2.setIcon(WhitePawnD2.getIcon());
					bD2.setName(WhitePawnD2.getTitle());
				}
				if (x == 3 && y == 7){
					grid[x][y] = bD1;
					bD1.setIcon(WhiteQueenD1.getIcon());
					bD1.setName(WhiteQueenD1.getTitle());
				}

				//E File
				if (x == 4 && y == 0){
					grid[x][y] = bE8;
					bE8.setIcon(BlackKingE8.getIcon());
					bE8.setName(BlackKingE8.getTitle());
				}
				if (x == 4 && y == 1){
					grid[x][y] = bE7;				
					bE7.setIcon(BlackPawnE7.getIcon());
					bE7.setName(BlackPawnE7.getTitle());
				}
				if (x == 4 && y == 2){
					grid[x][y] = bE6;
				}
				if (x == 4 && y == 3){
					grid[x][y] = bE5;
				}
				if (x == 4 && y == 4){
					grid[x][y] = bE4;
				}
				if (x == 4 && y == 5){
					grid[x][y] = bE3;
				}
				if (x == 4 && y == 6){
					grid[x][y] = bE2;
					bE2.setIcon(WhitePawnE2.getIcon());
					bE2.setName(WhitePawnE2.getTitle());
				}
				if (x == 4 && y == 7){
					grid[x][y] = bE1;
					bE1.setIcon(WhiteKingE1.getIcon());
					bE1.setName(WhiteKingE1.getTitle());
				}

				//F File
				if (x == 5 && y == 0){
					grid[x][y] = bF8;
					bF8.setIcon(BlackBishopF8.getIcon());
					bF8.setName(BlackBishopF8.getTitle());
				}
				if (x == 5 && y == 1){
					grid[x][y] = bF7;
					bF7.setIcon(BlackPawnF7.getIcon());
					bF7.setName(BlackPawnF7.getTitle());
				}
				if (x == 5 && y == 2){
					grid[x][y] = bF6;
				}
				if (x == 5 && y == 3){
					grid[x][y] = bF5;
				}
				if (x == 5 && y == 4){
					grid[x][y] = bF4;
				}
				if (x == 5 && y == 5){
					grid[x][y] = bF3;
				}
				if (x == 5 && y == 6){
					grid[x][y] = bF2;
					bF2.setIcon(WhitePawnF2.getIcon());
					bF2.setName(WhitePawnF2.getTitle());
				}
				if (x == 5 && y == 7){
					grid[x][y] = bF1;
					bF1.setIcon(WhiteBishopF1.getIcon());
					bF1.setName(WhiteBishopF1.getTitle());
				}

				//G File
				if (x == 6 && y == 0){
					grid[x][y] = bG8;
					bG8.setIcon(BlackKnightG8.getIcon());
					bG8.setName(BlackKnightG8.getTitle());
				}
				if (x == 6 && y == 1){
					grid[x][y] = bG7;
					bG7.setIcon(BlackPawnG7.getIcon());
					bG7.setName(BlackPawnG7.getTitle());
				}
				if (x == 6 && y == 2){
					grid[x][y] = bG6;
				}
				if (x == 6 && y == 3){
					grid[x][y] = bG5;
				}
				if (x == 6 && y == 4){
					grid[x][y] = bG4;
				}
				if (x == 6 && y == 5){
					grid[x][y] = bG3;
				}
				if (x == 6 && y == 6){
					grid[x][y] = bG2;
					bG2.setIcon(WhitePawnG2.getIcon());
					bG2.setName(WhitePawnG2.getTitle());
				}
				if (x == 6 && y == 7){
					grid[x][y] = bG1;
					bG1.setIcon(WhiteKnightG1.getIcon());
					bG1.setName(WhiteKnightG1.getTitle());
				}

				//H File
				if (x == 7 && y == 0){
					grid[x][y] = bH8;
					bH8.setIcon(BlackRookH8.getIcon());
					bH8.setName(BlackRookH8.getTitle());
				}
				if (x == 7 && y == 1){
					grid[x][y] = bH7;
					bH7.setIcon(BlackPawnH7.getIcon());
					bH7.setName(BlackPawnH7.getTitle());
				}
				if (x == 7 && y == 2){
					grid[x][y] = bH6;
				}
				if (x == 7 && y == 3){
					grid[x][y] = bH5;
				}
				if (x == 7 && y == 4){
					grid[x][y] = bH4;
				}
				if (x == 7 && y == 5){
					grid[x][y] = bH3;

				}
				if (x == 7 && y == 6){
					grid[x][y] = bH2;
					bH2.setIcon(WhitePawnH2.getIcon());
					bH2.setName(WhitePawnH2.getTitle());

				}
				if (x == 7 && y == 7){
					grid[x][y] = bH1;
					bH1.setIcon(WhiteRookH1.getIcon());
					bH1.setName(WhiteRookH1.getTitle());
				}

				//adds button to grid
				frame.add(grid[x][y]);
			}
		}
		SetActionCommand();
		new MenuBar();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack(); //sets appropriate size for frame
		frame.setVisible(true); //makes frame visible
		ResetSelection();
		
		
	}
	void SetActionCommand(){
		//A File
		bA8.setActionCommand("A8Com");
		bA7.setActionCommand("A7Com");
		bA6.setActionCommand("A6Com");
		bA5.setActionCommand("A5Com");
		bA4.setActionCommand("A4Com");
		bA3.setActionCommand("A3Com");
		bA2.setActionCommand("A2Com");
		bA1.setActionCommand("A1Com");
		bA8.addActionListener(this);
		bA7.addActionListener(this);
		bA6.addActionListener(this);
		bA5.addActionListener(this);
		bA4.addActionListener(this);
		bA3.addActionListener(this);
		bA2.addActionListener(this);
		bA1.addActionListener(this);

		//B File
		bB8.setActionCommand("B8Com");
		bB7.setActionCommand("B7Com");
		bB6.setActionCommand("B6Com");
		bB5.setActionCommand("B5Com");
		bB4.setActionCommand("B4Com");
		bB3.setActionCommand("B3Com");
		bB2.setActionCommand("B2Com");
		bB1.setActionCommand("B1Com");
		bB8.addActionListener(this);
		bB7.addActionListener(this);
		bB6.addActionListener(this);
		bB5.addActionListener(this);
		bB4.addActionListener(this);
		bB3.addActionListener(this);
		bB2.addActionListener(this);
		bB1.addActionListener(this);

		//C File
		bC8.setActionCommand("C8Com");
		bC7.setActionCommand("C7Com");
		bC6.setActionCommand("C6Com");
		bC5.setActionCommand("C5Com");
		bC4.setActionCommand("C4Com");
		bC3.setActionCommand("C3Com");
		bC2.setActionCommand("C2Com");
		bC1.setActionCommand("C1Com");
		bC8.addActionListener(this);
		bC7.addActionListener(this);
		bC6.addActionListener(this);
		bC5.addActionListener(this);
		bC4.addActionListener(this);
		bC3.addActionListener(this);
		bC2.addActionListener(this);
		bC1.addActionListener(this);

		//D File
		bD8.setActionCommand("D8Com");
		bD7.setActionCommand("D7Com");
		bD6.setActionCommand("D6Com");
		bD5.setActionCommand("D5Com");
		bD4.setActionCommand("D4Com");
		bD3.setActionCommand("D3Com");
		bD2.setActionCommand("D2Com");
		bD1.setActionCommand("D1Com");
		bD8.addActionListener(this);
		bD7.addActionListener(this);
		bD6.addActionListener(this);
		bD5.addActionListener(this);
		bD4.addActionListener(this);
		bD3.addActionListener(this);
		bD2.addActionListener(this);
		bD1.addActionListener(this);

		//E File
		bE8.setActionCommand("E8Com");
		bE7.setActionCommand("E7Com");
		bE6.setActionCommand("E6Com");
		bE5.setActionCommand("E5Com");
		bE4.setActionCommand("E4Com");
		bE3.setActionCommand("E3Com");
		bE2.setActionCommand("E2Com");
		bE1.setActionCommand("E1Com");
		bE8.addActionListener(this);
		bE7.addActionListener(this);
		bE6.addActionListener(this);
		bE5.addActionListener(this);
		bE4.addActionListener(this);
		bE3.addActionListener(this);
		bE2.addActionListener(this);
		bE1.addActionListener(this);

		//F File
		bF8.setActionCommand("F8Com");
		bF7.setActionCommand("F7Com");
		bF6.setActionCommand("F6Com");
		bF5.setActionCommand("F5Com");
		bF4.setActionCommand("F4Com");
		bF3.setActionCommand("F3Com");
		bF2.setActionCommand("F2Com");
		bF1.setActionCommand("F1Com");
		bF8.addActionListener(this);
		bF7.addActionListener(this);
		bF6.addActionListener(this);
		bF5.addActionListener(this);
		bF4.addActionListener(this);
		bF3.addActionListener(this);
		bF2.addActionListener(this);
		bF1.addActionListener(this);

		//G File
		bG8.setActionCommand("G8Com");
		bG7.setActionCommand("G7Com");
		bG6.setActionCommand("G6Com");
		bG5.setActionCommand("G5Com");
		bG4.setActionCommand("G4Com");
		bG3.setActionCommand("G3Com");
		bG2.setActionCommand("G2Com");
		bG1.setActionCommand("G1Com");
		bG8.addActionListener(this);
		bG7.addActionListener(this);
		bG6.addActionListener(this);
		bG5.addActionListener(this);
		bG4.addActionListener(this);
		bG3.addActionListener(this);
		bG2.addActionListener(this);
		bG1.addActionListener(this);

		//H File
		bH8.setActionCommand("H8Com");
		bH7.setActionCommand("H7Com");
		bH6.setActionCommand("H6Com");
		bH5.setActionCommand("H5Com");
		bH4.setActionCommand("H4Com");
		bH3.setActionCommand("H3Com");
		bH2.setActionCommand("H2Com");
		bH1.setActionCommand("H1Com");
		bH8.addActionListener(this);
		bH7.addActionListener(this);
		bH6.addActionListener(this);
		bH5.addActionListener(this);
		bH4.addActionListener(this);
		bH3.addActionListener(this);
		bH2.addActionListener(this);
		bH1.addActionListener(this);
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Chess");
		new Chess(8, 8);
	    try {
	    	System.setProperty("apple.laf.useScreenMenuBar", "true");
	    	LoggerUtil.setup();
	      
	    }
	    catch (Throwable e) {
	        e.printStackTrace();
	    }	
	}
	static void ResetSelection(){
		bA8.setSelected(false);
		bA7.setSelected(false);
		bA6.setSelected(false);
		bA5.setSelected(false);
		bA4.setSelected(false);
		bA3.setSelected(false);
		bA2.setSelected(false);
		bA1.setSelected(false);

		bB8.setSelected(false);
		bB7.setSelected(false);
		bB6.setSelected(false);
		bB5.setSelected(false);
		bB4.setSelected(false);
		bB3.setSelected(false);
		bB2.setSelected(false);
		bB1.setSelected(false);

		bC8.setSelected(false);
		bC7.setSelected(false);
		bC6.setSelected(false);
		bC5.setSelected(false);
		bC4.setSelected(false);
		bC3.setSelected(false);
		bC2.setSelected(false);
		bC1.setSelected(false);

		bD8.setSelected(false);
		bD7.setSelected(false);
		bD6.setSelected(false);
		bD5.setSelected(false);
		bD4.setSelected(false);
		bD3.setSelected(false);
		bD2.setSelected(false);
		bD1.setSelected(false);

		bE8.setSelected(false);
		bE7.setSelected(false);
		bE6.setSelected(false);
		bE5.setSelected(false);
		bE4.setSelected(false);
		bE3.setSelected(false);
		bE2.setSelected(false);
		bE1.setSelected(false);

		bF8.setSelected(false);
		bF7.setSelected(false);
		bF6.setSelected(false);
		bF5.setSelected(false);
		bF4.setSelected(false);
		bF3.setSelected(false);
		bF2.setSelected(false);
		bF1.setSelected(false);

		bG8.setSelected(false);
		bG7.setSelected(false);
		bG6.setSelected(false);
		bG5.setSelected(false);
		bG4.setSelected(false);
		bG3.setSelected(false);
		bG2.setSelected(false);
		bG1.setSelected(false);

		bH8.setSelected(false);
		bH7.setSelected(false);
		bH6.setSelected(false);
		bH5.setSelected(false);
		bH4.setSelected(false);
		bH3.setSelected(false);
		bH2.setSelected(false);
		bH1.setSelected(false);

		bA8.setBorder(new LineBorder(Color.black, 2,true));
		bA7.setBorder(new LineBorder(Color.black, 2,true));
		bA6.setBorder(new LineBorder(Color.black, 2,true));
		bA5.setBorder(new LineBorder(Color.black, 2,true));
		bA4.setBorder(new LineBorder(Color.black, 2,true));
		bA3.setBorder(new LineBorder(Color.black, 2,true));
		bA2.setBorder(new LineBorder(Color.black, 2,true));
		bA1.setBorder(new LineBorder(Color.black, 2,true));
		bB8.setBorder(new LineBorder(Color.black, 2,true));
		bB7.setBorder(new LineBorder(Color.black, 2,true));
		bB6.setBorder(new LineBorder(Color.black, 2,true));
		bB5.setBorder(new LineBorder(Color.black, 2,true));
		bB4.setBorder(new LineBorder(Color.black, 2,true));
		bB3.setBorder(new LineBorder(Color.black, 2,true));
		bB2.setBorder(new LineBorder(Color.black, 2,true));
		bB1.setBorder(new LineBorder(Color.black, 2,true));
		bC8.setBorder(new LineBorder(Color.black, 2,true));
		bC7.setBorder(new LineBorder(Color.black, 2,true));
		bC6.setBorder(new LineBorder(Color.black, 2,true));
		bC5.setBorder(new LineBorder(Color.black, 2,true));
		bC4.setBorder(new LineBorder(Color.black, 2,true));
		bC3.setBorder(new LineBorder(Color.black, 2,true));
		bC2.setBorder(new LineBorder(Color.black, 2,true));
		bC1.setBorder(new LineBorder(Color.black, 2,true));

		bD8.setBorder(new LineBorder(Color.black, 2,true));
		bD7.setBorder(new LineBorder(Color.black, 2,true));
		bD6.setBorder(new LineBorder(Color.black, 2,true));
		bD5.setBorder(new LineBorder(Color.black, 2,true));
		bD4.setBorder(new LineBorder(Color.black, 2,true));
		bD3.setBorder(new LineBorder(Color.black, 2,true));
		bD2.setBorder(new LineBorder(Color.black, 2,true));
		bD1.setBorder(new LineBorder(Color.black, 2,true));

		bE8.setBorder(new LineBorder(Color.black, 2,true));
		bE7.setBorder(new LineBorder(Color.black, 2,true));
		bE6.setBorder(new LineBorder(Color.black, 2,true));
		bE5.setBorder(new LineBorder(Color.black, 2,true));
		bE4.setBorder(new LineBorder(Color.black, 2,true));
		bE3.setBorder(new LineBorder(Color.black, 2,true));
		bE2.setBorder(new LineBorder(Color.black, 2,true));
		bE1.setBorder(new LineBorder(Color.black, 2,true));

		bF8.setBorder(new LineBorder(Color.black, 2,true));
		bF7.setBorder(new LineBorder(Color.black, 2,true));
		bF6.setBorder(new LineBorder(Color.black, 2,true));
		bF5.setBorder(new LineBorder(Color.black, 2,true));
		bF4.setBorder(new LineBorder(Color.black, 2,true));
		bF3.setBorder(new LineBorder(Color.black, 2,true));
		bF2.setBorder(new LineBorder(Color.black, 2,true));
		bF1.setBorder(new LineBorder(Color.black, 2,true));

		bG8.setBorder(new LineBorder(Color.black, 2,true));
		bG7.setBorder(new LineBorder(Color.black, 2,true));
		bG6.setBorder(new LineBorder(Color.black, 2,true));
		bG5.setBorder(new LineBorder(Color.black, 2,true));
		bG4.setBorder(new LineBorder(Color.black, 2,true));
		bG3.setBorder(new LineBorder(Color.black, 2,true));
		bG2.setBorder(new LineBorder(Color.black, 2,true));
		bG1.setBorder(new LineBorder(Color.black, 2,true));

		bH8.setBorder(new LineBorder(Color.black, 2,true));
		bH7.setBorder(new LineBorder(Color.black, 2,true));
		bH6.setBorder(new LineBorder(Color.black, 2,true));
		bH5.setBorder(new LineBorder(Color.black, 2,true));
		bH4.setBorder(new LineBorder(Color.black, 2,true));
		bH3.setBorder(new LineBorder(Color.black, 2,true));
		bH2.setBorder(new LineBorder(Color.black, 2,true));
		bH1.setBorder(new LineBorder(Color.black, 2,true));


	}
	static void resetWhiteEnPassat(){
		WhitePawnA2.setEnPassant(false);
		WhitePawnB2.setEnPassant(false);
		WhitePawnC2.setEnPassant(false);	
		WhitePawnD2.setEnPassant(false);
		WhitePawnE2.setEnPassant(false);
		WhitePawnF2.setEnPassant(false);
		WhitePawnG2.setEnPassant(false);
		WhitePawnH2.setEnPassant(false);
	}
	static void resetBlackEnPassat(){
		BlackPawnA7.setEnPassant(false);
		BlackPawnB7.setEnPassant(false);
		BlackPawnC7.setEnPassant(false);
		BlackPawnD7.setEnPassant(false);
		BlackPawnE7.setEnPassant(false);
		BlackPawnF7.setEnPassant(false);
		BlackPawnG7.setEnPassant(false);
		BlackPawnH7.setEnPassant(false);
	}
	static String getPiece(int x,int y){
		
		String NoPiece = "NoPiece";
		
		if (WhitePawnH2.getCurrentPositionX() == x && WhitePawnH2.getCurrentPositionY() == y){
			return WhitePawnH2.getTitle();
		}	
		if (WhitePawnG2.getCurrentPositionX() == x && WhitePawnG2.getCurrentPositionY() == y){
			return WhitePawnG2.getTitle();
		}	
		if (WhitePawnF2.getCurrentPositionX() == x && WhitePawnF2.getCurrentPositionY() == y){
			return WhitePawnF2.getTitle();
		}	
		if (WhitePawnE2.getCurrentPositionX() == x && WhitePawnE2.getCurrentPositionY() == y){
			return WhitePawnE2.getTitle();
		}	
		if (WhiteKnightG1.getCurrentPositionX() == x && WhiteKnightG1.getCurrentPositionY() == y){
			return WhiteKnightG1.getTitle();
		}	
		if (WhiteBishopF1.getCurrentPositionX() == x && WhiteBishopF1.getCurrentPositionY() == y){
			return WhiteBishopF1.getTitle();
		}	
		if (WhitePawnD2.getCurrentPositionX() == x && WhitePawnD2.getCurrentPositionY() == y){
			return WhitePawnD2.getTitle();
		}	
		if (WhiteRookH1.getCurrentPositionX() == x && WhiteRookH1.getCurrentPositionY() == y){
			return WhiteRookH1.getTitle();
		}	
		if (WhiteQueenD1.getCurrentPositionX() == x && WhiteQueenD1.getCurrentPositionY() == y){
			return WhiteQueenD1.getTitle();
		}
		if (WhitePawnA2.getCurrentPositionX() == x && WhitePawnA2.getCurrentPositionY() == y){
			return WhitePawnA2.getTitle();
		}
		if (WhitePawnB2.getCurrentPositionX() == x && WhitePawnB2.getCurrentPositionY() == y){
			return WhitePawnB2.getTitle();
		}
		if (WhiteKingE1.getCurrentPositionX() == x && WhiteKingE1.getCurrentPositionY() == y){
			return WhiteKingE1.getTitle();
		}
		if (WhiteKnightB1.getCurrentPositionX() == x && WhiteKnightB1.getCurrentPositionY() == y){
			return WhiteKnightB1.getTitle();
		}
		if (WhitePawnC2.getCurrentPositionX() == x && WhitePawnC2.getCurrentPositionY() == y){
			return WhitePawnC2.getTitle();
		}
		if (WhiteRookA1.getCurrentPositionX() == x && WhiteRookA1.getCurrentPositionY() == y){
			return WhiteRookA1.getTitle();
		}
		if (WhiteBishopC1.getCurrentPositionX() == x && WhiteBishopC1.getCurrentPositionY() == y){
			return WhiteBishopC1.getTitle();
		}
		if (BlackRookH8.getCurrentPositionX() == x && BlackRookH8.getCurrentPositionY() == y){
			return BlackRookH8.getTitle();
		}
		if (BlackPawnA7.getCurrentPositionX() == x && BlackPawnA7.getCurrentPositionY() == y){
			return BlackPawnA7.getTitle();
		}
		if (BlackPawnB7.getCurrentPositionX() == x && BlackPawnB7.getCurrentPositionY() == y){
			return BlackPawnB7.getTitle();
		}
		if (BlackKingE8.getCurrentPositionX() == x && BlackKingE8.getCurrentPositionY() == y){
			return BlackKingE8.getTitle();
		}
		if (BlackKnightG8.getCurrentPositionX() == x && BlackKnightG8.getCurrentPositionY() == y){
			return BlackKnightG8.getTitle();
		}
		if (BlackKnightB8.getCurrentPositionX() == x && BlackKnightB8.getCurrentPositionY() == y){
			return BlackKnightB8.getTitle();
		}
		if (BlackPawnC7.getCurrentPositionX() == x && BlackPawnC7.getCurrentPositionY() == y){
			return BlackPawnC7.getTitle();
		}
		if (BlackPawnD7.getCurrentPositionX() == x && BlackPawnD7.getCurrentPositionY() == y){
			return BlackPawnD7.getTitle();
		}
		if (BlackPawnE7.getCurrentPositionX() == x && BlackPawnE7.getCurrentPositionY() == y){
			return BlackPawnE7.getTitle();
		}
		if (BlackPawnF7.getCurrentPositionX() == x && BlackPawnF7.getCurrentPositionY() == y){
			return BlackPawnF7.getTitle();
		}
		if (BlackPawnG7.getCurrentPositionX() == x && BlackPawnG7.getCurrentPositionY() == y){
			return BlackPawnG7.getTitle();
		}
		if (BlackPawnH7.getCurrentPositionX() == x && BlackPawnH7.getCurrentPositionY() == y){
			return BlackPawnH7.getTitle();
		}
		if (BlackRookA8.getCurrentPositionX() == x && BlackRookA8.getCurrentPositionY() == y){
			return BlackRookA8.getTitle();
		}
		if (BlackBishopC8.getCurrentPositionX() == x && BlackBishopC8.getCurrentPositionY() == y){
			return BlackBishopC8.getTitle();
		}
		if (BlackBishopF8.getCurrentPositionX() == x && BlackBishopF8.getCurrentPositionY() == y){
			return BlackBishopF8.getTitle();
		}
		if (BlackQueenD8.getCurrentPositionX() == x && BlackQueenD8.getCurrentPositionY() == y){
			return BlackQueenD8.getTitle();
		}
		if (BlackRookH8.getCurrentPositionX() == x && BlackRookH8.getCurrentPositionY() == y){
			return BlackRookH8.getTitle();
		}
		if (WhiteKnightProm8.getCurrentPositionX() == x && WhiteKnightProm8.getCurrentPositionY() == y){
			return WhiteKnightProm8.getTitle();
		}
		if (WhiteKnightProm7.getCurrentPositionX() == x && WhiteKnightProm7.getCurrentPositionY() == y){
			return WhiteKnightProm7.getTitle();
		}
		if (WhiteKnightProm6.getCurrentPositionX() == x && WhiteKnightProm6.getCurrentPositionY() == y){
			return WhiteKnightProm6.getTitle();
		}
		if (WhiteKnightProm5.getCurrentPositionX() == x && WhiteKnightProm5.getCurrentPositionY() == y){
			return WhiteKnightProm5.getTitle();
		}
		if (WhiteKnightProm4.getCurrentPositionX() == x && WhiteKnightProm4.getCurrentPositionY() == y){
			return WhiteKnightProm4.getTitle();
		}
		if (WhiteKnightProm3.getCurrentPositionX() == x && WhiteKnightProm3.getCurrentPositionY() == y){
			return WhiteKnightProm3.getTitle();
		}
		if (WhiteKnightProm2.getCurrentPositionX() == x && WhiteKnightProm2.getCurrentPositionY() == y){
			return WhiteKnightProm2.getTitle();
		}
		if (WhiteKnightProm1.getCurrentPositionX() == x && WhiteKnightProm1.getCurrentPositionY() == y){
			return WhiteKnightProm1.getTitle();
		}
		if (WhiteBishopProm8.getCurrentPositionX() == x && WhiteBishopProm8.getCurrentPositionY() == y){
			return WhiteBishopProm8.getTitle();
		}
		if (WhiteBishopProm7.getCurrentPositionX() == x && WhiteBishopProm7.getCurrentPositionY() == y){
			return WhiteBishopProm7.getTitle();
		}
		if (WhiteBishopProm6.getCurrentPositionX() == x && WhiteBishopProm6.getCurrentPositionY() == y){
			return WhiteBishopProm6.getTitle();
		}
		if (WhiteBishopProm5.getCurrentPositionX() == x && WhiteBishopProm5.getCurrentPositionY() == y){
			return WhiteBishopProm5.getTitle();
		}
		if (WhiteBishopProm4.getCurrentPositionX() == x && WhiteBishopProm4.getCurrentPositionY() == y){
			return WhiteBishopProm4.getTitle();
		}
		if (WhiteBishopProm3.getCurrentPositionX() == x && WhiteBishopProm3.getCurrentPositionY() == y){
			return WhiteBishopProm3.getTitle();
		}
		if (WhiteBishopProm2.getCurrentPositionX() == x && WhiteBishopProm2.getCurrentPositionY() == y){
			return WhiteBishopProm2.getTitle();
		}
		if (WhiteBishopProm1.getCurrentPositionX() == x && WhiteBishopProm1.getCurrentPositionY() == y){
			return WhiteBishopProm1.getTitle();
		}
		if (WhiteQueenProm8.getCurrentPositionX() == x && WhiteQueenProm8.getCurrentPositionY() == y){
			return WhiteQueenProm8.getTitle();
		}
		if (WhiteQueenProm7.getCurrentPositionX() == x && WhiteQueenProm7.getCurrentPositionY() == y){
			return WhiteQueenProm7.getTitle();
		}
		if (WhiteQueenProm6.getCurrentPositionX() == x && WhiteQueenProm6.getCurrentPositionY() == y){
			return WhiteQueenProm6.getTitle();
		}
		if (WhiteQueenProm5.getCurrentPositionX() == x && WhiteQueenProm5.getCurrentPositionY() == y){
			return WhiteQueenProm5.getTitle();
		}
		if (WhiteQueenProm4.getCurrentPositionX() == x && WhiteQueenProm4.getCurrentPositionY() == y){
			return WhiteQueenProm4.getTitle();
		}
		if (WhiteQueenProm3.getCurrentPositionX() == x && WhiteQueenProm3.getCurrentPositionY() == y){
			return WhiteQueenProm3.getTitle();
		}
		if (WhiteQueenProm2.getCurrentPositionX() == x && WhiteQueenProm2.getCurrentPositionY() == y){
			return WhiteQueenProm2.getTitle();
		}
		if (WhiteQueenProm1.getCurrentPositionX() == x && WhiteQueenProm1.getCurrentPositionY() == y){
			return WhiteQueenProm1.getTitle();
		}
		if (WhiteRookProm8.getCurrentPositionX() == x && WhiteRookProm8.getCurrentPositionY() == y){
			return WhiteRookProm8.getTitle();
		}
		if (WhiteRookProm7.getCurrentPositionX() == x && WhiteRookProm7.getCurrentPositionY() == y){
			return WhiteRookProm7.getTitle();
		}
		if (WhiteRookProm6.getCurrentPositionX() == x && WhiteRookProm6.getCurrentPositionY() == y){
			return WhiteRookProm6.getTitle();
		}
		if (WhiteRookProm5.getCurrentPositionX() == x && WhiteRookProm5.getCurrentPositionY() == y){
			return WhiteRookProm5.getTitle();
		}
		if (WhiteRookProm4.getCurrentPositionX() == x && WhiteRookProm4.getCurrentPositionY() == y){
			return WhiteRookProm4.getTitle();
		}
		if (WhiteRookProm3.getCurrentPositionX() == x && WhiteRookProm3.getCurrentPositionY() == y){
			return WhiteRookProm3.getTitle();
		}
		if (WhiteRookProm2.getCurrentPositionX() == x && WhiteRookProm2.getCurrentPositionY() == y){
			return WhiteRookProm2.getTitle();
		}
		if (WhiteRookProm1.getCurrentPositionX() == x && WhiteRookProm1.getCurrentPositionY() == y){
			return WhiteRookProm1.getTitle();
		}
		if (BlackKnightProm8.getCurrentPositionX() == x && BlackKnightProm8.getCurrentPositionY() == y){
			return BlackKnightProm8.getTitle();
		}
		if (BlackKnightProm7.getCurrentPositionX() == x && BlackKnightProm7.getCurrentPositionY() == y){
			return BlackKnightProm7.getTitle();
		}
		if (BlackKnightProm6.getCurrentPositionX() == x && BlackKnightProm6.getCurrentPositionY() == y){
			return BlackKnightProm6.getTitle();
		}
		if (BlackKnightProm5.getCurrentPositionX() == x && BlackKnightProm5.getCurrentPositionY() == y){
			return BlackKnightProm5.getTitle();
		}
		if (BlackKnightProm4.getCurrentPositionX() == x && BlackKnightProm4.getCurrentPositionY() == y){
			return BlackKnightProm4.getTitle();
		}
		if (BlackKnightProm3.getCurrentPositionX() == x && BlackKnightProm3.getCurrentPositionY() == y){
			return BlackKnightProm3.getTitle();
		}
		if (BlackKnightProm2.getCurrentPositionX() == x && BlackKnightProm2.getCurrentPositionY() == y){
			return BlackKnightProm2.getTitle();
		}
		if (BlackKnightProm1.getCurrentPositionX() == x && BlackKnightProm1.getCurrentPositionY() == y){
			return BlackKnightProm1.getTitle();
		}
		if (BlackBishopProm8.getCurrentPositionX() == x && BlackBishopProm8.getCurrentPositionY() == y){
			return BlackBishopProm8.getTitle();
		}
		if (BlackBishopProm7.getCurrentPositionX() == x && BlackBishopProm7.getCurrentPositionY() == y){
			return BlackBishopProm7.getTitle();
		}
		if (BlackBishopProm6.getCurrentPositionX() == x && BlackBishopProm6.getCurrentPositionY() == y){
			return BlackBishopProm6.getTitle();
		}
		if (BlackBishopProm5.getCurrentPositionX() == x && BlackBishopProm5.getCurrentPositionY() == y){
			return BlackBishopProm5.getTitle();
		}
		if (BlackBishopProm4.getCurrentPositionX() == x && BlackBishopProm4.getCurrentPositionY() == y){
			return BlackBishopProm4.getTitle();
		}
		if (BlackBishopProm3.getCurrentPositionX() == x && BlackBishopProm3.getCurrentPositionY() == y){
			return BlackBishopProm3.getTitle();
		}
		if (BlackBishopProm2.getCurrentPositionX() == x && BlackBishopProm2.getCurrentPositionY() == y){
			return BlackBishopProm2.getTitle();
		}
		if (BlackBishopProm1.getCurrentPositionX() == x && BlackBishopProm1.getCurrentPositionY() == y){
			return BlackBishopProm1.getTitle();
		}
		if (BlackQueenProm8.getCurrentPositionX() == x && BlackQueenProm8.getCurrentPositionY() == y){
			return BlackQueenProm8.getTitle();
		}
		if (BlackQueenProm7.getCurrentPositionX() == x && BlackQueenProm7.getCurrentPositionY() == y){
			return BlackQueenProm7.getTitle();
		}
		if (BlackQueenProm6.getCurrentPositionX() == x && BlackQueenProm6.getCurrentPositionY() == y){
			return BlackQueenProm6.getTitle();
		}
		if (BlackQueenProm5.getCurrentPositionX() == x && BlackQueenProm5.getCurrentPositionY() == y){
			return BlackQueenProm5.getTitle();
		}
		if (BlackQueenProm4.getCurrentPositionX() == x && BlackQueenProm4.getCurrentPositionY() == y){
			return BlackQueenProm4.getTitle();
		}
		if (BlackQueenProm3.getCurrentPositionX() == x && BlackQueenProm3.getCurrentPositionY() == y){
			return BlackQueenProm3.getTitle();
		}
		if (BlackQueenProm2.getCurrentPositionX() == x && BlackQueenProm2.getCurrentPositionY() == y){
			return BlackQueenProm2.getTitle();
		}
		if (BlackQueenProm1.getCurrentPositionX() == x && BlackQueenProm1.getCurrentPositionY() == y){
			return BlackQueenProm1.getTitle();
		}
		if (BlackRookProm8.getCurrentPositionX() == x && BlackRookProm8.getCurrentPositionY() == y){
			return BlackRookProm8.getTitle();
		}
		if (BlackRookProm7.getCurrentPositionX() == x && BlackRookProm7.getCurrentPositionY() == y){
			return BlackRookProm7.getTitle();
		}
		if (BlackRookProm6.getCurrentPositionX() == x && BlackRookProm6.getCurrentPositionY() == y){
			return BlackRookProm6.getTitle();
		}
		if (BlackRookProm5.getCurrentPositionX() == x && BlackRookProm5.getCurrentPositionY() == y){
			return BlackRookProm5.getTitle();
		}
		if (BlackRookProm4.getCurrentPositionX() == x && BlackRookProm4.getCurrentPositionY() == y){
			return BlackRookProm4.getTitle();
		}
		if (BlackRookProm3.getCurrentPositionX() == x && BlackRookProm3.getCurrentPositionY() == y){
			return BlackRookProm3.getTitle();
		}
		if (BlackRookProm2.getCurrentPositionX() == x && BlackRookProm2.getCurrentPositionY() == y){
			return BlackRookProm2.getTitle();
		}
		if (BlackRookProm1.getCurrentPositionX() == x && BlackRookProm1.getCurrentPositionY() == y){
			return BlackRookProm1.getTitle();
		}
		return NoPiece;    
	}
	static void setPiece(JButton J, int X, int Y){
		int[]input={X,Y};
		if (CurrentTitle == "Black Rook (H8)"){
			LOGGER.log(Level.INFO, "You have set Black Rook (H8) on to " + Arrays.toString(input));
			J.setIcon(BlackRookH8.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackRookH8.setCurrentPositionX(X);
			BlackRookH8.setCurrentPositionY(Y);
			BlackRookH8.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			BlackRookH8.setFirstStrike(false);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Rook (H1)"){
			LOGGER.log(Level.INFO, "You have set White Rook (H1) on to " + Arrays.toString(input));
			J.setIcon(WhiteRookH1.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteRookH1.setCurrentPositionX(X);
			WhiteRookH1.setCurrentPositionY(Y);
			WhiteRookH1.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			WhiteRookH1.setFirstStrike(false);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Queen (D1)"){
			LOGGER.log(Level.INFO, "You have set White Queen (D1) on to " + Arrays.toString(input));
			J.setIcon(WhiteQueenD1.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteQueenD1.setCurrentPositionX(X);
			WhiteQueenD1.setCurrentPositionY(Y);
			WhiteQueenD1.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, "White Queen (D1)")){
				System.out.println("Black King in Check by White Queen!");
				ActivateBlackCheck = true;
				}
			
			return;
		}
		if (CurrentTitle == "White Bishop (F1)"){
			LOGGER.log(Level.INFO, "You have set White Bishop (F1) on to " + Arrays.toString(input));
			J.setIcon(WhiteBishopF1.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteBishopF1.setCurrentPositionX(X);
			WhiteBishopF1.setCurrentPositionY(Y);
			WhiteBishopF1.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			
			return;
		}
		if (CurrentTitle == "White Bishop (C1)"){
			LOGGER.log(Level.INFO, "You have set White Bishop (C1) on to " + Arrays.toString(input));
			J.setIcon(WhiteBishopC1.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteBishopC1.setCurrentPositionX(X);
			WhiteBishopC1.setCurrentPositionY(Y);
			WhiteBishopC1.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Rook (A1)"){
			LOGGER.log(Level.INFO, "You have set White Rook (A1) on to " + Arrays.toString(input));
			J.setIcon(WhiteRookA1.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteRookA1.setCurrentPositionX(X);
			WhiteRookA1.setCurrentPositionY(Y);
			WhiteRookA1.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			WhiteRookA1.setFirstStrike(false);
			resetBlackEnPassat();
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Pawn (H2)"){
			LOGGER.log(Level.INFO, "You have set White Pawn (H2) on to " + Arrays.toString(input));
			J.setIcon(WhitePawnH2.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhitePawnH2.setCurrentPositionX(X);
			WhitePawnH2.setCurrentPositionY(Y);
			WhitePawnH2.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			WhitePiece.updateEnPassatKill(X, Y);
			//determine if a pawn has reached end of board
			if (WhitePiece.pawnPromotion(Y,CurrentTitle)){
				new PawnPopUp(WhiteTurn,J, X);
			}
			
			if(WhitePawnH2.getFirstStrike()){
				if(WhitePawnH2.getCurrentPositionX() == 7 && WhitePawnH2.getCurrentPositionY() == 4){
					WhitePawnH2.setEnPassant(true);
					WhitePawnH2.setFirstStrike(false);
				}
				else{
					WhitePawnH2.setEnPassant(false);
					WhitePawnH2.setFirstStrike(false);
				}
			}
			resetBlackEnPassat();
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;		
		}
		if (CurrentTitle == "White Pawn (G2)"){
			LOGGER.log(Level.INFO, "You have set White Pawn (G2) on to " + Arrays.toString(input));
			J.setIcon(WhitePawnG2.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhitePawnG2.setCurrentPositionX(X);
			WhitePawnG2.setCurrentPositionY(Y);
			WhitePawnG2.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			WhitePiece.updateEnPassatKill(X, Y);
			//determine if a pawn has reached end of board
			if (WhitePiece.pawnPromotion(Y,CurrentTitle)){
				new PawnPopUp(WhiteTurn,J, X);;
			}
			
			if(WhitePawnG2.getFirstStrike()){
				if(WhitePawnG2.getCurrentPositionX() == 6 && WhitePawnG2.getCurrentPositionY() == 4){
					WhitePawnG2.setEnPassant(true);
					WhitePawnG2.setFirstStrike(false);
				}
				else{
					WhitePawnG2.setEnPassant(false);
					WhitePawnG2.setFirstStrike(false);
				}
			}
			resetBlackEnPassat();
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;		
		}
		if (CurrentTitle == "White Pawn (F2)"){
			LOGGER.log(Level.INFO, "You have set White Pawn (F2) on to " + Arrays.toString(input));
			J.setIcon(WhitePawnF2.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhitePawnF2.setCurrentPositionX(X);
			WhitePawnF2.setCurrentPositionY(Y);
			WhitePawnF2.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			WhitePiece.updateEnPassatKill(X, Y);
			//determine if a pawn has reached end of board
			if (WhitePiece.pawnPromotion(Y,CurrentTitle)){
				new PawnPopUp(WhiteTurn, J,X);
			}
			
			if(WhitePawnF2.getFirstStrike()){
				if(WhitePawnF2.getCurrentPositionX() == 5 && WhitePawnF2.getCurrentPositionY() == 4){
					WhitePawnF2.setEnPassant(true);
					WhitePawnF2.setFirstStrike(false);
				}
				else{
					WhitePawnF2.setEnPassant(false);
					WhitePawnF2.setFirstStrike(false);
				}
			}
			resetBlackEnPassat();
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;		
		}
		if (CurrentTitle == "White Pawn (E2)"){
			LOGGER.log(Level.INFO, "You have set White Pawn (E2) on to " + Arrays.toString(input));
			J.setIcon(WhitePawnE2.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhitePawnE2.setCurrentPositionX(X);
			WhitePawnE2.setCurrentPositionY(Y);
			WhitePawnE2.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			WhitePiece.updateEnPassatKill(X, Y);
			//determine if a pawn has reached end of board
			if (WhitePiece.pawnPromotion(Y,CurrentTitle)){
				new PawnPopUp(WhiteTurn, J,X);
			}
			
			if(WhitePawnE2.getFirstStrike()){
				if(WhitePawnE2.getCurrentPositionX() == 4 && WhitePawnE2.getCurrentPositionY() == 4){
					WhitePawnE2.setEnPassant(true);
					WhitePawnE2.setFirstStrike(false);
				}
				else{
					WhitePawnE2.setEnPassant(false);
					WhitePawnE2.setFirstStrike(false);
				}
			}
			resetBlackEnPassat();
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;		
		}
		if (CurrentTitle == "White Pawn (D2)"){
			LOGGER.log(Level.INFO, "You have set White Pawn (D2) on to " + Arrays.toString(input));
			J.setIcon(WhitePawnD2.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhitePawnD2.setCurrentPositionX(X);
			WhitePawnD2.setCurrentPositionY(Y);
			WhitePawnD2.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			WhitePiece.updateEnPassatKill(X, Y);
			//determine if a pawn has reached end of board
			if (WhitePiece.pawnPromotion(Y,CurrentTitle)){
				new PawnPopUp(WhiteTurn, J,X);
			}
			
			if(WhitePawnD2.getFirstStrike()){
				if(WhitePawnD2.getCurrentPositionX() == 3 && WhitePawnD2.getCurrentPositionY() == 4){
					WhitePawnD2.setEnPassant(true);
					WhitePawnD2.setFirstStrike(false);
				}
				else{
					WhitePawnD2.setEnPassant(false);
					WhitePawnD2.setFirstStrike(false);
				}
			}
			resetBlackEnPassat();
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;		
		}
		if (CurrentTitle == "White Pawn (C2)"){
			LOGGER.log(Level.INFO, "You have set White Pawn (C2) on to " + Arrays.toString(input));
			J.setIcon(WhitePawnC2.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhitePawnC2.setCurrentPositionX(X);
			WhitePawnC2.setCurrentPositionY(Y);
			WhitePawnC2.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			WhitePiece.updateEnPassatKill(X, Y);
			//determine if a pawn has reached end of board
			if (WhitePiece.pawnPromotion(Y,CurrentTitle)){
				new PawnPopUp(WhiteTurn, J,X);
			}
			
			if(WhitePawnC2.getFirstStrike()){
				if(WhitePawnC2.getCurrentPositionX() == 2 && WhitePawnC2.getCurrentPositionY() == 4){
					WhitePawnC2.setEnPassant(true);
					WhitePawnC2.setFirstStrike(false);
				}
				else{
					WhitePawnC2.setEnPassant(false);
					WhitePawnC2.setFirstStrike(false);
				}
			}
			resetBlackEnPassat();
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;		
		}
		if (CurrentTitle == "White Pawn (B2)"){
			LOGGER.log(Level.INFO, "You have set White Pawn (B2) on to " + Arrays.toString(input));
			J.setIcon(WhitePawnB2.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhitePawnB2.setCurrentPositionX(X);
			WhitePawnB2.setCurrentPositionY(Y);
			WhitePawnB2.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			WhitePiece.updateEnPassatKill(X, Y);
			//determine if a pawn has reached end of board
			if (WhitePiece.pawnPromotion(Y,CurrentTitle)){
				new PawnPopUp(WhiteTurn, J,X);
			}
			if(WhitePawnB2.getFirstStrike()){
				if(WhitePawnB2.getCurrentPositionX() == 1 && WhitePawnB2.getCurrentPositionY() == 4){
					WhitePawnB2.setEnPassant(true);
					WhitePawnB2.setFirstStrike(false);
				}
	
				else{
					WhitePawnB2.setEnPassant(false);
					WhitePawnB2.setFirstStrike(false);
				}
			}
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;	
		}
		if (CurrentTitle == "White Pawn (A2)"){
			LOGGER.log(Level.INFO, "You have set White Pawn (A2) on to " + Arrays.toString(input));
			J.setIcon(WhitePawnA2.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhitePawnA2.setCurrentPositionX(X);
			WhitePawnA2.setCurrentPositionY(Y);
			WhitePawnA2.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			WhitePiece.updateEnPassatKill(X, Y);
			//determine if a pawn has reached end of board
			if (WhitePiece.pawnPromotion(Y,CurrentTitle)){
				new PawnPopUp(WhiteTurn, J,X);
			}
			if(WhitePawnA2.getFirstStrike()){
				if(WhitePawnA2.getCurrentPositionX() == 0 && WhitePawnA2.getCurrentPositionY() == 4){
					WhitePawnA2.setEnPassant(true);
					WhitePawnA2.setFirstStrike(false);
				}
	
				else{
					WhitePawnA2.setEnPassant(false);
					WhitePawnA2.setFirstStrike(false);
				}
			}
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White King (E1)"){
			LOGGER.log(Level.INFO, "You have set White King (E1) on to " + Arrays.toString(input));
			J.setIcon(WhiteKingE1.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteKingE1.setCurrentPositionX(X);
			WhiteKingE1.setCurrentPositionY(Y);
			WhiteKingE1.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			WhiteKingE1.setFirstStrike(false);
			
			if(ActivateWhiteRightCastle){
				if(WhiteKingE1.getCurrentPositionX() == 6 && WhiteKingE1.getCurrentPositionY()==7){
					LOGGER.log(Level.INFO, "You have set White Rook (H1) on to [5,7] by castling");
					bF1.setIcon(WhiteRookH1.getIcon());
					bF1.setName("White Rook (H1)");
					bH1.setIcon(null);
					WhiteRookH1.setCurrentPositionX(5);
					WhiteRookH1.setCurrentPositionY(7);
					WhiteRookH1.setCurrentPositionXY(5,7);
					WhiteRookH1.setFirstStrike(false);
				}
			}
			
			if(ActivateWhiteLeftCastle){
				if(WhiteKingE1.getCurrentPositionX() == 2 && WhiteKingE1.getCurrentPositionY()==7){
					LOGGER.log(Level.INFO, "You have set White Rook (A1) on to [3,7] by castling");
					bD1.setIcon(WhiteRookA1.getIcon());
					bD1.setName("White Rook (A1)");
					bA1.setIcon(null);
					WhiteRookA1.setCurrentPositionX(3);
					WhiteRookA1.setCurrentPositionY(7);
					WhiteRookA1.setCurrentPositionXY(3,7);
					WhiteRookA1.setFirstStrike(false);
				}
			}
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Knight (G1)"){
			LOGGER.log(Level.INFO, "You have set White Knight (G1) on to " + Arrays.toString(input));
			J.setIcon(WhiteKnightG1.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteKnightG1.setCurrentPositionX(X);
			WhiteKnightG1.setCurrentPositionY(Y);
			WhiteKnightG1.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;	
		}
		if (CurrentTitle == "White Knight (B1)"){
			LOGGER.log(Level.INFO, "You have set White Knight (B1) on to " + Arrays.toString(input));
			J.setIcon(WhiteKnightB1.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteKnightB1.setCurrentPositionX(X);
			WhiteKnightB1.setCurrentPositionY(Y);
			WhiteKnightB1.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;	
		}
		if (CurrentTitle == "Black Pawn (H7)"){
			LOGGER.log(Level.INFO, "You have set Black Pawn (H7) on to " + Arrays.toString(input));
			J.setIcon(BlackPawnH7.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackPawnH7.setCurrentPositionX(X);
			BlackPawnH7.setCurrentPositionY(Y);
			BlackPawnH7.setCurrentPositionXY(X,Y);		
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			BlackPiece.updateEnPassatKill(X,Y);
			
			if (BlackPiece.pawnPromotion(Y,CurrentTitle)){
				new PawnPopUp(WhiteTurn, J,X);
			}
			
			if(BlackPawnH7.getFirstStrike()){
				if(BlackPawnH7.getCurrentPositionX() == 7 && BlackPawnH7.getCurrentPositionY() == 3){
					BlackPawnH7.setEnPassant(true);
					BlackPawnH7.setFirstStrike(false);
				}
				else{
					BlackPawnH7.setEnPassant(false);
					BlackPawnH7.setFirstStrike(false);
				}
			}
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Pawn (G7)"){
			LOGGER.log(Level.INFO, "You have set Black Pawn (G7) on to " + Arrays.toString(input));
			J.setIcon(BlackPawnG7.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackPawnG7.setCurrentPositionX(X);
			BlackPawnG7.setCurrentPositionY(Y);
			BlackPawnG7.setCurrentPositionXY(X,Y);		
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			BlackPiece.updateEnPassatKill(X,Y);
			
			if (BlackPiece.pawnPromotion(Y,CurrentTitle)){
				new PawnPopUp(WhiteTurn, J,X);
			}
			
			if(BlackPawnG7.getFirstStrike()){
				if(BlackPawnG7.getCurrentPositionX() == 6 && BlackPawnG7.getCurrentPositionY() == 3){
					BlackPawnG7.setEnPassant(true);
					BlackPawnG7.setFirstStrike(false);
				}
				else{
					BlackPawnG7.setEnPassant(false);
					BlackPawnG7.setFirstStrike(false);
				}
			}
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Pawn (F7)"){
			LOGGER.log(Level.INFO, "You have set Black Pawn (F7) on to " + Arrays.toString(input));
			J.setIcon(BlackPawnF7.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackPawnF7.setCurrentPositionX(X);
			BlackPawnF7.setCurrentPositionY(Y);
			BlackPawnF7.setCurrentPositionXY(X,Y);		
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			BlackPiece.updateEnPassatKill(X,Y);
			
			if (BlackPiece.pawnPromotion(Y,CurrentTitle)){
				new PawnPopUp(WhiteTurn, J,X);
			}
			
			if(BlackPawnF7.getFirstStrike()){
				if(BlackPawnF7.getCurrentPositionX() == 5 && BlackPawnF7.getCurrentPositionY() == 3){
					BlackPawnF7.setEnPassant(true);
					BlackPawnF7.setFirstStrike(false);
				}
				else{
					BlackPawnF7.setEnPassant(false);
					BlackPawnF7.setFirstStrike(false);
				}
			}
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Pawn (E7)"){
			LOGGER.log(Level.INFO, "You have set Black Pawn (E7) on to " + Arrays.toString(input));
			J.setIcon(BlackPawnE7.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackPawnE7.setCurrentPositionX(X);
			BlackPawnE7.setCurrentPositionY(Y);
			BlackPawnE7.setCurrentPositionXY(X,Y);		
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			BlackPiece.updateEnPassatKill(X,Y);
			
			if (BlackPiece.pawnPromotion(Y,CurrentTitle)){
				new PawnPopUp(WhiteTurn, J,X);
			}
			
			if(BlackPawnE7.getFirstStrike()){
				if(BlackPawnE7.getCurrentPositionX() == 4 && BlackPawnE7.getCurrentPositionY() == 3){
					BlackPawnE7.setEnPassant(true);
					BlackPawnE7.setFirstStrike(false);
				}
				else{
					BlackPawnE7.setEnPassant(false);
					BlackPawnE7.setFirstStrike(false);
				}
			}
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Pawn (D7)"){
			LOGGER.log(Level.INFO, "You have set Black Pawn (D7) on to " + Arrays.toString(input));
			J.setIcon(BlackPawnD7.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackPawnD7.setCurrentPositionX(X);
			BlackPawnD7.setCurrentPositionY(Y);
			BlackPawnD7.setCurrentPositionXY(X,Y);		
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			BlackPiece.updateEnPassatKill(X,Y);
			
			if (BlackPiece.pawnPromotion(Y,CurrentTitle)){
				new PawnPopUp(WhiteTurn, J,X);
			}
			
			if(BlackPawnD7.getFirstStrike()){
				if(BlackPawnD7.getCurrentPositionX() == 3 && BlackPawnD7.getCurrentPositionY() == 3){
					BlackPawnD7.setEnPassant(true);
					BlackPawnD7.setFirstStrike(false);
				}
				else{
					BlackPawnD7.setEnPassant(false);
					BlackPawnD7.setFirstStrike(false);
				}
			}
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Pawn (A7)"){
			LOGGER.log(Level.INFO, "You have set Black Pawn (A7) on to " + Arrays.toString(input));
			J.setIcon(BlackPawnA7.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackPawnA7.setCurrentPositionX(X);
			BlackPawnA7.setCurrentPositionY(Y);
			BlackPawnA7.setCurrentPositionXY(X,Y);		
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			BlackPiece.updateEnPassatKill(X,Y);
			
			if (BlackPiece.pawnPromotion(Y,CurrentTitle)){
				new PawnPopUp(WhiteTurn, J,X);
			}
			
			if(BlackPawnA7.getFirstStrike()){
				if(BlackPawnA7.getCurrentPositionX() == 0 && BlackPawnA7.getCurrentPositionY() == 3){
					BlackPawnA7.setEnPassant(true);
					BlackPawnA7.setFirstStrike(false);
				}
				else{
					BlackPawnA7.setEnPassant(false);
					BlackPawnA7.setFirstStrike(false);
				}
			}
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Pawn (B7)"){
			LOGGER.log(Level.INFO, "You have set Black Pawn (B7) on to " + Arrays.toString(input));
			J.setIcon(BlackPawnB7.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackPawnB7.setCurrentPositionX(X);
			BlackPawnB7.setCurrentPositionY(Y);
			BlackPawnB7.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			BlackPiece.updateEnPassatKill(X,Y);
			
			if (BlackPiece.pawnPromotion(Y,CurrentTitle)){
				new PawnPopUp(WhiteTurn, J,X);
			}
			
			if(BlackPawnB7.getFirstStrike()){
				if(BlackPawnB7.getCurrentPositionX() == 1 && BlackPawnB7.getCurrentPositionY() == 3){
					BlackPawnB7.setEnPassant(true);
					BlackPawnB7.setFirstStrike(false);
				}
				else{
					BlackPawnB7.setEnPassant(false);
					BlackPawnB7.setFirstStrike(false);
				}
			}
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black King (E8)"){
			LOGGER.log(Level.INFO, "You have set Black King (E8) on to " + Arrays.toString(input));
			J.setIcon(BlackKingE8.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackKingE8.setCurrentPositionX(X);
			BlackKingE8.setCurrentPositionY(Y);
			BlackKingE8.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			BlackKingE8.setFirstStrike(false);
	
			if(ActivateBlackRightCastle){
				if(BlackKingE8.getCurrentPositionX() == 6 && BlackKingE8.getCurrentPositionY()==0){
					LOGGER.log(Level.INFO, "You have set Black Rook (H8) on to [5,0] by castling");
					bF8.setIcon(BlackRookH8.getIcon());
					bF8.setName("Black Rook (H8)");
					bH8.setIcon(null);
					BlackRookH8.setCurrentPositionX(5);
					BlackRookH8.setCurrentPositionY(0);
					BlackRookH8.setCurrentPositionXY(5,0);
					BlackRookH8.setFirstStrike(false);
				}
			}
	
			if(ActivateBlackLeftCastle){
				if(BlackKingE8.getCurrentPositionX() == 2 && BlackKingE8.getCurrentPositionY()==0){
					LOGGER.log(Level.INFO, "You have set Black Rook (A8) on to [3,0] by castling");
					bD8.setIcon(BlackRookA8.getIcon());
					bD8.setName("Black Rook (A8)");
					bA8.setIcon(null);
					BlackRookA8.setCurrentPositionX(3);
					BlackRookA8.setCurrentPositionY(0);
					BlackRookA8.setCurrentPositionXY(3,0);
					BlackRookA8.setFirstStrike(false);
				}
			}
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		
		if (CurrentTitle == "Black Knight (B8)"){
			LOGGER.log(Level.INFO, "You have set Black Knight (B8) on to " + Arrays.toString(input));
			J.setIcon(BlackKnightB8.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackKnightB8.setCurrentPositionX(X);
			BlackKnightB8.setCurrentPositionY(Y);
			BlackKnightB8.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Knight (G8)"){
			LOGGER.log(Level.INFO, "You have set Black Knight (G8) on to " + Arrays.toString(input));
			J.setIcon(BlackKnightG8.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackKnightG8.setCurrentPositionX(X);
			BlackKnightG8.setCurrentPositionY(Y);
			BlackKnightG8.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Pawn (C7)"){
			LOGGER.log(Level.INFO, "You have set Black Pawn (C7) on to " + Arrays.toString(input));
			J.setIcon(BlackPawnC7.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackPawnC7.setCurrentPositionX(X);
			BlackPawnC7.setCurrentPositionY(Y);
			BlackPawnC7.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			BlackPiece.updateEnPassatKill(X,Y);
			
			if (BlackPiece.pawnPromotion(Y,CurrentTitle)){
				new PawnPopUp(WhiteTurn, J,X);
			}
			
			if(BlackPawnC7.getFirstStrike()){
				if(BlackPawnC7.getCurrentPositionX() == 2 && BlackPawnC7.getCurrentPositionY() == 3){
					BlackPawnC7.setEnPassant(true);
					BlackPawnC7.setFirstStrike(false);
				}
				else{
					BlackPawnC7.setEnPassant(false);
					BlackPawnC7.setFirstStrike(false);
				}
			}
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
	
		if (CurrentTitle == "Black Rook (A8)"){
			LOGGER.log(Level.INFO, "You have set Black Rook (A8) on to " + Arrays.toString(input));
			J.setIcon(BlackRookA8.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackRookA8.setCurrentPositionX(X);
			BlackRookA8.setCurrentPositionY(Y);
			BlackRookA8.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			BlackRookA8.setFirstStrike(false);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Bishop (C8)"){
			LOGGER.log(Level.INFO, "You have set Black Bishop (C8) on to " + Arrays.toString(input));
			J.setIcon(BlackBishopC8.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackBishopC8.setCurrentPositionX(X);
			BlackBishopC8.setCurrentPositionY(Y);
			BlackBishopC8.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;

		}
		if (CurrentTitle == "Black Bishop (F8)"){
			LOGGER.log(Level.INFO, "You have set Black Bishop (F8) on to " + Arrays.toString(input));
			J.setIcon(BlackBishopF8.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackBishopF8.setCurrentPositionX(X);
			BlackBishopF8.setCurrentPositionY(Y);
			BlackBishopF8.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;

		}
		if (CurrentTitle == "Black Queen (D8)"){
			LOGGER.log(Level.INFO, "You have set Black Queen (D8) on to " + Arrays.toString(input));
			J.setIcon(BlackQueenD8.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackQueenD8.setCurrentPositionX(X);
			BlackQueenD8.setCurrentPositionY(Y);
			BlackQueenD8.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		//////////////////////////
		if (CurrentTitle == "White Queen (Prom1)"){
			LOGGER.log(Level.INFO, "You have set White Queen (Prom1) on to " + Arrays.toString(input));
			J.setIcon(WhiteQueenProm1.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteQueenProm1.setCurrentPositionX(X);
			WhiteQueenProm1.setCurrentPositionY(Y);
			WhiteQueenProm1.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Queen (Prom2)"){
			LOGGER.log(Level.INFO, "You have set White Queen (Prom2) on to " + Arrays.toString(input));
			J.setIcon(WhiteQueenProm2.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteQueenProm2.setCurrentPositionX(X);
			WhiteQueenProm2.setCurrentPositionY(Y);
			WhiteQueenProm2.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Queen (Prom3)"){
			LOGGER.log(Level.INFO, "You have set White Queen (Prom3) on to " + Arrays.toString(input));
			J.setIcon(WhiteQueenProm3.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteQueenProm3.setCurrentPositionX(X);
			WhiteQueenProm3.setCurrentPositionY(Y);
			WhiteQueenProm3.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Queen (Prom4)"){
			LOGGER.log(Level.INFO, "You have set White Queen (Prom4) on to " + Arrays.toString(input));
			J.setIcon(WhiteQueenProm4.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteQueenProm4.setCurrentPositionX(X);
			WhiteQueenProm4.setCurrentPositionY(Y);
			WhiteQueenProm4.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Queen (Prom5)"){
			LOGGER.log(Level.INFO, "You have set White Queen (Prom5) on to " + Arrays.toString(input));
			J.setIcon(WhiteQueenProm5.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteQueenProm5.setCurrentPositionX(X);
			WhiteQueenProm5.setCurrentPositionY(Y);
			WhiteQueenProm5.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Queen (Prom6)"){
			LOGGER.log(Level.INFO, "You have set White Queen (Prom6) on to " + Arrays.toString(input));
			J.setIcon(WhiteQueenProm6.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteQueenProm6.setCurrentPositionX(X);
			WhiteQueenProm6.setCurrentPositionY(Y);
			WhiteQueenProm6.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Queen (Prom7)"){
			LOGGER.log(Level.INFO, "You have set White Queen (Prom7) on to " + Arrays.toString(input));
			J.setIcon(WhiteQueenProm7.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteQueenProm7.setCurrentPositionX(X);
			WhiteQueenProm7.setCurrentPositionY(Y);
			WhiteQueenProm7.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Queen (Prom8)"){
			LOGGER.log(Level.INFO, "You have set White Queen (Prom8) on to " + Arrays.toString(input));
			J.setIcon(WhiteQueenProm8.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteQueenProm8.setCurrentPositionX(X);
			WhiteQueenProm8.setCurrentPositionY(Y);
			WhiteQueenProm8.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Rook (Prom1)"){
			LOGGER.log(Level.INFO, "You have set White Rook (Prom1) on to " + Arrays.toString(input));
			J.setIcon(WhiteRookProm1.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteRookProm1.setCurrentPositionX(X);
			WhiteRookProm1.setCurrentPositionY(Y);
			WhiteRookProm1.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Rook (Prom2)"){
			LOGGER.log(Level.INFO, "You have set White Rook (Prom2) on to " + Arrays.toString(input));
			J.setIcon(WhiteRookProm2.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteRookProm2.setCurrentPositionX(X);
			WhiteRookProm2.setCurrentPositionY(Y);
			WhiteRookProm2.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Rook (Prom3)"){
			LOGGER.log(Level.INFO, "You have set White Rook (Prom3) on to " + Arrays.toString(input));
			J.setIcon(WhiteRookProm3.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteRookProm3.setCurrentPositionX(X);
			WhiteRookProm3.setCurrentPositionY(Y);
			WhiteRookProm3.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Rook (Prom4)"){
			LOGGER.log(Level.INFO, "You have set White Rook (Prom4) on to " + Arrays.toString(input));
			J.setIcon(WhiteRookProm4.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteRookProm4.setCurrentPositionX(X);
			WhiteRookProm4.setCurrentPositionY(Y);
			WhiteRookProm4.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Rook (Prom5)"){
			LOGGER.log(Level.INFO, "You have set White Rook (Prom5) on to " + Arrays.toString(input));
			J.setIcon(WhiteRookProm5.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteRookProm5.setCurrentPositionX(X);
			WhiteRookProm5.setCurrentPositionY(Y);
			WhiteRookProm5.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Rook (Prom6)"){
			LOGGER.log(Level.INFO, "You have set White Rook (Prom6) on to " + Arrays.toString(input));
			J.setIcon(WhiteRookProm6.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteRookProm6.setCurrentPositionX(X);
			WhiteRookProm6.setCurrentPositionY(Y);
			WhiteRookProm6.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Rook (Prom7)"){
			LOGGER.log(Level.INFO, "You have set White Rook (Prom7) on to " + Arrays.toString(input));
			J.setIcon(WhiteRookProm7.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteRookProm7.setCurrentPositionX(X);
			WhiteRookProm7.setCurrentPositionY(Y);
			WhiteRookProm7.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Rook (Prom8)"){
			LOGGER.log(Level.INFO, "You have set White Rook (Prom8) on to " + Arrays.toString(input));
			J.setIcon(WhiteRookProm8.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteRookProm8.setCurrentPositionX(X);
			WhiteRookProm8.setCurrentPositionY(Y);
			WhiteRookProm8.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Bishop (Prom1)"){
			LOGGER.log(Level.INFO, "You have set White Bishop (Prom1) on to " + Arrays.toString(input));
			J.setIcon(WhiteBishopProm1.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteBishopProm1.setCurrentPositionX(X);
			WhiteBishopProm1.setCurrentPositionY(Y);
			WhiteBishopProm1.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Bishop (Prom2)"){
			LOGGER.log(Level.INFO, "You have set White Bishop (Prom2) on to " + Arrays.toString(input));
			J.setIcon(WhiteBishopProm2.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteBishopProm2.setCurrentPositionX(X);
			WhiteBishopProm2.setCurrentPositionY(Y);
			WhiteBishopProm2.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Bishop (Prom3)"){
			LOGGER.log(Level.INFO, "You have set White Bishop (Prom3) on to " + Arrays.toString(input));
			J.setIcon(WhiteBishopProm3.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteBishopProm3.setCurrentPositionX(X);
			WhiteBishopProm3.setCurrentPositionY(Y);
			WhiteBishopProm3.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Bishop (Prom4)"){
			LOGGER.log(Level.INFO, "You have set White Bishop (Prom4) on to " + Arrays.toString(input));
			J.setIcon(WhiteBishopProm4.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteBishopProm4.setCurrentPositionX(X);
			WhiteBishopProm4.setCurrentPositionY(Y);
			WhiteBishopProm4.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Bishop (Prom5)"){
			LOGGER.log(Level.INFO, "You have set White Bishop (Prom5) on to " + Arrays.toString(input));
			J.setIcon(WhiteBishopProm5.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteBishopProm5.setCurrentPositionX(X);
			WhiteBishopProm5.setCurrentPositionY(Y);
			WhiteBishopProm5.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Bishop (Prom6)"){
			LOGGER.log(Level.INFO, "You have set White Bishop (Prom6) on to " + Arrays.toString(input));
			J.setIcon(WhiteBishopProm6.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteBishopProm6.setCurrentPositionX(X);
			WhiteBishopProm6.setCurrentPositionY(Y);
			WhiteBishopProm6.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Bishop (Prom7)"){
			LOGGER.log(Level.INFO, "You have set White Bishop (Prom7) on to " + Arrays.toString(input));
			J.setIcon(WhiteBishopProm7.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteBishopProm7.setCurrentPositionX(X);
			WhiteBishopProm7.setCurrentPositionY(Y);
			WhiteBishopProm7.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Bishop (Prom8)"){
			LOGGER.log(Level.INFO, "You have set White Bishop (Prom8) on to " + Arrays.toString(input));
			J.setIcon(WhiteBishopProm8.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteBishopProm8.setCurrentPositionX(X);
			WhiteBishopProm8.setCurrentPositionY(Y);
			WhiteBishopProm8.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Knight (Prom1)"){
			LOGGER.log(Level.INFO, "You have set White Knight (Prom1) on to " + Arrays.toString(input));
			J.setIcon(WhiteKnightProm1.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteKnightProm1.setCurrentPositionX(X);
			WhiteKnightProm1.setCurrentPositionY(Y);
			WhiteKnightProm1.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Knight (Prom2)"){
			LOGGER.log(Level.INFO, "You have set White Knight (Prom2) on to " + Arrays.toString(input));
			J.setIcon(WhiteKnightProm2.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteKnightProm2.setCurrentPositionX(X);
			WhiteKnightProm2.setCurrentPositionY(Y);
			WhiteKnightProm2.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Knight (Prom3)"){
			LOGGER.log(Level.INFO, "You have set White Knight (Prom3) on to " + Arrays.toString(input));
			J.setIcon(WhiteKnightProm3.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteKnightProm3.setCurrentPositionX(X);
			WhiteKnightProm3.setCurrentPositionY(Y);
			WhiteKnightProm3.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Knight (Prom4)"){
			LOGGER.log(Level.INFO, "You have set White Knight (Prom4) on to " + Arrays.toString(input));
			J.setIcon(WhiteKnightProm4.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteKnightProm4.setCurrentPositionX(X);
			WhiteKnightProm4.setCurrentPositionY(Y);
			WhiteKnightProm4.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Knight (Prom5)"){
			LOGGER.log(Level.INFO, "You have set White Knight (Prom5) on to " + Arrays.toString(input));
			J.setIcon(WhiteKnightProm5.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteKnightProm5.setCurrentPositionX(X);
			WhiteKnightProm5.setCurrentPositionY(Y);
			WhiteKnightProm5.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Knight (Prom6)"){
			LOGGER.log(Level.INFO, "You have set White Knight (Prom6) on to " + Arrays.toString(input));
			J.setIcon(WhiteKnightProm6.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteKnightProm6.setCurrentPositionX(X);
			WhiteKnightProm6.setCurrentPositionY(Y);
			WhiteKnightProm6.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Knight (Prom7)"){
			LOGGER.log(Level.INFO, "You have set White Knight (Prom7) on to " + Arrays.toString(input));
			J.setIcon(WhiteKnightProm7.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteKnightProm7.setCurrentPositionX(X);
			WhiteKnightProm7.setCurrentPositionY(Y);
			WhiteKnightProm7.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		if (CurrentTitle == "White Knight (Prom8)"){
			LOGGER.log(Level.INFO, "You have set White Knight (Prom8) on to " + Arrays.toString(input));
			J.setIcon(WhiteKnightProm8.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = false;
			WhiteKnightProm8.setCurrentPositionX(X);
			WhiteKnightProm8.setCurrentPositionY(Y);
			WhiteKnightProm8.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			WhitePiece.updateKill(input);
			resetBlackEnPassat();
			
			if(Superclass_BlackKing.isBlackKingInCheck_Set(input, CurrentTitle)){
				System.out.println("Black King in Check by " + CurrentTitle + "!");
				ActivateBlackCheck = true;
			}
			return;
		}
		////////////////////////////////
		if (CurrentTitle == "Black Queen (Prom1)"){
			LOGGER.log(Level.INFO, "You have set Black Queen (Prom1) on to " + Arrays.toString(input));
			J.setIcon(BlackQueenProm1.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackQueenProm1.setCurrentPositionX(X);
			BlackQueenProm1.setCurrentPositionY(Y);
			BlackQueenProm1.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Queen (Prom2)"){
			LOGGER.log(Level.INFO, "You have set Black Queen (Prom2) on to " + Arrays.toString(input));
			J.setIcon(BlackQueenProm2.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackQueenProm2.setCurrentPositionX(X);
			BlackQueenProm2.setCurrentPositionY(Y);
			BlackQueenProm2.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Queen (Prom3)"){
			LOGGER.log(Level.INFO, "You have set Black Queen (Prom3) on to " + Arrays.toString(input));
			J.setIcon(BlackQueenProm3.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackQueenProm3.setCurrentPositionX(X);
			BlackQueenProm3.setCurrentPositionY(Y);
			BlackQueenProm3.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Queen (Prom4)"){
			LOGGER.log(Level.INFO, "You have Black Queen (Prom4) on to " + Arrays.toString(input));
			J.setIcon(BlackQueenProm4.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackQueenProm4.setCurrentPositionX(X);
			BlackQueenProm4.setCurrentPositionY(Y);
			BlackQueenProm4.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			//determine if a pawn has reached end of board
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Queen (Prom5)"){
			LOGGER.log(Level.INFO, "You have set Black Queen (Prom5) on to " + Arrays.toString(input));
			J.setIcon(BlackQueenProm5.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackQueenProm5.setCurrentPositionX(X);
			BlackQueenProm5.setCurrentPositionY(Y);
			BlackQueenProm5.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Queen (Prom6)"){
			LOGGER.log(Level.INFO, "You have set Black Queen (Prom6) on to " + Arrays.toString(input));
			J.setIcon(BlackQueenProm6.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackQueenProm6.setCurrentPositionX(X);
			BlackQueenProm6.setCurrentPositionY(Y);
			BlackQueenProm6.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Queen (Prom7)"){
			LOGGER.log(Level.INFO, "You have set Black Queen (Prom7) on to " + Arrays.toString(input));
			J.setIcon(BlackQueenProm7.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackQueenProm7.setCurrentPositionX(X);
			BlackQueenProm7.setCurrentPositionY(Y);
			BlackQueenProm7.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Queen (Prom8)"){
			LOGGER.log(Level.INFO, "You have set Black Queen (Prom8) on to " + Arrays.toString(input));
			J.setIcon(BlackQueenProm8.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackQueenProm8.setCurrentPositionX(X);
			BlackQueenProm8.setCurrentPositionY(Y);
			BlackQueenProm8.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Rook (Prom1)"){
			LOGGER.log(Level.INFO, "You have set Black Rook (Prom1) on to " + Arrays.toString(input));
			J.setIcon(BlackRookProm1.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackRookProm1.setCurrentPositionX(X);
			BlackRookProm1.setCurrentPositionY(Y);
			BlackRookProm1.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Rook (Prom2)"){
			LOGGER.log(Level.INFO, "You have set Black Rook (Prom2 on to " + Arrays.toString(input));
			J.setIcon(BlackRookProm2.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackRookProm2.setCurrentPositionX(X);
			BlackRookProm2.setCurrentPositionY(Y);
			BlackRookProm2.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Rook (Prom3)"){
			LOGGER.log(Level.INFO, "You have set Black Rook (Prom3) on to " + Arrays.toString(input));
			J.setIcon(BlackRookProm3.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackRookProm3.setCurrentPositionX(X);
			BlackRookProm3.setCurrentPositionY(Y);
			BlackRookProm3.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			//determine if a pawn has reached end of board
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Rook (Prom4)"){
			LOGGER.log(Level.INFO, "You have set Black Rook (Prom4) on to " + Arrays.toString(input));
			J.setIcon(BlackRookProm4.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackRookProm4.setCurrentPositionX(X);
			BlackRookProm4.setCurrentPositionY(Y);
			BlackRookProm4.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Rook (Prom5)"){
			LOGGER.log(Level.INFO, "You have set Black Rook (Prom5) on to " + Arrays.toString(input));
			J.setIcon(BlackRookProm5.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackRookProm5.setCurrentPositionX(X);
			BlackRookProm5.setCurrentPositionY(Y);
			BlackRookProm5.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Rook (Prom6)"){
			LOGGER.log(Level.INFO, "You have set Black Rook (Prom6) on to " + Arrays.toString(input));
			J.setIcon(BlackRookProm6.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackRookProm6.setCurrentPositionX(X);
			BlackRookProm6.setCurrentPositionY(Y);
			BlackRookProm6.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Rook (Prom7)"){
			LOGGER.log(Level.INFO, "You have set Black Rook (Prom7) on to " + Arrays.toString(input));
			J.setIcon(BlackRookProm7.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackRookProm7.setCurrentPositionX(X);
			BlackRookProm7.setCurrentPositionY(Y);
			BlackRookProm7.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Rook (Prom8)"){
			LOGGER.log(Level.INFO, "You have set Black Rook (Prom8) on to " + Arrays.toString(input));
			J.setIcon(BlackRookProm8.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackRookProm8.setCurrentPositionX(X);
			BlackRookProm8.setCurrentPositionY(Y);
			BlackRookProm8.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Bishop (Prom1)"){
			LOGGER.log(Level.INFO, "You have set Black Bishop (Prom1) on to " + Arrays.toString(input));
			J.setIcon(BlackBishopProm1.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackBishopProm1.setCurrentPositionX(X);
			BlackBishopProm1.setCurrentPositionY(Y);
			BlackBishopProm1.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Bishop (Prom2)"){
			LOGGER.log(Level.INFO, "You have set Black Bishop (Prom2) on to " + Arrays.toString(input));
			J.setIcon(BlackBishopProm2.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackBishopProm2.setCurrentPositionX(X);
			BlackBishopProm2.setCurrentPositionY(Y);
			BlackBishopProm2.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Bishop (Prom3)"){
			LOGGER.log(Level.INFO, "You have set Black Bishop (Prom3) on to " + Arrays.toString(input));
			J.setIcon(BlackBishopProm3.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackBishopProm3.setCurrentPositionX(X);
			BlackBishopProm3.setCurrentPositionY(Y);
			BlackBishopProm3.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Bishop (Prom4)"){
			LOGGER.log(Level.INFO, "You have set Black Bishop (Prom4) on to " + Arrays.toString(input));
			J.setIcon(BlackBishopProm4.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackBishopProm4.setCurrentPositionX(X);
			BlackBishopProm4.setCurrentPositionY(Y);
			BlackBishopProm4.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Bishop (Prom5)"){
			LOGGER.log(Level.INFO, "You have set Black Bishop (Prom5) on to " + Arrays.toString(input));
			J.setIcon(BlackBishopProm5.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackBishopProm5.setCurrentPositionX(X);
			BlackBishopProm5.setCurrentPositionY(Y);
			BlackBishopProm5.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Bishop (Prom6)"){
			LOGGER.log(Level.INFO, "You have set Black Bishop (Prom6) on to " + Arrays.toString(input));
			J.setIcon(BlackBishopProm6.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackBishopProm6.setCurrentPositionX(X);
			BlackBishopProm6.setCurrentPositionY(Y);
			BlackBishopProm6.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Bishop (Prom7)"){
			LOGGER.log(Level.INFO, "You have set Black Bishop (Prom7) on to " + Arrays.toString(input));
			J.setIcon(BlackBishopProm7.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackBishopProm7.setCurrentPositionX(X);
			BlackBishopProm7.setCurrentPositionY(Y);
			BlackBishopProm7.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Bishop (Prom8)"){
			LOGGER.log(Level.INFO, "You have set Black Bishop (Prom8) on to " + Arrays.toString(input));
			J.setIcon(BlackBishopProm8.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackBishopProm8.setCurrentPositionX(X);
			BlackBishopProm8.setCurrentPositionY(Y);
			BlackBishopProm8.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Knight (Prom1)"){
			LOGGER.log(Level.INFO, "You have set Black Knight (Prom1) on to " + Arrays.toString(input));
			J.setIcon(BlackKnightProm1.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackKnightProm1.setCurrentPositionX(X);
			BlackKnightProm1.setCurrentPositionY(Y);
			BlackKnightProm1.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Knight (Prom2)"){
			LOGGER.log(Level.INFO, "You have set Black Knight (Prom2) on to " + Arrays.toString(input));
			J.setIcon(BlackKnightProm2.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackKnightProm2.setCurrentPositionX(X);
			BlackKnightProm2.setCurrentPositionY(Y);
			BlackKnightProm2.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Knight (Prom3)"){
			LOGGER.log(Level.INFO, "You have set Black Knight (Prom3) on to " + Arrays.toString(input));
			J.setIcon(BlackKnightProm3.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackKnightProm3.setCurrentPositionX(X);
			BlackKnightProm3.setCurrentPositionY(Y);
			BlackKnightProm3.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Knight (Prom4)"){
			LOGGER.log(Level.INFO, "You have set Black Knight (Prom4) on to " + Arrays.toString(input));
			J.setIcon(BlackKnightProm4.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackKnightProm4.setCurrentPositionX(X);
			BlackKnightProm4.setCurrentPositionY(Y);
			BlackKnightProm4.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Knight (Prom5)"){
			LOGGER.log(Level.INFO, "You have set Black Knight (Prom5) on to " + Arrays.toString(input));
			J.setIcon(BlackKnightProm5.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackKnightProm5.setCurrentPositionX(X);
			BlackKnightProm5.setCurrentPositionY(Y);
			BlackKnightProm5.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Knight (Prom6)"){
			LOGGER.log(Level.INFO, "You have set Black Knight (Prom6) on to " + Arrays.toString(input));
			J.setIcon(BlackKnightProm6.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackKnightProm6.setCurrentPositionX(X);
			BlackKnightProm6.setCurrentPositionY(Y);
			BlackKnightProm6.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Knight (Prom7)"){
			LOGGER.log(Level.INFO, "You have set Black Knight (Prom7) on to " + Arrays.toString(input));
			J.setIcon(BlackKnightProm7.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackKnightProm7.setCurrentPositionX(X);
			BlackKnightProm7.setCurrentPositionY(Y);
			BlackKnightProm7.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
		if (CurrentTitle == "Black Knight (Prom8)"){
			J.setIcon(BlackKnightProm8.getIcon());
			J.setName(CurrentTitle);
			ComingFrom.setIcon(null);
			WhiteTurn = true;
			BlackKnightProm8.setCurrentPositionX(X);
			BlackKnightProm8.setCurrentPositionY(Y);
			BlackKnightProm8.setCurrentPositionXY(X,Y);
			//determine if a kill has been made. if so then have to update piece location
			BlackPiece.updateKill(input);
			resetWhiteEnPassat();
			
			if(Superclass_WhiteKing.isWhiteKingInCheck_Set(input, CurrentTitle)){
				System.out.println("White King in Check by " + CurrentTitle + "!");
				ActivateWhiteCheck = true;
			}
			return;
		}
	}
    static void resetMainFrame(JFrame PromotionFrame, LightBox light, JPanel PromotionPanel, JButton J){
    	frame.toFront();
    	frame.setEnabled(true);
    	PromotionFrame.dispose();
    	J.setIcon(null);
    	J.setName(null);
    	light.closeLightBox(frame, PromotionPanel);
    }

	static String getColor(int x,int y){
		
		String NoColor = "NoColor";
		
		if (WhiteKnightG1.getCurrentPositionX() == x && WhiteKnightG1.getCurrentPositionY() == y){
			return WhiteKnightG1.getColor();
		}
		if (WhiteBishopF1.getCurrentPositionX() == x && WhiteBishopF1.getCurrentPositionY() == y){
			return WhiteBishopF1.getColor();
		}
		if (WhitePawnH2.getCurrentPositionX() == x && WhitePawnH2.getCurrentPositionY() == y){
			return WhitePawnH2.getColor();
		}
		if (WhitePawnG2.getCurrentPositionX() == x && WhitePawnG2.getCurrentPositionY() == y){
			return WhitePawnG2.getColor();
		}
		if (WhitePawnF2.getCurrentPositionX() == x && WhitePawnF2.getCurrentPositionY() == y){
			return WhitePawnF2.getColor();
		}
		if (WhitePawnE2.getCurrentPositionX() == x && WhitePawnE2.getCurrentPositionY() == y){
			return WhitePawnE2.getColor();
		}
		if (WhitePawnD2.getCurrentPositionX() == x && WhitePawnD2.getCurrentPositionY() == y){
			return WhitePawnD2.getColor();
		}
		if (WhiteRookH1.getCurrentPositionX() == x && WhiteRookH1.getCurrentPositionY() == y){
			return WhiteRookH1.getColor();
		}
		if (WhiteQueenD1.getCurrentPositionX() == x && WhiteQueenD1.getCurrentPositionY() == y){
			return WhiteQueenD1.getColor();
		}
		if (WhiteBishopC1.getCurrentPositionX() == x && WhiteBishopC1.getCurrentPositionY() == y){
			return WhiteBishopC1.getColor();
		}
		if (WhiteRookA1.getCurrentPositionX() == x && WhiteRookA1.getCurrentPositionY() == y){
			return WhiteRookA1.getColor();
		}
		if (WhitePawnA2.getCurrentPositionX() == x && WhitePawnA2.getCurrentPositionY() == y){
			return WhitePawnA2.getColor();
		}
		if (WhitePawnB2.getCurrentPositionX() == x && WhitePawnB2.getCurrentPositionY() == y){
			return WhitePawnB2.getColor();
		}
		if (WhitePawnC2.getCurrentPositionX() == x && WhitePawnC2.getCurrentPositionY() == y){
			return WhitePawnC2.getColor();
		}
		if (WhiteKingE1.getCurrentPositionX() == x && WhiteKingE1.getCurrentPositionY() == y){
			return WhiteKingE1.getColor();
		}
		if (WhiteKnightB1.getCurrentPositionX() == x && WhiteKnightB1.getCurrentPositionY() == y){
			return WhiteKnightB1.getColor();
		}
		if (BlackPawnA7.getCurrentPositionX() == x && BlackPawnA7.getCurrentPositionY() == y){
			return BlackPawnA7.getColor();
		}
		if (BlackPawnB7.getCurrentPositionX() == x && BlackPawnB7.getCurrentPositionY() == y){
			return BlackPawnB7.getColor();
		}
		if (BlackPawnH7.getCurrentPositionX() == x && BlackPawnH7.getCurrentPositionY() == y){
			return BlackPawnH7.getColor();
		}
		if (BlackPawnG7.getCurrentPositionX() == x && BlackPawnG7.getCurrentPositionY() == y){
			return BlackPawnG7.getColor();
		}
		if (BlackPawnF7.getCurrentPositionX() == x && BlackPawnF7.getCurrentPositionY() == y){
			return BlackPawnF7.getColor();
		}
		if (BlackPawnE7.getCurrentPositionX() == x && BlackPawnE7.getCurrentPositionY() == y){
			return BlackPawnE7.getColor();
		}
		if (BlackPawnD7.getCurrentPositionX() == x && BlackPawnD7.getCurrentPositionY() == y){
			return BlackPawnD7.getColor();
		}
		if (BlackKingE8.getCurrentPositionX() == x && BlackKingE8.getCurrentPositionY() == y){
			return BlackKingE8.getColor();
		}
		if (BlackKnightB8.getCurrentPositionX() == x && BlackKnightB8.getCurrentPositionY() == y){
			return BlackKnightB8.getColor();
		}
		if (BlackKnightG8.getCurrentPositionX() == x && BlackKnightG8.getCurrentPositionY() == y){
			return BlackKnightG8.getColor();
		}
		if (BlackPawnC7.getCurrentPositionX() == x && BlackPawnC7.getCurrentPositionY() == y){
			return BlackPawnC7.getColor();
		}
		if (BlackRookA8.getCurrentPositionX() == x && BlackRookA8.getCurrentPositionY() == y){
			return BlackRookA8.getColor();
		}
		if (BlackBishopC8.getCurrentPositionX() == x && BlackBishopC8.getCurrentPositionY() == y){
			return BlackBishopC8.getColor();
		}
		if (BlackBishopF8.getCurrentPositionX() == x && BlackBishopF8.getCurrentPositionY() == y){
			return BlackBishopF8.getColor();
		}
		if (BlackQueenD8.getCurrentPositionX() == x && BlackQueenD8.getCurrentPositionY() == y){
			return BlackQueenD8.getColor();
		}
		if (BlackRookH8.getCurrentPositionX() == x && BlackRookH8.getCurrentPositionY() == y){
			return BlackRookH8.getColor();
		}
		if (WhiteQueenProm8.getCurrentPositionX() == x && WhiteQueenProm8.getCurrentPositionY() == y){
			return WhiteQueenProm8.getColor();
		}
		if (WhiteQueenProm7.getCurrentPositionX() == x && WhiteQueenProm7.getCurrentPositionY() == y){
			return WhiteQueenProm7.getColor();
		}
		if (WhiteQueenProm6.getCurrentPositionX() == x && WhiteQueenProm6.getCurrentPositionY() == y){
			return WhiteQueenProm6.getColor();
		}
		if (WhiteQueenProm5.getCurrentPositionX() == x && WhiteQueenProm5.getCurrentPositionY() == y){
			return WhiteQueenProm5.getColor();
		}
		if (WhiteQueenProm4.getCurrentPositionX() == x && WhiteQueenProm4.getCurrentPositionY() == y){
			return WhiteQueenProm4.getColor();
		}
		if (WhiteQueenProm3.getCurrentPositionX() == x && WhiteQueenProm3.getCurrentPositionY() == y){
			return WhiteQueenProm3.getColor();
		}
		if (WhiteQueenProm2.getCurrentPositionX() == x && WhiteQueenProm2.getCurrentPositionY() == y){
			return WhiteQueenProm2.getColor();
		}
		if (WhiteQueenProm1.getCurrentPositionX() == x && WhiteQueenProm1.getCurrentPositionY() == y){
			return WhiteQueenProm1.getColor();
		}
		if (WhiteRookProm8.getCurrentPositionX() == x && WhiteRookProm8.getCurrentPositionY() == y){
			return WhiteRookProm8.getColor();
		}
		if (WhiteRookProm7.getCurrentPositionX() == x && WhiteRookProm7.getCurrentPositionY() == y){
			return WhiteRookProm7.getColor();
		}
		if (WhiteRookProm6.getCurrentPositionX() == x && WhiteRookProm6.getCurrentPositionY() == y){
			return WhiteRookProm6.getColor();
		}
		if (WhiteRookProm5.getCurrentPositionX() == x && WhiteRookProm5.getCurrentPositionY() == y){
			return WhiteRookProm5.getColor();
		}
		if (WhiteRookProm4.getCurrentPositionX() == x && WhiteRookProm4.getCurrentPositionY() == y){
			return WhiteRookProm4.getColor();
		}
		if (WhiteRookProm3.getCurrentPositionX() == x && WhiteRookProm3.getCurrentPositionY() == y){
			return WhiteRookProm3.getColor();
		}
		if (WhiteRookProm2.getCurrentPositionX() == x && WhiteRookProm2.getCurrentPositionY() == y){
			return WhiteRookProm2.getColor();
		}
		if (WhiteRookProm1.getCurrentPositionX() == x && WhiteRookProm1.getCurrentPositionY() == y){
			return WhiteRookProm1.getColor();
		}
		if (WhiteBishopProm8.getCurrentPositionX() == x && WhiteBishopProm8.getCurrentPositionY() == y){
			return WhiteBishopProm8.getColor();
		}
		if (WhiteBishopProm7.getCurrentPositionX() == x && WhiteBishopProm7.getCurrentPositionY() == y){
			return WhiteBishopProm7.getColor();
		}
		if (WhiteBishopProm6.getCurrentPositionX() == x && WhiteBishopProm6.getCurrentPositionY() == y){
			return WhiteBishopProm6.getColor();
		}
		if (WhiteBishopProm5.getCurrentPositionX() == x && WhiteBishopProm5.getCurrentPositionY() == y){
			return WhiteBishopProm5.getColor();
		}
		if (WhiteBishopProm4.getCurrentPositionX() == x && WhiteBishopProm4.getCurrentPositionY() == y){
			return WhiteBishopProm4.getColor();
		}
		if (WhiteBishopProm3.getCurrentPositionX() == x && WhiteBishopProm3.getCurrentPositionY() == y){
			return WhiteBishopProm3.getColor();
		}
		if (WhiteBishopProm2.getCurrentPositionX() == x && WhiteBishopProm2.getCurrentPositionY() == y){
			return WhiteBishopProm2.getColor();
		}
		if (WhiteBishopProm1.getCurrentPositionX() == x && WhiteBishopProm1.getCurrentPositionY() == y){
			return WhiteBishopProm1.getColor();
		}
		if (WhiteKnightProm8.getCurrentPositionX() == x && WhiteKnightProm8.getCurrentPositionY() == y){
			return WhiteKnightProm8.getColor();
		}
		if (WhiteKnightProm7.getCurrentPositionX() == x && WhiteKnightProm7.getCurrentPositionY() == y){
			return WhiteKnightProm7.getColor();
		}
		if (WhiteKnightProm6.getCurrentPositionX() == x && WhiteKnightProm6.getCurrentPositionY() == y){
			return WhiteKnightProm6.getColor();
		}
		if (WhiteKnightProm5.getCurrentPositionX() == x && WhiteKnightProm5.getCurrentPositionY() == y){
			return WhiteKnightProm5.getColor();
		}
		if (WhiteKnightProm4.getCurrentPositionX() == x && WhiteKnightProm4.getCurrentPositionY() == y){
			return WhiteKnightProm4.getColor();
		}
		if (WhiteKnightProm3.getCurrentPositionX() == x && WhiteKnightProm3.getCurrentPositionY() == y){
			return WhiteKnightProm3.getColor();
		}
		if (WhiteKnightProm2.getCurrentPositionX() == x && WhiteKnightProm2.getCurrentPositionY() == y){
			return WhiteKnightProm2.getColor();
		}
		if (WhiteKnightProm1.getCurrentPositionX() == x && WhiteKnightProm1.getCurrentPositionY() == y){
			return WhiteKnightProm1.getColor();
		}
		if (BlackQueenProm8.getCurrentPositionX() == x && BlackQueenProm8.getCurrentPositionY() == y){
			return BlackQueenProm8.getColor();
		}
		if (BlackQueenProm7.getCurrentPositionX() == x && BlackQueenProm7.getCurrentPositionY() == y){
			return BlackQueenProm7.getColor();
		}
		if (BlackQueenProm6.getCurrentPositionX() == x && BlackQueenProm6.getCurrentPositionY() == y){
			return BlackQueenProm6.getColor();
		}
		if (BlackQueenProm5.getCurrentPositionX() == x && BlackQueenProm5.getCurrentPositionY() == y){
			return BlackQueenProm5.getColor();
		}
		if (BlackQueenProm4.getCurrentPositionX() == x && BlackQueenProm4.getCurrentPositionY() == y){
			return BlackQueenProm4.getColor();
		}
		if (BlackQueenProm3.getCurrentPositionX() == x && BlackQueenProm3.getCurrentPositionY() == y){
			return BlackQueenProm3.getColor();
		}
		if (BlackQueenProm2.getCurrentPositionX() == x && BlackQueenProm2.getCurrentPositionY() == y){
			return BlackQueenProm2.getColor();
		}
		if (BlackQueenProm1.getCurrentPositionX() == x && BlackQueenProm1.getCurrentPositionY() == y){
			return BlackQueenProm1.getColor();
		}
		if (BlackRookProm8.getCurrentPositionX() == x && BlackRookProm8.getCurrentPositionY() == y){
			return BlackRookProm8.getColor();
		}
		if (BlackRookProm7.getCurrentPositionX() == x && BlackRookProm7.getCurrentPositionY() == y){
			return BlackRookProm7.getColor();
		}
		if (BlackRookProm6.getCurrentPositionX() == x && BlackRookProm6.getCurrentPositionY() == y){
			return BlackRookProm6.getColor();
		}
		if (BlackRookProm5.getCurrentPositionX() == x && BlackRookProm5.getCurrentPositionY() == y){
			return BlackRookProm5.getColor();
		}
		if (BlackRookProm4.getCurrentPositionX() == x && BlackRookProm4.getCurrentPositionY() == y){
			return BlackRookProm4.getColor();
		}
		if (BlackRookProm3.getCurrentPositionX() == x && BlackRookProm3.getCurrentPositionY() == y){
			return BlackRookProm3.getColor();
		}
		if (BlackRookProm2.getCurrentPositionX() == x && BlackRookProm2.getCurrentPositionY() == y){
			return BlackRookProm2.getColor();
		}
		if (BlackRookProm1.getCurrentPositionX() == x && BlackRookProm1.getCurrentPositionY() == y){
			return BlackRookProm1.getColor();
		}
		if (BlackBishopProm8.getCurrentPositionX() == x && BlackBishopProm8.getCurrentPositionY() == y){
			return BlackBishopProm8.getColor();
		}
		if (BlackBishopProm7.getCurrentPositionX() == x && BlackBishopProm7.getCurrentPositionY() == y){
			return BlackBishopProm7.getColor();
		}
		if (BlackBishopProm6.getCurrentPositionX() == x && BlackBishopProm6.getCurrentPositionY() == y){
			return BlackBishopProm6.getColor();
		}
		if (BlackBishopProm5.getCurrentPositionX() == x && BlackBishopProm5.getCurrentPositionY() == y){
			return BlackBishopProm5.getColor();
		}
		if (BlackBishopProm4.getCurrentPositionX() == x && BlackBishopProm4.getCurrentPositionY() == y){
			return BlackBishopProm4.getColor();
		}
		if (BlackBishopProm3.getCurrentPositionX() == x && BlackBishopProm3.getCurrentPositionY() == y){
			return BlackBishopProm3.getColor();
		}
		if (BlackBishopProm2.getCurrentPositionX() == x && BlackBishopProm2.getCurrentPositionY() == y){
			return BlackBishopProm2.getColor();
		}	
		if (BlackBishopProm1.getCurrentPositionX() == x && BlackBishopProm1.getCurrentPositionY() == y){
			return BlackBishopProm1.getColor();
		}
		if (BlackKnightProm8.getCurrentPositionX() == x && BlackKnightProm8.getCurrentPositionY() == y){
			return BlackKnightProm8.getColor();
		}
		if (BlackKnightProm7.getCurrentPositionX() == x && BlackKnightProm7.getCurrentPositionY() == y){
			return BlackKnightProm7.getColor();
		}
		if (BlackKnightProm6.getCurrentPositionX() == x && BlackKnightProm6.getCurrentPositionY() == y){
			return BlackKnightProm6.getColor();
		}
		if (BlackKnightProm5.getCurrentPositionX() == x && BlackKnightProm5.getCurrentPositionY() == y){
			return BlackKnightProm5.getColor();
		}
		if (BlackKnightProm4.getCurrentPositionX() == x && BlackKnightProm4.getCurrentPositionY() == y){
			return BlackKnightProm4.getColor();
		}
		if (BlackKnightProm3.getCurrentPositionX() == x && BlackKnightProm3.getCurrentPositionY() == y){
			return BlackKnightProm3.getColor();
		}
		if (BlackKnightProm2.getCurrentPositionX() == x && BlackKnightProm2.getCurrentPositionY() == y){
			return BlackKnightProm2.getColor();
		}
		if (BlackKnightProm1.getCurrentPositionX() == x && BlackKnightProm1.getCurrentPositionY() == y){
			return BlackKnightProm1.getColor();
		}

		return NoColor;
	}
	static void highlightButton(JButton J){
		J.setSelected(true);
		J.setBorder(new LineBorder(Color.blue, 5,true));
		Highlighted = true;
	}
	static void dehighlightButton(JButton J){

		try{
			J.setSelected(false);
			J.setBorder(new LineBorder(Color.black, 2,true));
		}
		catch(NullPointerException e){
			//User has exited from winning screen. Null Pointer results from clicking reset game
			//ResetSelection(); is taken care of from Winning Screen to avoid graphical glitch
		}
		finally{
			Highlighted = false;
		}
		
	}
	static void whiteMovementHandler(int ComX, int ComY){

		if(CurrentTitle == "White Knight (G1)"){
			int x = WhiteKnightG1.getCurrentPositionX();
			int y = WhiteKnightG1.getCurrentPositionY();
			PossibleXY = WhiteKnightG1.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}	
		if(CurrentTitle == "White Knight (B1)"){
			int x = WhiteKnightB1.getCurrentPositionX();
			int y = WhiteKnightB1.getCurrentPositionY();
			PossibleXY = WhiteKnightB1.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White King (E1)"){
			int x = WhiteKingE1.getCurrentPositionX();
			int y = WhiteKingE1.getCurrentPositionY();
			PossibleXY = WhiteKingE1.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Bishop (F1)"){
			int x = WhiteBishopF1.getCurrentPositionX();
			int y = WhiteBishopF1.getCurrentPositionY();
			PossibleXY = WhiteBishopF1.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}	
		if(CurrentTitle == "White Bishop (C1)"){
			int x = WhiteBishopC1.getCurrentPositionX();
			int y = WhiteBishopC1.getCurrentPositionY();
			PossibleXY = WhiteBishopC1.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Rook (A1)"){
			int x = WhiteRookA1.getCurrentPositionX();
			int y = WhiteRookA1.getCurrentPositionY();
			PossibleXY = WhiteRookA1.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Rook (H1)"){
			int x = WhiteRookH1.getCurrentPositionX();
			int y = WhiteRookH1.getCurrentPositionY();
			PossibleXY = WhiteRookH1.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Pawn (H2)"){
			int x = WhitePawnH2.getCurrentPositionX();
			int y = WhitePawnH2.getCurrentPositionY();
			PossibleXY = WhitePawnH2.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}	
		if(CurrentTitle == "White Pawn (G2)"){
			int x = WhitePawnG2.getCurrentPositionX();
			int y = WhitePawnG2.getCurrentPositionY();
			PossibleXY = WhitePawnG2.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}	
		if(CurrentTitle == "White Pawn (F2)"){
			int x = WhitePawnF2.getCurrentPositionX();
			int y = WhitePawnF2.getCurrentPositionY();
			PossibleXY = WhitePawnF2.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}	
		if(CurrentTitle == "White Pawn (E2)"){
			int x = WhitePawnE2.getCurrentPositionX();
			int y = WhitePawnE2.getCurrentPositionY();
			PossibleXY = WhitePawnE2.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}	
		if(CurrentTitle == "White Pawn (D2)"){
			int x = WhitePawnD2.getCurrentPositionX();
			int y = WhitePawnD2.getCurrentPositionY();
			PossibleXY = WhitePawnD2.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}	

		if(CurrentTitle == "White Pawn (C2)"){
			int x = WhitePawnC2.getCurrentPositionX();
			int y = WhitePawnC2.getCurrentPositionY();
			PossibleXY = WhitePawnC2.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Pawn (B2)"){
			int x = WhitePawnB2.getCurrentPositionX();
			int y = WhitePawnB2.getCurrentPositionY();
			PossibleXY = WhitePawnB2.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Pawn (A2)"){
			int x = WhitePawnA2.getCurrentPositionX();
			int y = WhitePawnA2.getCurrentPositionY();
			PossibleXY = WhitePawnA2.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}

		
	
		if(CurrentTitle == "White Queen (D1)"){
			int x = WhiteQueenD1.getCurrentPositionX();
			int y = WhiteQueenD1.getCurrentPositionY();
			PossibleXY = WhiteQueenD1.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		
		if(CurrentTitle == "White Queen (Prom8)"){
			int x = WhiteQueenProm8.getCurrentPositionX();
			int y = WhiteQueenProm8.getCurrentPositionY();
			PossibleXY = WhiteQueenProm8.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Queen (Prom7)"){
			int x = WhiteQueenProm7.getCurrentPositionX();
			int y = WhiteQueenProm7.getCurrentPositionY();
			PossibleXY = WhiteQueenProm7.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Queen (Prom6)"){
			int x = WhiteQueenProm6.getCurrentPositionX();
			int y = WhiteQueenProm6.getCurrentPositionY();
			PossibleXY = WhiteQueenProm6.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Queen (Prom5)"){
			int x = WhiteQueenProm5.getCurrentPositionX();
			int y = WhiteQueenProm5.getCurrentPositionY();
			PossibleXY = WhiteQueenProm5.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Queen (Prom4)"){
			int x = WhiteQueenProm4.getCurrentPositionX();
			int y = WhiteQueenProm4.getCurrentPositionY();
			PossibleXY = WhiteQueenProm4.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Queen (Prom3)"){
			int x = WhiteQueenProm3.getCurrentPositionX();
			int y = WhiteQueenProm3.getCurrentPositionY();
			PossibleXY = WhiteQueenProm3.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Queen (Prom2)"){
			int x = WhiteQueenProm2.getCurrentPositionX();
			int y = WhiteQueenProm2.getCurrentPositionY();
			PossibleXY = WhiteQueenProm2.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Queen (Prom1)"){
			int x = WhiteQueenProm1.getCurrentPositionX();
			int y = WhiteQueenProm1.getCurrentPositionY();
			PossibleXY = WhiteQueenProm1.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		
		if(CurrentTitle == "White Knight (Prom8)"){
			int x = WhiteKnightProm8.getCurrentPositionX();
			int y = WhiteKnightProm8.getCurrentPositionY();
			PossibleXY = WhiteKnightProm8.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Knight (Prom7)"){
			int x = WhiteKnightProm7.getCurrentPositionX();
			int y = WhiteKnightProm7.getCurrentPositionY();
			PossibleXY = WhiteKnightProm7.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Knight (Prom6)"){
			int x = WhiteKnightProm6.getCurrentPositionX();
			int y = WhiteKnightProm6.getCurrentPositionY();
			PossibleXY = WhiteKnightProm6.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Knight (Prom5)"){
			int x = WhiteKnightProm5.getCurrentPositionX();
			int y = WhiteKnightProm5.getCurrentPositionY();
			PossibleXY = WhiteKnightProm5.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Knight (Prom4)"){
			int x = WhiteKnightProm4.getCurrentPositionX();
			int y = WhiteKnightProm4.getCurrentPositionY();
			PossibleXY = WhiteKnightProm4.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Knight (Prom3)"){
			int x = WhiteKnightProm3.getCurrentPositionX();
			int y = WhiteKnightProm3.getCurrentPositionY();
			PossibleXY = WhiteKnightProm3.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Knight (Prom2)"){
			int x = WhiteKnightProm2.getCurrentPositionX();
			int y = WhiteKnightProm2.getCurrentPositionY();
			PossibleXY = WhiteKnightProm2.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Knight (Prom1)"){
			int x = WhiteKnightProm1.getCurrentPositionX();
			int y = WhiteKnightProm1.getCurrentPositionY();
			PossibleXY = WhiteKnightProm1.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Bishop (Prom8)"){
			int x = WhiteBishopProm8.getCurrentPositionX();
			int y = WhiteBishopProm8.getCurrentPositionY();
			PossibleXY = WhiteBishopProm8.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Bishop (Prom7)"){
			int x = WhiteBishopProm7.getCurrentPositionX();
			int y = WhiteBishopProm7.getCurrentPositionY();
			PossibleXY = WhiteBishopProm7.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Bishop (Prom6)"){
			int x = WhiteBishopProm6.getCurrentPositionX();
			int y = WhiteBishopProm6.getCurrentPositionY();
			PossibleXY = WhiteBishopProm6.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Bishop (Prom5)"){
			int x = WhiteBishopProm5.getCurrentPositionX();
			int y = WhiteBishopProm5.getCurrentPositionY();
			PossibleXY = WhiteBishopProm5.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Bishop (Prom4)"){
			int x = WhiteBishopProm4.getCurrentPositionX();
			int y = WhiteBishopProm4.getCurrentPositionY();
			PossibleXY = WhiteBishopProm4.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Bishop (Prom3)"){
			int x = WhiteBishopProm3.getCurrentPositionX();
			int y = WhiteBishopProm3.getCurrentPositionY();
			PossibleXY = WhiteBishopProm3.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Bishop (Prom2)"){
			int x = WhiteBishopProm2.getCurrentPositionX();
			int y = WhiteBishopProm2.getCurrentPositionY();
			PossibleXY = WhiteBishopProm2.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Bishop (Prom1)"){
			int x = WhiteBishopProm1.getCurrentPositionX();
			int y = WhiteBishopProm1.getCurrentPositionY();
			PossibleXY = WhiteBishopProm1.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Rook (Prom8)"){
			int x = WhiteRookProm8.getCurrentPositionX();
			int y = WhiteRookProm8.getCurrentPositionY();
			PossibleXY = WhiteRookProm8.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Rook (Prom7)"){
			int x = WhiteRookProm7.getCurrentPositionX();
			int y = WhiteRookProm7.getCurrentPositionY();
			PossibleXY = WhiteRookProm7.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Rook (Prom6)"){
			int x = WhiteRookProm6.getCurrentPositionX();
			int y = WhiteRookProm6.getCurrentPositionY();
			PossibleXY = WhiteRookProm6.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Rook (Prom5)"){
			int x = WhiteRookProm5.getCurrentPositionX();
			int y = WhiteRookProm5.getCurrentPositionY();
			PossibleXY = WhiteRookProm5.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Rook (Prom4)"){
			int x = WhiteRookProm4.getCurrentPositionX();
			int y = WhiteRookProm4.getCurrentPositionY();
			PossibleXY = WhiteRookProm4.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Rook (Prom3)"){
			int x = WhiteRookProm3.getCurrentPositionX();
			int y = WhiteRookProm3.getCurrentPositionY();
			PossibleXY = WhiteRookProm3.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Rook (Prom2)"){
			int x = WhiteRookProm2.getCurrentPositionX();
			int y = WhiteRookProm2.getCurrentPositionY();
			PossibleXY = WhiteRookProm2.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "White Rook (Prom1)"){
			int x = WhiteRookProm1.getCurrentPositionX();
			int y = WhiteRookProm1.getCurrentPositionY();
			PossibleXY = WhiteRookProm1.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		
	}
	static void blackMovementHandler(int ComX, int ComY){
		
		if(CurrentTitle == "Black Pawn (C7)"){
			int x = BlackPawnC7.getCurrentPositionX();
			int y = BlackPawnC7.getCurrentPositionY();
			PossibleXY = BlackPawnC7.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Pawn (A7)"){
			int x = BlackPawnA7.getCurrentPositionX();
			int y = BlackPawnA7.getCurrentPositionY();
			PossibleXY = BlackPawnA7.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Pawn (H7)"){
			int x = BlackPawnH7.getCurrentPositionX();
			int y = BlackPawnH7.getCurrentPositionY();
			PossibleXY = BlackPawnH7.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Pawn (G7)"){
			int x = BlackPawnG7.getCurrentPositionX();
			int y = BlackPawnG7.getCurrentPositionY();
			PossibleXY = BlackPawnG7.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Pawn (F7)"){
			int x = BlackPawnF7.getCurrentPositionX();
			int y = BlackPawnF7.getCurrentPositionY();
			PossibleXY = BlackPawnF7.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Pawn (E7)"){
			int x = BlackPawnE7.getCurrentPositionX();
			int y = BlackPawnE7.getCurrentPositionY();
			PossibleXY = BlackPawnE7.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Pawn (D7)"){
			int x = BlackPawnD7.getCurrentPositionX();
			int y = BlackPawnD7.getCurrentPositionY();
			PossibleXY = BlackPawnD7.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Pawn (B7)"){
			int x = BlackPawnB7.getCurrentPositionX();
			int y = BlackPawnB7.getCurrentPositionY();
			PossibleXY = BlackPawnB7.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		
		if(CurrentTitle == "Black Knight (G8)"){
			int x = BlackKnightG8.getCurrentPositionX();
			int y = BlackKnightG8.getCurrentPositionY();
			PossibleXY = BlackKnightG8.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Bishop (F8)"){
			int x = BlackBishopF8.getCurrentPositionX();
			int y = BlackBishopF8.getCurrentPositionY();
			PossibleXY = BlackBishopF8.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Rook (H8)"){
			int x = BlackRookH8.getCurrentPositionX();
			int y = BlackRookH8.getCurrentPositionY();
			PossibleXY = BlackRookH8.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		
		if(CurrentTitle == "Black King (E8)"){
			int x = BlackKingE8.getCurrentPositionX();
			int y = BlackKingE8.getCurrentPositionY();
			PossibleXY = BlackKingE8.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Knight (B8)"){
			int x = BlackKnightB8.getCurrentPositionX();
			int y = BlackKnightB8.getCurrentPositionY();
			PossibleXY = BlackKnightB8.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		
		if(CurrentTitle == "Black Rook (A8)"){
			int x = BlackRookA8.getCurrentPositionX();
			int y = BlackRookA8.getCurrentPositionY();
			PossibleXY = BlackRookA8.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Bishop (C8)"){
			int x = BlackBishopC8.getCurrentPositionX();
			int y = BlackBishopC8.getCurrentPositionY();
			PossibleXY = BlackBishopC8.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Queen (D8)"){
			int x = BlackQueenD8.getCurrentPositionX();
			int y = BlackQueenD8.getCurrentPositionY();
			PossibleXY = BlackQueenD8.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Queen (Prom8)"){

			int x = BlackQueenProm8.getCurrentPositionX();
			int y = BlackQueenProm8.getCurrentPositionY();
			PossibleXY = BlackQueenProm8.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Queen (Prom7)"){

			int x = BlackQueenProm7.getCurrentPositionX();
			int y = BlackQueenProm7.getCurrentPositionY();
			PossibleXY = BlackQueenProm7.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Queen (Prom6)"){

			int x = BlackQueenProm6.getCurrentPositionX();
			int y = BlackQueenProm6.getCurrentPositionY();
			PossibleXY = BlackQueenProm6.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Queen (Prom5)"){

			int x = BlackQueenProm5.getCurrentPositionX();
			int y = BlackQueenProm5.getCurrentPositionY();
			PossibleXY = BlackQueenProm5.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Queen (Prom4)"){

			int x = BlackQueenProm4.getCurrentPositionX();
			int y = BlackQueenProm4.getCurrentPositionY();
			PossibleXY = BlackQueenProm4.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Queen (Prom3)"){

			int x = BlackQueenProm3.getCurrentPositionX();
			int y = BlackQueenProm3.getCurrentPositionY();
			PossibleXY = BlackQueenProm3.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Queen (Prom2)"){

			int x = BlackQueenProm2.getCurrentPositionX();
			int y = BlackQueenProm2.getCurrentPositionY();
			PossibleXY = BlackQueenProm2.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Queen (Prom1)"){

			int x = BlackQueenProm1.getCurrentPositionX();
			int y = BlackQueenProm1.getCurrentPositionY();
			PossibleXY = BlackQueenProm1.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Knight (Prom8)"){

			int x = BlackKnightProm8.getCurrentPositionX();
			int y = BlackKnightProm8.getCurrentPositionY();
			PossibleXY = BlackKnightProm8.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Knight (Prom7)"){

			int x = BlackKnightProm7.getCurrentPositionX();
			int y = BlackKnightProm7.getCurrentPositionY();
			PossibleXY = BlackKnightProm7.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Knight (Prom6)"){

			int x = BlackKnightProm6.getCurrentPositionX();
			int y = BlackKnightProm6.getCurrentPositionY();
			PossibleXY = BlackKnightProm6.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Knight (Prom5)"){

			int x = BlackKnightProm5.getCurrentPositionX();
			int y = BlackKnightProm5.getCurrentPositionY();
			PossibleXY = BlackKnightProm5.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Knight (Prom4)"){

			int x = BlackKnightProm4.getCurrentPositionX();
			int y = BlackKnightProm4.getCurrentPositionY();
			PossibleXY = BlackKnightProm4.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Knight (Prom3)"){

			int x = BlackKnightProm3.getCurrentPositionX();
			int y = BlackKnightProm3.getCurrentPositionY();
			PossibleXY = BlackKnightProm3.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Knight (Prom2)"){

			int x = BlackKnightProm2.getCurrentPositionX();
			int y = BlackKnightProm2.getCurrentPositionY();
			PossibleXY = BlackKnightProm2.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Knight (Prom1)"){

			int x = BlackKnightProm1.getCurrentPositionX();
			int y = BlackKnightProm1.getCurrentPositionY();
			PossibleXY = BlackKnightProm1.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Bishop (Prom8)"){

			int x = BlackBishopProm8.getCurrentPositionX();
			int y = BlackBishopProm8.getCurrentPositionY();
			PossibleXY = BlackBishopProm8.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Bishop (Prom7)"){

			int x = BlackBishopProm7.getCurrentPositionX();
			int y = BlackBishopProm7.getCurrentPositionY();
			PossibleXY = BlackBishopProm7.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Bishop (Prom6)"){

			int x = BlackBishopProm6.getCurrentPositionX();
			int y = BlackBishopProm6.getCurrentPositionY();
			PossibleXY = BlackBishopProm6.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Bishop (Prom5)"){

			int x = BlackBishopProm5.getCurrentPositionX();
			int y = BlackBishopProm5.getCurrentPositionY();
			PossibleXY = BlackBishopProm5.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Bishop (Prom4)"){

			int x = BlackBishopProm4.getCurrentPositionX();
			int y = BlackBishopProm4.getCurrentPositionY();
			PossibleXY = BlackBishopProm4.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Bishop (Prom3)"){

			int x = BlackBishopProm3.getCurrentPositionX();
			int y = BlackBishopProm3.getCurrentPositionY();
			PossibleXY = BlackBishopProm3.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Bishop (Prom2)"){

			int x = BlackBishopProm2.getCurrentPositionX();
			int y = BlackBishopProm2.getCurrentPositionY();
			PossibleXY = BlackBishopProm2.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Bishop (Prom1)"){

			int x = BlackBishopProm1.getCurrentPositionX();
			int y = BlackBishopProm1.getCurrentPositionY();
			PossibleXY = BlackBishopProm1.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}

		
		if(CurrentTitle == "Black Rook (Prom8)"){

			int x = BlackRookProm8.getCurrentPositionX();
			int y = BlackRookProm8.getCurrentPositionY();
			PossibleXY = BlackRookProm8.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Rook (Prom7)"){

			int x = BlackRookProm7.getCurrentPositionX();
			int y = BlackRookProm7.getCurrentPositionY();
			PossibleXY = BlackRookProm7.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Rook (Prom6)"){

			int x = BlackRookProm6.getCurrentPositionX();
			int y = BlackRookProm6.getCurrentPositionY();
			PossibleXY = BlackRookProm6.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Rook (Prom5)"){

			int x = BlackRookProm5.getCurrentPositionX();
			int y = BlackRookProm5.getCurrentPositionY();
			PossibleXY = BlackRookProm5.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Rook (Prom4)"){

			int x = BlackRookProm4.getCurrentPositionX();
			int y = BlackRookProm4.getCurrentPositionY();
			PossibleXY = BlackRookProm4.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Rook (Prom3)"){

			int x = BlackRookProm3.getCurrentPositionX();
			int y = BlackRookProm3.getCurrentPositionY();
			PossibleXY = BlackRookProm3.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Rook (Prom2)"){

			int x = BlackRookProm2.getCurrentPositionX();
			int y = BlackRookProm2.getCurrentPositionY();
			PossibleXY = BlackRookProm2.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		if(CurrentTitle == "Black Rook (Prom1)"){

			int x = BlackRookProm1.getCurrentPositionX();
			int y = BlackRookProm1.getCurrentPositionY();
			PossibleXY = BlackRookProm1.movementHandler(x, y);
			LOGGER.log(Level.INFO, "Available Moves: " + ListUtility.listToString(PossibleXY));
			return;
		}
		
	
	}
	static void Engine(int ComX, int ComY,int[] ComXY, JButton b){
		
		CurrentColor = getColor(ComX,ComY);
		
		if (Highlighted == false && CurrentColor == "White"){
			if (WhiteTurn == true){
				final long startWhiteGrabTime = System.currentTimeMillis();
				highlightButton(b);		
				CurrentTitle=getPiece(ComX,ComY);
				LOGGER.log(Level.INFO, "Current Title is: " + CurrentTitle);
				whiteMovementHandler(ComX,ComY); //will determine available moves
				ComingFrom = b; //will set the button to which will send to next button
				final long endWhiteGrabTime = System.currentTimeMillis();
				System.out.println("Total white grab piece time: " + (endWhiteGrabTime - startWhiteGrabTime));
			}
			else if (WhiteTurn == false){
				//do nothing
				System.out.println("It is black's turn");
			}
		}
		
		else if (Highlighted == false && CurrentColor == "Black"){
			if (WhiteTurn == true){
				//do nothing
				System.out.println("It is white's turn");
			}
			else if (WhiteTurn == false){
				final long startBlackGrabTime = System.currentTimeMillis();
				highlightButton(b);
				CurrentTitle=getPiece(ComX,ComY);
				LOGGER.log(Level.INFO, "Current Title is: " + CurrentTitle);
				blackMovementHandler(ComX,ComY);
				ComingFrom = b;
				final long endBlackGrabTime = System.currentTimeMillis();
				System.out.println("Total black grab piece time: " + (endBlackGrabTime - startBlackGrabTime));
			}
		}
		
		else if (Highlighted == true && b.isSelected()== true){
			dehighlightButton(b);
		}
		
		else if (Highlighted == true && b.isSelected() == false){
			//loops through PossibleXY multiarray to find a match
			for(int i = 0 ; i < PossibleXY.size() ; i++) {
				
				int[] Coordinate = PossibleXY.get(i);
				
				if(Arrays.equals(Coordinate, ComXY)){		
					//have to check if we are still in check right here	
					
					if (WhiteTurn){		
						//It is white's turn. Is White King in check?
						final long startCheckTime = System.currentTimeMillis();
						if (WhiteKingE1.isWhiteKingInCheck(ComXY, CurrentTitle) == true){
							System.out.println("Move denied. White King is in check or would be placed into check");
							dehighlightButton(ComingFrom);	
							break;
							}
						ActivateWhiteCheck = false;
						final long endCheckTime = System.currentTimeMillis();
						System.out.println("Total white set piece time: " + (endCheckTime - startCheckTime));
					}
					else if (WhiteTurn == false){
						//It is black's turn. Is Black King in check?	
						 	final long startCheckTime = System.currentTimeMillis();
							if (BlackKingE8.isBlackKingInCheck(ComXY, CurrentTitle) == true){
								//this denies movement that place king into check
								System.out.println("Move denied. Black King is in check or would be placed into check");
								dehighlightButton(ComingFrom);	
								break;
							}
							ActivateBlackCheck = false;
							final long endCheckTime = System.currentTimeMillis();
							System.out.println("Total black set piece time: " + (endCheckTime - startCheckTime));			
					}
					

					
					setPiece(b,ComXY[0],ComXY[1]);
					LOGGER.log(Level.FINE,"You have done a valid move");
					
					// have to look for checkmate here
					final long startCheckMateTime = System.currentTimeMillis();
				
					if(ActivateBlackCheck){
						
						LOGGER.log(Level.INFO, "Black King in Check");
						if(Superclass_BlackKing.isBlackKingInCheckMate()){
							LOGGER.log(Level.INFO, "Black King in Checkmate. White wins!");
							new WinningScreen(1);
						}
					}
					
					if(ActivateWhiteCheck){
						LOGGER.log(Level.INFO, "White King in Check");
						if(Superclass_WhiteKing.isWhiteKingInCheckMate()){
							LOGGER.log(Level.INFO, "White King in Checkmate. Black wins!");
							new WinningScreen(0);
						}	
					}
					final long endCheckMateTime = System.currentTimeMillis();
					System.out.println("Total checkmate set piece time: " + (endCheckMateTime - startCheckMateTime));	
					break;  
				}		
			}		
			dehighlightButton(ComingFrom);		
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if ("A8Com".equals(e.getActionCommand())) {
			Engine(A8ComX, A8ComY, A8ComXY, bA8);
		}
		if ("A7Com".equals(e.getActionCommand())) {
			Engine(A7ComX, A7ComY, A7ComXY, bA7);
		}
		if ("A6Com".equals(e.getActionCommand())) {
			Engine(A6ComX,A6ComY,A6ComXY,bA6);
		}
		if ("A5Com".equals(e.getActionCommand())) {
			Engine(A5ComX, A5ComY, A5ComXY, bA5);
		}
		if ("A4Com".equals(e.getActionCommand())) {
			Engine(A4ComX, A4ComY, A4ComXY, bA4);
		}
		if ("A3Com".equals(e.getActionCommand())) {
			Engine(A3ComX, A3ComY, A3ComXY, bA3);
		}
		if ("A2Com".equals(e.getActionCommand())) {
			Engine(A2ComX, A2ComY, A2ComXY, bA2);
		}
		if ("A1Com".equals(e.getActionCommand())) {		
			Engine(A1ComX, A1ComY, A1ComXY, bA1);
		}
		if ("B8Com".equals(e.getActionCommand())) {
			Engine(B8ComX, B8ComY, B8ComXY, bB8);
		}
		if ("B7Com".equals(e.getActionCommand())) {
			Engine(B7ComX, B7ComY, B7ComXY, bB7);
		}
		if ("B6Com".equals(e.getActionCommand())) {
			Engine(B6ComX, B6ComY, B6ComXY, bB6);
		}
		if ("B5Com".equals(e.getActionCommand())) {
			Engine(B5ComX, B5ComY, B5ComXY, bB5);
		}
		if ("B4Com".equals(e.getActionCommand())) {
			Engine(B4ComX,B4ComY,B4ComXY,bB4);
		}
		if ("B3Com".equals(e.getActionCommand())) {
			Engine(B3ComX,B3ComY,B3ComXY,bB3);
		}
		if ("B2Com".equals(e.getActionCommand())) {
			Engine(B2ComX,B2ComY,B2ComXY,bB2);
		}
		if ("B1Com".equals(e.getActionCommand())) {
			Engine(B1ComX, B1ComY, B1ComXY, bB1);
		}    
		if ("C8Com".equals(e.getActionCommand())) {
			Engine(C8ComX, C8ComY, C8ComXY, bC8);
		}   
		if ("C7Com".equals(e.getActionCommand())) {
			Engine(C7ComX, C7ComY, C7ComXY, bC7);
		}    
		if ("C6Com".equals(e.getActionCommand())) {
			Engine(C6ComX, C6ComY, C6ComXY, bC6);
		}    
		if ("C5Com".equals(e.getActionCommand())) {
			Engine(C5ComX, C5ComY, C5ComXY, bC5);
		}    
		if ("C4Com".equals(e.getActionCommand())) {
			Engine(C4ComX, C4ComY, C4ComXY, bC4);
		}    
		if ("C3Com".equals(e.getActionCommand())) {
			Engine(C3ComX, C3ComY, C3ComXY, bC3);
		}   
		if ("C2Com".equals(e.getActionCommand())) {
			Engine(C2ComX, C2ComY, C2ComXY, bC2);
		}    
		if ("C1Com".equals(e.getActionCommand())) {
			Engine(C1ComX, C1ComY, C1ComXY, bC1);
		}   
		if ("D8Com".equals(e.getActionCommand())) {
			Engine(D8ComX, D8ComY, D8ComXY, bD8);
		}   
		if ("D7Com".equals(e.getActionCommand())) {
			Engine(D7ComX, D7ComY, D7ComXY, bD7);
		}    
		if ("D6Com".equals(e.getActionCommand())) {
			Engine(D6ComX, D6ComY, D6ComXY, bD6);
		}    
		if ("D5Com".equals(e.getActionCommand())) {
			Engine(D5ComX, D5ComY, D5ComXY, bD5);
		}    
		if ("D4Com".equals(e.getActionCommand())) {
			Engine(D4ComX, D4ComY, D4ComXY, bD4);
		}    
		if ("D3Com".equals(e.getActionCommand())) {
			Engine(D3ComX, D3ComY, D3ComXY, bD3);
		}   
		if ("D2Com".equals(e.getActionCommand())) {
			Engine(D2ComX, D2ComY, D2ComXY, bD2);
		}    
		if ("D1Com".equals(e.getActionCommand())) {
			Engine(D1ComX, D1ComY, D1ComXY, bD1);
		}    
		if ("E8Com".equals(e.getActionCommand())) {
			Engine(E8ComX, E8ComY, E8ComXY, bE8);
		}   
		if ("E7Com".equals(e.getActionCommand())) {
			Engine(E7ComX, E7ComY, E7ComXY, bE7);
		}    
		if ("E6Com".equals(e.getActionCommand())) {
			Engine(E6ComX, E6ComY, E6ComXY, bE6);
		}    
		if ("E5Com".equals(e.getActionCommand())) {
			Engine(E5ComX, E5ComY, E5ComXY, bE5);
		}    
		if ("E4Com".equals(e.getActionCommand())) {
			Engine(E4ComX, E4ComY, E4ComXY, bE4);
		}    
		if ("E3Com".equals(e.getActionCommand())) {
			Engine(E3ComX, E3ComY, E3ComXY, bE3);
		}   
		if ("E2Com".equals(e.getActionCommand())) {
			Engine(E2ComX, E2ComY, E2ComXY, bE2);
		}    
		if ("E1Com".equals(e.getActionCommand())) {
			Engine(E1ComX, E1ComY, E1ComXY, bE1);
		}  
		if ("F8Com".equals(e.getActionCommand())) {
			Engine(F8ComX, F8ComY, F8ComXY, bF8);
		}   
		if ("F7Com".equals(e.getActionCommand())) {
			Engine(F7ComX, F7ComY, F7ComXY, bF7);
		}    
		if ("F6Com".equals(e.getActionCommand())) {
			Engine(F6ComX, F6ComY, F6ComXY, bF6);
		}    
		if ("F5Com".equals(e.getActionCommand())) {
			Engine(F5ComX, F5ComY, F5ComXY, bF5);
		}    
		if ("F4Com".equals(e.getActionCommand())) {
			Engine(F4ComX, F4ComY, F4ComXY, bF4);
		}    
		if ("F3Com".equals(e.getActionCommand())) {
			Engine(F3ComX, F3ComY, F3ComXY, bF3);
		}   
		if ("F2Com".equals(e.getActionCommand())) {
			Engine(F2ComX, F2ComY, F2ComXY, bF2);
		}    
		if ("F1Com".equals(e.getActionCommand())) {
			Engine(F1ComX, F1ComY, F1ComXY, bF1);
		}  
		if ("G8Com".equals(e.getActionCommand())) {
			Engine(G8ComX, G8ComY, G8ComXY, bG8);
		}   
		if ("G7Com".equals(e.getActionCommand())) {
			Engine(G7ComX, G7ComY, G7ComXY, bG7);
		}    
		if ("G6Com".equals(e.getActionCommand())) {
			Engine(G6ComX, G6ComY, G6ComXY, bG6);
		}    
		if ("G5Com".equals(e.getActionCommand())) {
			Engine(G5ComX, G5ComY, G5ComXY, bG5);
		}    
		if ("G4Com".equals(e.getActionCommand())) {
			Engine(G4ComX, G4ComY, G4ComXY, bG4);
		}    
		if ("G3Com".equals(e.getActionCommand())) {
			Engine(G3ComX, G3ComY, G3ComXY, bG3);
		}   
		if ("G2Com".equals(e.getActionCommand())) {
			Engine(G2ComX, G2ComY, G2ComXY, bG2);
		}    
		if ("G1Com".equals(e.getActionCommand())) {
			Engine(G1ComX, G1ComY, G1ComXY, bG1);
		}  
		if ("H8Com".equals(e.getActionCommand())) {
			Engine(H8ComX, H8ComY, H8ComXY, bH8);
		}   
		if ("H7Com".equals(e.getActionCommand())) {
			Engine(H7ComX, H7ComY, H7ComXY, bH7);
		}    
		if ("H6Com".equals(e.getActionCommand())) {
			Engine(H6ComX, H6ComY, H6ComXY, bH6);
		}    
		if ("H5Com".equals(e.getActionCommand())) {
			Engine(H5ComX, H5ComY, H5ComXY, bH5);
		}    
		if ("H4Com".equals(e.getActionCommand())) {
			Engine(H4ComX, H4ComY, H4ComXY, bH4);
		}    
		if ("H3Com".equals(e.getActionCommand())) {
			Engine(H3ComX, H3ComY, H3ComXY, bH3);
		}   
		if ("H2Com".equals(e.getActionCommand())) {
			Engine(H2ComX, H2ComY, H2ComXY, bH2);
		}    
		if ("H1Com".equals(e.getActionCommand())) {
			Engine(H1ComX, H1ComY, H1ComXY, bH1);
		}  
	}
}
