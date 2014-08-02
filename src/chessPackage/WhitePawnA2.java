package chessPackage;

public class WhitePawnA2 extends Superclass_WhitePawn {
	static int CurrentPositionX=0;
	static int CurrentPositionY =6;
	static int[] CurrentPositionXY= {0,6};
	static final int  StartingPositionX = 0;
	static final int StartingPositionY = 6;
	static boolean active = true;
	static boolean EnPassant = false;
	static boolean FirstStrike = true;
	static final String Title = "White Pawn (A2)";
	
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
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class WhitePawnB2 extends Superclass_WhitePawn {
	static int CurrentPositionX=1;
	static int CurrentPositionY =6;
	static int[] CurrentPositionXY= {1,6};
	static final int  StartingPositionX = 1;
	static final int StartingPositionY = 6;
	static boolean active = true;
	static boolean EnPassant = false;
	static boolean FirstStrike = true;
	static final String Title = "White Pawn (B2)";
	
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
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class WhitePawnC2 extends Superclass_WhitePawn {
	static int CurrentPositionX=2;
	static int CurrentPositionY =6;
	static int[] CurrentPositionXY= {2,6};
	static final int  StartingPositionX = 2;
	static final int StartingPositionY = 6;
	static boolean active = true;
	static boolean EnPassant = false;
	static boolean FirstStrike = true;
	static final String Title = "White Pawn (C2)";
	
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
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class WhitePawnD2 extends Superclass_WhitePawn {
	static int CurrentPositionX=3;
	static int CurrentPositionY =6;
	static int[] CurrentPositionXY= {3,6};
	static final int  StartingPositionX = 3;
	static final int StartingPositionY = 6;
	static boolean active = true;
	static boolean EnPassant = false;
	static boolean FirstStrike = true;
	static final String Title = "White Pawn (D2)";
	
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
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class WhitePawnE2 extends Superclass_WhitePawn {
	static int CurrentPositionX=4;
	static int CurrentPositionY =6;
	static int[] CurrentPositionXY= {4,6};
	static final int  StartingPositionX = 4;
	static final int StartingPositionY = 6;
	static boolean active = true;
	static boolean EnPassant = false;
	static boolean FirstStrike = true;
	static final String Title = "White Pawn (E2)";
	
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
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class WhitePawnF2 extends Superclass_WhitePawn {
	static int CurrentPositionX=5;
	static int CurrentPositionY =6;
	static int[] CurrentPositionXY= {5,6};
	static final int  StartingPositionX = 5;
	static final int StartingPositionY = 6;
	static boolean active = true;
	static boolean EnPassant = false;
	static boolean FirstStrike = true;
	static final String Title = "White Pawn (F2)";
	
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
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class WhitePawnG2 extends Superclass_WhitePawn {
	static int CurrentPositionX=6;
	static int CurrentPositionY =6;
	static int[] CurrentPositionXY= {6,6};
	static final int  StartingPositionX = 6;
	static final int StartingPositionY = 6;
	static boolean active = true;
	static boolean EnPassant = false;
	static boolean FirstStrike = true;
	static final String Title = "White Pawn (G2)";
	
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
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}
class WhitePawnH2 extends Superclass_WhitePawn {
	static int CurrentPositionX=7;
	static int CurrentPositionY =6;
	static int[] CurrentPositionXY= {7,6};
	static final int  StartingPositionX = 7;
	static final int StartingPositionY = 6;
	static boolean active = true;
	static boolean EnPassant = false;
	static boolean FirstStrike = true;
	static final String Title = "White Pawn (H2)";
	
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
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX,StartingPositionY);
	}
}