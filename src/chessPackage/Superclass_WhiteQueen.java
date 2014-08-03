package chessPackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;

public class Superclass_WhiteQueen extends WhitePiece {
	static ImageIcon getIcon(){
		URL White_Queen_URL = Chess.class.getResource("chess_piece_white_queen.png");
		ImageIcon White_Queen_Icon = new ImageIcon(White_Queen_URL);
		return White_Queen_Icon;
	}
	

	static ArrayList<int[]> movementHandler(int CurrentX, int CurrentY,int StartingPositionX, int StartingPositionY){

			ArrayList<int[]> MoveList = new ArrayList<int []>();

			MoveList = searcherTopTiles(MoveList,CurrentX,CurrentY); 
			MoveList = searcherLeftTiles(MoveList,CurrentX,CurrentY); 
			MoveList=searcherBottomTiles(MoveList,CurrentX,CurrentY);
			MoveList=searcherRightTiles(MoveList,CurrentX,CurrentY); 	
			
			MoveList=searcherTopLeftTiles(MoveList,CurrentX,CurrentY); 
			MoveList=searcherTopRightTiles(MoveList,CurrentX,CurrentY); 
			MoveList=searcherBottomLeftTiles(MoveList,CurrentX,CurrentY);
			MoveList=searcherBottomRightTiles(MoveList,CurrentX,CurrentY);
			

			return MoveList;
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
			for(int i = 0 ; i < aggregateBlacksEXKing(CurrentTitle,ComXY).length ; i++) {
				int[] Coordinate = aggregateBlacksEXKing(CurrentTitle,ComXY)[i];
				if(Arrays.equals(Coordinate, NewXY)){
					break outerloop_TopTiles;
				}		    			  
			}
	
			for(int[] i: aggregateWhitesForCheck(CurrentTitle, ComXY)){
				int[] Coordinate = i;
				if(Arrays.equals(Coordinate, NewXY)){
					break outerloop_TopTiles;
				}		 
			}
			
			if(Arrays.equals(NewXY,ComXY) && CurrentTitle != "Black King (E8)"){
				//this if statement is necessary to allow pieces to block Queen's line of sight
				////System.out.println("Outerbreak3.3");
				break outerloop_TopTiles;
			}

			for(int i = 0 ; i < MultiArray.length ; i++) {
				if(Arrays.equals(MultiArray[i], NewXY)){
					//System.out.println("White Queen threatining check from the bottom");
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
			
			for(int i = 0 ; i < aggregateBlacksEXKing(CurrentTitle,ComXY).length ; i++) {
				int[] Coordinate = aggregateBlacksEXKing(CurrentTitle,ComXY)[i];
				if(Arrays.equals(Coordinate, NewXY)){
					break outerloop_LeftTiles;
				}		    			  
			}
			

			for(int[] i: aggregateWhitesForCheck(CurrentTitle, ComXY)){
				int[] Coordinate = i;
				if(Arrays.equals(Coordinate, NewXY)){
					break outerloop_LeftTiles;
				}		 
			}
			if(Arrays.equals(NewXY,ComXY) && CurrentTitle != "Black King (E8)"){
				//this if statement is necessary to allow pieces to block Queen's line of sight
				break outerloop_LeftTiles;
			}
			for(int i = 0 ; i < MultiArray.length ; i++) {
				if(Arrays.equals(MultiArray[i], NewXY)){
					//System.out.println("White Queen threatining check from the right");
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

			for(int i = 0 ; i < aggregateBlacksEXKing(CurrentTitle,ComXY).length ; i++) {
				int[] Coordinate = aggregateBlacksEXKing(CurrentTitle,ComXY)[i];
				if(Arrays.equals(Coordinate, NewXY)){
					////System.out.println("Outerbreak3.1");
					break outerloop_BottomTiles;
				}		    			  
			}
		

			for(int[] i: aggregateWhitesForCheck(CurrentTitle, ComXY)){
				int[] Coordinate = i;
				if(Arrays.equals(Coordinate, NewXY)){
					////System.out.println("Outerbreak3.2");
					break outerloop_BottomTiles;
				}	 
			}
			if(Arrays.equals(NewXY,ComXY) && CurrentTitle != "Black King (E8)"){
				//this if statement is necessary to allow pieces to block Queen's line of sight
				////System.out.println("Outerbreak3.3");
				break outerloop_BottomTiles;
			}

			for(int i = 0 ; i < MultiArray.length ; i++) {
				if(Arrays.equals(MultiArray[i], NewXY)){
					////System.out.println("Outerbreak3.4");
					//System.out.println("White Queen threatining check from the top");
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
			
			for(int i = 0 ; i < aggregateBlacksEXKing(CurrentTitle,ComXY).length ; i++) {
				int[] Coordinate = aggregateBlacksEXKing(CurrentTitle,ComXY)[i];
				if(Arrays.equals(Coordinate, NewXY)){
					break outerloop_RightTiles;
				}		    			  
			}
			

			for(int[] i: aggregateWhitesForCheck(CurrentTitle, ComXY)){
				int[] Coordinate = i;
				if(Arrays.equals(Coordinate, NewXY)){
					break outerloop_RightTiles;
				}
			}
			if(Arrays.equals(NewXY,ComXY) && CurrentTitle != "Black King (E8)"){
				//this if statement is necessary to allow pieces to block Queen's line of sight
				break outerloop_RightTiles;
			}
			for(int i = 0 ; i < MultiArray.length ; i++) {
				if(Arrays.equals(MultiArray[i], NewXY)){
					//System.out.println("White Queen threatining check from the left");
					MultiArray[i]=null;	
					break outerloop_RightTiles;
				}		    			  
			}
		}
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
			
	
					for(int[] i: aggregateWhitesForCheck(CurrentTitle, ComXY)){
						int[] Coordinate = i;
						if(Arrays.equals(Coordinate, NewXY)){
							break outerloop_TopLeftTiles;
						}	
					}
					if(Arrays.equals(NewXY,ComXY) && CurrentTitle != "Black King (E8)"){
						//this if statement is necessary to allow pieces to block Queen's line of sight
						////System.out.println("Outerbreak3.3");
						break outerloop_TopLeftTiles;
					}

					for(int i = 0 ; i < MultiArray.length ; i++) {
						if(Arrays.equals(MultiArray[i], NewXY)){
							//System.out.println("White Queen threatining check from the bottom right");
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
					

					for(int[] i: aggregateWhitesForCheck(CurrentTitle, ComXY)){
						int[] Coordinate = i;
						if(Arrays.equals(Coordinate, NewXY)){
							break outerloop_TopRightTiles;
						}
					}
					if(Arrays.equals(NewXY,ComXY) && CurrentTitle != "Black King (E8)"){
						//this if statement is necessary to allow pieces to block Queen's line of sight
						break outerloop_TopRightTiles;
					}
					for(int i = 0 ; i < MultiArray.length ; i++) {
						if(Arrays.equals(MultiArray[i], NewXY)){
							//System.out.println("White Queen threatining check from the bottom left");
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
				
	
					for(int[] i: aggregateWhitesForCheck(CurrentTitle, ComXY)){
						int[] Coordinate = i;
						if(Arrays.equals(Coordinate, NewXY)){
							////System.out.println("Outerbreak3.2");
							break outerloop_BottomLeftTiles;
						}	
					}
					if(Arrays.equals(NewXY,ComXY) && CurrentTitle != "Black King (E8)"){
						//this if statement is necessary to allow pieces to block Queen's line of sight
						////System.out.println("Outerbreak3.3");
						break outerloop_BottomLeftTiles;
					}

					for(int i = 0 ; i < MultiArray.length ; i++) {
						if(Arrays.equals(MultiArray[i], NewXY)){
							////System.out.println("Outerbreak3.4");
							//System.out.println("White Queen threatining check from the top right");
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
					
	
					for(int[] i: aggregateWhitesForCheck(CurrentTitle, ComXY)){
						int[] Coordinate = i;
						if(Arrays.equals(Coordinate, NewXY)){
							break outerloop_BottomRightTiles;
						}		
					}
					if(Arrays.equals(NewXY,ComXY) && CurrentTitle != "Black King (E8)"){
						//this if statement is necessary to allow pieces to block Queen's line of sight
						break outerloop_BottomRightTiles;
					}
					for(int i = 0 ; i < MultiArray.length ; i++) {
						if(Arrays.equals(MultiArray[i], NewXY)){
							//System.out.println("White Queen threatining check from the top left");
							MultiArray[i]=null;	
							break outerloop_BottomRightTiles;
						}		    			  
					}
				}
		
		return MultiArray;
	}


	static ArrayList<int[]> searcherTopTiles(ArrayList<int[]> MoveList, int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this Queen top tiles
		
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];
			NewXY[0] = CurrentX + 0;
			NewXY[1] = CurrentY - j;
			
			if(NewXY[1] < 0){
				return MoveList;
			}

			for(int [] i: aggregateBlacks()){
				int[] Coordinate = i;
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a valid black piece to kill " + j + " tiles top of this Queen");
					MoveList.add(NewXY);
					return MoveList;
				}			    				
			}
			
			for (int [] i: aggregateWhites()){
				int[] Coordinate = i;
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a white piece " + j + " tiles top of this Queen");
					return MoveList;
				}		
			}	

			MoveList.add(NewXY);
		}
		return MoveList;
	}	
	static ArrayList<int[]> searcherLeftTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this Queen left tiles
		
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];	
			NewXY[0] = CurrentX - j;
			NewXY[1] = CurrentY + 0;
			
			if(NewXY[0] < 0){
				return MoveList;
			}
			
	
			for(int [] i: aggregateBlacks()){
				int[] Coordinate = i;
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a valid black piece to kill " + j + " tiles left of this Queen");
					MoveList.add(NewXY);
					return MoveList;
				}			    				
			}
			for (int [] i: aggregateWhites()){
				int[] Coordinate = i;
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a white piece " + j + " tiles top of this Queen");
					return MoveList;
				}		
			}	
			MoveList.add(NewXY);
			}
		return MoveList;
		}
	static ArrayList<int[]> searcherBottomTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this Queen left tiles
		
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];
			NewXY[0] = CurrentX + 0;
			NewXY[1] = CurrentY + j;
			
			if(NewXY[1] > 7){
				return MoveList;
			}
	
			for(int [] i: aggregateBlacks()){
				int[] Coordinate = i;
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a valid blacks piece to kill " + j + " tiles bottom of this Queen");
					MoveList.add(NewXY);
					return MoveList;
				}		    				
			}

			for (int [] i: aggregateWhites()){
				int[] Coordinate = i;
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a white piece " + j + " tiles top of this Queen");
					return MoveList;
				}		
			}	
			MoveList.add(NewXY);
			}
		return MoveList;
		}
	static ArrayList<int[]> searcherRightTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this Queen left tiles
		
		for(int j = 1; j <=7 ; j++){
			int [] NewXY = new int[2];	
			NewXY[0] = CurrentX + j;
			NewXY[1] = CurrentY + 0;
			
			if(NewXY[0] > 7){
				return MoveList;
			}
			

			for(int [] i: aggregateBlacks()){
				int[] Coordinate = i;
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a valid black piece to kill " + j + " tiles right of this Queen");
					MoveList.add(NewXY);
					return MoveList;
				}		    				
			}
			for (int [] i: aggregateWhites()){
				int[] Coordinate = i;
				if(Arrays.equals(Coordinate, NewXY)){
					//System.out.println("We have found a white piece " + j + " tiles top of this Queen");
					return MoveList;
				}		
			}	
			MoveList.add(NewXY);
			}
		return MoveList;
	}
	static ArrayList<int[]> searcherTopLeftTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
			//this function looks for black pieces blocking this rook top tiles
			
			for(int j = 1; j <=7 ; j++){
				int [] NewXY = new int[2];
				NewXY[0] = CurrentX - j;
				NewXY[1] = CurrentY - j;
				
				if(NewXY[0] < 0 || NewXY[1] < 0){
					return MoveList;
				}
				

				for(int [] i: aggregateBlacks()){
					int[] Coordinate = i;
					if(Arrays.equals(Coordinate, NewXY)){
						//System.out.println("We have found a valid black piece to kill " + j + " tiles top left of this Queen");
						MoveList.add(NewXY);
						return MoveList;
					}		    				
				}
				for (int [] i: aggregateWhites()){
					int[] Coordinate = i;
					if(Arrays.equals(Coordinate, NewXY)){
						//System.out.println("We have found a white piece " + j + " tiles top of this Queen");
						return MoveList;
					}		
				}	
				MoveList.add(NewXY);
			}
			return MoveList;
		}	
	static ArrayList<int[]> searcherTopRightTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
			//this function looks for black pieces blocking this rook left tiles
			
			for(int j = 1; j <=7 ; j++){
				int [] NewXY = new int[2];	
				NewXY[0] = CurrentX + j;
				NewXY[1] = CurrentY - j;
				
				if(NewXY[0] > 7 || NewXY[1] < 0){
					return MoveList;
				}
				

				for(int [] i: aggregateBlacks()){
					int[] Coordinate = i;
					if(Arrays.equals(Coordinate, NewXY)){
						//System.out.println("We have found a valid black piece to kill " + j + " tiles top right of this Queen");
						MoveList.add(NewXY);
						return MoveList;
					}	    				
				}
				for (int [] i: aggregateWhites()){
					int[] Coordinate = i;
					if(Arrays.equals(Coordinate, NewXY)){
						//System.out.println("We have found a white piece " + j + " tiles top of this Queen");
						return MoveList;
					}		
				}	
				MoveList.add(NewXY);
				}
			return MoveList;
			}
	static ArrayList<int[]> searcherBottomLeftTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
			//this function looks for black pieces blocking this rook left tiles	
		
			for(int j = 1; j <=7 ; j++){
				int [] NewXY = new int[2];
				NewXY[0] = CurrentX - j;
				NewXY[1] = CurrentY + j;
				
				if(NewXY[0] < 0 || NewXY[1] > 7){
					return MoveList;
				}
				

				for(int [] i: aggregateBlacks()){
					int[] Coordinate = i;
					if(Arrays.equals(Coordinate, NewXY)){
						//System.out.println("We have found a valid blacks piece to kill " + j + " tiles bottom left of this Queen");
						MoveList.add(NewXY);
						return MoveList;
					}	    				
				}
				for (int [] i: aggregateWhites()){
					int[] Coordinate = i;
					if(Arrays.equals(Coordinate, NewXY)){
						//System.out.println("We have found a white piece " + j + " tiles top of this Queen");
						return MoveList;
					}		
				}	
				MoveList.add(NewXY);
				}
			return MoveList;
			}
	static ArrayList<int[]> searcherBottomRightTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
			//this function looks for black pieces blocking this rook left tiles
			
			for(int j = 1; j <=7 ; j++){
				int [] NewXY = new int[2];	
				NewXY[0] = CurrentX + j;
				NewXY[1] = CurrentY + j;
				
				if(NewXY[0] > 7 || NewXY[1] > 7){
					return MoveList;
				}
				

				for(int [] i: aggregateBlacks()){
					int[] Coordinate = i;
					if(Arrays.equals(Coordinate, NewXY)){
						//System.out.println("We have found a valid black piece to kill " + j + " tiles bottom right of this Queen");
						MoveList.add(NewXY);
						return MoveList;
					}	    				
				}
				for (int [] i: aggregateWhites()){
					int[] Coordinate = i;
					if(Arrays.equals(Coordinate, NewXY)){
						//System.out.println("We have found a white piece " + j + " tiles top of this Queen");
						return MoveList;
					}		
				}	
				MoveList.add(NewXY);
				}

	
		return MoveList;
		}

}

