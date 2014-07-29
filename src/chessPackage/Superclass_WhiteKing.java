package chessPackage;

import java.net.URL;
import java.util.Arrays;

import javax.swing.ImageIcon;

public class Superclass_WhiteKing extends WhitePiece {
	static ImageIcon getIcon(){
		URL White_King_URL = Chess.class.getResource("chess_piece_white_king.png");
		ImageIcon White_King_Icon = new ImageIcon(White_King_URL);
		return White_King_Icon;
	}

	static int[][] movementHandler(int CurrentX, int CurrentY,int StartingPositionX, int StartingPositionY){

		int [][]MultiArray = new int[10][2];
		MultiArray[0]=null;
		MultiArray[1]=null;
		MultiArray[2]=null;
		MultiArray[3]=null;
		MultiArray[4]=null;
		MultiArray[5]=null;
		MultiArray[6]=null;
		MultiArray[7]=null;

		
		//this looks for possibles kills
		MultiArray= killSearcher(MultiArray,CurrentX,CurrentY); //XY2,XY3

		//this looks for all possible moves.
		MultiArray=searcherOneTile(MultiArray,CurrentX,CurrentY); //XY1
		
		//this looks for castle left rook side
		MultiArray=castleLeftSide(MultiArray,CurrentX,CurrentY);
		MultiArray=castleRightSide(MultiArray,CurrentX,CurrentY);
		return MultiArray;
	}
	static int [][] castleRightSide(int[][] MultiArray, int CurrentX, int CurrentY){
		if(WhiteKingE1.getFirstStrike() == true && WhiteRookH1.getFirstStrike() == true){

			int [] ComXY = {4,7};
			if(WhiteKingE1.isWhiteKingInCheck(ComXY, "White King (E1)")){
				//cannot castle out of check
				System.out.println("Cannot right castle out of check");
				MultiArray[9] = null;
				return MultiArray;
			}
			
			
			int [] NewXY=new int[2];
			NewXY[0] = 5;
			NewXY[1] = 7;
			int [] NewXY2=new int[2];
			NewXY2[0] = 6;
			NewXY2[1] = 7;

			//loop through all blacks
			for(int i = 0 ; i < aggregateBlacks().length ; i++) {
				int[] Coordinate = aggregateBlacks()[i];
				
				if(Arrays.equals(Coordinate, NewXY)){
					MultiArray[9] = null;
					return MultiArray;
				}
				if(Arrays.equals(Coordinate, NewXY2)){
					MultiArray[9] = null;
					return MultiArray;
				}	
	
			}
			//loop through all whites
			for(int i = 0 ; i < aggregateWhites().length ; i++) {
				int[] Coordinate = aggregateWhites()[i];
				
				if(Arrays.equals(Coordinate, NewXY)){
					MultiArray[9] = null;
					return MultiArray;
				}
				if(Arrays.equals(Coordinate, NewXY2)){	
					MultiArray[9] = null;
					return MultiArray;
				}	

			}	
			//right side castle is possible. Add possible movement to MultiArray
			MultiArray[9][0] = 6;	
			MultiArray[9][1] = 7;
			Chess.ActivateWhiteRightCastle = true;
			return MultiArray;
		}
		//else right side castle is not possible. Add nulls movement to MultiArray
		MultiArray[9] = null;
		return MultiArray;
	}

	static int [][] castleLeftSide(int[][] MultiArray, int CurrentX, int CurrentY){
		int [] ComXY = {4,7};
		if(WhiteKingE1.isWhiteKingInCheck(ComXY, "White King (E1)")){
			//cannot castle out of check
			System.out.println("Cannot left castle out of check");
			MultiArray[8] = null;
			return MultiArray;
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
				for(int i = 0 ; i < aggregateBlacks().length ; i++) {
					int[] Coordinate = aggregateBlacks()[i];
					
					if(Arrays.equals(Coordinate, NewXY)){
						MultiArray[8] = null;
						return MultiArray;
					}
					if(Arrays.equals(Coordinate, NewXY2)){
						MultiArray[8] = null;
						return MultiArray;
					}	
					if(Arrays.equals(Coordinate, NewXY3)){
						MultiArray[8] = null;
						return MultiArray;
					}	
				}
				//loop through all whites
				for(int i = 0 ; i < aggregateWhites().length ; i++) {
					int[] Coordinate = aggregateWhites()[i];
					
					if(Arrays.equals(Coordinate, NewXY)){
						MultiArray[8] = null;
						return MultiArray;
					}
					if(Arrays.equals(Coordinate, NewXY2)){	
						MultiArray[8] = null;
						return MultiArray;
					}	
					if(Arrays.equals(Coordinate, NewXY3)){
						MultiArray[8] = null;
						return MultiArray;
					}	
				}	
				//left side castle is possible. Add possible movement to MultiArray
				MultiArray[8][0] = 2;	
				MultiArray[8][1] = 7;
				Chess.ActivateWhiteLeftCastle = true;
				return MultiArray;
			}
		
		//else left side castle is not possible. Add nulls movement to MultiArray
		MultiArray[8] = null;
		return MultiArray;
	}
	static int [][] killSearcher( int[][]MultiArray,int CurrentX, int CurrentY){
		//this function looks for a black piece to kill
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
		//this function looks for a white piece 1 tile in front or anywhere
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
		
		for(int i = 0 ; i < aggregateWhites().length ; i++) {
			int[] Coordinate = aggregateWhites()[i];
			if(Arrays.equals(Coordinate, NewXY)){
				System.out.println("We have found a white piece interrupting this king");
				return MultiArray;
				//gotta exit out of this function
			}		    			  
		}
		MultiArray[j]=NewXY;
		return MultiArray;
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
				System.out.println("White King threatining check");
				MultiArray[i]=null;
				
				break;  
			}		    			  
		}

		
		NewXY2[0]=CurrentX+0;
		NewXY2[1]=CurrentY-1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY2)){
				System.out.println("White King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY3[0]=CurrentX+1;
		NewXY3[1]=CurrentY-0;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY3)){
				System.out.println("White King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY4[0]=CurrentX-1;
		NewXY4[1]=CurrentY+0;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY4)){
				System.out.println("White King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY5[0]=CurrentX+1;
		NewXY5[1]=CurrentY+1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY5)){
				System.out.println("White King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY6[0]=CurrentX-1;
		NewXY6[1]=CurrentY-1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY6)){
				System.out.println("White King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY7[0]=CurrentX+1;
		NewXY7[1]=CurrentY-1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY7)){
				System.out.println("White King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY8[0]=CurrentX-1;
		NewXY8[1]=CurrentY+1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY8)){
				System.out.println("White King threatining check");
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
		//toDO
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
	

	
	static int[][] movementKillEngine(int[] NewXY,int[][]MultiArray, int j){
		for(int i = 0 ; i < aggregateBlacks().length ; i++) {
			int[] Coordinate = aggregateBlacks()[i];
			if(Arrays.equals(Coordinate, NewXY)){
				System.out.println("We have found a valid black piece to kill");
				MultiArray[j]=NewXY;
			}		    			  
		}

		return MultiArray;
	}
}
