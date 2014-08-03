package chessPackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;

public class Superclass_WhiteKing extends WhitePiece {
	static ImageIcon getIcon(){
		URL White_King_URL = Chess.class.getResource("chess_piece_white_king.png");
		ImageIcon White_King_Icon = new ImageIcon(White_King_URL);
		return White_King_Icon;
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
	private static ArrayList<int[]> castleRightSide(ArrayList<int[]> MoveList, int CurrentX, int CurrentY) {
		if(WhiteKingE1.getFirstStrike() == true && WhiteRookH1.getFirstStrike() == true){

			int [] ComXY = {4,7};
			if(WhiteKingE1.isWhiteKingInCheck(ComXY, "White King (E1)")){
				//cannot castle out of check
				//System.out.println("Cannot right castle out of check");
				return MoveList;
			}
			
			
			int [] NewXY=new int[2];
			NewXY[0] = 5;
			NewXY[1] = 7;
			int [] NewXY2=new int[2];
			NewXY2[0] = 6;
			NewXY2[1] = 7;

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
			for(int [] i: aggregateWhites()){
				int[] Coordinate = i;
				if(Arrays.equals(Coordinate, NewXY)){
					return MoveList;
				}
				if(Arrays.equals(Coordinate, NewXY2)){	
					return MoveList;
				}		
			}	
			//right side castle is possible. Add possible movement to MultiArray

			int [] Coord = {6,7};
			MoveList.add(Coord);
			Chess.ActivateWhiteRightCastle = true;
			return MoveList;
		}
		//else right side castle is not possible. Add nulls movement to MultiArray
		return MoveList;
	}

	private static ArrayList<int[]> castleLeftSide(ArrayList<int[]> MoveList, int CurrentX, int CurrentY) {
		int [] ComXY = {4,7};
		if(WhiteKingE1.isWhiteKingInCheck(ComXY, "White King (E1)")){
			//cannot castle out of check
			//System.out.println("Cannot left castle out of check");
			return MoveList;
		}
		
		if(WhiteKingE1.getFirstStrike() == true && WhiteRookA1.getFirstStrike() == true){
				//left side castle check
				int [] NewXY=new int[2];
				NewXY[0] = 3;
				NewXY[1] = 7;
				int [] NewXY2=new int[2];
				NewXY2[0] = 2;
				NewXY2[1] = 7;
				int [] NewXY3=new int[2];
				NewXY3[0] = 1;
				NewXY3[1] = 7;
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

				for(int [] i: aggregateWhites()){
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
	
				int [] Coord = {2,7};
				MoveList.add(Coord);
				Chess.ActivateWhiteLeftCastle = true;
				return MoveList;
			}
		
		//else left side castle is not possible. Add nulls movement to MultiArray
		return MoveList;
	}




	static int [][] checkPreventer( int[][]MultiArray,int CurrentX, int CurrentY){
		//this forces other King to move out of check. Used for isBlackKinginCheck

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
				////System.out.println("White King threatining check");
				MultiArray[i]=null;
				
				break;  
			}		    			  
		}

		
		NewXY2[0]=CurrentX+0;
		NewXY2[1]=CurrentY-1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY2)){
				////System.out.println("White King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY3[0]=CurrentX+1;
		NewXY3[1]=CurrentY-0;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY3)){
				////System.out.println("White King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY4[0]=CurrentX-1;
		NewXY4[1]=CurrentY+0;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY4)){
				////System.out.println("White King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY5[0]=CurrentX+1;
		NewXY5[1]=CurrentY+1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY5)){
				////System.out.println("White King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY6[0]=CurrentX-1;
		NewXY6[1]=CurrentY-1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY6)){
				////System.out.println("White King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY7[0]=CurrentX+1;
		NewXY7[1]=CurrentY-1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY7)){
				////System.out.println("White King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY8[0]=CurrentX-1;
		NewXY8[1]=CurrentY+1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY8)){
				////System.out.println("White King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		return MultiArray;
	}
	
	static boolean isWhiteKingInCheck(int[] ComXY, String CurrentTitle){
		//will return true if king is in check
		
		int [][]MultiArray = new int[1][2];

		
		if (CurrentTitle == "White King (E1)"){
			
			MultiArray[0][0] = ComXY[0];
			MultiArray[0][1] = ComXY[1];
			
		}
		else{
			MultiArray[0][0]=WhiteKingE1.getCurrentPositionX();
			MultiArray[0][1]=WhiteKingE1.getCurrentPositionY();
		}

		
		//must insert here

		if(!Arrays.equals(BlackPawnH7.getCurrentPositionXY(), ComXY) && BlackPawnH7.getActive() == true){
			MultiArray = Superclass_BlackPawn.checkPreventer(MultiArray, BlackPawnH7.getCurrentPositionX(), BlackPawnH7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}

		if(!Arrays.equals(BlackPawnG7.getCurrentPositionXY(), ComXY) && BlackPawnG7.getActive() == true){
			MultiArray = Superclass_BlackPawn.checkPreventer(MultiArray, BlackPawnG7.getCurrentPositionX(), BlackPawnG7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackPawnF7.getCurrentPositionXY(), ComXY) && BlackPawnF7.getActive() == true){
			MultiArray = Superclass_BlackPawn.checkPreventer(MultiArray, BlackPawnF7.getCurrentPositionX(), BlackPawnF7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackPawnE7.getCurrentPositionXY(), ComXY) && BlackPawnE7.getActive() == true){
			MultiArray = Superclass_BlackPawn.checkPreventer(MultiArray, BlackPawnE7.getCurrentPositionX(), BlackPawnE7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackRookH8.getCurrentPositionXY(), ComXY) && BlackRookH8.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookH8.getCurrentPositionX(), BlackRookH8.getCurrentPositionY(),ComXY,CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		
		if(!Arrays.equals(BlackPawnD7.getCurrentPositionXY(), ComXY) && BlackPawnD7.getActive() == true){
			MultiArray = Superclass_BlackPawn.checkPreventer(MultiArray, BlackPawnD7.getCurrentPositionX(), BlackPawnD7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}

		if(!Arrays.equals(BlackPawnA7.getCurrentPositionXY(), ComXY) && BlackPawnA7.getActive() == true){
			MultiArray = Superclass_BlackPawn.checkPreventer(MultiArray, BlackPawnA7.getCurrentPositionX(), BlackPawnA7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}

		
		if(!Arrays.equals(BlackPawnB7.getCurrentPositionXY(), ComXY) && BlackPawnB7.getActive() == true){
			MultiArray = Superclass_BlackPawn.checkPreventer(MultiArray, BlackPawnB7.getCurrentPositionX(), BlackPawnB7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}

		if(!Arrays.equals(BlackKnightG8.getCurrentPositionXY(), ComXY) && BlackKnightG8.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightG8.getCurrentPositionX(), BlackKnightG8.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}

		if(!Arrays.equals(BlackKnightB8.getCurrentPositionXY(), ComXY) && BlackKnightB8.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightB8.getCurrentPositionX(), BlackKnightB8.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}

		if(!Arrays.equals(BlackPawnC7.getCurrentPositionXY(), ComXY) && BlackPawnC7.getActive() == true ){
			MultiArray = Superclass_BlackPawn.checkPreventer(MultiArray, BlackPawnC7.getCurrentPositionX(), BlackPawnC7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}

	
		
		if(!Arrays.equals(BlackRookA8.getCurrentPositionXY(),ComXY) && BlackRookA8.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookA8.getCurrentPositionX(), BlackRookA8.getCurrentPositionY(),ComXY,CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}

		
		if(!Arrays.equals(BlackKingE8.getCurrentPositionXY(),ComXY) && BlackKingE8.getActive() == true){
			MultiArray = Superclass_BlackKing.checkPreventer(MultiArray, BlackKingE8.getCurrentPositionX(), BlackKingE8.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
	
		
		if(!Arrays.equals(BlackBishopC8.getCurrentPositionXY(),ComXY) && BlackBishopC8.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopC8.getCurrentPositionX(), BlackBishopC8.getCurrentPositionY(),ComXY,CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackBishopF8.getCurrentPositionXY(),ComXY) && BlackBishopF8.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopF8.getCurrentPositionX(), BlackBishopF8.getCurrentPositionY(),ComXY,CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		
		if(!Arrays.equals(BlackQueenD8.getCurrentPositionXY(),ComXY) && BlackQueenD8.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenD8.getCurrentPositionX(), BlackQueenD8.getCurrentPositionY(),ComXY,CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}


		if(!Arrays.equals(BlackRookProm1.getCurrentPositionXY(), ComXY) && BlackRookProm1.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookProm1.getCurrentPositionX(), BlackRookProm1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackRookProm2.getCurrentPositionXY(), ComXY) && BlackRookProm2.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookProm2.getCurrentPositionX(), BlackRookProm2.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackRookProm3.getCurrentPositionXY(), ComXY) && BlackRookProm3.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookProm3.getCurrentPositionX(), BlackRookProm3.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackRookProm4.getCurrentPositionXY(), ComXY) && BlackRookProm4.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookProm4.getCurrentPositionX(), BlackRookProm4.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackRookProm5.getCurrentPositionXY(), ComXY) && BlackRookProm5.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookProm5.getCurrentPositionX(), BlackRookProm5.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackRookProm6.getCurrentPositionXY(), ComXY) && BlackRookProm6.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookProm6.getCurrentPositionX(), BlackRookProm6.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackRookProm7.getCurrentPositionXY(), ComXY) && BlackRookProm7.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookProm7.getCurrentPositionX(), BlackRookProm7.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackRookProm8.getCurrentPositionXY(), ComXY) && BlackRookProm8.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookProm8.getCurrentPositionX(), BlackRookProm8.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}

		if(!Arrays.equals(BlackQueenProm1.getCurrentPositionXY(), ComXY) && BlackQueenProm1.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm1.getCurrentPositionX(), BlackQueenProm1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}

		if(!Arrays.equals(BlackQueenProm2.getCurrentPositionXY(), ComXY) && BlackQueenProm2.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm2.getCurrentPositionX(), BlackQueenProm2.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackQueenProm3.getCurrentPositionXY(), ComXY) && BlackQueenProm3.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm3.getCurrentPositionX(), BlackQueenProm3.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackQueenProm4.getCurrentPositionXY(), ComXY) && BlackQueenProm4.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm4.getCurrentPositionX(), BlackQueenProm4.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackQueenProm5.getCurrentPositionXY(), ComXY) && BlackQueenProm5.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm5.getCurrentPositionX(), BlackQueenProm5.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackQueenProm6.getCurrentPositionXY(), ComXY) && BlackQueenProm6.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm6.getCurrentPositionX(), BlackQueenProm6.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackQueenProm7.getCurrentPositionXY(), ComXY) && BlackQueenProm7.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm7.getCurrentPositionX(), BlackQueenProm7.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackQueenProm8.getCurrentPositionXY(), ComXY) && BlackQueenProm8.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm8.getCurrentPositionX(), BlackQueenProm8.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackQueenProm1.getCurrentPositionXY(), ComXY) && BlackQueenProm1.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm1.getCurrentPositionX(), BlackQueenProm1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
				}
		}
		if(!Arrays.equals(BlackQueenProm2.getCurrentPositionXY(), ComXY) && BlackQueenProm2.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm2.getCurrentPositionX(), BlackQueenProm2.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
				}
		}
		if(!Arrays.equals(BlackQueenProm3.getCurrentPositionXY(), ComXY) && BlackQueenProm3.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm3.getCurrentPositionX(), BlackQueenProm3.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackQueenProm4.getCurrentPositionXY(), ComXY) && BlackQueenProm4.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm4.getCurrentPositionX(), BlackQueenProm4.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackQueenProm5.getCurrentPositionXY(), ComXY) && BlackQueenProm5.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm5.getCurrentPositionX(), BlackQueenProm5.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackQueenProm6.getCurrentPositionXY(), ComXY) && BlackQueenProm6.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm6.getCurrentPositionX(), BlackQueenProm6.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackQueenProm7.getCurrentPositionXY(), ComXY) && BlackQueenProm7.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm7.getCurrentPositionX(), BlackQueenProm7.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackQueenProm8.getCurrentPositionXY(), ComXY) && BlackQueenProm8.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm8.getCurrentPositionX(), BlackQueenProm8.getCurrentPositionY(), ComXY, CurrentTitle);
				
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackBishopProm1.getCurrentPositionXY(), ComXY) && BlackBishopProm1.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopProm1.getCurrentPositionX(), BlackBishopProm1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackBishopProm2.getCurrentPositionXY(), ComXY) && BlackBishopProm2.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopProm2.getCurrentPositionX(), BlackBishopProm2.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackBishopProm3.getCurrentPositionXY(), ComXY) && BlackBishopProm3.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopProm3.getCurrentPositionX(), BlackBishopProm3.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackBishopProm4.getCurrentPositionXY(), ComXY) && BlackBishopProm4.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopProm4.getCurrentPositionX(), BlackBishopProm4.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackBishopProm5.getCurrentPositionXY(), ComXY) && BlackBishopProm5.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopProm5.getCurrentPositionX(), BlackBishopProm5.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackBishopProm6.getCurrentPositionXY(), ComXY) && BlackBishopProm6.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopProm6.getCurrentPositionX(), BlackBishopProm6.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackBishopProm7.getCurrentPositionXY(), ComXY) && BlackBishopProm7.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopProm7.getCurrentPositionX(), BlackBishopProm7.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackBishopProm8.getCurrentPositionXY(), ComXY) && BlackBishopProm8.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopProm8.getCurrentPositionX(), BlackBishopProm8.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
					return true;
			}
		}	
		
		if(!Arrays.equals(BlackKnightProm1.getCurrentPositionXY(), ComXY) && BlackKnightProm1.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightProm1.getCurrentPositionX(), BlackKnightProm1.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackKnightProm2.getCurrentPositionXY(), ComXY) && BlackKnightProm2.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightProm2.getCurrentPositionX(), BlackKnightProm2.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackKnightProm3.getCurrentPositionXY(), ComXY) && BlackKnightProm3.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightProm3.getCurrentPositionX(), BlackKnightProm3.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackKnightProm4.getCurrentPositionXY(), ComXY) && BlackKnightProm4.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightProm4.getCurrentPositionX(), BlackKnightProm4.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackKnightProm5.getCurrentPositionXY(), ComXY) && BlackKnightProm5.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightProm5.getCurrentPositionX(), BlackKnightProm5.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackKnightProm6.getCurrentPositionXY(), ComXY) && BlackKnightProm6.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightProm6.getCurrentPositionX(), BlackKnightProm6.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackKnightProm7.getCurrentPositionXY(), ComXY) && BlackKnightProm7.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightProm7.getCurrentPositionX(), BlackKnightProm7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(!Arrays.equals(BlackKnightProm8.getCurrentPositionXY(), ComXY) && BlackKnightProm8.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightProm8.getCurrentPositionX(), BlackKnightProm8.getCurrentPositionY());
			if(MultiArray[0]==null){
					return true;
			}
		}	

		return false;	
	}
	
	static boolean isWhiteKingInCheck_Set(int[] ComXY, String CurrentTitle){
		//will return true if king is in check
		//only works during black turn
		
		int [][]MultiArray = new int[1][2];

		
		if (CurrentTitle == "White King (E1)"){
			
			MultiArray[0][0] = ComXY[0];
			MultiArray[0][1] = ComXY[1];
			
		}
		else{
			MultiArray[0][0]=WhiteKingE1.getCurrentPositionX();
			MultiArray[0][1]=WhiteKingE1.getCurrentPositionY();
		}

		
		//must insert here
		//toDO
		
		if(BlackPawnH7.getActive() == true){
			MultiArray = Superclass_BlackPawn.checkPreventer(MultiArray, BlackPawnH7.getCurrentPositionX(), BlackPawnH7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}

		if(BlackPawnG7.getActive() == true){
			MultiArray = Superclass_BlackPawn.checkPreventer(MultiArray, BlackPawnG7.getCurrentPositionX(), BlackPawnG7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackPawnF7.getActive() == true){
			MultiArray = Superclass_BlackPawn.checkPreventer(MultiArray, BlackPawnF7.getCurrentPositionX(), BlackPawnF7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackPawnE7.getActive() == true){
			MultiArray = Superclass_BlackPawn.checkPreventer(MultiArray, BlackPawnE7.getCurrentPositionX(), BlackPawnE7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackRookH8.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookH8.getCurrentPositionX(), BlackRookH8.getCurrentPositionY(),ComXY,CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		
		if(BlackPawnD7.getActive() == true){
			MultiArray = Superclass_BlackPawn.checkPreventer(MultiArray, BlackPawnD7.getCurrentPositionX(), BlackPawnD7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}

		if(BlackPawnA7.getActive() == true){
			MultiArray = Superclass_BlackPawn.checkPreventer(MultiArray, BlackPawnA7.getCurrentPositionX(), BlackPawnA7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}

		
		if(BlackPawnB7.getActive() == true){
			MultiArray = Superclass_BlackPawn.checkPreventer(MultiArray, BlackPawnB7.getCurrentPositionX(), BlackPawnB7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}

		if(BlackKnightG8.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightG8.getCurrentPositionX(), BlackKnightG8.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}

		if(BlackKnightB8.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightB8.getCurrentPositionX(), BlackKnightB8.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}

		if(BlackPawnC7.getActive() == true ){
			MultiArray = Superclass_BlackPawn.checkPreventer(MultiArray, BlackPawnC7.getCurrentPositionX(), BlackPawnC7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}

	
		
		if(BlackRookA8.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookA8.getCurrentPositionX(), BlackRookA8.getCurrentPositionY(),ComXY,CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}

		
		if(BlackKingE8.getActive() == true){
			MultiArray = Superclass_BlackKing.checkPreventer(MultiArray, BlackKingE8.getCurrentPositionX(), BlackKingE8.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
	
		
		if(BlackBishopC8.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopC8.getCurrentPositionX(), BlackBishopC8.getCurrentPositionY(),ComXY,CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackBishopF8.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopF8.getCurrentPositionX(), BlackBishopF8.getCurrentPositionY(),ComXY,CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		
		if(BlackQueenD8.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenD8.getCurrentPositionX(), BlackQueenD8.getCurrentPositionY(),ComXY,CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}


		if(BlackRookProm1.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookProm1.getCurrentPositionX(), BlackRookProm1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackRookProm2.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookProm2.getCurrentPositionX(), BlackRookProm2.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackRookProm3.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookProm3.getCurrentPositionX(), BlackRookProm3.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackRookProm4.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookProm4.getCurrentPositionX(), BlackRookProm4.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackRookProm5.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookProm5.getCurrentPositionX(), BlackRookProm5.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackRookProm6.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookProm6.getCurrentPositionX(), BlackRookProm6.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackRookProm7.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookProm7.getCurrentPositionX(), BlackRookProm7.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackRookProm8.getActive() == true){
			MultiArray = Superclass_BlackRook.checkPreventer(MultiArray, BlackRookProm8.getCurrentPositionX(), BlackRookProm8.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}

		if(BlackQueenProm1.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm1.getCurrentPositionX(), BlackQueenProm1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}

		if(BlackQueenProm2.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm2.getCurrentPositionX(), BlackQueenProm2.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackQueenProm3.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm3.getCurrentPositionX(), BlackQueenProm3.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackQueenProm4.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm4.getCurrentPositionX(), BlackQueenProm4.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackQueenProm5.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm5.getCurrentPositionX(), BlackQueenProm5.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackQueenProm6.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm6.getCurrentPositionX(), BlackQueenProm6.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackQueenProm7.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm7.getCurrentPositionX(), BlackQueenProm7.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackQueenProm8.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm8.getCurrentPositionX(), BlackQueenProm8.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackQueenProm1.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm1.getCurrentPositionX(), BlackQueenProm1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
				}
		}
		if(BlackQueenProm2.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm2.getCurrentPositionX(), BlackQueenProm2.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
				}
		}
		if(BlackQueenProm3.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm3.getCurrentPositionX(), BlackQueenProm3.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackQueenProm4.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm4.getCurrentPositionX(), BlackQueenProm4.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackQueenProm5.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm5.getCurrentPositionX(), BlackQueenProm5.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackQueenProm6.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm6.getCurrentPositionX(), BlackQueenProm6.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackQueenProm7.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm7.getCurrentPositionX(), BlackQueenProm7.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackQueenProm8.getActive() == true){
			MultiArray = Superclass_BlackQueen.checkPreventer(MultiArray, BlackQueenProm8.getCurrentPositionX(), BlackQueenProm8.getCurrentPositionY(), ComXY, CurrentTitle);
				
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackBishopProm1.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopProm1.getCurrentPositionX(), BlackBishopProm1.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackBishopProm2.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopProm2.getCurrentPositionX(), BlackBishopProm2.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackBishopProm3.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopProm3.getCurrentPositionX(), BlackBishopProm3.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackBishopProm4.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopProm4.getCurrentPositionX(), BlackBishopProm4.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackBishopProm5.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopProm5.getCurrentPositionX(), BlackBishopProm5.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackBishopProm6.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopProm6.getCurrentPositionX(), BlackBishopProm6.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackBishopProm7.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopProm7.getCurrentPositionX(), BlackBishopProm7.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackBishopProm8.getActive() == true){
			MultiArray = Superclass_BlackBishop.checkPreventer(MultiArray, BlackBishopProm8.getCurrentPositionX(), BlackBishopProm8.getCurrentPositionY(), ComXY, CurrentTitle);
			if(MultiArray[0]==null){
					return true;
			}
		}	
		
		if(BlackKnightProm1.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightProm1.getCurrentPositionX(), BlackKnightProm1.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackKnightProm2.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightProm2.getCurrentPositionX(), BlackKnightProm2.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackKnightProm3.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightProm3.getCurrentPositionX(), BlackKnightProm3.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackKnightProm4.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightProm4.getCurrentPositionX(), BlackKnightProm4.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackKnightProm5.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightProm5.getCurrentPositionX(), BlackKnightProm5.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackKnightProm6.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightProm6.getCurrentPositionX(), BlackKnightProm6.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackKnightProm7.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightProm7.getCurrentPositionX(), BlackKnightProm7.getCurrentPositionY());
			if(MultiArray[0]==null){
				return true;
			}
		}
		if(BlackKnightProm8.getActive() == true){
			MultiArray = Superclass_BlackKnight.checkPreventer(MultiArray, BlackKnightProm8.getCurrentPositionX(), BlackKnightProm8.getCurrentPositionY());
			if(MultiArray[0]==null){
					return true;
			}
		}	

		return false;	
	}
	


	public static boolean isWhiteKingInCheckMate() {
		//returns true if white king is in checkmate
		if(WhiteKingE1.getActive()){
			ArrayList<int[]> MovementHandler = WhiteKingE1.movementHandler(WhiteKingE1.getCurrentPositionX(), WhiteKingE1.getCurrentPositionY(), WhiteKingE1.StartingPositionX, WhiteKingE1.StartingPositionY);
			
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White King (E1)")){
					return false;
				}
			}
		}
		
		if(WhiteRookA1.getActive()){
			ArrayList<int[]> MovementHandler = WhiteRookA1.movementHandler(WhiteRookA1.getCurrentPositionX(), WhiteRookA1.getCurrentPositionY(), WhiteRookA1.StartingPositionX, WhiteRookA1.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Rook (A1)")){
					return false;
				}
			}	
		}
		
		if(WhiteRookH1.getActive()){
			ArrayList<int[]> MovementHandler = WhiteRookH1.movementHandler(WhiteRookH1.getCurrentPositionX(), WhiteRookH1.getCurrentPositionY(), WhiteRookH1.StartingPositionX, WhiteRookH1.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Rook (H1)")){
					return false;
				}
			}	
		}
		if(WhiteQueenD1.getActive()){
			ArrayList<int[]> MovementHandler = WhiteQueenD1.movementHandler(WhiteQueenD1.getCurrentPositionX(), WhiteQueenD1.getCurrentPositionY(), WhiteQueenD1.StartingPositionX, WhiteQueenD1.StartingPositionY);
			
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Queen (D1)")){
					return false;
				}
			}
			
		}
		
		if(WhiteBishopC1.getActive()){
			ArrayList<int[]> MovementHandler = WhiteBishopC1.movementHandler(WhiteBishopC1.getCurrentPositionX(), WhiteBishopC1.getCurrentPositionY(), WhiteBishopC1.StartingPositionX, WhiteBishopC1.StartingPositionY);
			
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Bishop (C1)")){
					return false;
				}
			}
		}
		
		if(WhiteBishopF1.getActive()){
			ArrayList<int[]> MovementHandler = WhiteBishopF1.movementHandler(WhiteBishopF1.getCurrentPositionX(), WhiteBishopF1.getCurrentPositionY(), WhiteBishopF1.StartingPositionX, WhiteBishopF1.StartingPositionY);
			
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Bishop (F1)")){
					return false;
				}
			}
		}
		
		if(WhiteKnightB1.getActive()){
			ArrayList<int[]> MovementHandler = WhiteKnightB1.movementHandler(WhiteKnightB1.getCurrentPositionX(), WhiteKnightB1.getCurrentPositionY(), WhiteKnightB1.StartingPositionX, WhiteKnightB1.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Knight (B1)")){
					return false;
				}
			}	
		}
		if(WhiteKnightG1.getActive()){
			ArrayList<int[]> MovementHandler = WhiteKnightG1.movementHandler(WhiteKnightG1.getCurrentPositionX(), WhiteKnightG1.getCurrentPositionY(), WhiteKnightG1.StartingPositionX, WhiteKnightG1.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Knight (G1)")){
					return false;
				}
			}	
		}
		
		if(WhitePawnA2.getActive()){
		
			ArrayList<int[]> MovementHandler = WhitePawnA2.movementHandler(WhitePawnA2.getCurrentPositionX(), WhitePawnA2.getCurrentPositionY(), WhitePawnA2.StartingPositionX, WhitePawnA2.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Pawn (A2)")){
					return false;
				}
			}		
		}
		
		if(WhitePawnB2.getActive()){
			ArrayList<int[]> MovementHandler = WhitePawnB2.movementHandler(WhitePawnB2.getCurrentPositionX(), WhitePawnB2.getCurrentPositionY(), WhitePawnB2.StartingPositionX, WhitePawnB2.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Pawn (B2)")){
					return false;
				}
			}	
		}
		
		if(WhitePawnC2.getActive()){
			ArrayList<int[]> MovementHandler = WhitePawnC2.movementHandler(WhitePawnC2.getCurrentPositionX(), WhitePawnC2.getCurrentPositionY(), WhitePawnC2.StartingPositionX, WhitePawnC2.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Pawn (C2)")){
					return false;
				}
			}	
		}
		
		if(WhitePawnD2.getActive()){
			ArrayList<int[]> MovementHandler = WhitePawnD2.movementHandler(WhitePawnD2.getCurrentPositionX(), WhitePawnD2.getCurrentPositionY(), WhitePawnD2.StartingPositionX, WhitePawnD2.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Pawn (D2)")){
					return false;
				}
			}	
		}
		
		if(WhitePawnE2.getActive()){
			ArrayList<int[]> MovementHandler = WhitePawnE2.movementHandler(WhitePawnE2.getCurrentPositionX(), WhitePawnE2.getCurrentPositionY(), WhitePawnE2.StartingPositionX, WhitePawnE2.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Pawn (E2)")){
					return false;
				}
			}	
		}
		
		if(WhitePawnF2.getActive()){
			ArrayList<int[]> MovementHandler = WhitePawnF2.movementHandler(WhitePawnF2.getCurrentPositionX(), WhitePawnF2.getCurrentPositionY(), WhitePawnF2.StartingPositionX, WhitePawnF2.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Pawn (F2)")){
					return false;
				}
			}	
		}
		
		if(WhitePawnG2.getActive()){
			ArrayList<int[]> MovementHandler = WhitePawnG2.movementHandler(WhitePawnG2.getCurrentPositionX(), WhitePawnG2.getCurrentPositionY(), WhitePawnG2.StartingPositionX, WhitePawnG2.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Pawn (G2)")){
					return false;
				}
			}	
		}
		
		if(WhitePawnH2.getActive()){
			ArrayList<int[]> MovementHandler = WhitePawnH2.movementHandler(WhitePawnH2.getCurrentPositionX(), WhitePawnH2.getCurrentPositionY(), WhitePawnH2.StartingPositionX, WhitePawnH2.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Pawn (H2)")){
					return false;
				}
			}	
		}
		if(WhiteKnightProm1.getActive()){
			ArrayList<int[]> MovementHandler = WhiteKnightProm1.movementHandler(WhiteKnightProm1.getCurrentPositionX(), WhiteKnightProm1.getCurrentPositionY(), WhiteKnightProm1.StartingPositionX, WhiteKnightProm1.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Knight (Prom1)")){
					return false;
				}
			}	
		}
		if(WhiteKnightProm2.getActive()){
			ArrayList<int[]> MovementHandler = WhiteKnightProm2.movementHandler(WhiteKnightProm2.getCurrentPositionX(), WhiteKnightProm2.getCurrentPositionY(), WhiteKnightProm2.StartingPositionX, WhiteKnightProm2.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Knight (Prom2)")){
					return false;
				}
			}	
		}
		if(WhiteKnightProm3.getActive()){
			ArrayList<int[]> MovementHandler = WhiteKnightProm3.movementHandler(WhiteKnightProm3.getCurrentPositionX(), WhiteKnightProm3.getCurrentPositionY(), WhiteKnightProm3.StartingPositionX, WhiteKnightProm3.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Knight (Prom3)")){
					return false;
				}
			}	
		}
		if(WhiteKnightProm4.getActive()){
			ArrayList<int[]> MovementHandler = WhiteKnightProm4.movementHandler(WhiteKnightProm4.getCurrentPositionX(), WhiteKnightProm4.getCurrentPositionY(), WhiteKnightProm4.StartingPositionX, WhiteKnightProm4.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Knight (Prom4)")){
					return false;
				}
			}	
		}
		if(WhiteKnightProm5.getActive()){
			ArrayList<int[]> MovementHandler = WhiteKnightProm5.movementHandler(WhiteKnightProm5.getCurrentPositionX(), WhiteKnightProm5.getCurrentPositionY(), WhiteKnightProm5.StartingPositionX, WhiteKnightProm5.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Knight (Prom5)")){
					return false;
				}
			}	
		}
		if(WhiteKnightProm6.getActive()){
			ArrayList<int[]> MovementHandler = WhiteKnightProm6.movementHandler(WhiteKnightProm6.getCurrentPositionX(), WhiteKnightProm6.getCurrentPositionY(), WhiteKnightProm6.StartingPositionX, WhiteKnightProm6.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Knight (Prom6)")){
					return false;
				}
			}	
		}
		if(WhiteKnightProm7.getActive()){
			ArrayList<int[]> MovementHandler = WhiteKnightProm7.movementHandler(WhiteKnightProm7.getCurrentPositionX(), WhiteKnightProm7.getCurrentPositionY(), WhiteKnightProm7.StartingPositionX, WhiteKnightProm7.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Knight (Prom7)")){
					return false;
				}
			}	
		}
		if(WhiteKnightProm8.getActive()){
			ArrayList<int[]> MovementHandler = WhiteKnightProm8.movementHandler(WhiteKnightProm8.getCurrentPositionX(), WhiteKnightProm8.getCurrentPositionY(), WhiteKnightProm8.StartingPositionX, WhiteKnightProm8.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Knight (Prom8)")){
					return false;
				}
			}	
		}
		if(WhiteQueenProm1.getActive()){
			ArrayList<int[]> MovementHandler = WhiteQueenProm1.movementHandler(WhiteQueenProm1.getCurrentPositionX(), WhiteQueenProm1.getCurrentPositionY(), WhiteQueenProm1.StartingPositionX, WhiteQueenProm1.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Queen (Prom1)")){
					return false;
				}
			}	
		}
		if(WhiteQueenProm2.getActive()){
			ArrayList<int[]> MovementHandler = WhiteQueenProm2.movementHandler(WhiteQueenProm2.getCurrentPositionX(), WhiteQueenProm2.getCurrentPositionY(), WhiteQueenProm2.StartingPositionX, WhiteQueenProm2.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Queen (Prom2)")){
					return false;
				}
			}	
		}
		if(WhiteQueenProm3.getActive()){
			ArrayList<int[]> MovementHandler = WhiteQueenProm3.movementHandler(WhiteQueenProm3.getCurrentPositionX(), WhiteQueenProm3.getCurrentPositionY(), WhiteQueenProm3.StartingPositionX, WhiteQueenProm3.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Queen (Prom3)")){
					return false;
				}
			}	
		}
		if(WhiteQueenProm4.getActive()){
			ArrayList<int[]> MovementHandler = WhiteQueenProm4.movementHandler(WhiteQueenProm4.getCurrentPositionX(), WhiteQueenProm4.getCurrentPositionY(), WhiteQueenProm4.StartingPositionX, WhiteQueenProm4.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Queen (Prom4)")){
					return false;
				}
			}	
		}
		if(WhiteQueenProm5.getActive()){
			ArrayList<int[]> MovementHandler = WhiteQueenProm5.movementHandler(WhiteQueenProm5.getCurrentPositionX(), WhiteQueenProm5.getCurrentPositionY(), WhiteQueenProm5.StartingPositionX, WhiteQueenProm5.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Queen (Prom5)")){
					return false;
				}
			}	
		}
		if(WhiteQueenProm6.getActive()){
			ArrayList<int[]> MovementHandler = WhiteQueenProm6.movementHandler(WhiteQueenProm6.getCurrentPositionX(), WhiteQueenProm6.getCurrentPositionY(), WhiteQueenProm6.StartingPositionX, WhiteQueenProm6.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Queen (Prom6)")){
					return false;
				}
			}	
		}
		if(WhiteQueenProm7.getActive()){
			ArrayList<int[]> MovementHandler = WhiteQueenProm7.movementHandler(WhiteQueenProm7.getCurrentPositionX(), WhiteQueenProm7.getCurrentPositionY(), WhiteQueenProm7.StartingPositionX, WhiteQueenProm7.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Queen (Prom7)")){
					return false;
				}
			}	
		}
		if(WhiteQueenProm8.getActive()){
			ArrayList<int[]> MovementHandler = WhiteQueenProm8.movementHandler(WhiteQueenProm8.getCurrentPositionX(), WhiteQueenProm8.getCurrentPositionY(), WhiteQueenProm8.StartingPositionX, WhiteQueenProm8.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Queen (Prom8)")){
					return false;
				}
			}	
		}
		if(WhiteBishopProm1.getActive()){
			ArrayList<int[]> MovementHandler = WhiteBishopProm1.movementHandler(WhiteBishopProm1.getCurrentPositionX(), WhiteBishopProm1.getCurrentPositionY(), WhiteBishopProm1.StartingPositionX, WhiteBishopProm1.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Bishop (Prom1)")){
					return false;
				}
			}	
		}
		if(WhiteBishopProm2.getActive()){
			ArrayList<int[]> MovementHandler = WhiteBishopProm2.movementHandler(WhiteBishopProm2.getCurrentPositionX(), WhiteBishopProm2.getCurrentPositionY(), WhiteBishopProm2.StartingPositionX, WhiteBishopProm2.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Bishop (Prom2)")){
					return false;
				}
			}	
		}
		if(WhiteBishopProm2.getActive()){
			ArrayList<int[]> MovementHandler = WhiteBishopProm2.movementHandler(WhiteBishopProm2.getCurrentPositionX(), WhiteBishopProm2.getCurrentPositionY(), WhiteBishopProm2.StartingPositionX, WhiteBishopProm2.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Bishop (Prom2)")){
					return false;
				}
			}	
		}
		if(WhiteBishopProm3.getActive()){
			ArrayList<int[]> MovementHandler = WhiteBishopProm3.movementHandler(WhiteBishopProm3.getCurrentPositionX(), WhiteBishopProm3.getCurrentPositionY(), WhiteBishopProm3.StartingPositionX, WhiteBishopProm3.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Bishop (Prom3)")){
					return false;
				}
			}	
		}
		if(WhiteBishopProm4.getActive()){
			ArrayList<int[]> MovementHandler = WhiteBishopProm4.movementHandler(WhiteBishopProm4.getCurrentPositionX(), WhiteBishopProm4.getCurrentPositionY(), WhiteBishopProm4.StartingPositionX, WhiteBishopProm4.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Bishop (Prom4)")){
					return false;
				}
			}	
		}
		if(WhiteBishopProm5.getActive()){
			ArrayList<int[]> MovementHandler = WhiteBishopProm5.movementHandler(WhiteBishopProm5.getCurrentPositionX(), WhiteBishopProm5.getCurrentPositionY(), WhiteBishopProm5.StartingPositionX, WhiteBishopProm5.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Bishop (Prom5)")){
					return false;
				}
			}	
		}
		if(WhiteBishopProm6.getActive()){
			ArrayList<int[]> MovementHandler = WhiteBishopProm6.movementHandler(WhiteBishopProm6.getCurrentPositionX(), WhiteBishopProm6.getCurrentPositionY(), WhiteBishopProm6.StartingPositionX, WhiteBishopProm6.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Bishop (Prom6)")){
					return false;
				}
			}	
		}
		if(WhiteBishopProm7.getActive()){
			ArrayList<int[]> MovementHandler = WhiteBishopProm7.movementHandler(WhiteBishopProm7.getCurrentPositionX(), WhiteBishopProm7.getCurrentPositionY(), WhiteBishopProm7.StartingPositionX, WhiteBishopProm7.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Bishop (Prom7)")){
					return false;
				}
			}	
		}
		if(WhiteBishopProm8.getActive()){
			ArrayList<int[]> MovementHandler = WhiteBishopProm8.movementHandler(WhiteBishopProm8.getCurrentPositionX(), WhiteBishopProm8.getCurrentPositionY(), WhiteBishopProm8.StartingPositionX, WhiteBishopProm8.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Bishop (Prom8)")){
					return false;
				}
			}	
		}
		if(WhiteRookProm1.getActive()){
			ArrayList<int[]> MovementHandler = WhiteRookProm1.movementHandler(WhiteRookProm1.getCurrentPositionX(), WhiteRookProm1.getCurrentPositionY(), WhiteRookProm1.StartingPositionX, WhiteRookProm1.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Rook (Prom1)")){
					return false;
				}
			}	
		}
		if(WhiteRookProm2.getActive()){
			ArrayList<int[]> MovementHandler = WhiteRookProm2.movementHandler(WhiteRookProm2.getCurrentPositionX(), WhiteRookProm2.getCurrentPositionY(), WhiteRookProm2.StartingPositionX, WhiteRookProm2.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Rook (Prom2)")){
					return false;
				}
			}	
		}
		if(WhiteRookProm3.getActive()){
			ArrayList<int[]> MovementHandler = WhiteRookProm3.movementHandler(WhiteRookProm3.getCurrentPositionX(), WhiteRookProm3.getCurrentPositionY(), WhiteRookProm3.StartingPositionX, WhiteRookProm3.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Rook (Prom3)")){
					return false;
				}
			}	
		}
		if(WhiteRookProm4.getActive()){
			ArrayList<int[]> MovementHandler = WhiteRookProm4.movementHandler(WhiteRookProm4.getCurrentPositionX(), WhiteRookProm4.getCurrentPositionY(), WhiteRookProm4.StartingPositionX, WhiteRookProm4.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Rook (Prom4)")){
					return false;
				}
			}	
		}
		if(WhiteRookProm5.getActive()){
			ArrayList<int[]> MovementHandler = WhiteRookProm5.movementHandler(WhiteRookProm5.getCurrentPositionX(), WhiteRookProm5.getCurrentPositionY(), WhiteRookProm5.StartingPositionX, WhiteRookProm5.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Rook (Prom5)")){
					return false;
				}
			}	
		}
		if(WhiteRookProm6.getActive()){
			ArrayList<int[]> MovementHandler = WhiteRookProm6.movementHandler(WhiteRookProm6.getCurrentPositionX(), WhiteRookProm6.getCurrentPositionY(), WhiteRookProm6.StartingPositionX, WhiteRookProm6.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Rook (Prom6)")){
					return false;
				}
			}	
		}
		if(WhiteRookProm7.getActive()){
			ArrayList<int[]> MovementHandler = WhiteRookProm7.movementHandler(WhiteRookProm7.getCurrentPositionX(), WhiteRookProm7.getCurrentPositionY(), WhiteRookProm7.StartingPositionX, WhiteRookProm7.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Rook (Prom7)")){
					return false;
				}
			}	
		}
		if(WhiteRookProm8.getActive()){
			ArrayList<int[]> MovementHandler = WhiteRookProm8.movementHandler(WhiteRookProm8.getCurrentPositionX(), WhiteRookProm8.getCurrentPositionY(), WhiteRookProm8.StartingPositionX, WhiteRookProm8.StartingPositionY);
			for (int [] i: MovementHandler){
				if(!Superclass_WhiteKing.isWhiteKingInCheck(i, "White Rook (Prom8)")){
					return false;
				}
			}	
		}
		return true;

	}
	static ArrayList<int[]> searcherTopTiles(ArrayList<int[]> MoveList, int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this King top tiles
			
		int [] NewXY = new int[2];
		
		NewXY[0] = CurrentX + 0;
		NewXY[1] = CurrentY - 1;
		
		if(NewXY[1] < 0){
			return MoveList;
		}

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a valid black piece to kill " + 1 + " tiles top of this King");
				MoveList.add(NewXY);
				return MoveList;
			}			    				
		}
		
		for (int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a white piece " + 1 + " tiles top of this King");
				return MoveList;
			}		
		}	

		MoveList.add(NewXY);
		
		return MoveList;
	}	
	static ArrayList<int[]> searcherLeftTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this King left tiles
		
	
		int [] NewXY = new int[2];	
		
		NewXY[0] = CurrentX - 1;
		NewXY[1] = CurrentY + 0;
		
		if(NewXY[0] < 0){
			return MoveList;
		}
		

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a valid black piece to kill " + 1 + " tiles left of this King");
				MoveList.add(NewXY);
				return MoveList;
			}			    				
		}
		for (int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a white piece " + 1 + " tiles left of this King");
				return MoveList;
			}		
		}	
		MoveList.add(NewXY);
		
	return MoveList;
	}
	static ArrayList<int[]> searcherBottomTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this King left tiles
		
		
		int [] NewXY = new int[2];
		NewXY[0] = CurrentX + 0;
		NewXY[1] = CurrentY + 1;
		
		if(NewXY[1] > 7){
			return MoveList;
		}

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a valid blacks piece to kill " + 1 + " tiles bottom of this King");
				MoveList.add(NewXY);
				return MoveList;
			}		    				
		}

		for (int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a white piece " + 1 + " tiles bottom  of this King");
				return MoveList;
			}		
		}	
		MoveList.add(NewXY);
		
		return MoveList;
	}
	static ArrayList<int[]> searcherRightTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this King left tiles
		
		
		int [] NewXY = new int[2];	
		NewXY[0] = CurrentX + 1;
		NewXY[1] = CurrentY + 0;
		
		if(NewXY[0] > 7){
			return MoveList;
		}
		

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a valid black piece to kill " + 1 + " tiles right of this King");
				MoveList.add(NewXY);
				return MoveList;
			}		    				
		}
		for (int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a white piece " + 1 + " tiles right of this King");
				return MoveList;
			}		
		}	
		MoveList.add(NewXY);
			
		return MoveList;
	}
	static ArrayList<int[]> searcherTopLeftTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this rook top tiles
		
		
		int [] NewXY = new int[2];
		NewXY[0] = CurrentX - 1;
		NewXY[1] = CurrentY - 1;
		
		if(NewXY[0] < 0 || NewXY[1] < 0){
			return MoveList;
		}
		

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a valid black piece to kill " + 1 + " tiles top left of this King");
				MoveList.add(NewXY);
				return MoveList;
			}		    				
		}
		for (int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a white piece " + 1 + " tiles top left of this King");
				return MoveList;
			}		
		}	
		MoveList.add(NewXY);
	
		return MoveList;
	}	
	static ArrayList<int[]> searcherTopRightTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this rook left tiles
		
		int [] NewXY = new int[2];	
		NewXY[0] = CurrentX + 1;
		NewXY[1] = CurrentY - 1;
		
		if(NewXY[0] > 7 || NewXY[1] < 0){
			return MoveList;
		}
		

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a valid black piece to kill " + 1 + " tiles top right of this King");
				MoveList.add(NewXY);
				return MoveList;
			}	    				
		}
		for (int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a white piece " + 1 + " tiles top right of this King");
				return MoveList;
			}		
		}	
		MoveList.add(NewXY);	
		return MoveList;
	}
	static ArrayList<int[]> searcherBottomLeftTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this rook left tiles	
		
		int [] NewXY = new int[2];
		NewXY[0] = CurrentX - 1;
		NewXY[1] = CurrentY + 1;
		
		if(NewXY[0] < 0 || NewXY[1] > 7){
			return MoveList;
		}
		

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a valid blacks piece to kill " + 1 + " tiles bottom left of this King");
				MoveList.add(NewXY);
				return MoveList;
			}	    				
		}
		for (int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a white piece " + 1 + " tiles bottom left of this King");
				return MoveList;
			}		
		}	
		MoveList.add(NewXY);
		return MoveList;
	}
	static ArrayList<int[]> searcherBottomRightTiles(ArrayList<int[]> MoveList,int CurrentX, int CurrentY){
		//this function looks for black pieces blocking this rook left tiles

		int [] NewXY = new int[2];	
		NewXY[0] = CurrentX + 1;
		NewXY[1] = CurrentY + 1;
		
		if(NewXY[0] > 7 || NewXY[1] > 7){
			return MoveList;
		}
		

		for(int [] i: aggregateBlacks()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a valid black piece to kill " + 1 + " tiles bottom right of this King");
				MoveList.add(NewXY);
				return MoveList;
			}	    				
		}
		for (int [] i: aggregateWhites()){
			int[] Coordinate = i;
			if(Arrays.equals(Coordinate, NewXY)){
				//System.out.println("We have found a white piece " + 1 + " tiles bottom right of this King");
				return MoveList;
			}		
		}	
		MoveList.add(NewXY);
		return MoveList;
	}

}
