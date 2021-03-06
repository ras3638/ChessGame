package chessPackage;

import java.util.ArrayList;

public class WhiteKingE1 extends Superclass_WhiteKing {
	static int CurrentPositionX=4;
	static int CurrentPositionY =7;
	static int[] CurrentPositionXY= {4,7};
	static final int  StartingPositionX = 4;
	static final int StartingPositionY = 7;
	static boolean active = true;
	static boolean FirstStrike = true;
	static final String Title = "White King (E1)";
	
	static void reset(){
		setFirstStrike(true);
		setActive(true);
		setCurrentPositionX(StartingPositionX);
		setCurrentPositionY(StartingPositionY);
		setCurrentPositionXY(StartingPositionX,StartingPositionY);
	}
	static void setFirstStrike(boolean a){
		FirstStrike = a;
	}
	static boolean getFirstStrike(){
		return FirstStrike;
	}
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		return Title;
	}
	static int getCurrentPositionX(){
		return CurrentPositionX ;
	}
	static int getCurrentPositionY(){

		return CurrentPositionY ;
	}
	static int[] getCurrentPositionXY(){
		return CurrentPositionXY ;
	}
	static void setCurrentPositionX(int X){
		CurrentPositionX = X;
	}
	static void setCurrentPositionY(int Y){
		CurrentPositionY = Y;
	}
	static void setCurrentPositionXY(int X,int Y){
		CurrentPositionXY = new int[] {X,Y};
	}
	static ArrayList<int[]> movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	} 
}
