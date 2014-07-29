package chessPackage;

import java.net.URL;
import java.util.Arrays;

import javax.swing.ImageIcon;

public class Superclass_BlackKing extends BlackPiece {
	static ImageIcon getIcon(){
		URL Black_King_URL = Chess.class.getResource("chess_piece_black_king.png");
		ImageIcon Black_King_Icon = new ImageIcon(Black_King_URL);
		return Black_King_Icon;
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

		MultiArray= killSearcher(MultiArray,CurrentX,CurrentY); //XY2,XY3
		MultiArray=searcherOneTile(MultiArray,CurrentX,CurrentY); //XY1
		
		//this looks for castle left rook side
		MultiArray=castleLeftSide(MultiArray,CurrentX,CurrentY);
		MultiArray=castleRightSide(MultiArray,CurrentX,CurrentY);
		return MultiArray;
	}
	
	static int [][] castleRightSide(int[][] MultiArray, int CurrentX, int CurrentY){
		if(BlackKingE8.getFirstStrike() == true && BlackRookH8.getFirstStrike() == true){
			int [] ComXY = {4,0};
			if(BlackKingE8.isBlackKingInCheck(ComXY, "Black King (E8)")){
				//cannot castle out of check
				System.out.println("Cannot right castle out of check");
				MultiArray[9] = null;
				return MultiArray;
			}
			int [] NewXY=new int[2];
			NewXY[0] = 5;
			NewXY[1] = 0;
			int [] NewXY2=new int[2];
			NewXY2[0] = 6;
			NewXY2[1] = 0;

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
			MultiArray[9][1] = 0;
			Chess.ActivateBlackRightCastle = true;
			return MultiArray;
		}
		//else right side castle is not possible. Add nulls movement to MultiArray
		MultiArray[9] = null;
		return MultiArray;
	}

	static int [][] castleLeftSide(int[][] MultiArray, int CurrentX, int CurrentY){
		
		if(BlackKingE8.getFirstStrike() == true && BlackRookA8.getFirstStrike() == true){
			int [] ComXY = {4,0};
			if(BlackKingE8.isBlackKingInCheck(ComXY, "Black King (E8)")){
				//cannot castle out of check
				System.out.println("Cannot left castle out of check");
				MultiArray[8] = null;
				return MultiArray;
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
				MultiArray[8][1] = 0;
				Chess.ActivateBlackLeftCastle = true;
				return MultiArray;
			}
		
		//else left side castle is not possible. Add nulls movement to MultiArray
		MultiArray[8] = null;
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
		for(int i = 0 ; i < aggregateBlacks().length ; i++) {
			int[] Coordinate = aggregateBlacks()[i];
			if(Arrays.equals(Coordinate, NewXY)){
				System.out.println("We have found a black piece interrupting this king");
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
				System.out.println("Black King threatining check");
				MultiArray[i]=null;
				
				break;  
			}		    			  
		}
		
		
		NewXY2[0]=CurrentX+0;
		NewXY2[1]=CurrentY-1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY2)){
				System.out.println("Black King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY3[0]=CurrentX+1;
		NewXY3[1]=CurrentY-0;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY3)){
				System.out.println("Black King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY4[0]=CurrentX-1;
		NewXY4[1]=CurrentY+0;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY4)){
				System.out.println("Black King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY5[0]=CurrentX+1;
		NewXY5[1]=CurrentY+1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY5)){
				System.out.println("Black King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY6[0]=CurrentX-1;
		NewXY6[1]=CurrentY-1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY6)){
				System.out.println("Black King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY7[0]=CurrentX+1;
		NewXY7[1]=CurrentY-1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY7)){
				System.out.println("Black King threatining check");
				MultiArray[i]=null;
				break;  
			}		    			  
		}
		
		NewXY8[0]=CurrentX-1;
		NewXY8[1]=CurrentY+1;
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			
			if(Arrays.equals(MultiArray[i],NewXY8)){
				System.out.println("Black King threatining check");
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
	static int[][] movementKillEngine(int[] NewXY,int[][]MultiArray, int j){
		for(int i = 0 ; i < aggregateWhites().length ; i++) {
			int[] Coordinate = aggregateWhites()[i];
			if(Arrays.equals(Coordinate, NewXY)){
				System.out.println("We have found a valid white piece to kill");
				MultiArray[j]=NewXY;
			}		    			  
		}

		return MultiArray;
	}
}