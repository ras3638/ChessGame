package chessPackage;

import java.util.ArrayList;

public class BlackPawnA7 extends Superclass_BlackPawn {
	static int CurrentPositionX = 0;
	static int CurrentPositionY = 1;
	static int [] CurrentPositionXY = {0,1};
	static final int  StartingPositionX = 0;
	static final int StartingPositionY = 1;
	static boolean active = true;
	static boolean EnPassant = false;
	static boolean FirstStrike = true;
	static final String Title = "Black Pawn (A7)";
	
	static void reset(){
		setActive(true);
		setFirstStrike(true);
		setEnPassant(false);
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
	static void setEnPassant(boolean a){
		EnPassant = a;
	}
	static boolean getEnPassant(){
		return EnPassant;
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
		return CurrentPositionXY;
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
class BlackPawnB7 extends Superclass_BlackPawn {
	static int CurrentPositionX=1;
	static int CurrentPositionY=1;
	static int [] CurrentPositionXY = {1,1};
	static final int  StartingPositionX = 1;
	static final int StartingPositionY = 1;
	static boolean active = true;
	static boolean EnPassant = false;
	static boolean FirstStrike = true;
	static final String Title = "Black Pawn (B7)";
	
	static void reset(){
		setActive(true);
		setFirstStrike(true);
		setEnPassant(false);
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
	static void setEnPassant(boolean a){
		EnPassant = a;
	}
	static boolean getEnPassant(){
		return EnPassant;
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
		return CurrentPositionXY;
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
class BlackPawnC7 extends Superclass_BlackPawn {
	static int CurrentPositionX=2;
	static int CurrentPositionY=1;
	static int [] CurrentPositionXY = {2,1};
	static final int  StartingPositionX = 2;
	static final int StartingPositionY = 1;
	static boolean active = true;
	static boolean EnPassant = false;
	static boolean FirstStrike = true;
	static final String Title = "Black Pawn (C7)";
	
	static void reset(){
		setActive(true);
		setFirstStrike(true);
		setEnPassant(false);
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
	static void setEnPassant(boolean a){
		EnPassant = a;
	}
	static boolean getEnPassant(){
		return EnPassant;
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
		return CurrentPositionXY;
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
class BlackPawnD7 extends Superclass_BlackPawn {
	static int CurrentPositionX=3;
	static int CurrentPositionY=1;
	static int [] CurrentPositionXY = {3,1};
	static final int  StartingPositionX = 3;
	static final int StartingPositionY = 1;
	static boolean active = true;
	static boolean EnPassant = false;
	static boolean FirstStrike = true;
	static final String Title = "Black Pawn (D7)";
	
	static void reset(){
		setActive(true);
		setFirstStrike(true);
		setEnPassant(false);
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
	static void setEnPassant(boolean a){
		EnPassant = a;
	}
	static boolean getEnPassant(){
		return EnPassant;
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
		return CurrentPositionXY;
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
class BlackPawnE7 extends Superclass_BlackPawn {
	static int CurrentPositionX=4;
	static int CurrentPositionY=1;
	static int [] CurrentPositionXY = {4,1};
	static final int  StartingPositionX = 4;
	static final int StartingPositionY = 1;
	static boolean active = true;
	static boolean EnPassant = false;
	static boolean FirstStrike = true;
	static final String Title = "Black Pawn (E7)";
	
	static void reset(){
		setActive(true);
		setFirstStrike(true);
		setEnPassant(false);
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
	static void setEnPassant(boolean a){
		EnPassant = a;
	}
	static boolean getEnPassant(){
		return EnPassant;
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
		return CurrentPositionXY;
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
class BlackPawnF7 extends Superclass_BlackPawn {
	static int CurrentPositionX=5;
	static int CurrentPositionY=1;
	static int [] CurrentPositionXY = {5,1};
	static final int  StartingPositionX = 5;
	static final int StartingPositionY = 1;
	static boolean active = true;
	static boolean EnPassant = false;
	static boolean FirstStrike = true;
	static final String Title = "Black Pawn (F7)";
	
	static void reset(){
		setActive(true);
		setFirstStrike(true);
		setEnPassant(false);
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
	static void setEnPassant(boolean a){
		EnPassant = a;
	}
	static boolean getEnPassant(){
		return EnPassant;
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
		return CurrentPositionXY;
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
class BlackPawnG7 extends Superclass_BlackPawn {
	static int CurrentPositionX=6;
	static int CurrentPositionY=1;
	static int [] CurrentPositionXY = {6,1};
	static final int  StartingPositionX = 6;
	static final int StartingPositionY = 1;
	static boolean active = true;
	static boolean EnPassant = false;
	static boolean FirstStrike = true;
	static final String Title = "Black Pawn (G7)";
	
	static void reset(){
		setActive(true);
		setFirstStrike(true);
		setEnPassant(false);
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
	static void setEnPassant(boolean a){
		EnPassant = a;
	}
	static boolean getEnPassant(){
		return EnPassant;
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
		return CurrentPositionXY;
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
class BlackPawnH7 extends Superclass_BlackPawn {
	static int CurrentPositionX=7;
	static int CurrentPositionY=1;
	static int [] CurrentPositionXY = {7,1};
	static final int  StartingPositionX = 7;
	static final int StartingPositionY = 1;
	static boolean active = true;
	static boolean EnPassant = false;
	static boolean FirstStrike = true;
	static final String Title = "Black Pawn (H7)";
	
	static void reset(){
		setActive(true);
		setFirstStrike(true);
		setEnPassant(false);
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
	static void setEnPassant(boolean a){
		EnPassant = a;
	}
	static boolean getEnPassant(){
		return EnPassant;
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
		return CurrentPositionXY;
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