package chessPackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;

public class Superclass_BlackKnight extends BlackPiece {
	static ImageIcon getIcon(){
		URL Black_Knight_URL = Chess.class.getResource("chess_piece_black_knight.png");
		ImageIcon Black_Knight_Icon = new ImageIcon(Black_Knight_URL);
		return Black_Knight_Icon;
	}
	
	static ArrayList<int[]> movementHandler(int CurrentX, int CurrentY,int StartingPositionX, int StartingPositionY){
		
		ArrayList<int[]> MoveList = new ArrayList<int []>();
			
		int [][]MultiArray = new int[8][2];
		
		MultiArray[0]=null;
		MultiArray[1]=null;
		MultiArray[2]=null;
		MultiArray[3]=null;
		MultiArray[4]=null;
		MultiArray[5]=null;
		MultiArray[6]=null;
		MultiArray[7]=null;

		MultiArray= killSearcher(MultiArray,CurrentX,CurrentY); //XY1,XY2,XY3...XY8
		MultiArray=searcherOneTile(MultiArray,CurrentX,CurrentY); 
			

		MoveList = ListUtility.arrayToListConverter(MultiArray);
		
		return MoveList;
	}

	
	static int [][] killSearcher( int[][]MultiArray,int CurrentX, int CurrentY){
		//this function looks for a white piece to kill with 8 different kill moves
		int [] NewXY1 = new int[2];
		int [] NewXY2 = new int[2];
		int [] NewXY3 = new int[2];
		int [] NewXY4 = new int[2];
		int [] NewXY5 = new int[2];
		int [] NewXY6 = new int[2];
		int [] NewXY7 = new int[2];
		int [] NewXY8 = new int[2];
		
		
		NewXY1[0] = CurrentX +2;
		NewXY1[1] = CurrentY +1;
		

		for(int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY1)){
				//System.out.println("We have found a valid white piece to kill");
				MultiArray[0]=NewXY1;
				break;  
			}		 
		}
		
		
		NewXY2[0]=CurrentX+2;
		NewXY2[1]=CurrentY-1;
		

		for(int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate,NewXY2)){
				//System.out.println("We have found a valid white piece to kill");
				MultiArray[1]=NewXY2;
				break;  
			}			 
		}
		
		NewXY3[0]=CurrentX+1;
		NewXY3[1]=CurrentY+2;

		for(int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate,NewXY3)){
				//System.out.println("We have found a valid white piece to kill");
				MultiArray[2]=NewXY3;
				break;  
			}			 
		}
		NewXY4[0]=CurrentX-1;
		NewXY4[1]=CurrentY+2;
		

		for(int[] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate,NewXY4)){
				//System.out.println("We have found a valid white piece to kill");
				MultiArray[3]=NewXY4;
				break;  
			}				 
		}
		NewXY5[0]=CurrentX-2;
		NewXY5[1]=CurrentY+1;
		

		for(int[] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate,NewXY5)){
				//System.out.println("We have found a valid white piece to kill");
				MultiArray[4]=NewXY5;
				break;  
			}				 
		}
		NewXY6[0]=CurrentX-2;
		NewXY6[1]=CurrentY-1;
		

		for(int[] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate,NewXY6)){
				//System.out.println("We have found a valid white piece to kill");
				MultiArray[5]=NewXY6;
				break;  
			}			 
		}
		NewXY7[0]=CurrentX-1;
		NewXY7[1]=CurrentY-2;
		
		for(int[] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate,NewXY7)){
				//System.out.println("We have found a valid white piece to kill");
				MultiArray[6]=NewXY7;
				break;  
			}			 
		}
		NewXY8[0]=CurrentX+1;
		NewXY8[1]=CurrentY-2;
		
		for(int[] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate,NewXY8)){
				//System.out.println("We have found a valid white piece to kill");
				MultiArray[7]=NewXY8;
				break;  
			}			 
		}
		return MultiArray;
	}
	
	static int [][] searcherOneTile( int[][]MultiArray,int CurrentX, int CurrentY){
		//this function looks for a black piece blocking knight movement
		int [] NewXY=new int[2];
		int [] NewXY2=new int[2];
		int [] NewXY3=new int[2];
		int [] NewXY4=new int[2];
		int [] NewXY5=new int[2];
		int [] NewXY6=new int[2];
		int [] NewXY7=new int[2];
		int [] NewXY8=new int[2];

		NewXY[0] = CurrentX +2;
		NewXY[1] = CurrentY +1;
		MultiArray=movementEngine(NewXY,MultiArray,0);
		
		NewXY2[0]= CurrentX +2;
		NewXY2[1]=CurrentY -1;
		MultiArray=movementEngine(NewXY2,MultiArray,1);
		
		NewXY3[0]=CurrentX +1;
		NewXY3[1]=CurrentY +2;
		MultiArray=movementEngine(NewXY3,MultiArray,2);
		
		NewXY4[0]=CurrentX -1;
		NewXY4[1]=CurrentY +2;
		MultiArray=movementEngine(NewXY4,MultiArray,3);
	
		NewXY5[0]=CurrentX -2;
		NewXY5[1]=CurrentY +1;
		MultiArray=movementEngine(NewXY5,MultiArray,4);
		
		NewXY6[0]=CurrentX -2;
		NewXY6[1]=CurrentY -1;
		MultiArray=movementEngine(NewXY6,MultiArray,5);
		
		NewXY7[0]=CurrentX -1;
		NewXY7[1]=CurrentY -2;
		MultiArray=movementEngine(NewXY7,MultiArray,6);
		
		NewXY8[0]=CurrentX +1;
		NewXY8[1]=CurrentY -2;
		MultiArray=movementEngine(NewXY8,MultiArray,7);

	
		return MultiArray;   			  
	}
	
	static int[][] movementEngine(int[] NewXY,int[][]MultiArray, int j){

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a black piece interrupting this knight");
				return MultiArray;
				//gotta exit out of this function

			}		
		}
		MultiArray[j]=NewXY;
		return MultiArray;
	}
	static int [][] checkPreventer( int[][]MultiArray,int CurrentX, int CurrentY){
		//this function prevents check against Black King
		int [] NewXY1 = new int[2];
		int [] NewXY2 = new int[2];
		int [] NewXY3 = new int[2];
		int [] NewXY4 = new int[2];
		int [] NewXY5 = new int[2];
		int [] NewXY6 = new int[2];
		int [] NewXY7 = new int[2];
		int [] NewXY8 = new int[2];
		
		NewXY1[0] = CurrentX +2;
		NewXY1[1] = CurrentY +1;
		
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i], NewXY1)){
				//System.out.println("Black Knight threatining check");
				MultiArray[i]=null;
				
				break;  
			}		    			  
		}
		
		
		NewXY2[0]=CurrentX+2;
		NewXY2[1]=CurrentY-1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY2)){
				//System.out.println("Black Knight threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}

		NewXY3[0]=CurrentX+1;
		NewXY3[1]=CurrentY+2;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY3)){
				//System.out.println("Black Knight threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		NewXY4[0]=CurrentX-1;
		NewXY4[1]=CurrentY+2;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY4)){
				//System.out.println("Black Knight threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		NewXY5[0]=CurrentX-2;
		NewXY5[1]=CurrentY+1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY5)){
				//System.out.println("Black Knight threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY6[0]=CurrentX-2;
		NewXY6[1]=CurrentY-1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY6)){
				//System.out.println("Black Knight threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		
		NewXY7[0]=CurrentX-1;
		NewXY7[1]=CurrentY-2;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY7)){
				//System.out.println("Black Knight threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY8[0]=CurrentX+1;
		NewXY8[1]=CurrentY-2;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY8)){
				//System.out.println("Black Knight threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		return MultiArray;
	}
}