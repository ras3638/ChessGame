package chessPackage;

public class WhiteRookA1 extends Superclass_WhiteRook {
	static int CurrentPositionX=0;
	static int CurrentPositionY=7;
	static int StartingPositionX=0;
	static int StartingPositionY=7;
	static int [] CurrentPositionXY = {0,7};
	static boolean active = true;
	static boolean FirstStrike = true;
	
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
		String Title = "White Rook (A1)";
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
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY, StartingPositionY, StartingPositionY);
	}
}
class WhiteRookH1 extends Superclass_WhiteRook {
	static int CurrentPositionX=7;
	static int CurrentPositionY=7;
	static int StartingPositionX=7;
	static int StartingPositionY=7;
	static int [] CurrentPositionXY = {7,7};
	static boolean active = true;
	static boolean FirstStrike = true;
	
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
		String Title = "White Rook (H1)";
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
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY, StartingPositionY, StartingPositionY);
	}
}

class WhiteRookProm1 extends Superclass_WhiteRook {
	static int CurrentPositionX = -10;
	static int CurrentPositionY = -10;
	static int StartingPositionX=-10;
	static int StartingPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static boolean active = false;
	
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		String Title = "White Rook (Prom1)";
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
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX, StartingPositionY);
	}
}
class WhiteRookProm2 extends Superclass_WhiteRook {
	static int CurrentPositionX = -10;
	static int CurrentPositionY = -10;
	static int StartingPositionX=-10;
	static int StartingPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static boolean active = false;
	
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		String Title = "White Rook (Prom2)";
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
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX, StartingPositionY);
	}
}
class WhiteRookProm3 extends Superclass_WhiteRook {
	static int CurrentPositionX = -10;
	static int CurrentPositionY = -10;
	static int StartingPositionX=-10;
	static int StartingPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static boolean active = false;
	
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		String Title = "White Rook (Prom3)";
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
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX, StartingPositionY);
	}
}
class WhiteRookProm4 extends Superclass_WhiteRook {
	static int CurrentPositionX = -10;
	static int CurrentPositionY = -10;
	static int StartingPositionX=-10;
	static int StartingPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static boolean active = false;
	
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		String Title = "White Rook (Prom2)";
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
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX, StartingPositionY);
	}
}
class WhiteRookProm5 extends Superclass_WhiteRook {
	static int CurrentPositionX = -10;
	static int CurrentPositionY = -10;
	static int StartingPositionX=-10;
	static int StartingPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static boolean active = false;
	
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		String Title = "White Rook (Prom2)";
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
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX, StartingPositionY);
	}
}
class WhiteRookProm6 extends Superclass_WhiteRook {
	static int CurrentPositionX = -10;
	static int CurrentPositionY = -10;
	static int StartingPositionX=-10;
	static int StartingPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static boolean active = false;
	
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		String Title = "White Rook (Prom2)";
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
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX, StartingPositionY);
	}
}
class WhiteRookProm7 extends Superclass_WhiteRook {
	static int CurrentPositionX = -10;
	static int CurrentPositionY = -10;
	static int StartingPositionX=-10;
	static int StartingPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static boolean active = false;
	
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		String Title = "White Rook (Prom2)";
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
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX, StartingPositionY);
	}
}
class WhiteRookProm8 extends Superclass_WhiteRook {
	static int CurrentPositionX = -10;
	static int CurrentPositionY = -10;
	static int StartingPositionX=-10;
	static int StartingPositionY=-10;
	static int [] CurrentPositionXY = {-10,-10};
	static boolean active = false;
	
	static void setActive(boolean a){
		active = a;
	}
	static boolean getActive(){
		return active;
	}
	static String getTitle(){
		String Title = "White Rook (Prom2)";
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
	static int[][] movementHandler(int CurrentX, int CurrentY) {
		return movementHandler(CurrentX,CurrentY,StartingPositionX, StartingPositionY);
	}
}