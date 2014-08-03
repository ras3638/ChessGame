package chessPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class WhitePiece extends Piece {
	static String getColor(){
		String Color = "White";
		return Color;
	}
	static boolean pawnPromotion(int Y, String CurrentTitle){
		//returns true if a white pawn has been promoted
		
		if(CurrentTitle == "White Pawn (H2)"){
			if(Y==0){
				WhitePawnH2.setCurrentPositionX(-1);
				WhitePawnH2.setCurrentPositionY(-1);
				WhitePawnH2.setCurrentPositionXY(-1,-1);
				System.out.println("White Pawn (H2) has been promoted");
				return true;
			}
		}
		if(CurrentTitle == "White Pawn (G2)"){
			if(Y==0){
				WhitePawnG2.setCurrentPositionX(-1);
				WhitePawnG2.setCurrentPositionY(-1);
				WhitePawnG2.setCurrentPositionXY(-1,-1);
				System.out.println("White Pawn (G2) has been promoted");
				return true;
			}
		}
		if(CurrentTitle == "White Pawn (F2)"){
			if(Y==0){
				WhitePawnF2.setCurrentPositionX(-1);
				WhitePawnF2.setCurrentPositionY(-1);
				WhitePawnF2.setCurrentPositionXY(-1,-1);
				System.out.println("White Pawn (F2) has been promoted");
				return true;
			}
		}
		if(CurrentTitle == "White Pawn (E2)"){
			if(Y==0){
				WhitePawnE2.setCurrentPositionX(-1);
				WhitePawnE2.setCurrentPositionY(-1);
				WhitePawnE2.setCurrentPositionXY(-1,-1);
				System.out.println("White Pawn (E2) has been promoted");
				return true;
			}
		}
		if(CurrentTitle == "White Pawn (D2)"){
			if(Y==0){
				WhitePawnD2.setCurrentPositionX(-1);
				WhitePawnD2.setCurrentPositionY(-1);
				WhitePawnD2.setCurrentPositionXY(-1,-1);
				System.out.println("White Pawn (D2) has been promoted");
				return true;
			}
		}
		if(CurrentTitle == "White Pawn (C2)"){
			if(Y==0){
				WhitePawnC2.setCurrentPositionX(-1);
				WhitePawnC2.setCurrentPositionY(-1);
				WhitePawnC2.setCurrentPositionXY(-1,-1);
				System.out.println("White Pawn (C2) has been promoted");
				return true;
			}
		}
		if(CurrentTitle == "White Pawn (B2)"){
			if(Y==0){
				WhitePawnB2.setCurrentPositionX(-1);
				WhitePawnB2.setCurrentPositionY(-1);
				WhitePawnB2.setCurrentPositionXY(-1,-1);
				System.out.println("White Pawn (B2) has been promoted");
				return true;
			}
		}
		if(CurrentTitle == "White Pawn (A2)"){
			if(Y==0){
				WhitePawnA2.setCurrentPositionX(-1);
				WhitePawnA2.setCurrentPositionY(-1);
				WhitePawnA2.setCurrentPositionXY(-1,-1);
				System.out.println("White Pawn (A2) has been promoted");
				return true;
			}
		}
		return false;
		
		
	}
	static void updateEnPassatKill(int CurrentX, int CurrentY){
		
		int [] CurrentXY = new int[2];
		
		CurrentXY[0] = CurrentX + 0;
		CurrentXY[1] = CurrentY + 1;
		
		if(BlackPawnH7.getEnPassant() && Arrays.equals(CurrentXY, BlackPawnH7.getCurrentPositionXY())){
			
			BlackPawnH7.setCurrentPositionXY(-1,-1);
			BlackPawnH7.setCurrentPositionX(-1);
			BlackPawnH7.setCurrentPositionY(-1);
			BlackPawnH7.setActive(false);
			Chess.bH5.setIcon(null);
			System.out.println("Black Pawn (H7) has been killed");
			return;
		}
		if(BlackPawnG7.getEnPassant() && Arrays.equals(CurrentXY, BlackPawnG7.getCurrentPositionXY())){
			
			BlackPawnG7.setCurrentPositionXY(-1,-1);
			BlackPawnG7.setCurrentPositionX(-1);
			BlackPawnG7.setCurrentPositionY(-1);
			BlackPawnG7.setActive(false);
			Chess.bG5.setIcon(null);
			System.out.println("Black Pawn (G7) has been killed");
			return;
		}
		if(BlackPawnF7.getEnPassant() && Arrays.equals(CurrentXY, BlackPawnF7.getCurrentPositionXY())){
			
			BlackPawnF7.setCurrentPositionXY(-1,-1);
			BlackPawnF7.setCurrentPositionX(-1);
			BlackPawnF7.setCurrentPositionY(-1);
			BlackPawnF7.setActive(false);
			Chess.bF5.setIcon(null);
			System.out.println("Black Pawn (F7) has been killed");
			return;
		}
		if(BlackPawnE7.getEnPassant() && Arrays.equals(CurrentXY, BlackPawnE7.getCurrentPositionXY())){
			
			BlackPawnE7.setCurrentPositionXY(-1,-1);
			BlackPawnE7.setCurrentPositionX(-1);
			BlackPawnE7.setCurrentPositionY(-1);
			BlackPawnE7.setActive(false);
			Chess.bE5.setIcon(null);
			System.out.println("Black Pawn (E7) has been killed");
			return;
		}
		if(BlackPawnD7.getEnPassant() && Arrays.equals(CurrentXY, BlackPawnD7.getCurrentPositionXY())){
			
			BlackPawnD7.setCurrentPositionXY(-1,-1);
			BlackPawnD7.setCurrentPositionX(-1);
			BlackPawnD7.setCurrentPositionY(-1);
			BlackPawnD7.setActive(false);
			Chess.bD5.setIcon(null);
			System.out.println("Black Pawn (D7) has been killed");
			return;
		}
		if(BlackPawnA7.getEnPassant() && Arrays.equals(CurrentXY, BlackPawnA7.getCurrentPositionXY())){
			
			BlackPawnA7.setCurrentPositionXY(-1,-1);
			BlackPawnA7.setCurrentPositionX(-1);
			BlackPawnA7.setCurrentPositionY(-1);
			BlackPawnA7.setActive(false);
			Chess.bA5.setIcon(null);
			System.out.println("Black Pawn (A7) has been killed");
			return;
		}
		if(BlackPawnB7.getEnPassant() && Arrays.equals(CurrentXY, BlackPawnB7.getCurrentPositionXY())){
			BlackPawnB7.setCurrentPositionXY(-1,-1);
			BlackPawnB7.setCurrentPositionX(-1);
			BlackPawnB7.setCurrentPositionY(-1);
			BlackPawnB7.setActive(false);
			Chess.bB5.setIcon(null);
			System.out.println("Black Pawn (B7) has been killed");
			return;
		}
		if(BlackPawnC7.getEnPassant() && Arrays.equals(CurrentXY, BlackPawnC7.getCurrentPositionXY())){
			BlackPawnC7.setCurrentPositionXY(-1,-1);
			BlackPawnC7.setCurrentPositionX(-1);
			BlackPawnC7.setCurrentPositionY(-1);
			BlackPawnC7.setActive(false);
			Chess.bC5.setIcon(null);
			System.out.println("Black Pawn (C7) has been killed");
			return;
		}
	}
	static void updateKill(int[] CurrentXY){
		
		if(Arrays.equals(CurrentXY, BlackPawnH7.getCurrentPositionXY())){
			BlackPawnH7.setCurrentPositionXY(-1,-1);
			BlackPawnH7.setCurrentPositionX(-1);
			BlackPawnH7.setCurrentPositionY(-1);
			BlackPawnH7.setActive(false);
			System.out.println("Black Pawn (H7) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackPawnG7.getCurrentPositionXY())){
			BlackPawnG7.setCurrentPositionXY(-1,-1);
			BlackPawnG7.setCurrentPositionX(-1);
			BlackPawnG7.setCurrentPositionY(-1);
			BlackPawnG7.setActive(false);
			System.out.println("Black Pawn (G7) has been killed");
			return;	
		}
		if(Arrays.equals(CurrentXY, BlackPawnF7.getCurrentPositionXY())){
			BlackPawnF7.setCurrentPositionXY(-1,-1);
			BlackPawnF7.setCurrentPositionX(-1);
			BlackPawnF7.setCurrentPositionY(-1);
			BlackPawnF7.setActive(false);
			System.out.println("Black Pawn (F7) has been killed");
			return;	
		}
		if(Arrays.equals(CurrentXY, BlackPawnE7.getCurrentPositionXY())){
			BlackPawnE7.setCurrentPositionXY(-1,-1);
			BlackPawnE7.setCurrentPositionX(-1);
			BlackPawnE7.setCurrentPositionY(-1);
			BlackPawnE7.setActive(false);
			System.out.println("Black Pawn (E7) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackKnightG8.getCurrentPositionXY())){
			BlackKnightG8.setCurrentPositionXY(-1,-1);
			BlackKnightG8.setCurrentPositionX(-1);
			BlackKnightG8.setCurrentPositionY(-1);
			BlackKnightG8.setActive(false);
			System.out.println("Black Knight (G8) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackBishopF8.getCurrentPositionXY())){
			BlackBishopF8.setCurrentPositionXY(-1,-1);
			BlackBishopF8.setCurrentPositionX(-1);
			BlackBishopF8.setCurrentPositionY(-1);
			BlackBishopF8.setActive(false);
			System.out.println("Black Bishop (F8) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackPawnD7.getCurrentPositionXY())){
			BlackPawnD7.setCurrentPositionXY(-1,-1);
			BlackPawnD7.setCurrentPositionX(-1);
			BlackPawnD7.setCurrentPositionY(-1);
			BlackPawnD7.setActive(false);
			System.out.println("Black Pawn (D7) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackRookH8.getCurrentPositionXY())){
			BlackRookH8.setCurrentPositionXY(-1,-1);
			BlackRookH8.setCurrentPositionX(-1);
			BlackRookH8.setCurrentPositionY(-1);
			BlackRookH8.setActive(false);
			System.out.println("Black Rook (H8) has been killed");
			return;		
		}
		if(Arrays.equals(CurrentXY, BlackPawnA7.getCurrentPositionXY())){
			BlackPawnA7.setCurrentPositionXY(-1,-1);
			BlackPawnA7.setCurrentPositionX(-1);
			BlackPawnA7.setCurrentPositionY(-1);
			BlackPawnA7.setActive(false);
			System.out.println("Black Pawn (A7) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackPawnB7.getCurrentPositionXY())){
			BlackPawnB7.setCurrentPositionXY(-1,-1);
			BlackPawnB7.setCurrentPositionX(-1);
			BlackPawnB7.setCurrentPositionY(-1);
			BlackPawnB7.setActive(false);
			System.out.println("Black Pawn (B7) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackKingE8.getCurrentPositionXY())){
			BlackKingE8.setCurrentPositionXY(-1,-1);
			BlackKingE8.setCurrentPositionX(-1);
			BlackKingE8.setCurrentPositionY(-1);
			BlackKingE8.setActive(false);
			System.out.println("Black King (E8) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackKnightB8.getCurrentPositionXY())){
			BlackKnightB8.setCurrentPositionXY(-1,-1);
			BlackKnightB8.setCurrentPositionX(-1);
			BlackKnightB8.setCurrentPositionY(-1);
			BlackKnightB8.setActive(false);
			System.out.println("Black Knight (B8) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackPawnC7.getCurrentPositionXY())){
			BlackPawnC7.setCurrentPositionXY(-1,-1);
			BlackPawnC7.setCurrentPositionX(-1);
			BlackPawnC7.setCurrentPositionY(-1);
			BlackPawnC7.setActive(false);
			System.out.println("Black Pawn (C7) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackRookA8.getCurrentPositionXY())){
			BlackRookA8.setCurrentPositionXY(-1,-1);
			BlackRookA8.setCurrentPositionX(-1);
			BlackRookA8.setCurrentPositionY(-1);
			BlackRookA8.setActive(false);
			System.out.println("Black Rook (A8) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackBishopC8.getCurrentPositionXY())){
			BlackBishopC8.setCurrentPositionXY(-1,-1);
			BlackBishopC8.setCurrentPositionX(-1);
			BlackBishopC8.setCurrentPositionY(-1);
			BlackBishopC8.setActive(false);
			System.out.println("Black Bishop (C8) has been killed");
			return;
		}	
		if(Arrays.equals(CurrentXY, BlackQueenD8.getCurrentPositionXY())){
			BlackQueenD8.setCurrentPositionXY(-1,-1);
			BlackQueenD8.setCurrentPositionX(-1);
			BlackQueenD8.setCurrentPositionY(-1);
			BlackQueenD8.setActive(false);
			System.out.println("Black Queen (D8) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackQueenProm1.getCurrentPositionXY())){
			BlackQueenProm1.setCurrentPositionXY(-1,-1);
			BlackQueenProm1.setCurrentPositionX(-1);
			BlackQueenProm1.setCurrentPositionY(-1);
			BlackQueenProm1.setActive(false);
			System.out.println("Black Queen (Prom1) has been killed");
			return;	
		}
		if(Arrays.equals(CurrentXY, BlackQueenProm2.getCurrentPositionXY())){
			BlackQueenProm2.setCurrentPositionXY(-1,-1);
			BlackQueenProm2.setCurrentPositionX(-1);
			BlackQueenProm2.setCurrentPositionY(-1);
			BlackQueenProm2.setActive(false);
			System.out.println("Black Queen (Prom2) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackQueenProm3.getCurrentPositionXY())){
			BlackQueenProm3.setCurrentPositionXY(-1,-1);
			BlackQueenProm3.setCurrentPositionX(-1);
			BlackQueenProm3.setCurrentPositionY(-1);
			BlackQueenProm3.setActive(false);
			System.out.println("Black Queen (Prom3) has been killed");	
			return;
		}
		if(Arrays.equals(CurrentXY, BlackQueenProm4.getCurrentPositionXY())){
			BlackQueenProm4.setCurrentPositionXY(-1,-1);
			BlackQueenProm4.setCurrentPositionX(-1);
			BlackQueenProm4.setCurrentPositionY(-1);
			BlackQueenProm4.setActive(false);
			System.out.println("Black Queen (Prom4) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackQueenProm5.getCurrentPositionXY())){
			BlackQueenProm5.setCurrentPositionXY(-1,-1);
			BlackQueenProm5.setCurrentPositionX(-1);
			BlackQueenProm5.setCurrentPositionY(-1);
			BlackQueenProm5.setActive(false);
			System.out.println("Black Queen (Prom5) has been killed");	
			return;
		}
		if(Arrays.equals(CurrentXY, BlackQueenProm6.getCurrentPositionXY())){
			BlackQueenProm6.setCurrentPositionXY(-1,-1);
			BlackQueenProm6.setCurrentPositionX(-1);
			BlackQueenProm6.setCurrentPositionY(-1);
			BlackQueenProm6.setActive(false);
			System.out.println("Black Queen (Prom6) has been killed");	
			return;
		}
		if(Arrays.equals(CurrentXY, BlackQueenProm7.getCurrentPositionXY())){
			BlackQueenProm7.setCurrentPositionXY(-1,-1);
			BlackQueenProm7.setCurrentPositionX(-1);
			BlackQueenProm7.setCurrentPositionY(-1);
			BlackQueenProm7.setActive(false);
			System.out.println("Black Queen (Prom7) has been killed");	
			return;
		}
		if(Arrays.equals(CurrentXY, BlackQueenProm8.getCurrentPositionXY())){
			BlackQueenProm8.setCurrentPositionXY(-1,-1);
			BlackQueenProm8.setCurrentPositionX(-1);
			BlackQueenProm8.setCurrentPositionY(-1);
			BlackQueenProm8.setActive(false);
			System.out.println("Black Queen (Prom8) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackRookProm1.getCurrentPositionXY())){
			BlackRookProm1.setCurrentPositionXY(-1,-1);
			BlackRookProm1.setCurrentPositionX(-1);
			BlackRookProm1.setCurrentPositionY(-1);
			BlackRookProm1.setActive(false);
			System.out.println("Black Rook (Prom1) has been killed");
			return;	
		}
		if(Arrays.equals(CurrentXY, BlackRookProm2.getCurrentPositionXY())){
			BlackRookProm2.setCurrentPositionXY(-1,-1);
			BlackRookProm2.setCurrentPositionX(-1);
			BlackRookProm2.setCurrentPositionY(-1);
			BlackRookProm2.setActive(false);
			System.out.println("Black Rook (Prom2) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackRookProm3.getCurrentPositionXY())){
			BlackRookProm3.setCurrentPositionXY(-1,-1);
			BlackRookProm3.setCurrentPositionX(-1);
			BlackRookProm3.setCurrentPositionY(-1);
			BlackRookProm3.setActive(false);
			System.out.println("Black Rook (Prom3) has been killed");	
			return;
		}
		if(Arrays.equals(CurrentXY, BlackRookProm4.getCurrentPositionXY())){
			BlackRookProm4.setCurrentPositionXY(-1,-1);
			BlackRookProm4.setCurrentPositionX(-1);
			BlackRookProm4.setCurrentPositionY(-1);
			BlackRookProm4.setActive(false);
			System.out.println("Black Rook (Prom4) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackRookProm5.getCurrentPositionXY())){
			BlackRookProm5.setCurrentPositionXY(-1,-1);
			BlackRookProm5.setCurrentPositionX(-1);
			BlackRookProm5.setCurrentPositionY(-1);
			BlackRookProm5.setActive(false);
			System.out.println("Black Rook (Prom5) has been killed");	
			return;
		}
		if(Arrays.equals(CurrentXY, BlackRookProm6.getCurrentPositionXY())){
			BlackRookProm6.setCurrentPositionXY(-1,-1);
			BlackRookProm6.setCurrentPositionX(-1);
			BlackRookProm6.setCurrentPositionY(-1);
			BlackRookProm6.setActive(false);
			System.out.println("Black Rook (Prom6) has been killed");	
			return;
		}
		if(Arrays.equals(CurrentXY, BlackRookProm7.getCurrentPositionXY())){
			BlackRookProm7.setCurrentPositionXY(-1,-1);
			BlackRookProm7.setCurrentPositionX(-1);
			BlackRookProm7.setCurrentPositionY(-1);
			BlackRookProm7.setActive(false);
			System.out.println("Black Rook (Prom7) has been killed");	
			return;
		}
		if(Arrays.equals(CurrentXY, BlackRookProm8.getCurrentPositionXY())){
			BlackRookProm8.setCurrentPositionXY(-1,-1);
			BlackRookProm8.setCurrentPositionX(-1);
			BlackRookProm8.setCurrentPositionY(-1);
			BlackRookProm8.setActive(false);
			System.out.println("Black Rook (Prom8) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackBishopProm1.getCurrentPositionXY())){
			BlackBishopProm1.setCurrentPositionXY(-1,-1);
			BlackBishopProm1.setCurrentPositionX(-1);
			BlackBishopProm1.setCurrentPositionY(-1);
			BlackBishopProm1.setActive(false);
			System.out.println("Black Bishop (Prom1) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackBishopProm2.getCurrentPositionXY())){
			BlackBishopProm2.setCurrentPositionXY(-1,-1);
			BlackBishopProm2.setCurrentPositionX(-1);
			BlackBishopProm2.setCurrentPositionY(-1);
			BlackBishopProm2.setActive(false);
			System.out.println("Black Bishop (Prom2) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackBishopProm3.getCurrentPositionXY())){
			BlackBishopProm3.setCurrentPositionXY(-1,-1);
			BlackBishopProm3.setCurrentPositionX(-1);
			BlackBishopProm3.setCurrentPositionY(-1);
			BlackBishopProm3.setActive(false);
			System.out.println("Black Bishop (Prom3) has been killed");	
			return;
		}
		if(Arrays.equals(CurrentXY, BlackBishopProm4.getCurrentPositionXY())){
			BlackBishopProm4.setCurrentPositionXY(-1,-1);
			BlackBishopProm4.setCurrentPositionX(-1);
			BlackBishopProm4.setCurrentPositionY(-1);
			BlackBishopProm4.setActive(false);
			System.out.println("Black Bishop (Prom4) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackBishopProm5.getCurrentPositionXY())){
			BlackBishopProm5.setCurrentPositionXY(-1,-1);
			BlackBishopProm5.setCurrentPositionX(-1);
			BlackBishopProm5.setCurrentPositionY(-1);
			BlackBishopProm5.setActive(false);
			System.out.println("Black Bishop (Prom5) has been killed");	
			return;
		}
		if(Arrays.equals(CurrentXY, BlackBishopProm6.getCurrentPositionXY())){
			BlackBishopProm6.setCurrentPositionXY(-1,-1);
			BlackBishopProm6.setCurrentPositionX(-1);
			BlackBishopProm6.setCurrentPositionY(-1);
			BlackBishopProm6.setActive(false);
			System.out.println("Black Bishop (Prom6) has been killed");	
			return;
		}
		if(Arrays.equals(CurrentXY, BlackBishopProm7.getCurrentPositionXY())){
			BlackBishopProm7.setCurrentPositionXY(-1,-1);
			BlackBishopProm7.setCurrentPositionX(-1);
			BlackBishopProm7.setCurrentPositionY(-1);
			BlackBishopProm7.setActive(false);
			System.out.println("Black Bishop (Prom7) has been killed");	
			return;
		}
		if(Arrays.equals(CurrentXY, BlackBishopProm8.getCurrentPositionXY())){
			BlackBishopProm8.setCurrentPositionXY(-1,-1);
			BlackBishopProm8.setCurrentPositionX(-1);
			BlackBishopProm8.setCurrentPositionY(-1);
			BlackBishopProm8.setActive(false);
			System.out.println("Black Bishop (Prom8) has been killed");
			return;
		}		
		if(Arrays.equals(CurrentXY, BlackKnightProm1.getCurrentPositionXY())){
			BlackKnightProm1.setCurrentPositionXY(-1,-1);
			BlackKnightProm1.setCurrentPositionX(-1);
			BlackKnightProm1.setCurrentPositionY(-1);
			BlackKnightProm1.setActive(false);
			System.out.println("Black Knight (Prom1) has been killed");
			return;
		
		}
		if(Arrays.equals(CurrentXY, BlackKnightProm2.getCurrentPositionXY())){
			BlackKnightProm2.setCurrentPositionXY(-1,-1);
			BlackKnightProm2.setCurrentPositionX(-1);
			BlackKnightProm2.setCurrentPositionY(-1);
			BlackKnightProm2.setActive(false);
			System.out.println("Black Knight (Prom2) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackKnightProm3.getCurrentPositionXY())){
			BlackKnightProm3.setCurrentPositionXY(-1,-1);
			BlackKnightProm3.setCurrentPositionX(-1);
			BlackKnightProm3.setCurrentPositionY(-1);
			BlackKnightProm3.setActive(false);
			System.out.println("Black Knight (Prom3) has been killed");	
			return;
		}
		if(Arrays.equals(CurrentXY, BlackKnightProm4.getCurrentPositionXY())){
			BlackKnightProm4.setCurrentPositionXY(-1,-1);
			BlackKnightProm4.setCurrentPositionX(-1);
			BlackKnightProm4.setCurrentPositionY(-1);
			BlackKnightProm4.setActive(false);
			System.out.println("Black Knight (Prom4) has been killed");
			return;
		}
		if(Arrays.equals(CurrentXY, BlackKnightProm5.getCurrentPositionXY())){
			BlackKnightProm5.setCurrentPositionXY(-1,-1);
			BlackKnightProm5.setCurrentPositionX(-1);
			BlackKnightProm5.setCurrentPositionY(-1);
			BlackKnightProm5.setActive(false);
			System.out.println("Black Knight (Prom5) has been killed");	
			return;
		}
		if(Arrays.equals(CurrentXY, BlackKnightProm6.getCurrentPositionXY())){
			BlackKnightProm6.setCurrentPositionXY(-1,-1);
			BlackKnightProm6.setCurrentPositionX(-1);
			BlackKnightProm6.setCurrentPositionY(-1);
			BlackKnightProm6.setActive(false);
			System.out.println("Black Knight (Prom6) has been killed");	
			return;
		}
		if(Arrays.equals(CurrentXY, BlackKnightProm7.getCurrentPositionXY())){
			BlackKnightProm7.setCurrentPositionXY(-1,-1);
			BlackKnightProm7.setCurrentPositionX(-1);
			BlackKnightProm7.setCurrentPositionY(-1);
			BlackKnightProm7.setActive(false);
			System.out.println("Black Knight (Prom7) has been killed");	
			return;
		}
		if(Arrays.equals(CurrentXY, BlackKnightProm8.getCurrentPositionXY())){
			BlackKnightProm8.setCurrentPositionXY(-1,-1);
			BlackKnightProm8.setCurrentPositionX(-1);
			BlackKnightProm8.setCurrentPositionY(-1);
			BlackKnightProm8.setActive(false);
			System.out.println("Black Knight (Prom8) has been killed");
			return;
		}		
	}
	static int[][] aggregateBlackPawns(){
		
		int [][] BlackPawnAggregate = new int [8][2];
	
		if(BlackPawnB7.getEnPassant()){
			BlackPawnAggregate[0]=BlackPawnB7.getCurrentPositionXY();
		}
		else{
			BlackPawnAggregate[0] = null;
		}
		
		
		if(BlackPawnA7.getEnPassant()){
			BlackPawnAggregate[1]=BlackPawnA7.getCurrentPositionXY();
		}
		else{
			BlackPawnAggregate[1] = null;
		}
		
		if(BlackPawnC7.getEnPassant()){
			BlackPawnAggregate[2]=BlackPawnC7.getCurrentPositionXY();
		}
		else{
			BlackPawnAggregate[2] = null;
		}
		if(BlackPawnD7.getEnPassant()){
			BlackPawnAggregate[3]=BlackPawnD7.getCurrentPositionXY();
		}
		else{
			BlackPawnAggregate[3] = null;
		}
		if(BlackPawnE7.getEnPassant()){
			BlackPawnAggregate[4]=BlackPawnE7.getCurrentPositionXY();
		}
		else{
			BlackPawnAggregate[4] = null;
		}
		if(BlackPawnF7.getEnPassant()){
			BlackPawnAggregate[5]=BlackPawnF7.getCurrentPositionXY();
		}
		else{
			BlackPawnAggregate[5] = null;
		}
		if(BlackPawnG7.getEnPassant()){
			BlackPawnAggregate[6]=BlackPawnG7.getCurrentPositionXY();
		}
		else{
			BlackPawnAggregate[6] = null;
		}
		if(BlackPawnH7.getEnPassant()){
			BlackPawnAggregate[7]=BlackPawnH7.getCurrentPositionXY();
		}
		else{
			BlackPawnAggregate[7] = null;
		}
		return BlackPawnAggregate;
	}
	static int[][] aggregateBlacksEXKing(String CurrentTitle, int [] ComXY){
		//Used for check mechanic specifically. Excludes White King position
		
		int [][] BlackAggregate = new int [47][2];

		if (CurrentTitle == "Black Pawn (A7)"){
			BlackAggregate[0]=ComXY;
		}
		else{
			BlackAggregate[0]=BlackPawnA7.getCurrentPositionXY();
		}
		

		if (CurrentTitle == "Black Pawn (B7)"){
			BlackAggregate[1]=ComXY;
		}
		else{
			BlackAggregate[1]=BlackPawnB7.getCurrentPositionXY();
		}
		
		if (CurrentTitle == "Black Knight (B8)"){
			BlackAggregate[2]=ComXY;
		}
		else{
			BlackAggregate[2]=BlackKnightB8.getCurrentPositionXY();
		}
		
		if (CurrentTitle == "Black Pawn (C7)"){
			BlackAggregate[3]=ComXY;
		}
		else{
			BlackAggregate[3]=BlackPawnC7.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Rook (A8)"){
			BlackAggregate[4]=ComXY;
		}
		else{
			BlackAggregate[4]=BlackRookA8.getCurrentPositionXY();
		}

		if (CurrentTitle == "Black Bishop (C8)"){
			BlackAggregate[5]=ComXY;
		}
		else{
			BlackAggregate[5]=BlackBishopC8.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Queen (D8)"){
			BlackAggregate[6]=ComXY;
		}
		else{
			BlackAggregate[6]=BlackQueenD8.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Rook (Prom1)"){
			BlackAggregate[7]=ComXY;
		}
		else{
			BlackAggregate[7]=BlackRookProm1.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Rook (Prom2)"){
			BlackAggregate[8]=ComXY;
		}
		else{
			BlackAggregate[8]=BlackRookProm2.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Rook (Prom3)"){
			BlackAggregate[9]=ComXY;
		}
		else{
			BlackAggregate[9]=BlackRookProm3.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Rook (Prom4)"){
			BlackAggregate[10]=ComXY;
		}
		else{
			BlackAggregate[10]=BlackRookProm4.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Rook (Prom5)"){
			BlackAggregate[11]=ComXY;
		}
		else{
			BlackAggregate[11]=BlackRookProm5.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Rook (Prom6)"){
			BlackAggregate[12]=ComXY;
		}
		else{
			BlackAggregate[12]=BlackRookProm6.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Rook (Prom7)"){
			BlackAggregate[13]=ComXY;
		}
		else{
			BlackAggregate[13]=BlackRookProm7.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Rook (Prom8)"){
			BlackAggregate[14]=ComXY;
		}
		else{
			BlackAggregate[14]=BlackRookProm8.getCurrentPositionXY();
		}
		
		if (CurrentTitle == "Black Queen (Prom1)"){
			BlackAggregate[15]=ComXY;
		}
		else{
			BlackAggregate[15]=BlackQueenProm1.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Queen (Prom2)"){
			BlackAggregate[16]=ComXY;
		}
		else{
			BlackAggregate[16]=BlackQueenProm2.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Queen (Prom3)"){
			BlackAggregate[17]=ComXY;
		}
		else{
			BlackAggregate[17]=BlackQueenProm3.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Queen (Prom4)"){
			BlackAggregate[18]=ComXY;
		}
		else{
			BlackAggregate[18]=BlackQueenProm4.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Queen (Prom5)"){
			BlackAggregate[19]=ComXY;
		}
		else{
			BlackAggregate[19]=BlackQueenProm5.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Queen (Prom6)"){
			BlackAggregate[20]=ComXY;
		}
		else{
			BlackAggregate[20]=BlackQueenProm6.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Queen (Prom7)"){
			BlackAggregate[21]=ComXY;
		}
		else{
			BlackAggregate[21]=BlackQueenProm7.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Queen (Prom8)"){
			BlackAggregate[22]=ComXY;
		}
		else{
			BlackAggregate[22]=BlackQueenProm8.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Rook (Prom1)"){
			BlackAggregate[23]=ComXY;
		}
		else{
			BlackAggregate[23]=BlackRookProm1.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Rook (Prom2)"){
			BlackAggregate[24]=ComXY;
		}
		else{
			BlackAggregate[24]=BlackRookProm2.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Rook (Prom3)"){
			BlackAggregate[25]=ComXY;
		}
		else{
			BlackAggregate[25]=BlackRookProm3.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Rook (Prom4)"){
			BlackAggregate[26]=ComXY;
		}
		else{
			BlackAggregate[26]=BlackRookProm4.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Rook (Prom5)"){
			BlackAggregate[27]=ComXY;
		}
		else{
			BlackAggregate[27]=BlackRookProm5.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Rook (Prom6)"){
			BlackAggregate[28]=ComXY;
		}
		else{
			BlackAggregate[28]=BlackRookProm6.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Rook (Prom7)"){
			BlackAggregate[29]=ComXY;
		}
		else{
			BlackAggregate[29]=BlackRookProm7.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Rook (Prom8)"){
			BlackAggregate[30]=ComXY;
		}
		else{
			BlackAggregate[30]=BlackRookProm8.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Knight (Prom1)"){
			BlackAggregate[31]=ComXY;
		}
		else{
			BlackAggregate[31]=BlackKnightProm1.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Knight (Prom2)"){
			BlackAggregate[32]=ComXY;
		}
		else{
			BlackAggregate[32]=BlackKnightProm2.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Knight (Prom3)"){
			BlackAggregate[33]=ComXY;
		}
		else{
			BlackAggregate[33]=BlackKnightProm3.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Knight (Prom4)"){
			BlackAggregate[34]=ComXY;
		}
		else{
			BlackAggregate[34]=BlackKnightProm4.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Knight (Prom5)"){
			BlackAggregate[35]=ComXY;
		}
		else{
			BlackAggregate[35]=BlackKnightProm5.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Knight (Prom6)"){
			BlackAggregate[36]=ComXY;
		}
		else{
			BlackAggregate[36]=BlackKnightProm6.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Knight (Prom7)"){
			BlackAggregate[37]=ComXY;
		}
		else{
			BlackAggregate[37]=BlackKnightProm7.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Knight (Prom8)"){
			BlackAggregate[38]=ComXY;
		}
		else{
			BlackAggregate[38]=BlackKnightProm8.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Pawn (D7)"){
			BlackAggregate[39]=ComXY;
		}
		else{
			BlackAggregate[39]=BlackPawnD7.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Bishop (F8)"){
			BlackAggregate[40]=ComXY;
		}
		else{
			BlackAggregate[40]=BlackBishopF8.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Knight (G8)"){
			BlackAggregate[41]=ComXY;
		}
		else{
			BlackAggregate[41]=BlackKnightG8.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Pawn (E7)"){
			BlackAggregate[42]=ComXY;
		}
		else{
			BlackAggregate[42]=BlackPawnE7.getCurrentPositionXY();
		}
		
		if (CurrentTitle == "Black Pawn (F7)"){
			BlackAggregate[43]=ComXY;
		}
		else{
			BlackAggregate[43]=BlackPawnF7.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Pawn (G7)"){
			BlackAggregate[44]=ComXY;
		}
		else{
			BlackAggregate[44]=BlackPawnG7.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Pawn (H7)"){
			BlackAggregate[45]=ComXY;
		}
		else{
			BlackAggregate[45]=BlackPawnH7.getCurrentPositionXY();
		}
		if (CurrentTitle == "Black Rook (H8)"){
			BlackAggregate[46]=ComXY;
		}
		else{
			BlackAggregate[46]=BlackRookH8.getCurrentPositionXY();
		}
		return BlackAggregate;
	}
	static ArrayList<int[]> aggregateWhitesForCheck(String CurrentTitle, int [] ComXY){
		//Used for check mechanic specifically. 

		ArrayList<int[]> WhiteAggregate;
		
		WhiteAggregate = aggregateWhites();
		
		if (CurrentTitle == "Black King (E8)"){
			for(int[] i: aggregateWhites()){
				int[] Coordinate = i;
				if(Arrays.equals(ComXY, Coordinate)){
					WhiteAggregate.remove(i);
				}		 
			}
		}
		return WhiteAggregate;
	}
}
