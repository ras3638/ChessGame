package chessPackage;

import java.util.Arrays;

import javax.swing.JButton;

public class BlackPiece {
	public static String getColor(){
		String Color = "Black";
		return Color;
	}
	public static boolean pawnPromotion(int Y, String CurrentTitle){
		//returns true if a black pawn has been promoted
		if(CurrentTitle == "Black Pawn (H7)"){
			if(Y==7){
				BlackPawnH7.setCurrentPositionX(-1);
				BlackPawnH7.setCurrentPositionY(-1);
				BlackPawnH7.setCurrentPositionXY(-1,-1);
				System.out.println("Black Pawn (H7) has been promoted");
				return true;
			}
		}
		if(CurrentTitle == "Black Pawn (G7)"){
			if(Y==7){
				BlackPawnG7.setCurrentPositionX(-1);
				BlackPawnG7.setCurrentPositionY(-1);
				BlackPawnG7.setCurrentPositionXY(-1,-1);
				System.out.println("Black Pawn (G7) has been promoted");
				return true;
			}
		}
		if(CurrentTitle == "Black Pawn (F7)"){
			if(Y==7){
				BlackPawnF7.setCurrentPositionX(-1);
				BlackPawnF7.setCurrentPositionY(-1);
				BlackPawnF7.setCurrentPositionXY(-1,-1);
				System.out.println("Black Pawn (F7) has been promoted");
				return true;
			}
		}
		if(CurrentTitle == "Black Pawn (E7)"){
			if(Y==7){
				BlackPawnE7.setCurrentPositionX(-1);
				BlackPawnE7.setCurrentPositionY(-1);
				BlackPawnE7.setCurrentPositionXY(-1,-1);
				System.out.println("Black Pawn (E7) has been promoted");
				return true;
			}
		}
		if(CurrentTitle == "Black Pawn (D7)"){
			if(Y==7){
				BlackPawnD7.setCurrentPositionX(-1);
				BlackPawnD7.setCurrentPositionY(-1);
				BlackPawnD7.setCurrentPositionXY(-1,-1);
				System.out.println("Black Pawn (D7) has been promoted");
				return true;
			}
		}
		if(CurrentTitle == "Black Pawn (C7)"){
			if(Y==7){
				BlackPawnC7.setCurrentPositionX(-1);
				BlackPawnC7.setCurrentPositionY(-1);
				BlackPawnC7.setCurrentPositionXY(-1,-1);
				System.out.println("Black Pawn (C7) has been promoted");
				return true;
			}
		}
		if(CurrentTitle == "Black Pawn (B7)"){
			if(Y==7){
				BlackPawnB7.setCurrentPositionX(-1);
				BlackPawnB7.setCurrentPositionY(-1);
				BlackPawnB7.setCurrentPositionXY(-1,-1);
				System.out.println("Black Pawn (B7) has been promoted");
				return true;
			}
		}
		if(CurrentTitle == "Black Pawn (A7)"){
			if(Y==7){
				BlackPawnA7.setCurrentPositionX(-1);
				BlackPawnA7.setCurrentPositionY(-1);
				BlackPawnA7.setCurrentPositionXY(-1,-1);
				System.out.println("Black Pawn (A7) has been promoted");
				return true;
			}
		}

		return false;
		
		
	}
	public static void updateEnPassatKill(int CurrentX, int CurrentY){
		int [] CurrentXY = new int[2];
		CurrentXY[0] = CurrentX + 0;
		CurrentXY[1] = CurrentY - 1;

		if(WhitePawnA2.getEnPassant() && Arrays.equals(CurrentXY, WhitePawnA2.getCurrentPositionXY())){
			
			WhitePawnA2.setCurrentPositionXY(-1,-1);
			WhitePawnA2.setCurrentPositionX(-1);
			WhitePawnA2.setCurrentPositionY(-1);
			WhitePawnA2.setActive(false);
			Chess.bA4.setIcon(null);
			System.out.println("White Pawn (A2) has been killed");

			return;
		}
		if(WhitePawnB2.getEnPassant() && Arrays.equals(CurrentXY, WhitePawnB2.getCurrentPositionXY())){
			WhitePawnB2.setCurrentPositionXY(-1,-1);
			WhitePawnB2.setCurrentPositionX(-1);
			WhitePawnB2.setCurrentPositionY(-1);
			WhitePawnB2.setActive(false);
			Chess.bB4.setIcon(null);
			System.out.println("White Pawn (B2) has been killed");
			return;
		}
		if(WhitePawnC2.getEnPassant() && Arrays.equals(CurrentXY, WhitePawnC2.getCurrentPositionXY())){
			WhitePawnC2.setCurrentPositionXY(-1,-1);
			WhitePawnC2.setCurrentPositionX(-1);
			WhitePawnC2.setCurrentPositionY(-1);
			WhitePawnC2.setActive(false);
			Chess.bC4.setIcon(null);
			System.out.println("White Pawn (C2) has been killed");
			return;
		}
		if(WhitePawnD2.getEnPassant() && Arrays.equals(CurrentXY, WhitePawnD2.getCurrentPositionXY())){
			
			WhitePawnD2.setCurrentPositionXY(-1,-1);
			WhitePawnD2.setCurrentPositionX(-1);
			WhitePawnD2.setCurrentPositionY(-1);
			WhitePawnD2.setActive(false);
			Chess.bD4.setIcon(null);
			System.out.println("White Pawn (D2) has been killed");

			return;
		}
		if(WhitePawnE2.getEnPassant() && Arrays.equals(CurrentXY, WhitePawnE2.getCurrentPositionXY())){
			
			WhitePawnE2.setCurrentPositionXY(-1,-1);
			WhitePawnE2.setCurrentPositionX(-1);
			WhitePawnE2.setCurrentPositionY(-1);
			WhitePawnE2.setActive(false);
			Chess.bE4.setIcon(null);
			System.out.println("White Pawn (E2) has been killed");

			return;
		}
		if(WhitePawnF2.getEnPassant() && Arrays.equals(CurrentXY, WhitePawnF2.getCurrentPositionXY())){
			
			WhitePawnF2.setCurrentPositionXY(-1,-1);
			WhitePawnF2.setCurrentPositionX(-1);
			WhitePawnF2.setCurrentPositionY(-1);
			WhitePawnF2.setActive(false);
			Chess.bF4.setIcon(null);
			System.out.println("White Pawn (F2) has been killed");

			return;
		}
		if(WhitePawnG2.getEnPassant() && Arrays.equals(CurrentXY, WhitePawnG2.getCurrentPositionXY())){
			
			WhitePawnG2.setCurrentPositionXY(-1,-1);
			WhitePawnG2.setCurrentPositionX(-1);
			WhitePawnG2.setCurrentPositionY(-1);
			WhitePawnG2.setActive(false);
			Chess.bG4.setIcon(null);
			System.out.println("White Pawn (G2) has been killed");

			return;
		}
		if(WhitePawnH2.getEnPassant() && Arrays.equals(CurrentXY, WhitePawnH2.getCurrentPositionXY())){
			
			WhitePawnH2.setCurrentPositionXY(-1,-1);
			WhitePawnH2.setCurrentPositionX(-1);
			WhitePawnH2.setCurrentPositionY(-1);
			WhitePawnH2.setActive(false);
			Chess.bH4.setIcon(null);
			System.out.println("White Pawn (H2) has been killed");

			return;
		}
	}
	
	public static void updateKill(int[]CurrentXY){
		if(Arrays.equals(CurrentXY, WhitePawnH2.getCurrentPositionXY())){
			WhitePawnH2.setCurrentPositionXY(-1,-1);
			WhitePawnH2.setCurrentPositionX(-1);
			WhitePawnH2.setCurrentPositionY(-1);
			WhitePawnH2.setActive(false);
			System.out.println("White Pawn (H2) has been killed");
			return;
	}
		if(Arrays.equals(CurrentXY, WhitePawnG2.getCurrentPositionXY())){
			WhitePawnG2.setCurrentPositionXY(-1,-1);
			WhitePawnG2.setCurrentPositionX(-1);
			WhitePawnG2.setCurrentPositionY(-1);
			WhitePawnG2.setActive(false);
			System.out.println("White Pawn (G2) has been killed");
			return;
	}
		if(Arrays.equals(CurrentXY, WhitePawnF2.getCurrentPositionXY())){
			WhitePawnF2.setCurrentPositionXY(-1,-1);
			WhitePawnF2.setCurrentPositionX(-1);
			WhitePawnF2.setCurrentPositionY(-1);
			WhitePawnF2.setActive(false);
			System.out.println("White Pawn (F2) has been killed");
			return;
	}
		if(Arrays.equals(CurrentXY, WhitePawnE2.getCurrentPositionXY())){
			WhitePawnE2.setCurrentPositionXY(-1,-1);
			WhitePawnE2.setCurrentPositionX(-1);
			WhitePawnE2.setCurrentPositionY(-1);
			WhitePawnE2.setActive(false);
			System.out.println("White Pawn (E2) has been killed");
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteKnightG1.getCurrentPositionXY())){
			WhiteKnightG1.setCurrentPositionXY(-1,-1);
			WhiteKnightG1.setCurrentPositionX(-1);
			WhiteKnightG1.setCurrentPositionY(-1);
			WhiteKnightG1.setActive(false);
			System.out.println("White Knight (G1) has been killed");
			return;
	}	
		if(Arrays.equals(CurrentXY, WhiteBishopF1.getCurrentPositionXY())){
			WhiteBishopF1.setCurrentPositionXY(-1,-1);
			WhiteBishopF1.setCurrentPositionX(-1);
			WhiteBishopF1.setCurrentPositionY(-1);
			WhiteBishopF1.setActive(false);
			System.out.println("White Bishop (F1) has been killed");
			return;
	}	
		if(Arrays.equals(CurrentXY, WhiteRookH1.getCurrentPositionXY())){
			WhiteRookH1.setCurrentPositionXY(-1,-1);
			WhiteRookH1.setCurrentPositionX(-1);
			WhiteRookH1.setCurrentPositionY(-1);
			WhiteRookH1.setActive(false);
			System.out.println("White Rook (H1) has been killed");
			return;
	}	
		if(Arrays.equals(CurrentXY, WhitePawnD2.getCurrentPositionXY())){
			WhitePawnD2.setCurrentPositionXY(-1,-1);
			WhitePawnD2.setCurrentPositionX(-1);
			WhitePawnD2.setCurrentPositionY(-1);
			WhitePawnD2.setActive(false);
			System.out.println("White Pawn (D2) has been killed");
			return;
	}
		if(Arrays.equals(CurrentXY, WhitePawnB2.getCurrentPositionXY())){
			WhitePawnB2.setCurrentPositionXY(-1,-1);
			WhitePawnB2.setCurrentPositionX(-1);
			WhitePawnB2.setCurrentPositionY(-1);
			WhitePawnB2.setActive(false);
			System.out.println("White Pawn (B2) has been killed");
			return;
	}
		if(Arrays.equals(CurrentXY, WhitePawnA2.getCurrentPositionXY())){
			WhitePawnA2.setCurrentPositionXY(-1,-1);
			WhitePawnA2.setCurrentPositionX(-1);
			WhitePawnA2.setCurrentPositionY(-1);
			WhitePawnA2.setActive(false);
			System.out.println("White Pawn (A2) has been killed");
			return;
		
	}
		if(Arrays.equals(CurrentXY, WhiteKingE1.getCurrentPositionXY())){
			WhiteKingE1.setCurrentPositionXY(-1,-1);
			WhiteKingE1.setCurrentPositionX(-1);
			WhiteKingE1.setCurrentPositionY(-1);
			WhiteKingE1.setActive(false);
			System.out.println("White King (E1) has been killed");
			return;
		
	}
		
		if(Arrays.equals(CurrentXY, WhiteKnightB1.getCurrentPositionXY())){
			WhiteKnightB1.setCurrentPositionXY(-1,-1);
			WhiteKnightB1.setCurrentPositionX(-1);
			WhiteKnightB1.setCurrentPositionY(-1);
			WhiteKnightB1.setActive(false);
			System.out.println("White Knight (B1) has been killed");
			return;
		
	}
		if(Arrays.equals(CurrentXY, WhitePawnC2.getCurrentPositionXY())){
			WhitePawnC2.setCurrentPositionXY(-1,-1);
			WhitePawnC2.setCurrentPositionX(-1);
			WhitePawnC2.setCurrentPositionY(-1);
			WhitePawnC2.setActive(false);
			System.out.println("White Pawn (C2) has been killed");
			return;
		
	}
		if(Arrays.equals(CurrentXY, WhiteRookA1.getCurrentPositionXY())){
			WhiteRookA1.setCurrentPositionXY(-1,-1);
			WhiteRookA1.setCurrentPositionX(-1);
			WhiteRookA1.setCurrentPositionY(-1);
			WhiteRookA1.setActive(false);
			System.out.println("White Rook (A1) has been killed");
			return;
		
	}
		if(Arrays.equals(CurrentXY, WhiteBishopC1.getCurrentPositionXY())){
			WhiteBishopC1.setCurrentPositionXY(-1,-1);
			WhiteBishopC1.setCurrentPositionX(-1);
			WhiteBishopC1.setCurrentPositionY(-1);
			WhiteBishopC1.setActive(false);
			System.out.println("White Bishop (C1) has been killed");
			return;
		
	}
		if(Arrays.equals(CurrentXY, WhiteQueenD1.getCurrentPositionXY())){
			WhiteQueenD1.setCurrentPositionXY(-1,-1);
			WhiteQueenD1.setCurrentPositionX(-1);
			WhiteQueenD1.setCurrentPositionY(-1);
			WhiteQueenD1.setActive(false);
			System.out.println("White Queen (D1) has been killed");
			return;
		
	}
		if(Arrays.equals(CurrentXY, WhiteQueenProm1.getCurrentPositionXY())){
			WhiteQueenProm1.setCurrentPositionXY(-1,-1);
			WhiteQueenProm1.setCurrentPositionX(-1);
			WhiteQueenProm1.setCurrentPositionY(-1);
			WhiteQueenProm1.setActive(false);
			System.out.println("White Queen (Prom1) has been killed");
			return;
		
	}
		if(Arrays.equals(CurrentXY, WhiteQueenProm2.getCurrentPositionXY())){
			WhiteQueenProm2.setCurrentPositionXY(-1,-1);
			WhiteQueenProm2.setCurrentPositionX(-1);
			WhiteQueenProm2.setCurrentPositionY(-1);
			WhiteQueenProm2.setActive(false);
			System.out.println("White Queen (Prom2) has been killed");
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteQueenProm3.getCurrentPositionXY())){
			WhiteQueenProm3.setCurrentPositionXY(-1,-1);
			WhiteQueenProm3.setCurrentPositionX(-1);
			WhiteQueenProm3.setCurrentPositionY(-1);
			WhiteQueenProm3.setActive(false);
			System.out.println("White Queen (Prom3) has been killed");	
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteQueenProm4.getCurrentPositionXY())){
			WhiteQueenProm4.setCurrentPositionXY(-1,-1);
			WhiteQueenProm4.setCurrentPositionX(-1);
			WhiteQueenProm4.setCurrentPositionY(-1);
			WhiteQueenProm4.setActive(false);
			System.out.println("White Queen (Prom4) has been killed");
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteQueenProm5.getCurrentPositionXY())){
			WhiteQueenProm5.setCurrentPositionXY(-1,-1);
			WhiteQueenProm5.setCurrentPositionX(-1);
			WhiteQueenProm5.setCurrentPositionY(-1);
			WhiteQueenProm5.setActive(false);
			System.out.println("White Queen (Prom5) has been killed");	
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteQueenProm6.getCurrentPositionXY())){
			WhiteQueenProm6.setCurrentPositionXY(-1,-1);
			WhiteQueenProm6.setCurrentPositionX(-1);
			WhiteQueenProm6.setCurrentPositionY(-1);
			WhiteQueenProm6.setActive(false);
			System.out.println("White Queen (Prom6) has been killed");	
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteQueenProm7.getCurrentPositionXY())){
			WhiteQueenProm7.setCurrentPositionXY(-1,-1);
			WhiteQueenProm7.setCurrentPositionX(-1);
			WhiteQueenProm7.setCurrentPositionY(-1);
			WhiteQueenProm7.setActive(false);
			System.out.println("White Queen (Prom7) has been killed");
			
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteQueenProm8.getCurrentPositionXY())){
			WhiteQueenProm8.setCurrentPositionXY(-1,-1);
			WhiteQueenProm8.setCurrentPositionX(-1);
			WhiteQueenProm8.setCurrentPositionY(-1);
			WhiteQueenProm8.setActive(false);
			System.out.println("White Queen (Prom8) has been killed");
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteRookProm.getCurrentPositionXY())){
			WhiteRookProm.setCurrentPositionXY(-1,-1);
			WhiteRookProm.setCurrentPositionX(-1);
			WhiteRookProm.setCurrentPositionY(-1);
			WhiteRookProm.setActive(false);
			System.out.println("White Rook (Prom1) has been killed");
			return;
		
	}
		if(Arrays.equals(CurrentXY, WhiteRookProm2.getCurrentPositionXY())){
			WhiteRookProm2.setCurrentPositionXY(-1,-1);
			WhiteRookProm2.setCurrentPositionX(-1);
			WhiteRookProm2.setCurrentPositionY(-1);
			WhiteRookProm2.setActive(false);
			System.out.println("White Rook (Prom2) has been killed");
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteRookProm3.getCurrentPositionXY())){
			WhiteRookProm3.setCurrentPositionXY(-1,-1);
			WhiteRookProm3.setCurrentPositionX(-1);
			WhiteRookProm3.setCurrentPositionY(-1);
			WhiteRookProm3.setActive(false);
			System.out.println("White Rook (Prom3) has been killed");	
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteRookProm4.getCurrentPositionXY())){
			WhiteRookProm4.setCurrentPositionXY(-1,-1);
			WhiteRookProm4.setCurrentPositionX(-1);
			WhiteRookProm4.setCurrentPositionY(-1);
			WhiteRookProm4.setActive(false);
			System.out.println("White Rook (Prom4) has been killed");
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteRookProm5.getCurrentPositionXY())){
			WhiteRookProm5.setCurrentPositionXY(-1,-1);
			WhiteRookProm5.setCurrentPositionX(-1);
			WhiteRookProm5.setCurrentPositionY(-1);
			WhiteRookProm5.setActive(false);
			System.out.println("White Rook (Prom5) has been killed");	
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteRookProm6.getCurrentPositionXY())){
			WhiteRookProm6.setCurrentPositionXY(-1,-1);
			WhiteRookProm6.setCurrentPositionX(-1);
			WhiteRookProm6.setCurrentPositionY(-1);
			WhiteRookProm6.setActive(false);
			System.out.println("White Rook (Prom6) has been killed");	
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteRookProm7.getCurrentPositionXY())){
			WhiteRookProm7.setCurrentPositionXY(-1,-1);
			WhiteRookProm7.setCurrentPositionX(-1);
			WhiteRookProm7.setCurrentPositionY(-1);
			WhiteRookProm7.setActive(false);
			System.out.println("White Rook (Prom7) has been killed");	
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteRookProm8.getCurrentPositionXY())){
			WhiteRookProm8.setCurrentPositionXY(-1,-1);
			WhiteRookProm8.setCurrentPositionX(-1);
			WhiteRookProm8.setCurrentPositionY(-1);
			WhiteRookProm8.setActive(false);
			System.out.println("White Rook (Prom8) has been killed");
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteBishopProm1.getCurrentPositionXY())){
			WhiteBishopProm1.setCurrentPositionXY(-1,-1);
			WhiteBishopProm1.setCurrentPositionX(-1);
			WhiteBishopProm1.setCurrentPositionY(-1);
			WhiteBishopProm1.setActive(false);
			System.out.println("White Bishop (Prom1) has been killed");
			return;
		
	}
		if(Arrays.equals(CurrentXY, WhiteBishopProm2.getCurrentPositionXY())){
			WhiteBishopProm2.setCurrentPositionXY(-1,-1);
			WhiteBishopProm2.setCurrentPositionX(-1);
			WhiteBishopProm2.setCurrentPositionY(-1);
			WhiteBishopProm2.setActive(false);
			System.out.println("White Bishop (Prom2) has been killed");
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteBishopProm3.getCurrentPositionXY())){
			WhiteBishopProm3.setCurrentPositionXY(-1,-1);
			WhiteBishopProm3.setCurrentPositionX(-1);
			WhiteBishopProm3.setCurrentPositionY(-1);
			WhiteBishopProm3.setActive(false);
			System.out.println("White Bishop (Prom3) has been killed");	
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteBishopProm4.getCurrentPositionXY())){
			WhiteBishopProm4.setCurrentPositionXY(-1,-1);
			WhiteBishopProm4.setCurrentPositionX(-1);
			WhiteBishopProm4.setCurrentPositionY(-1);
			WhiteBishopProm4.setActive(false);
			System.out.println("White Bishop (Prom4) has been killed");
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteBishopProm5.getCurrentPositionXY())){
			WhiteBishopProm5.setCurrentPositionXY(-1,-1);
			WhiteBishopProm5.setCurrentPositionX(-1);
			WhiteBishopProm5.setCurrentPositionY(-1);
			WhiteBishopProm5.setActive(false);
			System.out.println("White Bishop (Prom5) has been killed");	
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteBishopProm6.getCurrentPositionXY())){
			WhiteBishopProm6.setCurrentPositionXY(-1,-1);
			WhiteBishopProm6.setCurrentPositionX(-1);
			WhiteBishopProm6.setCurrentPositionY(-1);
			WhiteBishopProm6.setActive(false);
			System.out.println("White Bishop (Prom6) has been killed");	
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteBishopProm7.getCurrentPositionXY())){
			WhiteBishopProm7.setCurrentPositionXY(-1,-1);
			WhiteBishopProm7.setCurrentPositionX(-1);
			WhiteBishopProm7.setCurrentPositionY(-1);
			WhiteBishopProm7.setActive(false);
			System.out.println("White Bishop (Prom7) has been killed");	
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteBishopProm8.getCurrentPositionXY())){
			WhiteBishopProm8.setCurrentPositionXY(-1,-1);
			WhiteBishopProm8.setCurrentPositionX(-1);
			WhiteBishopProm8.setCurrentPositionY(-1);
			WhiteBishopProm8.setActive(false);
			System.out.println("White Bishop (Prom8) has been killed");
			return;
	}		
		if(Arrays.equals(CurrentXY, WhiteKnightProm1.getCurrentPositionXY())){
			WhiteKnightProm1.setCurrentPositionXY(-1,-1);
			WhiteKnightProm1.setCurrentPositionX(-1);
			WhiteKnightProm1.setCurrentPositionY(-1);
			WhiteKnightProm1.setActive(false);
			System.out.println("White Knight (Prom1) has been killed");
			return;
		
	}
		if(Arrays.equals(CurrentXY, WhiteKnightProm2.getCurrentPositionXY())){
			WhiteKnightProm2.setCurrentPositionXY(-1,-1);
			WhiteKnightProm2.setCurrentPositionX(-1);
			WhiteKnightProm2.setCurrentPositionY(-1);
			WhiteKnightProm2.setActive(false);
			System.out.println("White Knight (Prom2) has been killed");
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteKnightProm3.getCurrentPositionXY())){
			WhiteKnightProm3.setCurrentPositionXY(-1,-1);
			WhiteKnightProm3.setCurrentPositionX(-1);
			WhiteKnightProm3.setCurrentPositionY(-1);
			WhiteKnightProm3.setActive(false);
			System.out.println("White Knight (Prom3) has been killed");	
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteKnightProm4.getCurrentPositionXY())){
			WhiteKnightProm4.setCurrentPositionXY(-1,-1);
			WhiteKnightProm4.setCurrentPositionX(-1);
			WhiteKnightProm4.setCurrentPositionY(-1);
			WhiteKnightProm4.setActive(false);
			System.out.println("White Knight (Prom4) has been killed");
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteKnightProm5.getCurrentPositionXY())){
			WhiteKnightProm5.setCurrentPositionXY(-1,-1);
			WhiteKnightProm5.setCurrentPositionX(-1);
			WhiteKnightProm5.setCurrentPositionY(-1);
			WhiteKnightProm5.setActive(false);
			System.out.println("White Knight (Prom5) has been killed");	
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteKnightProm6.getCurrentPositionXY())){
			WhiteKnightProm6.setCurrentPositionXY(-1,-1);
			WhiteKnightProm6.setCurrentPositionX(-1);
			WhiteKnightProm6.setCurrentPositionY(-1);
			WhiteKnightProm6.setActive(false);
			System.out.println("White Knight (Prom6) has been killed");	
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteKnightProm7.getCurrentPositionXY())){
			WhiteKnightProm7.setCurrentPositionXY(-1,-1);
			WhiteKnightProm7.setCurrentPositionX(-1);
			WhiteKnightProm7.setCurrentPositionY(-1);
			WhiteKnightProm7.setActive(false);
			System.out.println("White Knight (Prom7) has been killed");	
			return;
	}
		if(Arrays.equals(CurrentXY, WhiteKnightProm8.getCurrentPositionXY())){
			WhiteKnightProm8.setCurrentPositionXY(-1,-1);
			WhiteKnightProm8.setCurrentPositionX(-1);
			WhiteKnightProm8.setCurrentPositionY(-1);
			WhiteKnightProm8.setActive(false);
			System.out.println("White Knight (Prom8) has been killed");
			return;
	}		
}
	static int[][] aggregateBlacks(){
		//toDO Must update array length
		int [][] BlackAggregate = new int [48][2];
		BlackAggregate[0]=BlackPawnA7.getCurrentPositionXY();
		BlackAggregate[1]=BlackPawnB7.getCurrentPositionXY();
		BlackAggregate[2]=BlackKingE8.getCurrentPositionXY();
		BlackAggregate[3]=BlackKnightB8.getCurrentPositionXY();
		BlackAggregate[4]=BlackPawnC7.getCurrentPositionXY();
		BlackAggregate[5]=BlackRookA8.getCurrentPositionXY();
		BlackAggregate[6]=BlackBishopC8.getCurrentPositionXY();
		BlackAggregate[7]=BlackQueenD8.getCurrentPositionXY();
		
		BlackAggregate[8]=BlackRookProm1.getCurrentPositionXY();
		BlackAggregate[9]=BlackRookProm2.getCurrentPositionXY();
		BlackAggregate[10]=BlackRookProm3.getCurrentPositionXY();
		BlackAggregate[11]=BlackRookProm4.getCurrentPositionXY();
		BlackAggregate[12]=BlackRookProm5.getCurrentPositionXY();
		BlackAggregate[13]=BlackRookProm6.getCurrentPositionXY();
		BlackAggregate[14]=BlackRookProm7.getCurrentPositionXY();
		BlackAggregate[15]=BlackRookProm8.getCurrentPositionXY();
		
		BlackAggregate[16]=BlackQueenProm1.getCurrentPositionXY();
		BlackAggregate[17]=BlackQueenProm2.getCurrentPositionXY();
		BlackAggregate[18]=BlackQueenProm3.getCurrentPositionXY();
		BlackAggregate[19]=BlackQueenProm4.getCurrentPositionXY();
		BlackAggregate[20]=BlackQueenProm5.getCurrentPositionXY();
		BlackAggregate[21]=BlackQueenProm6.getCurrentPositionXY();
		BlackAggregate[22]=BlackQueenProm7.getCurrentPositionXY();
		BlackAggregate[23]=BlackQueenProm8.getCurrentPositionXY();
		
		BlackAggregate[24]=BlackBishopProm1.getCurrentPositionXY();
		BlackAggregate[25]=BlackBishopProm2.getCurrentPositionXY();
		BlackAggregate[26]=BlackBishopProm3.getCurrentPositionXY();
		BlackAggregate[27]=BlackBishopProm4.getCurrentPositionXY();
		BlackAggregate[28]=BlackBishopProm5.getCurrentPositionXY();
		BlackAggregate[29]=BlackBishopProm6.getCurrentPositionXY();
		BlackAggregate[30]=BlackBishopProm7.getCurrentPositionXY();
		BlackAggregate[31]=BlackBishopProm8.getCurrentPositionXY();
		
		BlackAggregate[32]=BlackKnightProm1.getCurrentPositionXY();
		BlackAggregate[33]=BlackKnightProm2.getCurrentPositionXY();
		BlackAggregate[34]=BlackKnightProm3.getCurrentPositionXY();
		BlackAggregate[35]=BlackKnightProm4.getCurrentPositionXY();
		BlackAggregate[36]=BlackKnightProm5.getCurrentPositionXY();
		BlackAggregate[37]=BlackKnightProm6.getCurrentPositionXY();
		BlackAggregate[38]=BlackKnightProm7.getCurrentPositionXY();
		BlackAggregate[39]=BlackKnightProm8.getCurrentPositionXY();
		
		BlackAggregate[40]=BlackRookH8.getCurrentPositionXY();
		BlackAggregate[41]=BlackPawnD7.getCurrentPositionXY();
		BlackAggregate[42]=BlackBishopF8.getCurrentPositionXY();
		BlackAggregate[43]=BlackKnightG8.getCurrentPositionXY();
		BlackAggregate[44]=BlackPawnE7.getCurrentPositionXY();
		BlackAggregate[45]=BlackPawnF7.getCurrentPositionXY();
		BlackAggregate[46]=BlackPawnG7.getCurrentPositionXY();
		BlackAggregate[47]=BlackPawnH7.getCurrentPositionXY();
		return BlackAggregate;
	}
	static int[][] aggregateWhitePawns(){
		int [][] WhitePawnAggregate = new int [8][2];
		
		if(WhitePawnB2.getEnPassant()){
			WhitePawnAggregate[0]=WhitePawnB2.getCurrentPositionXY();
		}
		else{
			WhitePawnAggregate[0] = null;
		}
		
		if(WhitePawnA2.getEnPassant()){
			WhitePawnAggregate[1]=WhitePawnA2.getCurrentPositionXY();
		}
		else{
			WhitePawnAggregate[1] = null;
		}
		
		if(WhitePawnC2.getEnPassant()){
			WhitePawnAggregate[2]=WhitePawnC2.getCurrentPositionXY();
		}
		else{
			WhitePawnAggregate[2] = null;
		}
		if(WhitePawnD2.getEnPassant()){
			WhitePawnAggregate[3]=WhitePawnD2.getCurrentPositionXY();
		}
		else{
			WhitePawnAggregate[3] = null;
		}
		if(WhitePawnE2.getEnPassant()){
			WhitePawnAggregate[4]=WhitePawnE2.getCurrentPositionXY();
		}
		else{
			WhitePawnAggregate[4] = null;
		}
		
		if(WhitePawnF2.getEnPassant()){
			WhitePawnAggregate[5]=WhitePawnF2.getCurrentPositionXY();
		}
		else{
			WhitePawnAggregate[5] = null;
		}
		if(WhitePawnG2.getEnPassant()){
			WhitePawnAggregate[6]=WhitePawnG2.getCurrentPositionXY();
		}
		else{
			WhitePawnAggregate[6] = null;
		}
		
		if(WhitePawnH2.getEnPassant()){
			WhitePawnAggregate[7]=WhitePawnH2.getCurrentPositionXY();
		}
		else{
			WhitePawnAggregate[7] = null;
		}

		return WhitePawnAggregate;
	}
	
	static int[][] aggregateWhites(){
		//toDO Must update array length
		int [][] WhiteAggregate = new int [48][2];
		//insert white pieces here such as...
		WhiteAggregate[0]=WhitePawnB2.getCurrentPositionXY();
		WhiteAggregate[1]=WhitePawnA2.getCurrentPositionXY();
		WhiteAggregate[2]=WhiteKingE1.getCurrentPositionXY();
		WhiteAggregate[3]=WhiteKnightB1.getCurrentPositionXY();
		WhiteAggregate[4]=WhitePawnC2.getCurrentPositionXY();
		WhiteAggregate[5]=WhiteRookA1.getCurrentPositionXY();
		WhiteAggregate[6]=WhiteBishopC1.getCurrentPositionXY();
		WhiteAggregate[7]=WhiteQueenD1.getCurrentPositionXY();
	
		
		WhiteAggregate[8]=WhiteRookProm.getCurrentPositionXY();
		WhiteAggregate[9]=WhiteRookProm2.getCurrentPositionXY();
		WhiteAggregate[10]=WhiteRookProm3.getCurrentPositionXY();
		WhiteAggregate[11]=WhiteRookProm4.getCurrentPositionXY();
		WhiteAggregate[12]=WhiteRookProm5.getCurrentPositionXY();
		WhiteAggregate[13]=WhiteRookProm6.getCurrentPositionXY();
		WhiteAggregate[14]=WhiteRookProm7.getCurrentPositionXY();
		WhiteAggregate[15]=WhiteRookProm8.getCurrentPositionXY();
		WhiteAggregate[16]=WhiteQueenProm1.getCurrentPositionXY();
		WhiteAggregate[17]=WhiteQueenProm2.getCurrentPositionXY();
		WhiteAggregate[18]=WhiteQueenProm3.getCurrentPositionXY();
		WhiteAggregate[19]=WhiteQueenProm4.getCurrentPositionXY();
		WhiteAggregate[20]=WhiteQueenProm5.getCurrentPositionXY();
		WhiteAggregate[21]=WhiteQueenProm6.getCurrentPositionXY();
		WhiteAggregate[22]=WhiteQueenProm7.getCurrentPositionXY();
		WhiteAggregate[23]=WhiteQueenProm8.getCurrentPositionXY();
		
		WhiteAggregate[24]=WhiteBishopProm1.getCurrentPositionXY();
		WhiteAggregate[25]=WhiteBishopProm2.getCurrentPositionXY();
		WhiteAggregate[26]=WhiteBishopProm3.getCurrentPositionXY();
		WhiteAggregate[27]=WhiteBishopProm4.getCurrentPositionXY();
		WhiteAggregate[28]=WhiteBishopProm5.getCurrentPositionXY();
		WhiteAggregate[29]=WhiteBishopProm6.getCurrentPositionXY();
		WhiteAggregate[30]=WhiteBishopProm7.getCurrentPositionXY();
		WhiteAggregate[31]=WhiteBishopProm8.getCurrentPositionXY();
		
		WhiteAggregate[32]=WhiteKnightProm1.getCurrentPositionXY();
		WhiteAggregate[33]=WhiteKnightProm2.getCurrentPositionXY();
		WhiteAggregate[34]=WhiteKnightProm3.getCurrentPositionXY();
		WhiteAggregate[35]=WhiteKnightProm4.getCurrentPositionXY();
		WhiteAggregate[36]=WhiteKnightProm5.getCurrentPositionXY();
		WhiteAggregate[37]=WhiteKnightProm6.getCurrentPositionXY();
		WhiteAggregate[38]=WhiteKnightProm7.getCurrentPositionXY();
		WhiteAggregate[39]=WhiteKnightProm8.getCurrentPositionXY();
		
		WhiteAggregate[40]=WhiteRookH1.getCurrentPositionXY();
		WhiteAggregate[41]=WhitePawnD2.getCurrentPositionXY();
		WhiteAggregate[42]=WhiteBishopF1.getCurrentPositionXY();
		WhiteAggregate[43]=WhiteKnightG1.getCurrentPositionXY();
		WhiteAggregate[44]=WhitePawnE2.getCurrentPositionXY();
		WhiteAggregate[45]=WhitePawnF2.getCurrentPositionXY();
		WhiteAggregate[46]=WhitePawnG2.getCurrentPositionXY();
		WhiteAggregate[47]=WhitePawnH2.getCurrentPositionXY();
		return WhiteAggregate;
	}
	static int[][] aggregateWhitesEXKing(String CurrentTitle, int [] ComXY){
		//Used for check mechanic specifically. Excludes White King position
		
		//toDO Must update array length
		int [][] WhiteAggregate = new int [47][2];
	
		//insert white pieces here such as...
	
		if (CurrentTitle == "White Pawn (B2)"){
			WhiteAggregate[0]=ComXY;
		}
		else{
			WhiteAggregate[0]=WhitePawnB2.getCurrentPositionXY();
		}
		

		if (CurrentTitle == "White Pawn (A2)"){
			WhiteAggregate[1]=ComXY;
		}
		else{
			WhiteAggregate[1]=WhitePawnA2.getCurrentPositionXY();
		}
		
		
		if (CurrentTitle == "White Knight (B1)"){
			WhiteAggregate[2]=ComXY;
		}
		else{
			WhiteAggregate[2]=WhiteKnightB1.getCurrentPositionXY();
		}
		
		if (CurrentTitle == "White Pawn (C2)"){
			WhiteAggregate[3]=ComXY;
		}
		else{
			WhiteAggregate[3]=WhitePawnC2.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Rook (A1)"){
			WhiteAggregate[4]=ComXY;
		}
		else{
			WhiteAggregate[4]=WhiteRookA1.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Bishop (C1)"){
			WhiteAggregate[5]=ComXY;
		}
		else{
			WhiteAggregate[5]=WhiteBishopC1.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Queen (D1)"){
			WhiteAggregate[6]=ComXY;
		}
		else{
			WhiteAggregate[6]=WhiteQueenD1.getCurrentPositionXY();
		}
		
		if (CurrentTitle == "White Rook (Prom1)"){
			WhiteAggregate[7]=ComXY;
		}
		else{
			WhiteAggregate[7]=WhiteRookProm.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Rook (Prom2)"){
			WhiteAggregate[8]=ComXY;
		}
		else{
			WhiteAggregate[8]=WhiteRookProm2.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Rook (Prom3)"){
			WhiteAggregate[9]=ComXY;
		}
		else{
			WhiteAggregate[9]=WhiteRookProm3.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Rook (Prom4)"){
			WhiteAggregate[10]=ComXY;
		}
		else{
			WhiteAggregate[10]=WhiteRookProm4.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Rook (Prom5)"){
			WhiteAggregate[11]=ComXY;
		}
		else{
			WhiteAggregate[11]=WhiteRookProm5.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Rook (Prom6)"){
			WhiteAggregate[12]=ComXY;
		}
		else{
			WhiteAggregate[12]=WhiteRookProm6.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Rook (Prom7)"){
			WhiteAggregate[13]=ComXY;
		}
		else{
			WhiteAggregate[13]=WhiteRookProm7.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Rook (Prom8)"){
			WhiteAggregate[14]=ComXY;
		}
		else{
			WhiteAggregate[14]=WhiteRookProm8.getCurrentPositionXY();
		}
		
		if (CurrentTitle == "White Queen (Prom1)"){
			WhiteAggregate[15]=ComXY;
		}
		else{
			WhiteAggregate[15]=WhiteQueenProm1.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Queen (Prom2)"){
			WhiteAggregate[16]=ComXY;
		}
		else{
			WhiteAggregate[16]=WhiteQueenProm2.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Queen (Prom3)"){
			WhiteAggregate[17]=ComXY;
		}
		else{
			WhiteAggregate[17]=WhiteQueenProm3.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Queen (Prom4)"){
			WhiteAggregate[18]=ComXY;
		}
		else{
			WhiteAggregate[18]=WhiteQueenProm4.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Queen (Prom5)"){
			WhiteAggregate[19]=ComXY;
		}
		else{
			WhiteAggregate[19]=WhiteQueenProm5.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Queen (Prom6)"){
			WhiteAggregate[20]=ComXY;
		}
		else{
			WhiteAggregate[20]=WhiteQueenProm6.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Queen (Prom7)"){
			WhiteAggregate[21]=ComXY;
		}
		else{
			WhiteAggregate[21]=WhiteQueenProm7.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Queen (Prom8)"){
			WhiteAggregate[22]=ComXY;
		}
		else{
			WhiteAggregate[22]=WhiteQueenProm8.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Bishop (Prom1)"){
			WhiteAggregate[23]=ComXY;
		}
		else{
			WhiteAggregate[23]=WhiteBishopProm1.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Bishop (Prom2)"){
			WhiteAggregate[24]=ComXY;
		}
		else{
			WhiteAggregate[24]=WhiteBishopProm2.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Bishop (Prom3)"){
			WhiteAggregate[25]=ComXY;
		}
		else{
			WhiteAggregate[25]=WhiteBishopProm3.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Bishop (Prom4)"){
			WhiteAggregate[26]=ComXY;
		}
		else{
			WhiteAggregate[26]=WhiteBishopProm4.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Bishop (Prom5)"){
			WhiteAggregate[27]=ComXY;
		}
		else{
			WhiteAggregate[27]=WhiteBishopProm5.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Bishop (Prom6)"){
			WhiteAggregate[28]=ComXY;
		}
		else{
			WhiteAggregate[28]=WhiteBishopProm6.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Bishop (Prom7)"){
			WhiteAggregate[29]=ComXY;
		}
		else{
			WhiteAggregate[29]=WhiteBishopProm7.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Bishop (Prom8)"){
			WhiteAggregate[30]=ComXY;
		}
		else{
			WhiteAggregate[30]=WhiteBishopProm8.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Knight (Prom1)"){
			WhiteAggregate[31]=ComXY;
		}
		else{
			WhiteAggregate[31]=WhiteKnightProm1.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Knight (Prom2)"){
			WhiteAggregate[32]=ComXY;
		}
		else{
			WhiteAggregate[32]=WhiteKnightProm2.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Knight (Prom3)"){
			WhiteAggregate[33]=ComXY;
		}
		else{
			WhiteAggregate[33]=WhiteKnightProm3.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Knight (Prom4)"){
			WhiteAggregate[34]=ComXY;
		}
		else{
			WhiteAggregate[34]=WhiteKnightProm4.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Knight (Prom5)"){
			WhiteAggregate[35]=ComXY;
		}
		else{
			WhiteAggregate[35]=WhiteKnightProm5.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Knight (Prom6)"){
			WhiteAggregate[36]=ComXY;
		}
		else{
			WhiteAggregate[36]=WhiteKnightProm6.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Knight (Prom7)"){
			WhiteAggregate[37]=ComXY;
		}
		else{
			WhiteAggregate[37]=WhiteKnightProm7.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Knight (Prom8)"){
			WhiteAggregate[38]=ComXY;
		}
		else{
			WhiteAggregate[38]=WhiteKnightProm8.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Rook (H1)"){
			WhiteAggregate[39]=ComXY;
		}
		else{
			WhiteAggregate[39]=WhiteRookH1.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Pawn (D2)"){
			WhiteAggregate[40]=ComXY;
		}
		else{
			WhiteAggregate[40]=WhitePawnD2.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Bishop (F1)"){
			WhiteAggregate[41]=ComXY;
		}
		else{
			WhiteAggregate[41]=WhiteBishopF1.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Knight (G1)"){
			WhiteAggregate[42]=ComXY;
		}
		else{
			WhiteAggregate[42]=WhiteKnightG1.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Pawn (E2)"){
			WhiteAggregate[43]=ComXY;
		}
		else{
			WhiteAggregate[43]=WhitePawnE2.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Pawn (F2)"){
			WhiteAggregate[44]=ComXY;
		}
		else{
			WhiteAggregate[44]=WhitePawnF2.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Pawn (G2)"){
			WhiteAggregate[45]=ComXY;
		}
		else{
			WhiteAggregate[45]=WhitePawnG2.getCurrentPositionXY();
		}
		if (CurrentTitle == "White Pawn (H2)"){
			WhiteAggregate[46]=ComXY;
		}
		else{
			WhiteAggregate[46]=WhitePawnH2.getCurrentPositionXY();
		}
		return WhiteAggregate;
	}
	
	static int[][] aggregateBlacksForCheck(String CurrentTitle, int [] ComXY){
		//Used for check mechanic specifically. 
		
		//toDO Must update array length
		int [][] BlackAggregate = new int [48][2];
		
		BlackAggregate = aggregateBlacks();
	
		if (CurrentTitle == "White King (E1)"){
			for(int i = 0 ; i < BlackAggregate.length ; i++) {
				int[] Coordinate = BlackAggregate[i];
				if(Arrays.equals(ComXY, Coordinate)){
					BlackAggregate[i]=null;
				}
			}	
		}
		return BlackAggregate;
	}
}
