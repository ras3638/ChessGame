package chessPackage;

import java.net.URL;
import java.util.Arrays;

import javax.swing.ImageIcon;

public class Superclass_WhiteBishop extends WhitePiece {
	static ImageIcon getIcon(){
		URL White_Bishop_URL = Chess.class.getResource("chess_piece_white_bishop.png");
		ImageIcon White_Bishop_Icon = new ImageIcon(White_Bishop_URL);
		return White_Bishop_Icon;
	}
	
	static int[][] movementHandler(int CurrentX, int CurrentY,int StartingPositionX, int StartingPositionY){
		
			int [][]MultiArray = new int[28][2];
			for(int i = 0 ; i < MultiArray.length ; i++) {
				MultiArray[i]=null;
			}

			MultiArray=searcherTopLeftTiles(MultiArray,CurrentX,CurrentY); 
			MultiArray=searcherTopRightTiles(MultiArray,CurrentX,CurrentY); 
			MultiArray=searcherBottomLeftTiles(MultiArray,CurrentX,CurrentY);
			MultiArray=searcherBottomRightTiles(MultiArray,CurrentX,CurrentY); 	
			
			MultiArray = Piece.arrayConverter(MultiArray);
			
			return MultiArray;
	}

	static int [][] checkPreventer( int[][]MultiArray,int CurrentX, int CurrentY, int[] ComXY, String CurrentTitle){
		//this function prevents check against Black King
		
		//top left tiles
		outerloop_TopLeftTiles:
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];
			NewXY[0] = CurrentX - j;
			NewXY[1] = CurrentY - j;
			
			if (NewXY[0] < 0 || NewXY[1] < 0 ){
				//break due to out of bounds
				break outerloop_TopLeftTiles;
			}
			for(int i = 0 ; i < aggregateBlacksEXKing(CurrentTitle,ComXY).length ; i++) {
				int[] Coordinate = aggregateBlacksEXKing(CurrentTitle,ComXY)[i];
				if(Arrays.equals(Coordinate, NewXY)){
					break outerloop_TopLeftTiles;
				}		    			  
			}
	
			for(int i = 0 ; i < aggregateWhitesForCheck(CurrentTitle, ComXY).length ; i++) {
				int[] Coordinate = aggregateWhitesForCheck(CurrentTitle, ComXY)[i];
				if(Arrays.equals(Coordinate, NewXY)){
					break outerloop_TopLeftTiles;
				}		
			}
			
			if(Arrays.equals(NewXY,ComXY) && CurrentTitle != "Black King (E8)"){
				//this if statement is necessary to allow pieces to block bishop's line of sight
				////System.out.println("Outerbreak3.3");
				break outerloop_TopLeftTiles;
			}

			for(int i = 0 ; i < MultiArray.length ; i++) {
				if(Arrays.equals(MultiArray[i], NewXY)){
					//System.out.println("White Bishop threatining check from the bottom right");
					MultiArray[i]=null;	
					break outerloop_TopLeftTiles;  
				}		    			  
			}
		}
		
		//top right tiles
		outerloop_TopRightTiles:
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];
			NewXY[0] = CurrentX + j;
			NewXY[1] = CurrentY - j;
			
			if (NewXY[0] > 7 || NewXY[1] < 0 ){
				//break due to out of bounds
				break outerloop_TopRightTiles;
			}
			for(int i = 0 ; i < aggregateBlacksEXKing(CurrentTitle,ComXY).length ; i++) {
				int[] Coordinate = aggregateBlacksEXKing(CurrentTitle,ComXY)[i];
				if(Arrays.equals(Coordinate, NewXY)){
					break outerloop_TopRightTiles;
				}		    			  
			}
			
			for(int i = 0 ; i < aggregateWhitesForCheck(CurrentTitle, ComXY).length ; i++) {
				int[] Coordinate = aggregateWhitesForCheck(CurrentTitle, ComXY)[i];
				if(Arrays.equals(Coordinate, NewXY)){
					break outerloop_TopRightTiles;
				}		
			}
			if(Arrays.equals(NewXY,ComXY) && CurrentTitle != "Black King (E8)"){
				//this if statement is necessary to allow pieces to block rook's line of sight
				break outerloop_TopRightTiles;
			}
			for(int i = 0 ; i < MultiArray.length ; i++) {
				if(Arrays.equals(MultiArray[i], NewXY)){
					//System.out.println("White Bishop threatining check from the bottom left");
					MultiArray[i]=null;	
					break outerloop_TopRightTiles;  
				}		    			  
			}
		}
		
		//bottom left tiles
		outerloop_BottomLeftTiles:
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];
			NewXY[0] = CurrentX - j;
			NewXY[1] = CurrentY + j;

			if (NewXY[0] < 0 || NewXY[1] > 7 ){
				//break due to out of bounds
				break outerloop_BottomLeftTiles;
			}
			
			for(int i = 0 ; i < aggregateBlacksEXKing(CurrentTitle,ComXY).length ; i++) {
				int[] Coordinate = aggregateBlacksEXKing(CurrentTitle,ComXY)[i];
				if(Arrays.equals(Coordinate, NewXY)){
					break outerloop_BottomLeftTiles;
				}		    			  
			}
		
			
			for(int i = 0 ; i < aggregateWhitesForCheck(CurrentTitle, ComXY).length ; i++) {
				int[] Coordinate = aggregateWhitesForCheck(CurrentTitle, ComXY)[i];
				
				if(Arrays.equals(Coordinate, NewXY)){
					////System.out.println("Outerbreak3.2");
					break outerloop_BottomLeftTiles;
				}		
			
			}
			if(Arrays.equals(NewXY,ComXY) && CurrentTitle != "Black King (E8)"){
				//this if statement is necessary to allow pieces to block rook's line of sight
				////System.out.println("Outerbreak3.3");
				break outerloop_BottomLeftTiles;
			}

			for(int i = 0 ; i < MultiArray.length ; i++) {
				if(Arrays.equals(MultiArray[i], NewXY)){
					////System.out.println("Outerbreak3.4");
					//System.out.println("White Bishop threatining check from the top right");
					MultiArray[i]=null;	
					break outerloop_BottomLeftTiles;  
				}		    			  
			}
		}
		//bottom right tiles
		outerloop_BottomRightTiles:
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];
			NewXY[0] = CurrentX + j;
			NewXY[1] = CurrentY + j;
			
			if (NewXY[0] > 7 || NewXY[1] > 7 ){
				//break due to out of bounds
				break outerloop_BottomRightTiles;
			}
			for(int i = 0 ; i < aggregateBlacksEXKing(CurrentTitle,ComXY).length ; i++) {
				int[] Coordinate = aggregateBlacksEXKing(CurrentTitle,ComXY)[i];
				if(Arrays.equals(Coordinate, NewXY)){
					break outerloop_BottomRightTiles;
				}		    			  
			}
			
			
			for(int i = 0 ; i < aggregateWhitesForCheck(CurrentTitle, ComXY).length ; i++) {
				int[] Coordinate = aggregateWhitesForCheck(CurrentTitle, ComXY)[i];
				if(Arrays.equals(Coordinate, NewXY)){
					break outerloop_BottomRightTiles;
				}		
			}
	
			if(Arrays.equals(NewXY,ComXY) && CurrentTitle != "Black King (E8)"){
				//this if statement is necessary to allow pieces to block rook's line of sight
				break outerloop_BottomRightTiles;
			}
			for(int i = 0 ; i < MultiArray.length ; i++) {
				if(Arrays.equals(MultiArray[i], NewXY)){
					//System.out.println("White Bishop threatining check from the top left");
					MultiArray[i]=null;	
					break outerloop_BottomRightTiles;
				}		    			  
			}
		}
		
		return MultiArray;
	}


	static int [][] searcherTopLeftTiles(int[][]MultiArray,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this rook top tiles
		
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];
			NewXY[0] = CurrentX - j;
			NewXY[1] = CurrentY - j;
			
			for(int i = 0 ; i < aggregateBlacks().length ; i++) {
				int[] Coordinate = aggregateBlacks()[i];
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a valid black piece to kill " + j + " tiles top left of this bishop");
					MultiArray[j-1]=NewXY;
					return MultiArray;
				}		    			  
			}
			for(int i = 0 ; i < aggregateWhites().length ; i++) {
				int[] Coordinate = aggregateWhites()[i];
				
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a white piece " + j + " tiles top left of this bishop");
					return MultiArray;
				}		
			
			}
			MultiArray[j-1]=NewXY;
		}
		return MultiArray;
	}	
	static int [][] searcherTopRightTiles(int[][]MultiArray,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this rook left tiles
		
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];	
			NewXY[0] = CurrentX + j;
			NewXY[1] = CurrentY - j;
			
			for(int i = 0 ; i < aggregateBlacks().length ; i++) {
				int[] Coordinate = aggregateBlacks()[i];
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a valid black piece to kill " + j + " tiles top right of this bishop");
					MultiArray[j+6]=NewXY;
					return MultiArray;
				}		    			  
			}
			
			for(int i = 0 ; i < aggregateWhites().length ; i++) {
				int[] Coordinate = aggregateWhites()[i];
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a white piece " + j + " tiles top right of this bishop");
					return MultiArray;
					}		
				}
			MultiArray[j+6]=NewXY;
			}
		return MultiArray;
		}
	static int [][] searcherBottomLeftTiles(int[][]MultiArray,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this rook left tiles
		
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];
			NewXY[0] = CurrentX - j;
			NewXY[1] = CurrentY + j;
			
			for(int i = 0 ; i < aggregateBlacks().length ; i++) {
				int[] Coordinate = aggregateBlacks()[i];
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a valid blacks piece to kill " + j + " tiles bottom left of this bishop");
					MultiArray[j+13]=NewXY;
					return MultiArray;
				}		    			  
			}

			for(int i = 0 ; i < aggregateWhites().length ; i++) {
				int[] Coordinate = aggregateWhites()[i];
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a white piece " + j + " tiles bottom left of this bishop");
					return MultiArray;
					}		
				}
			MultiArray[j+13]=NewXY;
			}
		return MultiArray;
		}
	static int [][] searcherBottomRightTiles(int[][]MultiArray,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this rook left tiles
		
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];	
			NewXY[0] = CurrentX + j;
			NewXY[1] = CurrentY + j;
			
			for(int i = 0 ; i < aggregateBlacks().length ; i++) {
				int[] Coordinate = aggregateBlacks()[i];
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a valid black piece to kill " + j + " tiles bottom right of this bishop");
					MultiArray[j+20]=NewXY;
					return MultiArray;
				}		    			  
			}
			
			for(int i = 0 ; i < aggregateWhites().length ; i++) {
				int[] Coordinate = aggregateWhites()[i];
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a white piece " + j + " tiles bottom right of this bishop");
					return MultiArray;
					}		
				}
			MultiArray[j+20]=NewXY;
			}
		return MultiArray;
		}
}
