package chessPackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;

public class Superclass_BlackKing extends BlackPiece {
	static ImageIcon getIcon(){
		URL Black_King_URL = Chess.class.getResource("chess_piece_black_king.png");
		ImageIcon Black_King_Icon = new ImageIcon(Black_King_URL);
		return Black_King_Icon;
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


		MoveList=castleLeftSide(MoveList,CurrentX,CurrentY);
		MoveList=castleRightSide(MoveList,CurrentX,CurrentY);

		return MoveList;
	}
	
	static ArrayList<int[]> castleRightSide(ArrayList<int[]> MoveList, int CurrentX, int CurrentY){
		if(BlackKingE8.getFirstStrike() == true && BlackRookH8.getFirstStrike() == true){
			int [] ComXY = {4,0};
			if(BlackKingE8.isBlackKingInCheck(ComXY, "Black King (E8)")){
				//cannot castle out of check
				//System.out.println("Cannot right castle out of check");
				return MoveList;
			}
			int [] NewXY=new int[2];
			NewXY[0] = 5;
			NewXY[1] = 0;
			int [] NewXY2=new int[2];
			NewXY2[0] = 6;
			NewXY2[1] = 0;

			//loop through all blacks
			for(int [] i: aggregateBlacks()){
				int[] Coordinate = i;
				if(Arrays.equals(Coordinate, NewXY)){
					return MoveList;
				}
				if(Arrays.equals(Coordinate, NewXY2)){
					return MoveList;
				}			
			}
			//loop through all whites

			for(int[] i: aggregateWhites()){
				int[] Coordinate = i;
				if(Arrays.equals(Coordinate, NewXY)){
					return MoveList;
				}
				if(Arrays.equals(Coordinate, NewXY2)){	
					return MoveList;
				}				 
			}
			//right side castle is possible. Add possible movement to MultiArray
			int [] Coord = {6,0};
			MoveList.add(Coord);
			Chess.ActivateBlackRightCastle = true;
			return MoveList;
		}
		//else right side castle is not possible. Add nulls movement to MultiArray
		return MoveList;
	}

	static ArrayList<int[]> castleLeftSide(ArrayList<int[]> MoveList, int CurrentX, int CurrentY){
		
		if(BlackKingE8.getFirstStrike() == true && BlackRookA8.getFirstStrike() == true){
			int [] ComXY = {4,0};
			if(BlackKingE8.isBlackKingInCheck(ComXY, "Black King (E8)")){
				//cannot castle out of check
				//System.out.println("Cannot left castle out of check");
				return MoveList;
			}	
			
			
			//left side castle check
				int [] NewXY=new int[2];
				NewXY[0] = 3;
				NewXY[1] = 0;
				int [] NewXY2=new int[2];
				NewXY2[0] = 2;
				NewXY2[1] = 0;
				int [] NewXY3=new int[2];
				NewXY3[0] = 1;
				NewXY3[1] = 0;
				//loop through all blacks

				for(int [] i: aggregateBlacks()){
					int[] Coordinate = i;
					
					if(Arrays.equals(Coordinate, NewXY)){
						return MoveList;
					}
					if(Arrays.equals(Coordinate, NewXY2)){
						return MoveList;
					}	
					if(Arrays.equals(Coordinate, NewXY3)){
						return MoveList;
					}			
				}
				//loop through all whites

				for(int[] i: aggregateWhites()){
					int[] Coordinate = i;
					if(Arrays.equals(Coordinate, NewXY)){
						return MoveList;
					}
					if(Arrays.equals(Coordinate, NewXY2)){	
						return MoveList;
					}	
					if(Arrays.equals(Coordinate, NewXY3)){
						return MoveList;
					}			 
				}
				//left side castle is possible. Add possible movement to MultiArray
				int [] Coord = {2,0};
				MoveList.add(Coord);
				Chess.ActivateBlackLeftCastle = true;
				return MoveList;
			}
		
		//else left side castle is not possible. Add nulls movement to MultiArray
		return MoveList;
	}
	static int[][] movementKillEngine(int[] NewXY,int[][]MultiArray, int j){
		for(int i = 0 ; i < aggregateWhites().size() ; i++) {
			int[] Coordinate = aggregateWhites().get(i);
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a valid black piece to kill");
				MultiArray[j]=NewXY;
			}		    			  
		}

		return MultiArray;
	}
	static int [][] killSearcher( int[][]MultiArray,int CurrentX, int CurrentY){
		//this function looks for a white piece to kill
		int [] NewXY=new int[2];
		int [] NewXY2=new int[2];
		int [] NewXY3=new int[2];
		int [] NewXY4=new int[2];
		int [] NewXY5=new int[2];
		int [] NewXY6=new int[2];
		int [] NewXY7=new int[2];
		int [] NewXY8=new int[2];
		
		NewXY[0] = CurrentX +0;
		NewXY[1] = CurrentY +1;
		MultiArray=movementKillEngine(NewXY,MultiArray,0);
		
		NewXY2[0]= CurrentX + 0;
		NewXY2[1]=CurrentY -1;
		MultiArray=movementKillEngine(NewXY2,MultiArray,1);
		
		NewXY3[0]=CurrentX +1;
		NewXY3[1]=CurrentY +0;
		MultiArray=movementKillEngine(NewXY3,MultiArray,2);
		
		NewXY4[0]=CurrentX -1;
		NewXY4[1]=CurrentY +0;
		MultiArray=movementKillEngine(NewXY4,MultiArray,3);
	
		NewXY5[0]=CurrentX +1;
		NewXY5[1]=CurrentY +1;
		MultiArray=movementKillEngine(NewXY5,MultiArray,4);
		
		NewXY6[0]=CurrentX -1;
		NewXY6[1]=CurrentY -1;
		MultiArray=movementKillEngine(NewXY6,MultiArray,5);
		
		NewXY7[0]=CurrentX +1;
		NewXY7[1]=CurrentY -1;
		MultiArray=movementKillEngine(NewXY7,MultiArray,6);
		
		NewXY8[0]=CurrentX -1;
		NewXY8[1]=CurrentY +1;
		MultiArray=movementKillEngine(NewXY8,MultiArray,7);

		return MultiArray;
	}
	static int [][] searcherOneTile( int[][]MultiArray,int CurrentX, int CurrentY){
		//this function looks for a black piece 1 tile in front or anywhere
		int [] NewXY=new int[2];
		int [] NewXY2=new int[2];
		int [] NewXY3=new int[2];
		int [] NewXY4=new int[2];
		int [] NewXY5=new int[2];
		int [] NewXY6=new int[2];
		int [] NewXY7=new int[2];
		int [] NewXY8=new int[2];

		NewXY[0] = CurrentX +0;
		NewXY[1] = CurrentY +1;
		MultiArray=movementEngine(NewXY,MultiArray,0);
		
		NewXY2[0]= CurrentX + 0;
		NewXY2[1]=CurrentY -1;
		MultiArray=movementEngine(NewXY2,MultiArray,1);
		
		NewXY3[0]=CurrentX +1;
		NewXY3[1]=CurrentY +0;
		MultiArray=movementEngine(NewXY3,MultiArray,2);
		
		NewXY4[0]=CurrentX -1;
		NewXY4[1]=CurrentY +0;
		MultiArray=movementEngine(NewXY4,MultiArray,3);
	
		NewXY5[0]=CurrentX +1;
		NewXY5[1]=CurrentY +1;
		MultiArray=movementEngine(NewXY5,MultiArray,4);
		
		NewXY6[0]=CurrentX -1;
		NewXY6[1]=CurrentY -1;
		MultiArray=movementEngine(NewXY6,MultiArray,5);
		
		NewXY7[0]=CurrentX +1;
		NewXY7[1]=CurrentY -1;
		MultiArray=movementEngine(NewXY7,MultiArray,6);
		
		NewXY8[0]=CurrentX -1;
		NewXY8[1]=CurrentY +1;
		MultiArray=movementEngine(NewXY8,MultiArray,7);

	
		return MultiArray;   			  
	}
	static int[][] movementEngine(int[] NewXY,int[][]MultiArray, int j){

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a black piece interrupting this king");
				return MultiArray;
				//gotta exit out of this function
		
			}
		}
		MultiArray[j]=NewXY;
		return MultiArray;
	}
	static int [][] checkPreventer( int[][]MultiArray,int CurrentX, int CurrentY){
		//this forces other King to move out of check. Used for isWhiteKinginCheck

		int [] NewXY=new int[2];
		int [] NewXY2=new int[2];
		int [] NewXY3=new int[2];
		int [] NewXY4=new int[2];
		int [] NewXY5=new int[2];
		int [] NewXY6=new int[2];
		int [] NewXY7=new int[2];
		int [] NewXY8=new int[2];
		
		NewXY[0] = CurrentX +0;
		NewXY[1] = CurrentY +1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i], NewXY)){
				MultiArray[i]=null;
				
				break;  
			}		    			  
		}
		
		
		NewXY2[0]=CurrentX+0;
		NewXY2[1]=CurrentY-1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY2)){
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY3[0]=CurrentX+1;
		NewXY3[1]=CurrentY-0;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY3)){
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY4[0]=CurrentX-1;
		NewXY4[1]=CurrentY+0;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY4)){
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY5[0]=CurrentX+1;
		NewXY5[1]=CurrentY+1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY5)){
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY6[0]=CurrentX-1;
		NewXY6[1]=CurrentY-1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY6)){
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY7[0]=CurrentX+1;
		NewXY7[1]=CurrentY-1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY7)){
				//System.out.println("Black King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY8[0]=CurrentX-1;
		NewXY8[1]=CurrentY+1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY8)){
				//System.out.println("Black King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		return MultiArray;
	}
	static boolean isBlackKingInCheck(int[] ComXY, String CurrentTitle){
		//will return true if black king is in check
		
		int [][]MultiArray = new int[1][2];
		
		//Determine's king position
		if (CurrentTitle == "Black King (E8)"){
			
			MultiArray[0][0] = ComXY[0];
			MultiArray[0][1] = ComXY[1];
		}
		else{
			MultiArray[0][0]=BlackKingE8.getCurrentPositionX();
			MultiArray[0][1]=BlackKingE8.getCurrentPositionY();
		}
		
		//must insert here
		//toDO
		if(!Arrays.equals(WhitePawnH2.getCurrentPositionXY(), ComXY)  && WhitePawnH2.getActive() == true){
			MultiArray = Superclass_WhitePawn.checkPreventer(MultiArray, WhitePawnH2.getCurrentPositionX(), WhitePawnH2.getCurrentPositionY());	
			
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhitePawnG2.getCurrentPositionXY(), ComXY)  && WhitePawnG2.getActive() == true){
			MultiArray = Superclass_WhitePawn.checkPreventer(MultiArray, WhitePawnG2.getCurrentPositionX(), WhitePawnG2.getCurrentPositionY());	
			
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhitePawnF2.getCurrentPositionXY(), ComXY)  && WhitePawnF2.getActive() == true){
			MultiArray = Superclass_WhitePawn.checkPreventer(MultiArray, WhitePawnF2.getCurrentPositionX(), WhitePawnF2.getCurrentPositionY());	
			
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhitePawnE2.getCurrentPositionXY(), ComXY)  && WhitePawnE2.getActive() == true){
			MultiArray = Superclass_WhitePawn.checkPreventer(MultiArray, WhitePawnE2.getCurrentPositionX(), WhitePawnE2.getCurrentPositionY());	
			
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhitePawnD2.getCurrentPositionXY(), ComXY)  && WhitePawnD2.getActive() == true){
			MultiArray = Superclass_WhitePawn.checkPreventer(MultiArray, WhitePawnD2.getCurrentPositionX(), WhitePawnD2.getCurrentPositionY());	
			
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteRookH1.getCurrentPositionXY(), ComXY)  && WhiteRookH1.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookH1.getCurrentPositionX(), WhiteRookH1.getCurrentPositionY(),  ComXY, CurrentTitle);	
			
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhitePawnC2.getCurrentPositionXY(), ComXY)  && WhitePawnC2.getActive() == true){
			MultiArray = Superclass_WhitePawn.checkPreventer(MultiArray, WhitePawnC2.getCurrentPositionX(), WhitePawnC2.getCurrentPositionY());	
			
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhitePawnA2.getCurrentPositionXY(), ComXY)  && WhitePawnA2.getActive() == true){
			MultiArray = Superclass_WhitePawn.checkPreventer(MultiArray, WhitePawnA2.getCurrentPositionX(), WhitePawnA2.getCurrentPositionY());
	
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhitePawnB2.getCurrentPositionXY(), ComXY)  && WhitePawnB2.getActive() == true){
			MultiArray = Superclass_WhitePawn.checkPreventer(MultiArray, WhitePawnB2.getCurrentPositionX(), WhitePawnB2.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteKnightB1.getCurrentPositionXY(), ComXY)  && WhiteKnightB1.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightB1.getCurrentPositionX(), WhiteKnightB1.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteKnightG1.getCurrentPositionXY(), ComXY)  && WhiteKnightG1.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightG1.getCurrentPositionX(), WhiteKnightG1.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteKingE1.getCurrentPositionXY(), ComXY)  && WhiteKingE1.getActive() == true){
			MultiArray = Superclass_WhiteKing.checkPreventer(MultiArray, WhiteKingE1.getCurrentPositionX(), WhiteKingE1.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteRookA1.getCurrentPositionXY(), ComXY)  && WhiteRookA1.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookA1.getCurrentPositionX(), WhiteRookA1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteBishopC1.getCurrentPositionXY(), ComXY)  && WhiteBishopC1.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopC1.getCurrentPositionX(), WhiteBishopC1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteBishopF1.getCurrentPositionXY(), ComXY)  && WhiteBishopF1.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopF1.getCurrentPositionX(), WhiteBishopF1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}

		if(!Arrays.equals(WhiteQueenD1.getCurrentPositionXY(), ComXY)  && WhiteQueenD1.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenD1.getCurrentPositionX(), WhiteQueenD1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteRookProm1.getCurrentPositionXY(), ComXY) && WhiteRookProm1.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookProm1.getCurrentPositionX(), WhiteRookProm1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteRookProm2.getCurrentPositionXY(), ComXY) && WhiteRookProm2.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookProm2.getCurrentPositionX(), WhiteRookProm2.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteRookProm3.getCurrentPositionXY(), ComXY) && WhiteRookProm3.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookProm3.getCurrentPositionX(), WhiteRookProm3.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteRookProm4.getCurrentPositionXY(), ComXY) && WhiteRookProm4.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookProm4.getCurrentPositionX(), WhiteRookProm4.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteRookProm5.getCurrentPositionXY(), ComXY) && WhiteRookProm5.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookProm5.getCurrentPositionX(), WhiteRookProm5.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteRookProm6.getCurrentPositionXY(), ComXY) && WhiteRookProm6.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookProm6.getCurrentPositionX(), WhiteRookProm6.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteRookProm7.getCurrentPositionXY(), ComXY) && WhiteRookProm7.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookProm7.getCurrentPositionX(), WhiteRookProm7.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteRookProm8.getCurrentPositionXY(), ComXY) && WhiteRookProm8.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookProm8.getCurrentPositionX(), WhiteRookProm8.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
			
		if(!Arrays.equals(WhiteQueenProm1.getCurrentPositionXY(), ComXY) && WhiteQueenProm1.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm1.getCurrentPositionX(), WhiteQueenProm1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteQueenProm2.getCurrentPositionXY(), ComXY) && WhiteQueenProm2.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm2.getCurrentPositionX(), WhiteQueenProm2.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteQueenProm3.getCurrentPositionXY(), ComXY) && WhiteQueenProm3.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm3.getCurrentPositionX(), WhiteQueenProm3.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteQueenProm4.getCurrentPositionXY(), ComXY) && WhiteQueenProm4.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm4.getCurrentPositionX(), WhiteQueenProm4.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteQueenProm5.getCurrentPositionXY(), ComXY) && WhiteQueenProm5.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm5.getCurrentPositionX(), WhiteQueenProm5.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteQueenProm6.getCurrentPositionXY(), ComXY) && WhiteQueenProm6.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm6.getCurrentPositionX(), WhiteQueenProm6.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteQueenProm7.getCurrentPositionXY(), ComXY) && WhiteQueenProm7.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm7.getCurrentPositionX(), WhiteQueenProm7.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteQueenProm8.getCurrentPositionXY(), ComXY) && WhiteQueenProm8.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm8.getCurrentPositionX(), WhiteQueenProm8.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteQueenProm1.getCurrentPositionXY(), ComXY) && WhiteQueenProm1.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm1.getCurrentPositionX(), WhiteQueenProm1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
				}
		}
		if(!Arrays.equals(WhiteQueenProm2.getCurrentPositionXY(), ComXY) && WhiteQueenProm2.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm2.getCurrentPositionX(), WhiteQueenProm2.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
				}
		}
		if(!Arrays.equals(WhiteQueenProm3.getCurrentPositionXY(), ComXY) && WhiteQueenProm3.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm3.getCurrentPositionX(), WhiteQueenProm3.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteQueenProm4.getCurrentPositionXY(), ComXY) && WhiteQueenProm4.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm4.getCurrentPositionX(), WhiteQueenProm4.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteQueenProm5.getCurrentPositionXY(), ComXY) && WhiteQueenProm5.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm5.getCurrentPositionX(), WhiteQueenProm5.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteQueenProm6.getCurrentPositionXY(), ComXY) && WhiteQueenProm6.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm6.getCurrentPositionX(), WhiteQueenProm6.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteQueenProm7.getCurrentPositionXY(), ComXY) && WhiteQueenProm7.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm7.getCurrentPositionX(), WhiteQueenProm7.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteQueenProm8.getCurrentPositionXY(), ComXY) && WhiteQueenProm8.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm8.getCurrentPositionX(), WhiteQueenProm8.getCurrentPositionY(), ComXY, CurrentTitle);
				
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteBishopProm1.getCurrentPositionXY(), ComXY) && WhiteBishopProm1.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopProm1.getCurrentPositionX(), WhiteBishopProm1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteBishopProm2.getCurrentPositionXY(), ComXY) && WhiteBishopProm2.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopProm2.getCurrentPositionX(), WhiteBishopProm2.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteBishopProm3.getCurrentPositionXY(), ComXY) && WhiteBishopProm3.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopProm3.getCurrentPositionX(), WhiteBishopProm3.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteBishopProm4.getCurrentPositionXY(), ComXY) && WhiteBishopProm4.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopProm4.getCurrentPositionX(), WhiteBishopProm4.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteBishopProm5.getCurrentPositionXY(), ComXY) && WhiteBishopProm5.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopProm5.getCurrentPositionX(), WhiteBishopProm5.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteBishopProm6.getCurrentPositionXY(), ComXY) && WhiteBishopProm6.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopProm6.getCurrentPositionX(), WhiteBishopProm6.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteBishopProm7.getCurrentPositionXY(), ComXY) && WhiteBishopProm7.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopProm7.getCurrentPositionX(), WhiteBishopProm7.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteBishopProm8.getCurrentPositionXY(), ComXY) && WhiteBishopProm8.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopProm8.getCurrentPositionX(), WhiteBishopProm8.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
					return true;
			}
		}	
		
		if(!Arrays.equals(WhiteKnightProm1.getCurrentPositionXY(), ComXY) && WhiteKnightProm1.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightProm1.getCurrentPositionX(), WhiteKnightProm1.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteKnightProm2.getCurrentPositionXY(), ComXY) && WhiteKnightProm2.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightProm2.getCurrentPositionX(), WhiteKnightProm2.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteKnightProm3.getCurrentPositionXY(), ComXY) && WhiteKnightProm3.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightProm3.getCurrentPositionX(), WhiteKnightProm3.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteKnightProm4.getCurrentPositionXY(), ComXY) && WhiteKnightProm4.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightProm4.getCurrentPositionX(), WhiteKnightProm4.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteKnightProm5.getCurrentPositionXY(), ComXY) && WhiteKnightProm5.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightProm5.getCurrentPositionX(), WhiteKnightProm5.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteKnightProm6.getCurrentPositionXY(), ComXY) && WhiteKnightProm6.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightProm6.getCurrentPositionX(), WhiteKnightProm6.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteKnightProm7.getCurrentPositionXY(), ComXY) && WhiteKnightProm7.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightProm7.getCurrentPositionX(), WhiteKnightProm7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(WhiteKnightProm8.getCurrentPositionXY(), ComXY) && WhiteKnightProm8.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightProm8.getCurrentPositionX(), WhiteKnightProm8.getCurrentPositionY());
			if(MultiArray[0]==null){
					return true;
			}
		}	
		
		return false;	
	}
	
	static boolean isBlackKingInCheck_Set(int[] ComXY, String CurrentTitle){
		//will return true if black king is in check
		// only works during white turn
		
		int [][]MultiArray = new int[1][2];
		
		//Determine's king position
		if (CurrentTitle == "Black King (E8)"){
			
			MultiArray[0][0] = ComXY[0];
			MultiArray[0][1] = ComXY[1];
		}
		else{
			MultiArray[0][0]=BlackKingE8.getCurrentPositionX();
			MultiArray[0][1]=BlackKingE8.getCurrentPositionY();
		}
		
		//must insert here
		//toDO
		if(WhitePawnH2.getActive() == true){
			MultiArray = Superclass_WhitePawn.checkPreventer(MultiArray, WhitePawnH2.getCurrentPositionX(), WhitePawnH2.getCurrentPositionY());	
			
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhitePawnG2.getActive() == true){
			MultiArray = Superclass_WhitePawn.checkPreventer(MultiArray, WhitePawnG2.getCurrentPositionX(), WhitePawnG2.getCurrentPositionY());	
			
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhitePawnF2.getActive() == true){
			MultiArray = Superclass_WhitePawn.checkPreventer(MultiArray, WhitePawnF2.getCurrentPositionX(), WhitePawnF2.getCurrentPositionY());	
			
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhitePawnE2.getActive() == true){
			MultiArray = Superclass_WhitePawn.checkPreventer(MultiArray, WhitePawnE2.getCurrentPositionX(), WhitePawnE2.getCurrentPositionY());	
			
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhitePawnD2.getActive() == true){
			MultiArray = Superclass_WhitePawn.checkPreventer(MultiArray, WhitePawnD2.getCurrentPositionX(), WhitePawnD2.getCurrentPositionY());	
			
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteRookH1.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookH1.getCurrentPositionX(), WhiteRookH1.getCurrentPositionY(),  ComXY, CurrentTitle);	
			
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhitePawnC2.getActive() == true){
			MultiArray = Superclass_WhitePawn.checkPreventer(MultiArray, WhitePawnC2.getCurrentPositionX(), WhitePawnC2.getCurrentPositionY());	
			
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhitePawnA2.getActive() == true){
			MultiArray = Superclass_WhitePawn.checkPreventer(MultiArray, WhitePawnA2.getCurrentPositionX(), WhitePawnA2.getCurrentPositionY());
	
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhitePawnB2.getActive() == true){
			MultiArray = Superclass_WhitePawn.checkPreventer(MultiArray, WhitePawnB2.getCurrentPositionX(), WhitePawnB2.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteKnightB1.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightB1.getCurrentPositionX(), WhiteKnightB1.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if( WhiteKnightG1.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightG1.getCurrentPositionX(), WhiteKnightG1.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteKingE1.getActive() == true){
			MultiArray = Superclass_WhiteKing.checkPreventer(MultiArray, WhiteKingE1.getCurrentPositionX(), WhiteKingE1.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteRookA1.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookA1.getCurrentPositionX(), WhiteRookA1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteBishopC1.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopC1.getCurrentPositionX(), WhiteBishopC1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteBishopF1.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopF1.getCurrentPositionX(), WhiteBishopF1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}

		if(WhiteQueenD1.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenD1.getCurrentPositionX(), WhiteQueenD1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteRookProm1.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookProm1.getCurrentPositionX(), WhiteRookProm1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteRookProm2.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookProm2.getCurrentPositionX(), WhiteRookProm2.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if( WhiteRookProm3.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookProm3.getCurrentPositionX(), WhiteRookProm3.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteRookProm4.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookProm4.getCurrentPositionX(), WhiteRookProm4.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteRookProm5.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookProm5.getCurrentPositionX(), WhiteRookProm5.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteRookProm6.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookProm6.getCurrentPositionX(), WhiteRookProm6.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteRookProm7.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookProm7.getCurrentPositionX(), WhiteRookProm7.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteRookProm8.getActive() == true){
			MultiArray = Superclass_WhiteRook.checkPreventer(MultiArray, WhiteRookProm8.getCurrentPositionX(), WhiteRookProm8.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
			
		if(WhiteQueenProm1.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm1.getCurrentPositionX(), WhiteQueenProm1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteQueenProm2.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm2.getCurrentPositionX(), WhiteQueenProm2.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteQueenProm3.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm3.getCurrentPositionX(), WhiteQueenProm3.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteQueenProm4.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm4.getCurrentPositionX(), WhiteQueenProm4.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteQueenProm5.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm5.getCurrentPositionX(), WhiteQueenProm5.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteQueenProm6.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm6.getCurrentPositionX(), WhiteQueenProm6.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteQueenProm7.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm7.getCurrentPositionX(), WhiteQueenProm7.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteQueenProm8.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm8.getCurrentPositionX(), WhiteQueenProm8.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteQueenProm1.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm1.getCurrentPositionX(), WhiteQueenProm1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
				}
		}
		if(WhiteQueenProm2.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm2.getCurrentPositionX(), WhiteQueenProm2.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
				}
		}
		if(WhiteQueenProm3.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm3.getCurrentPositionX(), WhiteQueenProm3.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteQueenProm4.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm4.getCurrentPositionX(), WhiteQueenProm4.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteQueenProm5.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm5.getCurrentPositionX(), WhiteQueenProm5.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteQueenProm6.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm6.getCurrentPositionX(), WhiteQueenProm6.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteQueenProm7.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm7.getCurrentPositionX(), WhiteQueenProm7.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteQueenProm8.getActive() == true){
			MultiArray = Superclass_WhiteQueen.checkPreventer(MultiArray, WhiteQueenProm8.getCurrentPositionX(), WhiteQueenProm8.getCurrentPositionY(), ComXY, CurrentTitle);
				
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteBishopProm1.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopProm1.getCurrentPositionX(), WhiteBishopProm1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteBishopProm2.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopProm2.getCurrentPositionX(), WhiteBishopProm2.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteBishopProm3.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopProm3.getCurrentPositionX(), WhiteBishopProm3.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteBishopProm4.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopProm4.getCurrentPositionX(), WhiteBishopProm4.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteBishopProm5.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopProm5.getCurrentPositionX(), WhiteBishopProm5.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteBishopProm6.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopProm6.getCurrentPositionX(), WhiteBishopProm6.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteBishopProm7.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopProm7.getCurrentPositionX(), WhiteBishopProm7.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteBishopProm8.getActive() == true){
			MultiArray = Superclass_WhiteBishop.checkPreventer(MultiArray, WhiteBishopProm8.getCurrentPositionX(), WhiteBishopProm8.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
					return true;
			}
		}	
		
		if(WhiteKnightProm1.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightProm1.getCurrentPositionX(), WhiteKnightProm1.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteKnightProm2.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightProm2.getCurrentPositionX(), WhiteKnightProm2.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteKnightProm3.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightProm3.getCurrentPositionX(), WhiteKnightProm3.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteKnightProm4.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightProm4.getCurrentPositionX(), WhiteKnightProm4.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteKnightProm5.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightProm5.getCurrentPositionX(), WhiteKnightProm5.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteKnightProm6.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightProm6.getCurrentPositionX(), WhiteKnightProm6.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteKnightProm7.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightProm7.getCurrentPositionX(), WhiteKnightProm7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(WhiteKnightProm8.getActive() == true){
			MultiArray = Superclass_WhiteKnight.checkPreventer(MultiArray, WhiteKnightProm8.getCurrentPositionX(), WhiteKnightProm8.getCurrentPositionY());
			if(MultiArray[0]==null){
					return true;
			}
		}	
		
		return false;	
	}
	
	
	static boolean isBlackKingInCheckMate(){
		
		//returns true if black king is in checkmate
		if(BlackKingE8.getActive()){
			ArrayList<int[]> MovementHandler = BlackKingE8.movementHandler(BlackKingE8.getCurrentPositionX(), BlackKingE8.getCurrentPositionY(), BlackKingE8.StartingPositionX, BlackKingE8.StartingPositionY);
			
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black King (E8)")){
					return false;
				}
			}
		}
		
		if(BlackRookA8.getActive()){
			ArrayList<int[]> MovementHandler = BlackRookA8.movementHandler(BlackRookA8.getCurrentPositionX(), BlackRookA8.getCurrentPositionY(), BlackRookA8.StartingPositionX, BlackRookA8.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Rook (A8)")){
					return false;
				}
			}	
		}
		
		if(BlackRookH8.getActive()){
			ArrayList<int[]> MovementHandler = BlackRookH8.movementHandler(BlackRookH8.getCurrentPositionX(), BlackRookH8.getCurrentPositionY(), BlackRookH8.StartingPositionX, BlackRookH8.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Rook (H8)")){
					return false;
				}
			}	
		}
		if(BlackQueenD8.getActive()){
			ArrayList<int[]> MovementHandler = BlackQueenD8.movementHandler(BlackQueenD8.getCurrentPositionX(), BlackQueenD8.getCurrentPositionY(), BlackQueenD8.StartingPositionX, BlackQueenD8.StartingPositionY);
			
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Queen (D8)")){
					return false;
				}
			}
			
		}
		
		if(BlackBishopC8.getActive()){
			ArrayList<int[]> MovementHandler = BlackBishopC8.movementHandler(BlackBishopC8.getCurrentPositionX(), BlackBishopC8.getCurrentPositionY(), BlackBishopC8.StartingPositionX, BlackBishopC8.StartingPositionY);
			
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Bishop (C8)")){
					return false;
				}
			}
		}
		
		if(BlackBishopF8.getActive()){
			ArrayList<int[]> MovementHandler = BlackBishopF8.movementHandler(BlackBishopF8.getCurrentPositionX(), BlackBishopF8.getCurrentPositionY(), BlackBishopF8.StartingPositionX, BlackBishopF8.StartingPositionY);
			
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Bishop (F8)")){
					return false;
				}
			}
		}
		
		if(BlackKnightB8.getActive()){
			ArrayList<int[]> MovementHandler = BlackKnightB8.movementHandler(BlackKnightB8.getCurrentPositionX(), BlackKnightB8.getCurrentPositionY(), BlackKnightB8.StartingPositionX, BlackKnightB8.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Knight (B8)")){
					return false;
				}
			}	
		}
		if(BlackKnightG8.getActive()){
			ArrayList<int[]> MovementHandler = BlackKnightG8.movementHandler(BlackKnightG8.getCurrentPositionX(), BlackKnightG8.getCurrentPositionY(), BlackKnightG8.StartingPositionX, BlackKnightG8.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Knight (G8)")){
					return false;
				}
			}	
		}
		
		if(BlackPawnA7.getActive()){
		
			ArrayList<int[]> MovementHandler = BlackPawnA7.movementHandler(BlackPawnA7.getCurrentPositionX(), BlackPawnA7.getCurrentPositionY(), BlackPawnA7.StartingPositionX, BlackPawnA7.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Pawn (A7)")){
					return false;
				}
			}		
		}
		
		if(BlackPawnB7.getActive()){
			ArrayList<int[]> MovementHandler = BlackPawnB7.movementHandler(BlackPawnB7.getCurrentPositionX(), BlackPawnB7.getCurrentPositionY(), BlackPawnB7.StartingPositionX, BlackPawnB7.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Pawn (B7)")){
					return false;
				}
			}	
		}
		
		if(BlackPawnC7.getActive()){
			ArrayList<int[]> MovementHandler = BlackPawnC7.movementHandler(BlackPawnC7.getCurrentPositionX(), BlackPawnC7.getCurrentPositionY(), BlackPawnC7.StartingPositionX, BlackPawnC7.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Pawn (C7)")){
					return false;
				}
			}	
		}
		
		if(BlackPawnD7.getActive()){
			ArrayList<int[]> MovementHandler = BlackPawnD7.movementHandler(BlackPawnD7.getCurrentPositionX(), BlackPawnD7.getCurrentPositionY(), BlackPawnD7.StartingPositionX, BlackPawnD7.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Pawn (D7)")){
					return false;
				}
			}	
		}
		
		if(BlackPawnE7.getActive()){
			ArrayList<int[]> MovementHandler = BlackPawnE7.movementHandler(BlackPawnE7.getCurrentPositionX(), BlackPawnE7.getCurrentPositionY(), BlackPawnE7.StartingPositionX, BlackPawnE7.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Pawn (E7)")){
					return false;
				}
			}	
		}
		
		if(BlackPawnF7.getActive()){
			ArrayList<int[]> MovementHandler = BlackPawnF7.movementHandler(BlackPawnF7.getCurrentPositionX(), BlackPawnF7.getCurrentPositionY(), BlackPawnF7.StartingPositionX, BlackPawnF7.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Pawn (F7)")){
					return false;
				}
			}	
		}
		
		if(BlackPawnG7.getActive()){
			ArrayList<int[]> MovementHandler = BlackPawnG7.movementHandler(BlackPawnG7.getCurrentPositionX(), BlackPawnG7.getCurrentPositionY(), BlackPawnG7.StartingPositionX, BlackPawnG7.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Pawn (G7)")){
					return false;
				}
			}	
		}
		
		if(BlackPawnH7.getActive()){
			ArrayList<int[]> MovementHandler = BlackPawnH7.movementHandler(BlackPawnH7.getCurrentPositionX(), BlackPawnH7.getCurrentPositionY(), BlackPawnH7.StartingPositionX, BlackPawnH7.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Pawn (H7)")){
					return false;
				}
			}	
		}
		if(BlackKnightProm1.getActive()){
			ArrayList<int[]> MovementHandler = BlackKnightProm1.movementHandler(BlackKnightProm1.getCurrentPositionX(), BlackKnightProm1.getCurrentPositionY(), BlackKnightProm1.StartingPositionX, BlackKnightProm1.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Knight (Prom1)")){
					return false;
				}
			}	
		}
		if(BlackKnightProm2.getActive()){
			ArrayList<int[]> MovementHandler = BlackKnightProm2.movementHandler(BlackKnightProm2.getCurrentPositionX(), BlackKnightProm2.getCurrentPositionY(), BlackKnightProm2.StartingPositionX, BlackKnightProm2.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Knight (Prom2)")){
					return false;
				}
			}	
		}
		if(BlackKnightProm3.getActive()){
			ArrayList<int[]> MovementHandler = BlackKnightProm3.movementHandler(BlackKnightProm3.getCurrentPositionX(), BlackKnightProm3.getCurrentPositionY(), BlackKnightProm3.StartingPositionX, BlackKnightProm3.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Knight (Prom3)")){
					return false;
				}
			}	
		}
		if(BlackKnightProm4.getActive()){
			ArrayList<int[]> MovementHandler = BlackKnightProm4.movementHandler(BlackKnightProm4.getCurrentPositionX(), BlackKnightProm4.getCurrentPositionY(), BlackKnightProm4.StartingPositionX, BlackKnightProm4.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Knight (Prom4)")){
					return false;
				}
			}	
		}
		if(BlackKnightProm5.getActive()){
			ArrayList<int[]> MovementHandler = BlackKnightProm5.movementHandler(BlackKnightProm5.getCurrentPositionX(), BlackKnightProm5.getCurrentPositionY(), BlackKnightProm5.StartingPositionX, BlackKnightProm5.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Knight (Prom5)")){
					return false;
				}
			}	
		}
		if(BlackKnightProm6.getActive()){
			ArrayList<int[]> MovementHandler = BlackKnightProm6.movementHandler(BlackKnightProm6.getCurrentPositionX(), BlackKnightProm6.getCurrentPositionY(), BlackKnightProm6.StartingPositionX, BlackKnightProm6.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Knight (Prom6)")){
					return false;
				}
			}	
		}
		if(BlackKnightProm7.getActive()){
			ArrayList<int[]> MovementHandler = BlackKnightProm7.movementHandler(BlackKnightProm7.getCurrentPositionX(), BlackKnightProm7.getCurrentPositionY(), BlackKnightProm7.StartingPositionX, BlackKnightProm7.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Knight (Prom7)")){
					return false;
				}
			}	
		}
		if(BlackKnightProm8.getActive()){
			ArrayList<int[]> MovementHandler = BlackKnightProm8.movementHandler(BlackKnightProm8.getCurrentPositionX(), BlackKnightProm8.getCurrentPositionY(), BlackKnightProm8.StartingPositionX, BlackKnightProm8.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Knight (Prom8)")){
					return false;
				}
			}	
		}
		if(BlackQueenProm1.getActive()){
			ArrayList<int[]> MovementHandler = BlackQueenProm1.movementHandler(BlackQueenProm1.getCurrentPositionX(), BlackQueenProm1.getCurrentPositionY(), BlackQueenProm1.StartingPositionX, BlackQueenProm1.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Queen (Prom1)")){
					return false;
				}
			}	
		}
		if(BlackQueenProm2.getActive()){
			ArrayList<int[]> MovementHandler = BlackQueenProm2.movementHandler(BlackQueenProm2.getCurrentPositionX(), BlackQueenProm2.getCurrentPositionY(), BlackQueenProm2.StartingPositionX, BlackQueenProm2.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Queen (Prom2)")){
					return false;
				}
			}	
		}
		if(BlackQueenProm3.getActive()){
			ArrayList<int[]> MovementHandler = BlackQueenProm3.movementHandler(BlackQueenProm3.getCurrentPositionX(), BlackQueenProm3.getCurrentPositionY(), BlackQueenProm3.StartingPositionX, BlackQueenProm3.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Queen (Prom3)")){
					return false;
				}
			}	
		}
		if(BlackQueenProm4.getActive()){
			ArrayList<int[]> MovementHandler = BlackQueenProm4.movementHandler(BlackQueenProm4.getCurrentPositionX(), BlackQueenProm4.getCurrentPositionY(), BlackQueenProm4.StartingPositionX, BlackQueenProm4.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Queen (Prom4)")){
					return false;
				}
			}	
		}
		if(BlackQueenProm5.getActive()){
			ArrayList<int[]> MovementHandler = BlackQueenProm5.movementHandler(BlackQueenProm5.getCurrentPositionX(), BlackQueenProm5.getCurrentPositionY(), BlackQueenProm5.StartingPositionX, BlackQueenProm5.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Queen (Prom5)")){
					return false;
				}
			}	
		}
		if(BlackQueenProm6.getActive()){
			ArrayList<int[]> MovementHandler = BlackQueenProm6.movementHandler(BlackQueenProm6.getCurrentPositionX(), BlackQueenProm6.getCurrentPositionY(), BlackQueenProm6.StartingPositionX, BlackQueenProm6.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Queen (Prom6)")){
					return false;
				}
			}	
		}
		if(BlackQueenProm7.getActive()){
			ArrayList<int[]> MovementHandler = BlackQueenProm7.movementHandler(BlackQueenProm7.getCurrentPositionX(), BlackQueenProm7.getCurrentPositionY(), BlackQueenProm7.StartingPositionX, BlackQueenProm7.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Queen (Prom7)")){
					return false;
				}
			}	
		}
		if(BlackQueenProm8.getActive()){
			ArrayList<int[]> MovementHandler = BlackQueenProm8.movementHandler(BlackQueenProm8.getCurrentPositionX(), BlackQueenProm8.getCurrentPositionY(), BlackQueenProm8.StartingPositionX, BlackQueenProm8.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Queen (Prom8)")){
					return false;
				}
			}	
		}
		if(BlackBishopProm1.getActive()){
			ArrayList<int[]> MovementHandler = BlackBishopProm1.movementHandler(BlackBishopProm1.getCurrentPositionX(), BlackBishopProm1.getCurrentPositionY(), BlackBishopProm1.StartingPositionX, BlackBishopProm1.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Bishop (Prom1)")){
					return false;
				}
			}	
		}
		if(BlackBishopProm2.getActive()){
			ArrayList<int[]> MovementHandler = BlackBishopProm2.movementHandler(BlackBishopProm2.getCurrentPositionX(), BlackBishopProm2.getCurrentPositionY(), BlackBishopProm2.StartingPositionX, BlackBishopProm2.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Bishop (Prom2)")){
					return false;
				}
			}	
		}
		if(BlackBishopProm3.getActive()){
			ArrayList<int[]> MovementHandler = BlackBishopProm3.movementHandler(BlackBishopProm3.getCurrentPositionX(), BlackBishopProm3.getCurrentPositionY(), BlackBishopProm3.StartingPositionX, BlackBishopProm3.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Bishop (Prom3)")){
					return false;
				}
			}	
		}
		if(BlackBishopProm4.getActive()){
			ArrayList<int[]> MovementHandler = BlackBishopProm4.movementHandler(BlackBishopProm4.getCurrentPositionX(), BlackBishopProm4.getCurrentPositionY(), BlackBishopProm4.StartingPositionX, BlackBishopProm4.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Bishop (Prom4)")){
					return false;
				}
			}	
		}
		if(BlackBishopProm5.getActive()){
			ArrayList<int[]> MovementHandler = BlackBishopProm5.movementHandler(BlackBishopProm5.getCurrentPositionX(), BlackBishopProm5.getCurrentPositionY(), BlackBishopProm5.StartingPositionX, BlackBishopProm5.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Bishop (Prom5)")){
					return false;
				}
			}	
		}
		if(BlackBishopProm6.getActive()){
			ArrayList<int[]> MovementHandler = BlackBishopProm6.movementHandler(BlackBishopProm6.getCurrentPositionX(), BlackBishopProm6.getCurrentPositionY(), BlackBishopProm6.StartingPositionX, BlackBishopProm6.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Bishop (Prom6)")){
					return false;
				}
			}	
		}
		if(BlackBishopProm7.getActive()){
			ArrayList<int[]> MovementHandler = BlackBishopProm7.movementHandler(BlackBishopProm7.getCurrentPositionX(), BlackBishopProm7.getCurrentPositionY(), BlackBishopProm7.StartingPositionX, BlackBishopProm7.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Bishop (Prom7)")){
					return false;
				}
			}	
		}
		if(BlackBishopProm8.getActive()){
			ArrayList<int[]> MovementHandler = BlackBishopProm8.movementHandler(BlackBishopProm8.getCurrentPositionX(), BlackBishopProm8.getCurrentPositionY(), BlackBishopProm8.StartingPositionX, BlackBishopProm8.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Bishop (Prom8)")){
					return false;
				}
			}	
		}
		if(BlackRookProm1.getActive()){
			ArrayList<int[]> MovementHandler = BlackRookProm1.movementHandler(BlackRookProm1.getCurrentPositionX(), BlackRookProm1.getCurrentPositionY(), BlackRookProm1.StartingPositionX, BlackRookProm1.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Rook (Prom1)")){
					return false;
				}
			}	
		}
		if(BlackRookProm2.getActive()){
			ArrayList<int[]> MovementHandler = BlackRookProm2.movementHandler(BlackRookProm2.getCurrentPositionX(), BlackRookProm2.getCurrentPositionY(), BlackRookProm2.StartingPositionX, BlackRookProm2.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Rook (Prom2)")){
					return false;
				}
			}	
		}
		if(BlackRookProm3.getActive()){
			ArrayList<int[]> MovementHandler = BlackRookProm3.movementHandler(BlackRookProm3.getCurrentPositionX(), BlackRookProm3.getCurrentPositionY(), BlackRookProm3.StartingPositionX, BlackRookProm3.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Rook (Prom3)")){
					return false;
				}
			}	
		}
		if(BlackRookProm4.getActive()){
			ArrayList<int[]> MovementHandler = BlackRookProm4.movementHandler(BlackRookProm4.getCurrentPositionX(), BlackRookProm4.getCurrentPositionY(), BlackRookProm4.StartingPositionX, BlackRookProm4.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Rook (Prom4)")){
					return false;
				}
			}	
		}
		
		if(BlackRookProm5.getActive()){
			ArrayList<int[]> MovementHandler = BlackRookProm5.movementHandler(BlackRookProm5.getCurrentPositionX(), BlackRookProm5.getCurrentPositionY(), BlackRookProm5.StartingPositionX, BlackRookProm5.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Rook (Prom5)")){
					return false;
				}
			}	
		}
		
		if(BlackRookProm6.getActive()){
			ArrayList<int[]> MovementHandler = BlackRookProm6.movementHandler(BlackRookProm6.getCurrentPositionX(), BlackRookProm6.getCurrentPositionY(), BlackRookProm6.StartingPositionX, BlackRookProm6.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Rook (Prom6)")){
					return false;
				}
			}	
		}
		
		if(BlackRookProm7.getActive()){
			ArrayList<int[]> MovementHandler = BlackRookProm7.movementHandler(BlackRookProm7.getCurrentPositionX(), BlackRookProm7.getCurrentPositionY(), BlackRookProm7.StartingPositionX, BlackRookProm7.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Rook (Prom7)")){
					return false;
				}
			}	
		}
		
		if(BlackRookProm8.getActive()){
			ArrayList<int[]> MovementHandler = BlackRookProm8.movementHandler(BlackRookProm8.getCurrentPositionX(), BlackRookProm8.getCurrentPositionY(), BlackRookProm8.StartingPositionX, BlackRookProm8.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_BlackKing.isBlackKingInCheck(i, "Black Rook (Prom8)")){
					return false;
				}
			}	
		}
		return true;

	}
	
	static ArrayList<int[]> searcherTopTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this queen top tiles

		int [] NewXY = new int[2];
		NewXY[0] = CurrentX + 0;
		NewXY[1] = CurrentY - 1;
		
		if(NewXY[1] < 0){
			return MoveList;
		}
		for(int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a valid white piece to kill " + j + " tiles top of this Queen");
				MoveList.add(NewXY);
				return MoveList;
			}
		}

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a black piece " + j + " tiles top of this Queen");
				return MoveList;
			}				
		}
		MoveList.add(NewXY);
		return MoveList;
	}	
	static ArrayList<int[]> searcherLeftTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this queen left tiles

		int [] NewXY = new int[2];	
		NewXY[0] = CurrentX - 1;
		NewXY[1] = CurrentY + 0;
		
		if(NewXY[0] < 0){
			return MoveList;
		}
		
		for(int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a valid white piece to kill " + j + " tiles left of this Queen");
				MoveList.add(NewXY);
				return MoveList;
			}	
		}

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a black piece " + j + " tiles left of this Queen");
				return MoveList;
			}				
		}
		MoveList.add(NewXY);
		
		return MoveList;
	}
	static ArrayList<int[]> searcherBottomTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this Queen left tiles

		int [] NewXY = new int[2];
		NewXY[0] = CurrentX + 0;
		NewXY[1] = CurrentY + 1;
		
		if(NewXY[1] > 7){
			return MoveList;
		}
		for(int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a valid white piece to kill " + j + " tiles bottom of this Queen");
				MoveList.add(NewXY);
				return MoveList;
			}	
		}

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a black piece " + j + " tiles bottom of this Queen");
				return MoveList;				
			}			
		}
		MoveList.add(NewXY);
		
		return MoveList;
	}
	static ArrayList<int[]> searcherRightTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this Queen left tiles

		int [] NewXY = new int[2];	
		NewXY[0] = CurrentX + 1;
		NewXY[1] = CurrentY + 0;
		
		if(NewXY[0] > 7){
			return MoveList;
		}
		for(int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a valid white piece to kill " + j + " tiles right of this Queen");
				MoveList.add(NewXY);
				return MoveList;
			}	
		}

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a black piece " + j + " tiles right of this Queen");
				return MoveList;
			}			
		}
		MoveList.add(NewXY);
		
		return MoveList;
	}
	static ArrayList<int[]> searcherTopLeftTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this Queen top left tiles
		

		int [] NewXY = new int[2];
		NewXY[0] = CurrentX - 1;
		NewXY[1] = CurrentY - 1;
		
		if(NewXY[0] < 0 || NewXY[1] < 0){
			return MoveList;
		}
		for(int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a valid white piece to kill " + j + " tiles top left of this Queen");
				MoveList.add(NewXY);
				return MoveList;
			}	
		}

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a black piece " + j + " tiles top left of this Queen");
				return MoveList;
			}			
		}
		MoveList.add(NewXY);
	
		return MoveList;
	}	
	static ArrayList<int[]> searcherTopRightTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this Queen top right tiles

		int [] NewXY = new int[2];	
		NewXY[0] = CurrentX + 1;
		NewXY[1] = CurrentY - 1;
		
		if(NewXY[0] > 7 || NewXY[1] < 0){
			return MoveList;
		}
		for(int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a valid white piece to kill " + j + " tiles top right of this Queen");
				MoveList.add(NewXY);
				return MoveList;
			}	
		}

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a black piece " + j + " tiles top right of this Queen");
				return MoveList;
			}			
		}
		MoveList.add(NewXY);
		
	return MoveList;
		}
	static ArrayList<int[]> searcherBottomLeftTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this Queen bottom left tiles
		

		int [] NewXY = new int[2];
		NewXY[0] = CurrentX - 1;
		NewXY[1] = CurrentY + 1;
		
		if(NewXY[0] < 0 || NewXY[1] > 7){
			return MoveList;
		}
		for(int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a valid white piece to kill " + j + " tiles bottom left of this Queen");
				MoveList.add(NewXY);
				return MoveList;
			}	
		}

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a black piece " + j + " tiles bottom left of this Queen");
				return MoveList;
			}			
		}
		MoveList.add(NewXY);
		
		return MoveList;
	}
	static ArrayList<int[]> searcherBottomRightTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this Queen bottom right tiles
		

		int [] NewXY = new int[2];	
		NewXY[0] = CurrentX + 1;
		NewXY[1] = CurrentY + 1;
		
		if(NewXY[0] > 7 || NewXY[1] > 7){
			return MoveList;
		}
		for(int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a valid white piece to kill " + j + " tiles bottom right of this Queen");
				MoveList.add(NewXY);
				return MoveList;
			}	
		}

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a black piece " + j + " tiles bottom right of this Queen");
				return MoveList;
			}				
		}
		MoveList.add(NewXY);
		
		return MoveList;
	}
}