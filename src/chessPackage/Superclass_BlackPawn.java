package chessPackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;

public class Superclass_BlackPawn extends BlackPiece {
	static ImageIcon getIcon(){
		URL Black_Pawn_URL = Chess.class.getResource("chess_piece_black_pawn.png");
		ImageIcon Black_Pawn_Icon = new ImageIcon(Black_Pawn_URL);
		return Black_Pawn_Icon;
	}
	
	static ArrayList<int []> movementHandler(int CurrentX, int CurrentY,int StartingPositionX, int StartingPositionY){
		
		ArrayList<int []> MoveList = new ArrayList<int []>();
		
		if (CurrentX == StartingPositionX && CurrentY == StartingPositionY){
			int [][]MultiArray = new int[4][2];
			MultiArray[0]=null;
			MultiArray[1]=null;
			MultiArray[2]=null;
			MultiArray[3]=null;

			MultiArray=searcherOneTile(MultiArray,CurrentX,CurrentY); //XY1
			MultiArray= killSearcher(MultiArray,CurrentX,CurrentY); //XY2,XY3
			MultiArray=searcherTwoTiles(MultiArray,CurrentX,CurrentY); //XY4
			
			MoveList = ListUtility.arrayToListConverter(MultiArray);
			
			return MoveList;
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
			
			BlackPawnA7.setEnPassant(false);
			BlackPawnB7.setEnPassant(false);
			BlackPawnC7.setEnPassant(false);
			BlackPawnD7.setEnPassant(false);
			BlackPawnE7.setEnPassant(false);
			BlackPawnF7.setEnPassant(false);
			BlackPawnG7.setEnPassant(false);
			BlackPawnH7.setEnPassant(false);

			MoveList = ListUtility.arrayToListConverter(MultiArray);
			
			return MoveList;
		}
	}
	static int[][] enPassant(int[][] MultiArray, int CurrentX,int CurrentY) {
		
		int [] NewXY3 = new int[2];
		int [] NewXY4 = new int[2];
		
		
		NewXY3[0] = CurrentX +1;
		NewXY3[1] = CurrentY + 0;
		
		NewXY4[0] = CurrentX +1;
		NewXY4[1] = CurrentY + 1;

		for(int i = 0 ; i < aggregateWhitePawns().length ; i++) {
			int[] Coordinate = aggregateWhitePawns()[i];
			if(Arrays.equals(Coordinate, NewXY3)){
				//System.out.println("We have found a white pawn to the right available for enPassant kill");
				
				MultiArray[3]=NewXY4;
				break;  
					
			}	
		}
		
		int [] NewXY5 = new int[2];
		int [] NewXY6 = new int[2];
		
		
		NewXY5[0] = CurrentX - 1;
		NewXY5[1] = CurrentY + 0;
		
		NewXY6[0] = CurrentX - 1;
		NewXY6[1] = CurrentY + 1;
		
		for(int i = 0 ; i < aggregateWhitePawns().length ; i++) {
			int[] Coordinate = aggregateWhitePawns()[i];
			if(Arrays.equals(Coordinate, NewXY5)){
				//System.out.println("We have found a white pawn to the left available for enPassant kill");
				
				MultiArray[4]=NewXY6;
				break;  
					
			}	
		}
		return MultiArray;
	}

	static int [][] killSearcher( int[][]MultiArray,int CurrentX, int CurrentY){
		//this function looks for a white piece to kill with 2 different kill moves
		int [] NewXY2 = new int[2];
		int [] NewXY3 = new int[2];
		
		
		NewXY2[0] = CurrentX +1;
		NewXY2[1] = CurrentY +1;
		

		for(int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY2)){
				//System.out.println("We have found a valid white piece to kill");
				MultiArray[1]=NewXY2;
				break;  
			}	
		}	
		NewXY3[0]=CurrentX-1;
		NewXY3[1]=CurrentY+1;
		
		for(int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate,NewXY3)){
				//System.out.println("We have found a valid white piece to kill");
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
		
		
		NewXY2[0] = CurrentX +1;
		NewXY2[1] = CurrentY +1;
		
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i], NewXY2)){
				//System.out.println("Black Pawn threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		
		NewXY3[0]=CurrentX-1;
		NewXY3[1]=CurrentY+1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY3)){
				//System.out.println("Black Pawn threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		return MultiArray;
	}
	static int [][] searcherOneTile( int[][]MultiArray,int CurrentX, int CurrentY){
		//this second function looks for a black piece 1 tile in front
		int [] NewXY = new int[2];
		
		NewXY[0] = CurrentX +0;
		NewXY[1] = CurrentY +1;
		

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a black piece 1 tile in front of this pawn");
				return MultiArray;
			}				
		}
		
		for(int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a white piece 1 tile in front of this pawn");
				return MultiArray;
			
			}	
		}
		MultiArray[0]=NewXY;
		return MultiArray;   			  
		}	


	static int [][] searcherTwoTiles( int[][]MultiArray,int CurrentX, int CurrentY){
		//this second function looks for a black piece 2 tiles in front
		
		int [] NewXY5= new int[2];
		
		NewXY5[0] = CurrentX +0;
		NewXY5[1] = CurrentY +1;

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY5)){
				//System.out.println("We have found a black piece 2 tile in front of this pawn");
				return MultiArray;
			}				
		}
		//we have to account for a white piece 2 tiles in front

		for(int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY5)){
				//System.out.println("We have found a white piece 2 tile in front of this pawn");
				return MultiArray;
			}	
		}
		int [] NewXY4= new int[2];
		
		NewXY4[0] = CurrentX +0;
		NewXY4[1] = CurrentY +2;
		
		//we have to account for a black piece 2 tiles in front

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY4)){
				//System.out.println("We have found a black piece 2 tiles in front of this pawn");
				return MultiArray;
			}				
		}
		//we have to account for a white piece 2 tiles in front
		for(int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY4)){
				//System.out.println("We have found a white piece 2 tiles in front of this pawn");
				
				return MultiArray;
			}
		}
		MultiArray[3]=NewXY4;
		return MultiArray;   			  
	}
}
