package chessPackage;

import java.net.URL;
import java.util.Arrays;

import javax.swing.ImageIcon;

public class Superclass_WhitePawn extends WhitePiece {
	static ImageIcon getIcon(){
		URL White_Pawn_URL = Chess.class.getResource("chess_piece_white_pawn.png");
		ImageIcon White_Pawn_Icon = new ImageIcon(White_Pawn_URL);
		return White_Pawn_Icon;
	}
	
	static int[][] movementHandler(int CurrentX, int CurrentY, int StartingPositionX, int StartingPositionY){

		if (CurrentX == StartingPositionX && CurrentY == StartingPositionY){
			int [][]MultiArray = new int[4][2];
			MultiArray[0]=null;
			MultiArray[1]=null;
			MultiArray[2]=null;
			MultiArray[3]=null;
			MultiArray=searcherOneTile(MultiArray,CurrentX,CurrentY); //XY1
			MultiArray= killSearcher(MultiArray,CurrentX,CurrentY); //XY2,XY3
			MultiArray=searcherTwoTile(MultiArray,CurrentX,CurrentY); //XY4
			
			MultiArray = Piece.arrayConverter(MultiArray);
			
			return MultiArray;
		}
		else{
			int [][]MultiArray = new int[5][2];
			MultiArray[0]=null;
			MultiArray[1]=null;
			MultiArray[2]=null;
			MultiArray[3]=null;
			MultiArray[4]=null;
			
			MultiArray=searcherOneTile(MultiArray,CurrentX,CurrentY);//XY1
			MultiArray= killSearcher(MultiArray,CurrentX,CurrentY);//XY2,XY3	
			MultiArray=enPassant(MultiArray,CurrentX,CurrentY);	
			
			WhitePawnA2.setEnPassant(false);
			WhitePawnB2.setEnPassant(false);
			WhitePawnC2.setEnPassant(false);
			WhitePawnD2.setEnPassant(false);
			WhitePawnE2.setEnPassant(false);
			WhitePawnF2.setEnPassant(false);
			WhitePawnG2.setEnPassant(false);
			WhitePawnH2.setEnPassant(false);
			
			MultiArray = Piece.arrayConverter(MultiArray);
			
			return MultiArray;
		}
	}
static int[][] enPassant(int[][] MultiArray, int CurrentX,int CurrentY) {
		
		int [] NewXY3 = new int[2];
		int [] NewXY4 = new int[2];
		
		
		NewXY3[0] = CurrentX +1;
		NewXY3[1] = CurrentY + 0;
		
		NewXY4[0] = CurrentX +1;
		NewXY4[1] = CurrentY - 1;

		for(int i = 0 ; i < aggregateBlackPawns().length ; i++) {
			int[] Coordinate = aggregateBlackPawns()[i];
			if(Arrays.equals(Coordinate, NewXY3)){
				//System.out.println("We have found a black pawn to the right available for enPassant kill");
				
				MultiArray[3]=NewXY4;
				break;  
					
			}	
		}
		
		int [] NewXY5 = new int[2];
		int [] NewXY6 = new int[2];
		
		
		NewXY5[0] = CurrentX - 1;
		NewXY5[1] = CurrentY + 0;
		
		NewXY6[0] = CurrentX - 1;
		NewXY6[1] = CurrentY - 1;
		
		for(int i = 0 ; i < aggregateBlackPawns().length ; i++) {
			int[] Coordinate = aggregateBlackPawns()[i];
			if(Arrays.equals(Coordinate, NewXY5)){
				//System.out.println("We have found a black pawn to the left available for enPassant kill");
				
				MultiArray[4]=NewXY6;
				break;  
					
			}	
		}
		return MultiArray;
	}

	static int [][] killSearcher( int[][]MultiArray,int CurrentX, int CurrentY){
		//this function looks for a black piece to kill with 2 different kill moves
		
		int [] NewXY2 = new int[2];
		int [] NewXY3 = new int[2];
		
		
		NewXY2[0] = CurrentX -1;
		NewXY2[1] = CurrentY -1;
		for(int i = 0 ; i < aggregateBlacks().length ; i++) {
			int[] Coordinate = aggregateBlacks()[i];
			if(Arrays.equals(Coordinate, NewXY2)){
				//System.out.println("We have found a valid black piece to kill");
				MultiArray[1]=NewXY2;
				break;  
			}		    			  
		}		
		NewXY3[0]=CurrentX+1;
		NewXY3[1]=CurrentY-1;
		for(int i = 0 ; i < aggregateBlacks().length ; i++) {
			int[] Coordinate = aggregateBlacks()[i];
			if(Arrays.equals(Coordinate, NewXY3)){
				//System.out.println("We have found a valid black piece to kill");
				MultiArray[2]=NewXY3;
				break;  
			}		    			  
		}
		
		
		return MultiArray;
	}
	
	static int [][] checkPreventer( int[][]MultiArray,int CurrentX, int CurrentY){
		//this function prevents check against Black King
		int [] NewXY2 = new int[2];
		int [] NewXY3 = new int[2];
		
		
		NewXY2[0] = CurrentX -1;
		NewXY2[1] = CurrentY -1;
		
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
		
			if(Arrays.equals(MultiArray[i], NewXY2)){
				//System.out.println("White Pawn threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		
		NewXY3[0]=CurrentX+1;
		NewXY3[1]=CurrentY-1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY3)){
				//System.out.println("White Pawn threating check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		
		return MultiArray;
	}
	static int [][] searcherOneTile( int[][]MultiArray,int CurrentX, int CurrentY){
		//this function looks for a white or black piece 1 tile in front
		int [] NewXY = new int[2];
		
		NewXY[0] = CurrentX +0;
		NewXY[1] = CurrentY -1;
		//this loop looks for a white piece
		for(int i = 0 ; i < aggregateWhites().length ; i++) {
			int[] Coordinate = aggregateWhites()[i];
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a white piece in front of this pawn");
				return MultiArray;
				//gotta exit out of this function
			}				
		}
		//we have to account for black pieces 1 tile in front
		for(int i = 0 ; i < aggregateBlacks().length ; i++) {
			int[] Coordinate = aggregateBlacks()[i];
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a black piece in front of this pawn");
				return MultiArray;
				//gotta exit out of this function
			}				
		}
		MultiArray[0]=NewXY;
		return MultiArray;   			  
		}	
	static int [][] searcherTwoTile ( int[][]MultiArray,int CurrentX, int CurrentY){
		//this function looks for a white or black piece 2 tiles in front
		
		
		
		int [] NewXY5 = new int[2];
		
		NewXY5[0] = CurrentX +0;
		NewXY5[1] = CurrentY -1;
		
		//this loop looks for a white piece 2 tiles in front
		for(int i = 0 ; i < aggregateWhites().length ; i++) {
			int[] Coordinate = aggregateWhites()[i];
			if(Arrays.equals(Coordinate, NewXY5)){
				//System.out.println("We have found a white piece 2 tiles in front of this pawn");
				return MultiArray;
				//gotta exit out of this function
			
			}		    			  
		}
		
		//we have to account for a black piece 2 tiles in front
		for(int i = 0 ; i < aggregateBlacks().length ; i++) {
			int[] Coordinate = aggregateBlacks()[i];
			if(Arrays.equals(Coordinate, NewXY5)){
				//System.out.println("We have found a black piece 2 tiles in front of this pawn");
				return MultiArray;
				//gotta exit out of this function
			
			}		    			  
		}
		

		
		int [] NewXY4 = new int[2];
		
		NewXY4[0] = CurrentX +0;
		NewXY4[1] = CurrentY -2;
		
		//this loop looks for a white piece 2 tiles in front
		for(int i = 0 ; i < aggregateWhites().length ; i++) {
			int[] Coordinate = aggregateWhites()[i];
			if(Arrays.equals(Coordinate, NewXY4)){
				//System.out.println("We have found a white piece in front of this pawn");
				return MultiArray;
				//gotta exit out of this function
			
			}		    			  
		}
		
		//we have to account for a black piece 2 tiles in front
		for(int i = 0 ; i < aggregateBlacks().length ; i++) {
			int[] Coordinate = aggregateBlacks()[i];
			if(Arrays.equals(Coordinate, NewXY4)){
				//System.out.println("We have found a black piece in front of this pawn");
				return MultiArray;
				//gotta exit out of this function
			
			}		    			  
		}
		MultiArray[3]=NewXY4;
		return MultiArray;   			  
		}	

}
