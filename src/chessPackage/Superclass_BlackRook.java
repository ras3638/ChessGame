package chessPackage;

import java.net.URL;
import java.util.Arrays;

import javax.swing.ImageIcon;

public class Superclass_BlackRook extends BlackPiece {
	static ImageIcon getIcon(){
		URL Black_Rook_URL = Chess.class.getResource("chess_piece_black_rook.png");
		ImageIcon Black_Rook_Icon = new ImageIcon(Black_Rook_URL);
		return Black_Rook_Icon;
	}
	
	static int[][] movementHandler(int CurrentX, int CurrentY,int StartingPositionX, int StartingPositionY){
		
			int [][]MultiArray = new int[28][2];
			for(int i = 0 ; i < MultiArray.length ; i++) {
				MultiArray[i]=null;
			}

			MultiArray=searcherTopTiles(MultiArray,CurrentX,CurrentY); 
			MultiArray=searcherLeftTiles(MultiArray,CurrentX,CurrentY); 
			MultiArray=searcherBottomTiles(MultiArray,CurrentX,CurrentY);
			MultiArray=searcherRightTiles(MultiArray,CurrentX,CurrentY); 	
			
			MultiArray = Piece.arrayConverter(MultiArray);
			
			return MultiArray;
	}

	static int [][] checkPreventer( int[][]MultiArray,int CurrentX, int CurrentY, int[] ComXY, String CurrentTitle){
		//this function prevents check against Black King
		
		//top tiles
		outerloop_TopTiles:
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];
			NewXY[0] = CurrentX + 0;
			NewXY[1] = CurrentY - j;
			
			if (NewXY[1] < 0){
				//break due to out of bounds
				break outerloop_TopTiles;
			}
			for(int i = 0 ; i < aggregateWhitesEXKing(CurrentTitle,ComXY).length ; i++) {
				int[] Coordinate = aggregateWhitesEXKing(CurrentTitle,ComXY)[i];
				if(Arrays.equals(Coordinate, NewXY)){
					break outerloop_TopTiles;
				}		    			  
			}
	
			for(int i = 0 ; i < aggregateBlacksForCheck(CurrentTitle,ComXY).length ; i++) {
				int[] Coordinate = aggregateBlacksForCheck(CurrentTitle,ComXY)[i];
				if(Arrays.equals(Coordinate, NewXY)){
					break outerloop_TopTiles;
				}		
			}
			if(Arrays.equals(NewXY,ComXY) && CurrentTitle != "White King (E1)"){
				//this if statement is necessary to allow pieces to block rook's line of sight
				////System.out.println("Outerbreak3.3");
				break outerloop_TopTiles;
			}

			for(int i = 0 ; i < MultiArray.length ; i++) {
				if(Arrays.equals(MultiArray[i], NewXY)){
					//System.out.println("Black Rook threatining check from the bottom");
					MultiArray[i]=null;	
					break outerloop_TopTiles;  
				}		    			  
			}
		}
		
		//left tiles
		outerloop_LeftTiles:
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];
			NewXY[0] = CurrentX - j;
			NewXY[1] = CurrentY + 0;
			
			if (NewXY[0] < 0){
				//break due to out of bounds
				break outerloop_LeftTiles;
			}
			
			for(int i = 0 ; i < aggregateWhitesEXKing(CurrentTitle,ComXY).length ; i++) {
				int[] Coordinate = aggregateWhitesEXKing(CurrentTitle,ComXY)[i];
				if(Arrays.equals(Coordinate, NewXY)){
					break outerloop_LeftTiles;
				}		    			  
			}
			
			for(int i = 0 ; i < aggregateBlacksForCheck(CurrentTitle,ComXY).length ; i++) {
				int[] Coordinate = aggregateBlacksForCheck(CurrentTitle,ComXY)[i];
				if(Arrays.equals(Coordinate, NewXY)){
					break outerloop_LeftTiles;
				}		
			}
			if(Arrays.equals(NewXY,ComXY) && CurrentTitle != "White King (E1)"){
				//this if statement is necessary to allow pieces to block rook's line of sight
				////System.out.println("Outerbreak3.3");
				break outerloop_LeftTiles;
			}
			for(int i = 0 ; i < MultiArray.length ; i++) {
				if(Arrays.equals(MultiArray[i], NewXY)){
					//System.out.println("Black Rook threatining check from the right");
					MultiArray[i]=null;	
					break outerloop_LeftTiles;  
				}		    			  
			}
		}
		
		//bottom tiles
		outerloop_BottomTiles:
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];
			NewXY[0] = CurrentX + 0;
			NewXY[1] = CurrentY + j;
			
			if (NewXY[1] > 7){
				//break due to out of bounds
				break outerloop_BottomTiles;
			}

			for(int i = 0 ; i < aggregateWhitesEXKing(CurrentTitle,ComXY).length ; i++) {
				int[] Coordinate = aggregateWhitesEXKing(CurrentTitle,ComXY)[i];
				if(Arrays.equals(Coordinate, NewXY)){
					////System.out.println("Outerbreak3.1");
					break outerloop_BottomTiles;
				}		    			  
			}
		
			
			for(int i = 0 ; i < aggregateBlacksForCheck(CurrentTitle,ComXY).length ; i++) {
				int[] Coordinate = aggregateBlacksForCheck(CurrentTitle,ComXY)[i];
				
				if(Arrays.equals(Coordinate, NewXY)){
					////System.out.println("Outerbreak3.2");
					break outerloop_BottomTiles;
				}		
			
			}
			if(Arrays.equals(NewXY,ComXY) && CurrentTitle != "White King (E1)"){
				//this if statement is necessary to allow pieces to block rook's line of sight
				////System.out.println("Outerbreak3.3");
				break outerloop_BottomTiles;
			}

			for(int i = 0 ; i < MultiArray.length ; i++) {
				if(Arrays.equals(MultiArray[i], NewXY)){
					////System.out.println("Outerbreak3.4");
					//System.out.println("Black Rook threatining check from the top");
					MultiArray[i]=null;	
					break outerloop_BottomTiles;  
				}		    			  
			}
		}
		//right tiles
		outerloop_RightTiles:
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];
			NewXY[0] = CurrentX + j;
			NewXY[1] = CurrentY + 0;
			
			if (NewXY[0] > 7){
				//break due to out of bounds
				break outerloop_RightTiles;
			}
			
			for(int i = 0 ; i < aggregateWhitesEXKing(CurrentTitle,ComXY).length ; i++) {
				int[] Coordinate = aggregateWhitesEXKing(CurrentTitle,ComXY)[i];
				if(Arrays.equals(Coordinate, NewXY)){
					break outerloop_RightTiles;
				}		    			  
			}
			
			
			for(int i = 0 ; i < aggregateBlacksForCheck(CurrentTitle,ComXY).length ; i++) {
				int[] Coordinate = aggregateBlacksForCheck(CurrentTitle,ComXY)[i];
				if(Arrays.equals(Coordinate, NewXY)){
					break outerloop_RightTiles;
				}		
			}
	
			if(Arrays.equals(NewXY,ComXY) && CurrentTitle != "White King (E1)"){
				//this if statement is necessary to allow pieces to block rook's line of sight
				break outerloop_RightTiles;
			}
			for(int i = 0 ; i < MultiArray.length ; i++) {
				if(Arrays.equals(MultiArray[i], NewXY)){
					//System.out.println("Black Rook threatining check from the left");
					MultiArray[i]=null;	
					break outerloop_RightTiles;
				}		    			  
			}
		}
		
		return MultiArray;
	}


	static int [][] searcherTopTiles(int[][]MultiArray,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this rook top tiles
		
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];
			NewXY[0] = CurrentX + 0;
			NewXY[1] = CurrentY - j;
			
			for(int i = 0 ; i < aggregateWhites().length ; i++) {
				int[] Coordinate = aggregateWhites()[i];
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a valid white piece to kill " + j + " tiles top of this rook");
					MultiArray[j-1]=NewXY;
					return MultiArray;
				}		    			  
			}
			for(int i = 0 ; i < aggregateBlacks().length ; i++) {
				int[] Coordinate = aggregateBlacks()[i];
				
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a black piece " + j + " tiles top of this rook");
					return MultiArray;
				}		
			
			}
			MultiArray[j-1]=NewXY;
		}
		return MultiArray;
	}	
	static int [][] searcherLeftTiles(int[][]MultiArray,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this rook left tiles
		
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];	
			NewXY[0] = CurrentX - j;
			NewXY[1] = CurrentY + 0;
			
			for(int i = 0 ; i < aggregateWhites().length ; i++) {
				int[] Coordinate = aggregateWhites()[i];
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a valid white piece to kill " + j + " tiles left of this rook");
					MultiArray[j+6]=NewXY;
					return MultiArray;
				}		    			  
			}
			
			for(int i = 0 ; i < aggregateBlacks().length ; i++) {
				int[] Coordinate = aggregateBlacks()[i];
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a black piece " + j + " tiles left of this rook");
					return MultiArray;
					}		
				}
			MultiArray[j+6]=NewXY;
			}
		return MultiArray;
		}
	static int [][] searcherBottomTiles(int[][]MultiArray,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this rook left tiles
		
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];
			NewXY[0] = CurrentX + 0;
			NewXY[1] = CurrentY + j;
			
			for(int i = 0 ; i < aggregateWhites().length ; i++) {
				int[] Coordinate = aggregateWhites()[i];
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a valid white piece to kill " + j + " tiles bottom of this rook");
					MultiArray[j+13]=NewXY;
					return MultiArray;
				}		    			  
			}

			for(int i = 0 ; i < aggregateBlacks().length ; i++) {
				int[] Coordinate = aggregateBlacks()[i];
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a black piece " + j + " tiles bottom of this rook");
					return MultiArray;
					}		
				}
			MultiArray[j+13]=NewXY;
			}
		return MultiArray;
		}
	static int [][] searcherRightTiles(int[][]MultiArray,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this rook left tiles
		
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];	
			NewXY[0] = CurrentX + j;
			NewXY[1] = CurrentY + 0;
			
			for(int i = 0 ; i < aggregateWhites().length ; i++) {
				int[] Coordinate = aggregateWhites()[i];
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a valid white piece to kill " + j + " tiles right of this rook");
					MultiArray[j+20]=NewXY;
					return MultiArray;
				}		    			  
			}
			
			for(int i = 0 ; i < aggregateBlacks().length ; i++) {
				int[] Coordinate = aggregateBlacks()[i];
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a black piece " + j + " tiles right of this rook");
					return MultiArray;
					}		
				}
			MultiArray[j+20]=NewXY;
			}
		return MultiArray;
		}
}
